package com.fastree.oa.utils;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;

@Slf4j
public class GadgetUtils {
    public static String getDownloadFilename(HttpServletRequest request, String filename) {
        String downloadName = null;
        String userAgent = request.getHeader("User-Agent");
        try {
            if (userAgent.contains("MSIE") || userAgent.contains("Trident")) {
                downloadName = java.net.URLEncoder.encode(filename, "UTF-8");
            } else {
                downloadName = new String(filename.getBytes("UTF-8"), "ISO-8859-1");
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return downloadName;
    }
}
