package com.sjk.webservice.match;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Map;

@Data
@Builder
public class Match {

    private LocalDateTime startDate;

    private Map<Team, Team> competitors;

    private String score;

    private class Team {
        private String name;
    }

}
