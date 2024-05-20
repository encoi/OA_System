package com.team.oa_system.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class dept {
    private Integer id;
    private String name;
    private LocalDate creatTime;
    private LocalDate updateTime;

}
