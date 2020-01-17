package com.aiwebops.house.biz.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.aiwebops.house.common.model.Blog;
import com.aiwebops.house.common.page.PageParams;

@Mapper
public interface BlogMapper {

	public List<Blog> selectBlog(@Param("blog") Blog query, @Param("pageParams") PageParams params);

	public Long selectBlogCount(Blog query);

}
