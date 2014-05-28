package com.companyname.hbms.resume.dao;

import com.companyname.hbms.resume.domain.Resume;

/**
 * Created by fellowlong on 2014-05-16.
 */
public interface ResumeDao {

  public int insert(Resume resume);

  public int update(Resume resume);

  public int delete(Resume resume);

  public int findById(Long resumeId);

}
