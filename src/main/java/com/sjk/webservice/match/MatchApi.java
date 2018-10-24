package com.sjk.webservice.match;

abstract class MatchApi {

    private IRepository<Match> repository;

    MatchApi(IRepository<Match> repository) {
        this.repository = repository;
    }

    Matches readMatches() {
        return Matches.builder().matches(repository.findAll()).build();
    }

    void save(Match item) {
        repository.save(item);
    }
}
