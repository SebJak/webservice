package com.sjk.webservice.match;

import java.util.Collections;
import java.util.List;

public class MatchApi {

    private IRepository<Match> repository;

    public MatchApi(IRepository repository) {
        this.repository = repository;
    }

    public List<Match> readMatches() {
        return Collections.emptyList();
    }

    public void save(Match item) {
        repository.save(item);
    }
}
