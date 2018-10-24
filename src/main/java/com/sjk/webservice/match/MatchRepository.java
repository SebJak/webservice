package com.sjk.webservice.match;

import java.util.ArrayList;
import java.util.List;

public class MatchRepository implements IRepository<Match> {

    private List<Match> matches = new ArrayList<>();

    @Override
    public IRepository save(Match input) {
        matches.add(input);
        return this;
    }

    @Override
    public List<Match> findAll() {
        return matches;
    }
}
