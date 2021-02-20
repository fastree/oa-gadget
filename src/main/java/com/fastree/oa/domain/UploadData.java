package com.fastree.oa.domain;

import lombok.Data;

import java.util.Map;

@Data
public class UploadData {
    private Integer code;
    private String msg;
    private Map<String, Object> data;
}
