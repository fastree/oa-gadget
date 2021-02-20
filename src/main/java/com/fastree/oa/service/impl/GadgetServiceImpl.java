package com.fastree.oa.service.impl;

import com.alibaba.excel.EasyExcel;
import com.fastree.oa.domain.*;
import com.fastree.oa.listener.LeaveReadListener;
import com.fastree.oa.listener.OvertimeReadListener;
import com.fastree.oa.service.GadgetService;
import com.fastree.oa.utils.GadgetUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.file.Files;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

@Slf4j
@Service
public class GadgetServiceImpl implements GadgetService {

    @Value("${oa.gadget.overtime.download.uri}")
    private String overtimeDownloadUri;
    @Value("${oa.gadget.leave.download.uri}")
    private String leaveDownloadUri;

    @Override
    public void populate28DayOvertime(OvertimeWrite28Data overtimeData, Integer day, Double hour) {
        if (day == 1) {
            overtimeData.setFirstDay(hour);
        } else if (day == 2) {
            overtimeData.setSecondDay(hour);
        } else if (day == 3) {
            overtimeData.setThirdDay(hour);
        } else if (day == 4) {
            overtimeData.setFourthDay(hour);
        } else if (day == 5) {
            overtimeData.setFifthDay(hour);
        } else if (day == 6) {
            overtimeData.setSixthDay(hour);
        } else if (day == 7) {
            overtimeData.setSeventhDay(hour);
        } else if (day == 8) {
            overtimeData.setEighthDay(hour);
        } else if (day == 9) {
            overtimeData.setNinthDay(hour);
        } else if (day == 10) {
            overtimeData.setTenthDay(hour);
        } else if (day == 11) {
            overtimeData.setEleventhDay(hour);
        } else if (day == 12) {
            overtimeData.setTwelfthDay(hour);
        } else if (day == 13) {
            overtimeData.setThirteenthDay(hour);
        } else if (day == 14) {
            overtimeData.setFourteenthDay(hour);
        } else if (day == 15) {
            overtimeData.setFifteenthDay(hour);
        } else if (day == 16) {
            overtimeData.setSixteenthDay(hour);
        } else if (day == 17) {
            overtimeData.setSeventeenthDay(hour);
        } else if (day == 18) {
            overtimeData.setEighteenthDay(hour);
        } else if (day == 19) {
            overtimeData.setNineteenthDay(hour);
        } else if (day == 20) {
            overtimeData.setTwentiethDay(hour);
        } else if (day == 21) {
            overtimeData.setTwentyFistDay(hour);
        } else if (day == 22) {
            overtimeData.setTwentySecondDay(hour);
        } else if (day == 23) {
            overtimeData.setTwentyThirdDay(hour);
        } else if (day == 24) {
            overtimeData.setTwentyFourthDay(hour);
        } else if (day == 25) {
            overtimeData.setTwentyFifthDay(hour);
        } else if (day == 26) {
            overtimeData.setTwentySixthDay(hour);
        } else if (day == 27) {
            overtimeData.setTwentySeventhDay(hour);
        } else if (day == 28) {
            overtimeData.setTwentyEighthDay(hour);
        }
    }

    @Override
    public void populate29DayOvertime(OvertimeWrite29Data overtimeData, Integer day, Double hour) {
        if (day == 1) {
            overtimeData.setFirstDay(hour);
        } else if (day == 2) {
            overtimeData.setSecondDay(hour);
        } else if (day == 3) {
            overtimeData.setThirdDay(hour);
        } else if (day == 4) {
            overtimeData.setFourthDay(hour);
        } else if (day == 5) {
            overtimeData.setFifthDay(hour);
        } else if (day == 6) {
            overtimeData.setSixthDay(hour);
        } else if (day == 7) {
            overtimeData.setSeventhDay(hour);
        } else if (day == 8) {
            overtimeData.setEighthDay(hour);
        } else if (day == 9) {
            overtimeData.setNinthDay(hour);
        } else if (day == 10) {
            overtimeData.setTenthDay(hour);
        } else if (day == 11) {
            overtimeData.setEleventhDay(hour);
        } else if (day == 12) {
            overtimeData.setTwelfthDay(hour);
        } else if (day == 13) {
            overtimeData.setThirteenthDay(hour);
        } else if (day == 14) {
            overtimeData.setFourteenthDay(hour);
        } else if (day == 15) {
            overtimeData.setFifteenthDay(hour);
        } else if (day == 16) {
            overtimeData.setSixteenthDay(hour);
        } else if (day == 17) {
            overtimeData.setSeventeenthDay(hour);
        } else if (day == 18) {
            overtimeData.setEighteenthDay(hour);
        } else if (day == 19) {
            overtimeData.setNineteenthDay(hour);
        } else if (day == 20) {
            overtimeData.setTwentiethDay(hour);
        } else if (day == 21) {
            overtimeData.setTwentyFistDay(hour);
        } else if (day == 22) {
            overtimeData.setTwentySecondDay(hour);
        } else if (day == 23) {
            overtimeData.setTwentyThirdDay(hour);
        } else if (day == 24) {
            overtimeData.setTwentyFourthDay(hour);
        } else if (day == 25) {
            overtimeData.setTwentyFifthDay(hour);
        } else if (day == 26) {
            overtimeData.setTwentySixthDay(hour);
        } else if (day == 27) {
            overtimeData.setTwentySeventhDay(hour);
        } else if (day == 28) {
            overtimeData.setTwentyEighthDay(hour);
        } else if (day == 29) {
            overtimeData.setTwentyNinthDay(hour);
        }
    }

