package com.sjk.webservice.match;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by snjw on 24/10/2018.
 */
@Data
@Builder
public class Matches {

    @Builder.Default
    List<Match> matches = new ArrayList<>();
}
