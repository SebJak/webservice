package com.sjk.webservice.match;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;

public class MatchApiTest {

    private MatchApi matchApi;

    @Before
    public void setup() {
        matchApi = new MatchApi(new MatchRepository());
    }

    @Test
    public void shouldReturnZeroItemWhenDbIsEmpty() {
        Assert.assertThat(matchApi.readMatches().size(), is(0));
    }

    @Test
    public void shouldReturnAllItemsFromDb() {
        insertOneMatch();
        Assert.assertThat(matchApi.readMatches().size(), is(1));
    }

    private void insertOneMatch() {
        matchApi.save(Match.builder().build());
    }

}