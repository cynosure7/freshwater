package com.helloowen.freshwater;

import java.util.List;

/**
 * Created by caoo on 10/02/2016.
 */
public interface FindComponent {

    Element find(String selector);

    List<Element> findAll(String selector);
}
