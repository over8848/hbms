package com.companyname.hbms.resume.service;

import com.companyname.hbms.resume.domain.Resume;
import com.companyname.hbms.utils.paging.PagingParameter;
import com.companyname.hbms.utils.paging.PagingResult;

/**
 * Created by fellowlong on 2014-05-27.
 *
 * 简历服务类
 */
public interface ResumeService {

  public int insert(Resume resume);

  public int update(Resume resume);

  public int disable(Long resumeId);

  public int enable(Long resumeId);

  public PagingResult<Resume> findByBean(PagingParameter resumePage);


}
