package com.helloowen.freshwater;

import java.util.List;

public interface FindComponent {

    Element find(String selector);

    List<Element> findAll(String selector);
}
