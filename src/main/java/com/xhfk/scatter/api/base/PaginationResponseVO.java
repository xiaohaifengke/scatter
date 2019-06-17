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
    private List<T> datas;

    public PaginationResponseVO(List<T> datas) {
        this.datas = datas;
    }

    public PaginationResponseVO(int perPage, int pageNum, List<T> datas) {
        this.perPage = perPage;
        this.pageNum = pageNum;
        this.datas = datas;
    }

    public PaginationResponseVO(int perPage, int pageNum, int totalCount, List<T> datas) {
        this.perPage = perPage;
        this.pageNum = pageNum;
        this.totalCount = totalCount;
        this.datas = datas;
    }

    public PaginationResponseVO(int totalCount, List<T> datas) {
        this.totalCount = totalCount;
        this.datas = datas;
    }
}
