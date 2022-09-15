package com.idealista.hackathon;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MainTest {

    private static Stream<Arguments> nextGen() {
        return Stream.of(
                Arguments.of(
                        "0000000,0000000,0011100,0000100,0001000,0000000,0000000",
                        "0000000,0001000,0001100,0010100,0000000,0000000,0000000"),
                Arguments.of(
                        "0000000,0001000,0001100,0010100,0000000,0000000,0000000",
                        "0000000,0001100,0010100,0000100,0000000,0000000,0000000"),
                Arguments.of(
                        "0000000,0001100,0010100,0000100,0000000,0000000,0000000",
                        "0000000,0001100,0000110,0001000,0000000,0000000,0000000"),
                Arguments.of(
                        "0000000,0001100,0000110,0001000,0000000,0000000,0000000",
                        "0000000,0001110,0000010,0000100,0000000,0000000,0000000")
        );
    }

    @Test
    public void isAlive() {

    }

    @ParameterizedTest
    @MethodSource("nextGen")
    public void nextGen(String input, String output) {

    }

}
