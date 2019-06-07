package com.xhfk.scatter.api.index.restful;

import com.xhfk.scatter.api.base.PaginationRequestVO;
import com.xhfk.scatter.api.index.service.ArticleService;
import com.xhfk.scatter.api.index.vo.ArticleVO;
import com.xhfk.scatter.domain.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("api/v1/articles")
public class ArticleApi {

    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "search", method = RequestMethod.GET)
    // public RestResponse<List<ArticleVO>> listArticles(HttpServletRequest request, @RequestBody PaginationRequestVO page) {
    public RestResponse<List<ArticleVO>> listArticles(HttpServletRequest request) {
        List<ArticleVO> articles = articleService.listArticles();
        return RestResponse.success(articles);
    }
}
