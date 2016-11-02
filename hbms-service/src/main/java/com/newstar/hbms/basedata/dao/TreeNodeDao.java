package com.newstar.hbms.basedata.dao;

import com.newstar.hbms.basedata.domain.TreeNode;

import java.util.List;

/**
 * Created by fellowlong on 2014-10-30.
 */
public interface TreeNodeDao {

  public int insert(TreeNode treeNode);

  public int update(TreeNode treeNode);

  public int deleteByIds(Long[] nodeIds);

  public List<TreeNode> findAll();

  public List<TreeNode> findByAncestorCode(String code);

  public TreeNode findByCode(String code);

  public List<TreeNode> findByIds(Long[] ids);

}
