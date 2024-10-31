package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExerectangleTest {
    @Test
    void loadOk1() throws Exception {
        String s = "src/test/resources/ok1.txt";
        List<Rectangl1> actual = Exerectangle.load(s);
        List<Rectangl1> expected = new ArrayList<>();
        expected.add(new Rectangl1(4,3));
        Assertions.assertIterableEquals(expected,actual);

    }

}