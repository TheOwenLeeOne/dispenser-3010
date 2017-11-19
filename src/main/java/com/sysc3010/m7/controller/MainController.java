package com.sysc3010.m7.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sysc3010.m7.model.PatientSearchForm;
import com.sysc3010.m7.service.ScheduleService;

@Controller
public class MainController {

    @Autowired
    ScheduleService scheduleService;
    

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public ModelAndView mainGet() {
        ModelAndView mav = new ModelAndView("/main");
        mav.addObject("patientList", scheduleService.getAllPatients());
        mav.addObject("patientForm", new PatientSearchForm());
        return mav;
    }

    

    
}
