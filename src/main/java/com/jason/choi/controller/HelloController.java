package com.jason.choi.controller;

import com.jason.choi.model.JobInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by choi on 2017/8/1.
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String greeting(@RequestParam(value = "name", required = false, defaultValue = "world") String name, Model model){
        model.addAttribute("name", name);
        return "hello";
    }

    @RequestMapping("/table")
    public String getTable(Model model){

        JobInfo info = new JobInfo();
        info.setJobId(1);
        info.setJobName("test1");
        info.setMainClass("com.jason.choi.main");
        info.setAppId("applicationId-1001");
        info.setJobStatus("running");

        JobInfo info1 = new JobInfo();
        info1.setJobId(2);
        info1.setJobName("test2");
        info1.setMainClass("com.jason.choi.Main");
        info1.setAppId("applicationId-1002");
        info1.setJobStatus("stopped");

        JobInfo info2 = new JobInfo();
        info2.setJobId(3);
        info2.setJobName("test3");
        info2.setMainClass("com.jason.choi.main");
        info2.setAppId("applicationId-1003");
        info2.setJobStatus("error");

        List<JobInfo> jobs = new ArrayList<>();
        jobs.add(info);
        jobs.add(info1);
        jobs.add(info2);

        model.addAttribute("jobs", jobs);

        return "hello";
    }
}
