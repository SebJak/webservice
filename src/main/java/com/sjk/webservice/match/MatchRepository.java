package com.sjk.webservice.match;

import java.util.List;

public class MatchRepository implements IRepository<Match> {

    private List<Match> matches;

    @Override
    public void save(Match input) {
        matches.add(input);
    }
}
