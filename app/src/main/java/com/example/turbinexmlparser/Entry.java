package com.example.turbinexmlparser;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

public class Entry {
    public final String title;

    public Entry(String title) {
        this.title = title;
    }
}