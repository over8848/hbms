package com.newstar.hbms.candidate2.web.controller;

import com.newstar.hbms.mvc.MessageCollector;
import com.newstar.hbms.candidate2.domain.Candidate;
import com.newstar.hbms.candidate2.service.CandidateService;
import com.newstar.hbms.utils.DateEditor;
import com.newstar.hbms.utils.WebUtils;
import com.newstar.hbms.utils.paging.PagingResult;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * Created by fellowlong on 2014-08-07.
 */
public class CandidateController extends MultiActionController {

  private CandidateService candidateService;

  private DateEditor dateEditor;

  public void setCandidateService(CandidateService candidateService) {
    this.candidateService = candidateService;
  }

  public void setDateEditor(DateEditor dateEditor) {
    this.dateEditor = dateEditor;
  }

  public void findByBean(HttpServletRequest request,
                   HttpServletResponse response,
                   Candidate candidate) throws Exception {
    candidate.setYn(Boolean.TRUE);
    PagingResult<Candidate> candidates = candidateService.findByBean(candidate, WebUtils.getPageRange(request));
    WebUtils.writeForEasyUIDataGrid(request, response, candidates, true);

  }

  public void insertOrUpdate(HttpServletRequest request,
                     HttpServletResponse response,
                     Candidate candidate) throws Exception {
    int resultCount = 0;
    if(candidate.getId() == null)  {
      resultCount = candidateService.insert(candidate);
    } else {
      resultCount = candidateService.update(candidate);
    }
    MessageCollector msgCollector = new MessageCollector();
    if (resultCount == 1) {
      msgCollector.addInfo(WebUtils.SUCCESS, Boolean.TRUE);
    } else {
      msgCollector.addError(WebUtils.ERROR, Boolean.TRUE);
    }
    WebUtils.writeWithJson(response, msgCollector);
  }

  public void deleteById(HttpServletRequest request,
                         HttpServletResponse response) throws Exception {
    int resultCount = 0;
    Long id = WebUtils.getLong(request,WebUtils.ID);
    if (id != null) {
      resultCount = candidateService.disable(id);
    }
    MessageCollector msgCollector = new MessageCollector();
    if (resultCount == 1) {
      msgCollector.addInfo(WebUtils.SUCCESS, Boolean.TRUE);
    } else {
      msgCollector.addError(WebUtils.ERROR, Boolean.TRUE);
    }
    WebUtils.writeWithJson(response, msgCollector);
  }

  @Override
  protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
    super.initBinder(request, binder);
    binder.registerCustomEditor(Date.class, dateEditor);
  }
}
