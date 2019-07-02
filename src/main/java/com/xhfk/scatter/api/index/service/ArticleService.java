package com.xhfk.scatter.api.index.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xhfk.scatter.api.base.PaginationRequestVO;
import com.xhfk.scatter.dao.ArticleVOMapper;
import com.xhfk.scatter.api.index.vo.ArticleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ArticleService {

    @Autowired
    private ArticleVOMapper articleVOMapper;

    private Map<String, String> orderByMap = new HashMap<String, String>();

    public ArticleService () {
        orderByMap.put("hot", "view_counts");
        orderByMap.put("recent", "create_date");
    }

    public List<ArticleVO> listArticles() {
        return articleVOMapper.listArticles();
    }

    public List<ArticleVO> listArticles(PaginationRequestVO page) {
        List<ArticleVO> articles = articleVOMapper.listArticles(page);
        return articles;
    }

    public List<ArticleVO> listArticlesByPageHelper() {
        return articleVOMapper.listArticlesByPageHelper();
    }


    public PageInfo<ArticleVO> listArticlesByPageHelper(PaginationRequestVO page) {
        PageHelper.startPage(page.getPageIndex(), page.getPageSize());
        List<ArticleVO> articles = articleVOMapper.listArticlesByPageHelper();
        return new PageInfo<>(articles);
    }

    /**
     * 获取分类的文章列表
     *
     * @param { string } categories ["hot"| "recent"]
     * @return
     */
    public List<ArticleVO> listArticlesByCategories(String categories) {
        String orderByParam = orderByMap.get(categories);
        return articleVOMapper.listArticlesByCategories(orderByParam);
    }
}
