package com.xhfk.scatter.api.index.dao;

import com.xhfk.scatter.api.base.PaginationRequestVO;
import com.xhfk.scatter.api.index.vo.ArticleVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleVOMapper {
    /**
     * 获取文章列表
     */
    List<ArticleVO> listArticles();

    List<ArticleVO> listArticles(PaginationRequestVO page);

    List<ArticleVO> listArticlesByPageHelper();

    List<ArticleVO> listArticlesByPageHelper(PaginationRequestVO page);
}
