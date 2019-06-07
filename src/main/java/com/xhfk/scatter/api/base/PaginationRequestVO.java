package com.xhfk.scatter.api.base;

import com.xhfk.scatter.Constant;

public class PaginationRequestVO {

    /*
     *每页显示的记录数,默认20
     */
    private int pageSize = Constant.PAGINATION_ITEMS_PER_PAGE;

    /*
     *当前页码，0为第一页
     */
    private int pageIndex = 0;
}