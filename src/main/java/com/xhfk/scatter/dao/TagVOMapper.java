package com.xhfk.scatter.dao;

import com.xhfk.scatter.api.base.vo.TagVO;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagVOMapper {
    @Select("select * from me_tag")
    List<TagVO> listAllTags();

    @Select("select * from me_tag limit 6")
    @Results(@Result(column = "avatar", property = "icon", javaType = String.class))
    List<TagVO> listHotTags();
}