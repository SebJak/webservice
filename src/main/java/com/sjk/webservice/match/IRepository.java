package com.sjk.webservice.match;

import java.util.List;

public interface IRepository<L> {

    IRepository save(L input);

    List<L> findAll();
}
