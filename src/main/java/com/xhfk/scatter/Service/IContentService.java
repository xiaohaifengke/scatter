package com.xhfk.scatter.Service;

import com.xhfk.scatter.vo.ContentVo;

import java.util.List;

/**
 * 首页内容相关
 */
public interface IContentService {

    /**
     * 获取首页文章列表
     */
    List<ContentVo> getContents(Integer p, Integer limit);
}
