package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class Rectangl1Test {
    @Test
    public void tetsConstructorOk(){
        Assertions.assertDoesNotThrow(() -> new Rectangl1(4,5));
    }
    @Test
    public void tetsConstructorBad1(){
        Assertions.assertThrows(Exception.class, () -> new Rectangl1(-4,3));
        Assertions.assertThrows(Exception.class, () -> new Rectangl1(-4,-3));
        Assertions.assertThrows(Exception.class, () -> new Rectangl1(4,-3));
    }
    @Test
    public void tetsConstructorBad2() {
        Assertions.assertThrows(Exception.class, () -> new Rectangl1(0, 3));
        Assertions.assertThrows(Exception.class, () -> new Rectangl1(0, 0));
        Assertions.assertThrows(Exception.class, () -> new Rectangl1(4, 0));
    }
    @Test
    public void tetsPerimitr1() throws Exception {
        Rectangl1 r1 = new Rectangl1(4, 3);
        Rectangl1 r2 = new Rectangl1(4, 3);
        Rectangl1 r3 = new Rectangl1(4, 3);
    }
    @Test
    void testEqualsYes() throws Exception {
        Rectangl1  r1 = new Rectangl1( 4,3);
        Assertions.assertTrue(r1.equals(r1));
        //Assertions.assertTrue();
    }



}