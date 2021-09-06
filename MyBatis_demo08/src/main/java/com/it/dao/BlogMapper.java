package com.it.dao;

import com.it.bean.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author ZuYingFang
 * @time 2021-08-16 20:51
 */
public interface BlogMapper {

    // 插入数据
    int addBlog(Blog blog);

    // 查询博客
    List<Blog> queryBlogIF(Map<String, Object> map);

    List<Blog> queryBlogChoose(Map<String, Object> map);


    int updateBlogBySet(Map<String, Object> map);

    List<Blog> queryBlogForeach(Map<String, Object> map);


}
