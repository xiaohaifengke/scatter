package com.xhfk.scatter.dao;

import com.xhfk.scatter.api.base.PaginationRequestVO;
import com.xhfk.scatter.api.index.vo.ArticleVO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
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

    @Select("select * from me_article order by ${orderByParam} desc limit 0, 2")
    List<ArticleVO> listArticlesByCategories (@Param("orderByParam") String orderByParam);
}
