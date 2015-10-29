package org.maxur.sample.junit;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.maxur.sample.junit.Main.triple;

public class MainTest {

    @Test
    public void testTriple() {
        assertThat(triple("AB")).isEqualTo("ABABAB");
    }
}