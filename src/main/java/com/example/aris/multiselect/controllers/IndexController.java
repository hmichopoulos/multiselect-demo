package com.example.aris.multiselect.controllers;

import com.example.aris.multiselect.model.FourLevelsSelection;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by haris on 24/2/2016.
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        return "index";
    }

    @RequestMapping(value = "/levels", method = RequestMethod.GET)
    public @ResponseBody
    FourLevelsSelection levels(
            @RequestParam List<String> levelOne,
            @RequestParam(required = false) List<String> levelTwo,
            @RequestParam(required = false) List<String> levelThree
    ) {
        return findAvailableSelections(levelOne, levelTwo, levelThree);
    }

    private FourLevelsSelection findAvailableSelections(
            List<String> levelOne,
            List<String> levelTwo,
            List<String> levelThree
    ) {
        FourLevelsSelection res = new FourLevelsSelection();
        res.getLevelOne().add("A");
        res.getLevelOne().add("B");
        if (levelOne.contains("A")) {
            res.getLevelTwo().add("A1");
            res.getLevelTwo().add("A2");
        }
        if (levelOne.contains("B")) {
            res.getLevelTwo().add("B1");
            res.getLevelTwo().add("B2");
            res.getLevelTwo().add("B3");
        }
        for (String s : new String[]{"A1", "A2", "B1", "B2", "B3"}) {
            if (levelTwo.contains(s) && res.getLevelTwo().contains(s)) {
                res.getLevelThree().add(s + "Z");
                if (levelThree.contains(s + "Z")) {
                    res.getLevelFour().add(s + "Z9");
                    res.getLevelFour().add(s + "Z8");
                    res.getLevelFour().add(s + "Z7");
                }
                res.getLevelThree().add(s + "Y");
                if (levelThree.contains(s + "Y")) {
                    res.getLevelFour().add(s + "Z9");
                }
            }
        }
        return res;
    }
}
