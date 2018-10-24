package com.sjk.webservice.match;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by snjw on 24/10/2018.
 */
@RestController(value= "matches")
public class MatchRestApi extends MatchApi {

    public MatchRestApi(IRepository repository) {
        super(repository);
    }

    @GetMapping()
    public ResponseEntity<Matches> get() {
        return ResponseEntity.ok(readMatches());
    }
}
