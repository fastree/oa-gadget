package com.fastree.oa.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson.JSON;
import com.fastree.oa.domain.LeaveReadData;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Slf4j
public class LeaveReadListener extends AnalysisEventListener<LeaveReadData> {
    @Getter
    private List<LeaveReadData> dataList = new CopyOnWriteArrayList<>();

    @Override
    public void invoke(LeaveReadData data, AnalysisContext context) {
        log.debug("解析到一条数据:{}", JSON.toJSONString(data));
        dataList.add(data);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        log.debug("所有数据解析完成！");
    }
}
