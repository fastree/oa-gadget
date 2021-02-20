package com.fastree.oa.domain;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class OvertimeReadData {

    @ExcelProperty("申请人")
    private String empName;
    @ExcelProperty("部门")
    private String deptName;
    @ExcelProperty("加班日期")
    private Date date;
    @ExcelProperty("加班时间")
    private Double hours;
    @ExcelProperty("加班类型")
    private String types;
}