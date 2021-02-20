package com.fastree.oa.service;

import com.fastree.oa.domain.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface GadgetService {
    void populate28DayOvertime(OvertimeWrite28Data overtimeData, Integer day, Double hour);

    void populate29DayOvertime(OvertimeWrite29Data overtimeData, Integer day, Double hour);

    void populate30DayOvertime(OvertimeWrite30Data overtimeData, Integer day, Double hour);

    void populate31DayOvertime(OvertimeWrite31Data overtimeData, Integer day, Double hour);

    List<MenuData> getUserMenuTree(long userId);

    UploadData createOvertimeTable(MultipartFile file);

    UploadData createLeaveTable(MultipartFile file);

    void processLeaveNode(LeaveWriteData writeData, String leaveType, Double leaveDuration);

    void downloadTableAction(String filename, HttpServletRequest request, HttpServletResponse response);
}
