package org.ppke.itk.worldcupbets.controller;

import org.ppke.itk.worldcupbets.controller.dto.TeamDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TeamController {

    @GetMapping("api/teams")
    List<TeamDTO> all() {
        List<TeamDTO> dtoList = new ArrayList<>();
        dtoList.add(new TeamDTO("0", "Brazil", 1837.56, "https://www.worldometers.info/img/flags/br-flag.gif"));
        dtoList.add(new TeamDTO("1", "Belgium", 1821.92, "https://www.worldometers.info/img/flags/be-flag.gif"));
        dtoList.add(new TeamDTO("2", "Argentina", 1770.65, "https://www.worldometers.info/img/flags/ar-flag.gif"));
        dtoList.add(new TeamDTO("3", "France", 1764.85, "https://www.worldometers.info/img/flags/fr-flag.gif"));
        dtoList.add(new TeamDTO("4", "Denmark", 1665.47, "https://www.worldometers.info/img/flags/da-flag.gif"));
        dtoList.add(new TeamDTO("5", "Spain", 1716.93, "https://www.worldometers.info/img/flags/sp-flag.gif"));
        dtoList.add(new TeamDTO("6", "Portugal", 1678.65, "https://www.worldometers.info/img/flags/po-flag.gif"));
        dtoList.add(new TeamDTO("7", "Germany", 1658.96, "https://www.worldometers.info/img/flags/gm-flag.gif"));
        dtoList.add(new TeamDTO("8", "England", 1737.46, "https://flagpedia.net/data/flags/h80/gb-eng.webp"));
        dtoList.add(new TeamDTO("9", "Qatar", 1441.41, "https://www.worldometers.info/img/flags/qa-flag.gif"));
        dtoList.add(new TeamDTO("10", "Mexico", 1649.57, "https://www.worldometers.info/img/flags/mx-flag.gif"));
        dtoList.add(new TeamDTO("11", "Netherlands", 1679.41, "https://www.worldometers.info/img/flags/nl-flag.gif"));
        dtoList.add(new TeamDTO("12", "Uruguay", 1643.71, "https://www.worldometers.info/img/flags/uy-flag.gif"));
        dtoList.add(new TeamDTO("13", "Switzerland", 1621.43, "https://www.worldometers.info/img/flags/sz-flag.gif"));
        dtoList.add(new TeamDTO("14", "USA", 1635.01, "https://www.worldometers.info/img/flags/us-flag.gif"));
        dtoList.add(new TeamDTO("15", "Croatia", 1632.15, "https://www.worldometers.info/img/flags/hr-flag.gif"));
        dtoList.add(new TeamDTO("16", "Senegal", 1593.45, "https://www.worldometers.info/img/flags/sg-flag.gif"));
        dtoList.add(new TeamDTO("17", "Iran", 1558.64, "https://www.worldometers.info/img/flags/ir-flag.gif"));
        dtoList.add(new TeamDTO("18", "Japan", 1552.77, "https://www.worldometers.info/img/flags/ja-flag.gif"));
        dtoList.add(new TeamDTO("19", "Morocco", 1558.9, "https://www.worldometers.info/img/flags/mo-flag.gif"));
        dtoList.add(new TeamDTO("20", "Serbia", 1549.53, "https://www.worldometers.info/img/flags/ri-flag.gif"));
        dtoList.add(new TeamDTO("21", "Poland", 1546.18, "https://www.worldometers.info/img/flags/pl-flag.gif"));
        dtoList.add(new TeamDTO("22", "South Korea", 1526.2, "https://www.worldometers.info/img/flags/ks-flag.gif"));
        dtoList.add(new TeamDTO("23", "Tunisia", 1507.86, "https://www.worldometers.info/img/flags/ts-flag.gif"));
        dtoList.add(new TeamDTO("24", "Cameroon", 1484.95, "https://www.worldometers.info/img/flags/cm-flag.gif"));
        dtoList.add(new TeamDTO("25", "Canada", 1473.82, "https://www.worldometers.info/img/flags/ca-flag.gif"));
        dtoList.add(new TeamDTO("26", "Ecuador", 1463.74, "https://www.worldometers.info/img/flags/ek-flag.gif"));
        dtoList.add(new TeamDTO("27", "Saudi Arabia", 1435.74, "https://www.worldometers.info/img/flags/sa-flag.gif"));
        dtoList.add(new TeamDTO("28", "Ghana", 1389.68, "https://www.worldometers.info/img/flags/gh-flag.gif"));
        dtoList.add(new TeamDTO("29", "Wales", 1582.13, "https://flagpedia.net/data/flags/h80/gb-wls.webp"));
        dtoList.add(new TeamDTO("30", "Costa Rica", 1500.06, "https://www.worldometers.info/img/flags/cs-flag.gif"));
        dtoList.add(new TeamDTO("31", "Australia", 1483.73, "https://www.worldometers.info/img/flags/as-flag.gif"));
        return dtoList;
    }

}
