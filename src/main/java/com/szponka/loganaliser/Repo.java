package com.szponka.loganaliser;

import java.util.List;

public interface Repo {

    List<String> getLogs(String adress, String id);
    void addToList(String input);

}
