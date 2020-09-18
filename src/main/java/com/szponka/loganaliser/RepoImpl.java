package com.szponka.loganaliser;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class RepoImpl implements Repo {

    public List<String> myList = new ArrayList<>();


    @Override
    public List<String> getLogs(String adress, String id) {
        System.out.println(adress + id);
        return myList;
    }
    @Override
    public void addToList(String input) {
        myList.add(input);
    }
}

