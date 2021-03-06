package com.newstar.hbms.utils;

/**
 * Created by fellowlong on 2016/2/10.
 */

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.*;

public class OfficeToXML {

  private final static OfficeToXML oOfficeToXML = new OfficeToXML();

  public static OfficeToXML getInstance() {
    return oOfficeToXML;
  }

  public OfficeToXML() {
  }

  public boolean WordtoHtml(String s, String s1) {
    ComThread.InitSTA();
    ActiveXComponent activexcomponent = new ActiveXComponent(
        "Word.Application");
    String s2 = s;
    String s3 = s1;
    boolean flag = false;
    try {
      activexcomponent.setProperty("Visible", new Variant(false));
      Dispatch dispatch = activexcomponent.getProperty("Documents").toDispatch();
      Dispatch dispatch1 = Dispatch.invoke(dispatch, "Open", 1,
          new Object[]{s2, new Variant(false), new Variant(true)},
          new int[1]).toDispatch();
      Dispatch.invoke(dispatch1, "SaveAs", 1, new Object[]{s3,
          new Variant(10)}, new int[1]);
      Variant variant = new Variant(false);
      Dispatch.call(dispatch1, "Close", variant);
      flag = true;
    } catch (Exception exception) {
      exception.printStackTrace();
    } finally {
      activexcomponent.invoke("Quit", new Variant[0]);
      ComThread.Release();
      ComThread.quitMainSTA();
    }
    return flag;
  }

  public boolean PPttoHtml(String s, String s1) {
    ComThread.InitSTA();
    ActiveXComponent activexcomponent = new ActiveXComponent(
        "PowerPoint.Application");
    String s2 = s;
    String s3 = s1;
    boolean flag = false;
    try {
      Dispatch dispatch = activexcomponent.getProperty("Presentations")
          .toDispatch();
      Dispatch dispatch1 = Dispatch.call(dispatch, "Open", s2,
          new Variant(-1), new Variant(-1), new Variant(0))
          .toDispatch();
      Dispatch.call(dispatch1, "SaveAs", s3, new Variant(12));
      Dispatch.call(dispatch1, "Close");
      flag = true;
    } catch (Exception exception) {
      System.out.println("|||" + exception.toString());
    } finally {
      activexcomponent.invoke("Quit", new Variant[0]);
      ComThread.Release();
      ComThread.quitMainSTA();
    }
    return flag;
  }

  public boolean ExceltoHtml(String s, String s1) {
    ComThread.InitSTA();
    ActiveXComponent activexcomponent = new
        ActiveXComponent("Excel.Application");
    String s2 = s;
    String s3 = s1;
    boolean flag = false;
    try {
      activexcomponent.setProperty("Visible", new Variant(false));
      Dispatch dispatch =
          activexcomponent.getProperty("Workbooks").toDispatch();
      Dispatch dispatch1 = Dispatch.invoke(dispatch, "Open", 1, new
          Object[]{
          s2, new Variant(false), new Variant(true)
      }, new int[1]).toDispatch();
      Dispatch.call(dispatch1, "SaveAs", s3, new Variant(44));
      Variant variant = new Variant(false);
      Dispatch.call(dispatch1, "Close", variant);
      flag = true;
    } catch (Exception exception) {
      System.out.println("|||" + exception.toString());
    } finally {
      activexcomponent.invoke("Quit", new Variant[0]);
      ComThread.Release();
      ComThread.quitMainSTA();
    }
    return flag;
  }

  public static void main(String args[]) {
    OfficeToXML otx = OfficeToXML.getInstance();
    boolean flag1 = otx.PPttoHtml("c:/test/晋升T4级别述职报告【王进思】V2.pptx", "c:/test/晋升T4级别述职报告【王进思】V2.html");
    if (flag1) {
      System.out.println("PPT文件转换成HTML成功！");
    } else {
      System.out.println("PPT文件转换成HTML失败！");
    }
    boolean flag2 = otx.WordtoHtml("c:/test/吴奇的简历.doc", "c:/test/吴奇的简历.html");
    if (flag2) {
      System.out.println("WORD文件转换成HTML成功！");
    } else {
      System.out.println("WORD文件转换成HTML失败！");
    }
    boolean flag3 = otx.ExceltoHtml("c:/test/jimdb集群收集模板-运营研发部-王进思.xlsx", "c:/test/jimdb集群收集模板.html");
    if (flag3) {
      System.out.println("EXCEL文件转换成HTML成功！");
    } else {
      System.out.println("EXCEL文件转换成HTML失败！");
    }
  }
}