    @Override
    public void populate30DayOvertime(OvertimeWrite30Data overtimeData, Integer day, Double hour) {
        if (day == 1) {
            overtimeData.setFirstDay(hour);
        } else if (day == 2) {
            overtimeData.setSecondDay(hour);
        } else if (day == 3) {
            overtimeData.setThirdDay(hour);
        } else if (day == 4) {
            overtimeData.setFourthDay(hour);
        } else if (day == 5) {
            overtimeData.setFifthDay(hour);
        } else if (day == 6) {
            overtimeData.setSixthDay(hour);
        } else if (day == 7) {
            overtimeData.setSeventhDay(hour);
        } else if (day == 8) {
            overtimeData.setEighthDay(hour);
        } else if (day == 9) {
            overtimeData.setNinthDay(hour);
        } else if (day == 10) {
            overtimeData.setTenthDay(hour);
        } else if (day == 11) {
            overtimeData.setEleventhDay(hour);
        } else if (day == 12) {
            overtimeData.setTwelfthDay(hour);
        } else if (day == 13) {
            overtimeData.setThirteenthDay(hour);
        } else if (day == 14) {
            overtimeData.setFourteenthDay(hour);
        } else if (day == 15) {
            overtimeData.setFifteenthDay(hour);
        } else if (day == 16) {
            overtimeData.setSixteenthDay(hour);
        } else if (day == 17) {
            overtimeData.setSeventeenthDay(hour);
        } else if (day == 18) {
            overtimeData.setEighteenthDay(hour);
        } else if (day == 19) {
            overtimeData.setNineteenthDay(hour);
        } else if (day == 20) {
            overtimeData.setTwentiethDay(hour);
        } else if (day == 21) {
            overtimeData.setTwentyFistDay(hour);
        } else if (day == 22) {
            overtimeData.setTwentySecondDay(hour);
        } else if (day == 23) {
            overtimeData.setTwentyThirdDay(hour);
        } else if (day == 24) {
            overtimeData.setTwentyFourthDay(hour);
        } else if (day == 25) {
            overtimeData.setTwentyFifthDay(hour);
        } else if (day == 26) {
            overtimeData.setTwentySixthDay(hour);
        } else if (day == 27) {
            overtimeData.setTwentySeventhDay(hour);
        } else if (day == 28) {
            overtimeData.setTwentyEighthDay(hour);
        } else if (day == 29) {
            overtimeData.setTwentyNinthDay(hour);
        } else if (day == 30) {
            overtimeData.setThirtiethDay(hour);
        }
    }

