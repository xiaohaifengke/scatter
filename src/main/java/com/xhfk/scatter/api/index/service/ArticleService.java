package com.xhfk.scatter.api.index.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xhfk.scatter.api.base.PaginationRequestVO;
import com.xhfk.scatter.api.index.dao.ArticleVOMapper;
import com.xhfk.scatter.api.index.vo.ArticleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    @Autowired
    private ArticleVOMapper articleVOMapper;

    public List<ArticleVO> listArticles() {
        return articleVOMapper.listArticles();
    }


    public List<ArticleVO> listArticles(PaginationRequestVO page) {
        List<ArticleVO> articles =  articleVOMapper.listArticles(page);
        return articles;
    }

    public List<ArticleVO> listArticlesByPageHelper() {
        return articleVOMapper.listArticlesByPageHelper();
    }


    public PageInfo<ArticleVO> listArticlesByPageHelper(PaginationRequestVO page) {
        PageHelper.startPage(page.getPageIndex(), page.getPageSize());
        List<ArticleVO> articles =  articleVOMapper.listArticlesByPageHelper();
        return new PageInfo<>(articles);
    }
}
