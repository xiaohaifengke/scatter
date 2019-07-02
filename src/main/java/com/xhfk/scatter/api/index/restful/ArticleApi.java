package com.xhfk.scatter.api.index.restful;

import com.github.pagehelper.PageInfo;
import com.xhfk.scatter.api.base.PaginationRequestVO;
import com.xhfk.scatter.api.base.PaginationResponseVO;
import com.xhfk.scatter.api.index.service.ArticleService;
import com.xhfk.scatter.api.index.vo.ArticleVO;
import com.xhfk.scatter.domain.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("api/1.0")
public class ArticleApi {

    @Autowired
    private ArticleService articleService;

    /**
     * unrestful api
     */
    @RequestMapping(value = "articles_list", method = RequestMethod.POST)
    public RestResponse<PaginationResponseVO<ArticleVO>> listArticlesByPageHelper(@RequestBody PaginationRequestVO page) {
        PageInfo<ArticleVO> pageInfo = articleService.listArticlesByPageHelper(page);
        List<ArticleVO> list = pageInfo.getList();
        PaginationResponseVO<ArticleVO> articleResult = new PaginationResponseVO((int) pageInfo.getTotal(), list);
        return RestResponse.success(articleResult);
    }

    /**
     * restful api
     * @param pageIndex
     * @param pageSize
     * @param categories
     * @return
     */
    @RequestMapping(value = "articles", method = RequestMethod.GET)
    public RestResponse<?> listArticles(@RequestParam(value = "pageIndex", required = false) Integer pageIndex,
                                        @RequestParam(value = "pageSize", required = false) Integer pageSize,
                                        @RequestParam(value = "categories", required = false) String categories) {
        if (categories != null) { // "hot" "recent"
            List<ArticleVO> list = articleService.listArticlesByCategories(categories);
            return RestResponse.success(list);
        } else if (pageIndex != null) {
            PaginationRequestVO pageParams = new PaginationRequestVO(pageIndex, pageSize);
            List<ArticleVO> list = articleService.listArticles(pageParams);
            PaginationResponseVO<ArticleVO> articleResult = new PaginationResponseVO(0, list);
            return RestResponse.success(articleResult);
        }
        return null;
    }
}