    @Override
    public void populate31DayOvertime(OvertimeWrite31Data overtimeData, Integer day, Double hour) {
        if (day == 1) {
            overtimeData.setFirstDay(hour);
        } else if (day == 2) {
            overtimeData.setSecondDay(hour);
        } else if (day == 3) {
            overtimeData.setThirdDay(hour);
        } else if (day == 4) {
            overtimeData.setFourthDay(hour);
        } else if (day == 5) {
            overtimeData.setFifthDay(hour);
        } else if (day == 6) {
            overtimeData.setSixthDay(hour);
        } else if (day == 7) {
            overtimeData.setSeventhDay(hour);
        } else if (day == 8) {
            overtimeData.setEighthDay(hour);
        } else if (day == 9) {
            overtimeData.setNinthDay(hour);
        } else if (day == 10) {
            overtimeData.setTenthDay(hour);
        } else if (day == 11) {
            overtimeData.setEleventhDay(hour);
        } else if (day == 12) {
            overtimeData.setTwelfthDay(hour);
        } else if (day == 13) {
            overtimeData.setThirteenthDay(hour);
        } else if (day == 14) {
            overtimeData.setFourteenthDay(hour);
        } else if (day == 15) {
            overtimeData.setFifteenthDay(hour);
        } else if (day == 16) {
            overtimeData.setSixteenthDay(hour);
        } else if (day == 17) {
            overtimeData.setSeventeenthDay(hour);
        } else if (day == 18) {
            overtimeData.setEighteenthDay(hour);
        } else if (day == 19) {
            overtimeData.setNineteenthDay(hour);
        } else if (day == 20) {
            overtimeData.setTwentiethDay(hour);
        } else if (day == 21) {
            overtimeData.setTwentyFistDay(hour);
        } else if (day == 22) {
            overtimeData.setTwentySecondDay(hour);
        } else if (day == 23) {
            overtimeData.setTwentyThirdDay(hour);
        } else if (day == 24) {
            overtimeData.setTwentyFourthDay(hour);
        } else if (day == 25) {
            overtimeData.setTwentyFifthDay(hour);
        } else if (day == 26) {
            overtimeData.setTwentySixthDay(hour);
        } else if (day == 27) {
            overtimeData.setTwentySeventhDay(hour);
        } else if (day == 28) {
            overtimeData.setTwentyEighthDay(hour);
        } else if (day == 29) {
            overtimeData.setTwentyNinthDay(hour);
        } else if (day == 30) {
            overtimeData.setThirtiethDay(hour);
        } else if (day == 31) {
            overtimeData.setThirtyFirstDay(hour);
        }
    }

    @Override
    public void processLeaveNode(LeaveWriteData writeData, String leaveType, Double leaveDuration) {
        if ("带薪病假".equalsIgnoreCase(leaveType)) {
            writeData.setSickLeaveWithPay(leaveDuration);
        } else if ("病假".equalsIgnoreCase(leaveType)) {
            writeData.setSickLeave(leaveDuration);
        } else if ("年假".equalsIgnoreCase(leaveType)) {
            writeData.setAnnualLeave(leaveDuration);
        } else if ("调休".equalsIgnoreCase(leaveType)) {
            writeData.setRestLeave(leaveDuration);
        } else if ("事假".equalsIgnoreCase(leaveType)) {
            writeData.setPersonalLeave(leaveDuration);
        } else if ("婚假".equalsIgnoreCase(leaveType)) {
            writeData.setMarriageLeave(leaveDuration);
        } else if ("产假".equalsIgnoreCase(leaveType)) {
            writeData.setMaternityLeave(leaveDuration);
        } else if ("哺乳假".equalsIgnoreCase(leaveType)) {
            writeData.setBreastFeedingLeave(leaveDuration);
        } else if ("陪产假".equalsIgnoreCase(leaveType)) {
            writeData.setPaternityLeave(leaveDuration);
        } else if ("丧假".equalsIgnoreCase(leaveType)) {
            writeData.setFuneralLeave(leaveDuration);
        }
    }

    @Override
    public List<MenuData> getUserMenuTree(long userId) {
        MenuData childMenu = new MenuData();
        childMenu.setMenuId(2l);
        childMenu.setParentId(1l);
        childMenu.setMenuName("table");
        childMenu.setMenuTitle("数据加工");
        childMenu.setMenuType(1);
        childMenu.setMenuSort(1);
        childMenu.setMenuHref("/gadget/convert");
        childMenu.setMenuIcon("");
        childMenu.setPermissions("hr:excel:list");
        childMenu.setDeleted(false);
        childMenu.setVersion(1);

        MenuData parentMenu = new MenuData();
        parentMenu.setMenuId(1l);
        parentMenu.setParentId(0l);
        parentMenu.setMenuName("hr");
        parentMenu.setMenuTitle("人事管理");
        parentMenu.setMenuType(0);
        parentMenu.setMenuSort(1);
        parentMenu.setMenuHref("javascript:;");
        parentMenu.setMenuIcon("layui-icon-group");
        parentMenu.setPermissions("");
        parentMenu.setDeleted(false);
        parentMenu.setVersion(1);
        parentMenu.setChildren(Arrays.asList(childMenu));

        return Arrays.asList(parentMenu);
    }

