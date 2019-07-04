package com.xhfk.scatter.api.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel(value = "PaginationResponseVO", description = "返回分页基础VO")
public class PaginationResponseVO<T> {
    @ApiModelProperty(example = "20", value = "返回当前页显示记录数")
    private int perPage = 20;
    @ApiModelProperty(example = "20", value = "返回当前页码")
    private int pageNum;
    @ApiModelProperty(example = "20", value = "返回总记录数")
    private int totalCount;
    @ApiModelProperty(value = "返回结果", required = true)
    private List<T> list;

    public PaginationResponseVO(List<T> list) {
        this.list = list;
    }

    public PaginationResponseVO(int perPage, int pageNum, List<T> list) {
        this.perPage = perPage;
        this.pageNum = pageNum;
        this.list = list;
    }

    public PaginationResponseVO(int perPage, int pageNum, int totalCount, List<T> list) {
        this.perPage = perPage;
        this.pageNum = pageNum;
        this.totalCount = totalCount;
        this.list = list;
    }

    public PaginationResponseVO(int totalCount, List<T> list) {
        this.totalCount = totalCount;
        this.list = list;
    }
}
