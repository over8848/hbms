package com.companyname.hbms.common.service.impl;

import com.companyname.hbms.common.service.FileService;
import com.companyname.hbms.utils.FileUtils;
import com.companyname.hbms.utils.IOUtils;

import java.io.*;
import java.util.Date;

/**
 * Created by fellowlong on 2014-09-26.
 */
public class FileServiceImpl implements FileService {

  private String prefix;

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  @Override
  public String save(InputStream inputStream, String uri) throws IOException {
    File file = new File(prefix + uri);
    if (!file.getParentFile().exists()) {
      file.getParentFile().mkdirs();
    }
    OutputStream out = new FileOutputStream(file);
    IOUtils.copy(inputStream, out);
    out.flush();
    out.close();
    return uri;
  }

  @Override
  public InputStream get(String uri) throws IOException {
    return new FileInputStream(prefix + uri);
  }

}