    @Override
    public UploadData createOvertimeTable(MultipartFile file) {
        UploadData uploadData = null;
        InputStream inputStream = null;
        OvertimeReadListener overtimeReaderListener = new OvertimeReadListener();

        // 读取所有的加班记录
        try {
            inputStream = file.getInputStream();
            EasyExcel.read(inputStream, OvertimeReadData.class, overtimeReaderListener).sheet().doRead();
        } catch (IOException e) {
            log.error(e.getMessage());
        } finally {
            try {
                IOUtils.close(inputStream);
            } catch (IOException e) {
                log.error(e.getMessage());
            }
        }

        // 返回前端指定格式的数据
        File overtimeFile = createOvertimeFile(overtimeReaderListener.getDataList(), file.getOriginalFilename());
        if (overtimeFile != null) {
            uploadData = new UploadData();//
            uploadData.setCode(200);
            uploadData.setMsg("上传加班清单成功");
            Map<String, Object> dataMap = new HashMap<>();
            dataMap.put("src", overtimeFile.getPath());
            dataMap.put("action", overtimeDownloadUri);
            dataMap.put("filename", overtimeFile.getName());
            uploadData.setData(dataMap);
        }
        return uploadData;
    }

    private File createOvertimeFile(List<OvertimeReadData> allData, String filename) {
        // 上传文件保存路径
        String projectPath = System.getProperty("user.dir");
        String stamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        File newFile = new File(projectPath, filename.split("\\.")[0] + "_" + stamp + ".xlsx");

        // 通过员工名进行分组
        Map<String, List<OvertimeReadData>> collect = allData.stream()
                .collect(Collectors.groupingBy(OvertimeReadData::getEmpName));

        // 获取月份的最大天数
        String[] strings = filename.substring(4, 11).split("-");
        LocalDate date = LocalDate.of(Integer.parseInt(strings[0]), Integer.parseInt(strings[1]), 1);
        int length = date.getMonth().length(date.isLeapYear());

        // 进行员工数据的填充
        if (length == 28) {
            List<OvertimeWrite28Data> dataList = new ArrayList<>();
            collect.forEach((empName, overtimeList) -> {
                OvertimeWrite28Data overtimeData = new OvertimeWrite28Data();
                overtimeList.forEach(overtime -> {
                    overtimeData.setEmpName(overtime.getEmpName());
                    overtimeData.setDeptName(overtime.getDeptName());
                    populate28DayOvertime(overtimeData, LocalDateTime.ofInstant(overtime.getDate().toInstant(), ZoneId.systemDefault()).getDayOfMonth(), overtime.getHours());
                });
                dataList.add(overtimeData);
            });
            EasyExcel.write(newFile, OvertimeWrite28Data.class).sheet().doWrite(dataList);

        } else if (length == 29) {
            List<OvertimeWrite29Data> dataList = new ArrayList<>();
            collect.forEach((empName, overtimeList) -> {
                OvertimeWrite29Data overtimeData = new OvertimeWrite29Data();
                overtimeList.forEach(overtime -> {
                    overtimeData.setEmpName(overtime.getEmpName());
                    overtimeData.setDeptName(overtime.getDeptName());
                    populate29DayOvertime(overtimeData, LocalDateTime.ofInstant(overtime.getDate().toInstant(), ZoneId.systemDefault()).getDayOfMonth(), overtime.getHours());
                });
                dataList.add(overtimeData);
            });
            EasyExcel.write(newFile, OvertimeWrite29Data.class).sheet().doWrite(dataList);

        } else if (length == 30) {
            List<OvertimeWrite30Data> dataList = new ArrayList<>();
            collect.forEach((empName, overtimeList) -> {
                OvertimeWrite30Data overtimeData = new OvertimeWrite30Data();
                overtimeList.forEach(overtime -> {
                    overtimeData.setEmpName(overtime.getEmpName());
                    overtimeData.setDeptName(overtime.getDeptName());
                    populate30DayOvertime(overtimeData, LocalDateTime.ofInstant(overtime.getDate().toInstant(), ZoneId.systemDefault()).getDayOfMonth(), overtime.getHours());
                });
                dataList.add(overtimeData);
            });
            EasyExcel.write(newFile, OvertimeWrite30Data.class).sheet().doWrite(dataList);

        } else if (length == 31) {
            List<OvertimeWrite31Data> dataList = new ArrayList<>();
            collect.forEach((empName, overtimeList) -> {
                OvertimeWrite31Data overtimeData = new OvertimeWrite31Data();
                overtimeList.forEach(overtime -> {
                    overtimeData.setEmpName(overtime.getEmpName());
                    overtimeData.setDeptName(overtime.getDeptName());
                    populate31DayOvertime(overtimeData, LocalDateTime.ofInstant(overtime.getDate().toInstant(), ZoneId.systemDefault()).getDayOfMonth(), overtime.getHours());
                });
                dataList.add(overtimeData);
            });
            EasyExcel.write(newFile, OvertimeWrite31Data.class).sheet().doWrite(dataList);
        }
        return newFile;

    }

