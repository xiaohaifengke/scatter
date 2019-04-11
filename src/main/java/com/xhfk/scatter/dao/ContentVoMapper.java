package com.xhfk.scatter.dao;

import com.xhfk.scatter.vo.ContentVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContentVoMapper {

    /**
     * 获取首页列表
     * */
    List<ContentVo> selectByExampleWithBLOBs();

    /**
     * 获取首页列表
     * */
    List<ContentVo> selectIndexContentList();
}
