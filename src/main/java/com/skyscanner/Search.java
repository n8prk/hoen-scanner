package com.skyscanner;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Search {

    /**
     * During deserialization (JSON -> Java): "When you see a JSON key named "city", map its value into this city field."
     * During serialization (Java -> JSON): "When converting this object to JSON, include this field as a key-value pair."
     */
    @JsonProperty
    private String city;

    public Search() {

    }

    public Search(String city) { this.city = city; }

    public String getCity() { return city;  }

}
