package com.fastree.oa.controller;

import com.fastree.oa.domain.MenuData;
import com.fastree.oa.domain.UploadData;
import com.fastree.oa.service.GadgetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Slf4j
@Controller
public class GadgetController {

    @Autowired
    private GadgetService gadgetService;

    @GetMapping({"/"})
    public String toIndexPage(Model model) {
        List<MenuData> userMenuTree = gadgetService.getUserMenuTree(1l);
        model.addAttribute("menus", userMenuTree);
        return "index";
    }

    @GetMapping("/gadget/console")
    public String toConsolePage() {
        return "home/console";
    }

    @GetMapping("/gadget/convert")
    public String toConvertPage() {
        return "hr/convert";
    }

    @ResponseBody
    @PostMapping("/gadget/overtime")
    public UploadData uploadOvertimeTable(MultipartFile file) {
        return gadgetService.createOvertimeTable(file);
    }

    @ResponseBody
    @GetMapping("/download/overtime/{filename}")
    public void downloadOvertimeTable(@PathVariable("filename") String filename,
                                      HttpServletRequest request,
                                      HttpServletResponse response) {
        gadgetService.downloadTableAction(filename, request, response);
    }

    @ResponseBody
    @PostMapping("/gadget/leave")
    public UploadData uploadLeaveTable(MultipartFile file) {
        return gadgetService.createLeaveTable(file);
    }

    @ResponseBody
    @GetMapping("/download/leave/{filename}")
    public void downloadLeaveTable(@PathVariable("filename") String filename,
                                   HttpServletRequest request,
                                   HttpServletResponse response) {
        gadgetService.downloadTableAction(filename, request, response);
    }

}