    @Override
    public UploadData createLeaveTable(MultipartFile file) {
        UploadData uploadData = null;
        InputStream inputStream = null;
        LeaveReadListener leaveReadListener = new LeaveReadListener();

        // 读取所有的请假记录
        try {
            inputStream = file.getInputStream();
            EasyExcel.read(inputStream, LeaveReadData.class, leaveReadListener).sheet().doRead();
        } catch (IOException e) {
            log.error(e.getMessage());
        } finally {
            try {
                IOUtils.close(inputStream);
            } catch (IOException e) {
                log.error(e.getMessage());
            }
        }

        // 返回前端指定格式的数据
        File leaveFile = createLeaveFile(leaveReadListener.getDataList(), file.getOriginalFilename());
        if (leaveFile != null) {
            uploadData = new UploadData();//
            uploadData.setCode(200);
            uploadData.setMsg("上传请假清单成功");
            Map<String, Object> dataMap = new HashMap<>();
            dataMap.put("src", leaveFile.getPath());
            dataMap.put("action", leaveDownloadUri);
            dataMap.put("filename", leaveFile.getName());
            uploadData.setData(dataMap);
        }

        return uploadData;
    }

    private File createLeaveFile(List<LeaveReadData> allData, String filename) {
        // 上传文件保存路径
        String projectPath = System.getProperty("user.dir");
        String stamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        File newFile = new File(projectPath, filename.split("\\.")[0] + "_" + stamp + ".xlsx");

        // 全部待写入的数据
        List<LeaveWriteData> writeDataList = new ArrayList<>();

        allData.stream()
                .collect(Collectors.groupingBy(LeaveReadData::getDeptName))
                .entrySet()
                .forEach(deptEntry -> {
                    log.debug("***************正在处理(" + deptEntry.getKey() + ")***************");
                    List<LeaveReadData> deptList = deptEntry.getValue();
                    deptList.stream()
                            .collect(Collectors.groupingBy(LeaveReadData::getEmpName))
                            .entrySet()
                            .forEach(empEntry -> {
                                String empName = empEntry.getKey();
                                List<LeaveReadData> empList = empEntry.getValue();
                                // 每个员工所有的假期为一条记录
                                LeaveWriteData writeData = new LeaveWriteData();
                                writeData.setEmpName(empName);
                                writeData.setDeptName(empList.get(0).getDeptName());

                                log.debug("正在处理(" + empName + ")");
                                empList.stream()
                                        .collect(Collectors.groupingBy(LeaveReadData::getLeaveType))
                                        .entrySet()
                                        .forEach(leaveEntry -> {

                                            String leaveType = leaveEntry.getKey().trim();
                                            List<LeaveReadData> leaveTypeList = leaveEntry.getValue();

                                            Double leaveDuration = leaveTypeList.stream()
                                                    .map(LeaveReadData::getLeaveDuration)
                                                    .reduce(0d, Double::sum);
                                            log.debug("  ==> " + leaveType + " : " + leaveDuration);

                                            processLeaveNode(writeData, leaveType, leaveDuration);
                                        });

                                writeDataList.add(writeData);
                            });
                });

        // 写入业务数据到指定文件
        EasyExcel.write(newFile, LeaveWriteData.class).sheet().doWrite(writeDataList);

        return newFile;
    }

    @Override
    public void downloadTableAction(String filename, HttpServletRequest request, HttpServletResponse response) {
        String projectPath = System.getProperty("user.dir");
        File file = new File(projectPath, filename);

        // 设置响应头字段信息
        try {
            response.setContentType(Files.probeContentType(file.toPath()));
            String downloadFilename = GadgetUtils.getDownloadFilename(request, filename);
            response.addHeader("Content-Disposition", "attachment; filename=" + downloadFilename);
        } catch (IOException e) {
            log.error(e.getMessage());
        }

        // 复制文件流到输出流
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(file);
            outputStream = response.getOutputStream();
            IOUtils.copy(inputStream, outputStream);
        } catch (IOException e) {
            log.error(e.getMessage());
        } finally {
            try {
                IOUtils.close(inputStream);
            } catch (IOException e) {
                log.error(e.getMessage());
            }
            try {
                IOUtils.close(outputStream);
            } catch (IOException e) {
                log.error(e.getMessage());
            }
        }
    }
}
