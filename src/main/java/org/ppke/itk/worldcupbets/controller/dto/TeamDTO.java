package org.ppke.itk.worldcupbets.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class TeamDTO implements Serializable {
    private String id;
    private String name;
    private double rankingPoints;
    private String flagPath;
}
