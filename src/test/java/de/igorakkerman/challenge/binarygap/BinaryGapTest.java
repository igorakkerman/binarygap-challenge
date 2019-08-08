package de.igorakkerman.challenge.binarygap;

import org.junit.jupiter.api.Test;

import static de.igorakkerman.challenge.binarygap.BinaryGap.binaryGap;
import static org.assertj.core.api.Assertions.assertThat;

class BinaryGapTest {

    @Test
    void for0() {
        assertThat(binaryGap(0)).isEqualTo(0);
    }

    @Test
    void for1() {
        assertThat(binaryGap(1)).isEqualTo(0);
    }

    @Test
    void for2() {
        assertThat(binaryGap(2)).isEqualTo(0);
    }

    @Test
    void for3() {
        assertThat(binaryGap(3)).isEqualTo(0);
    }

    @Test
    void for4() {
        assertThat(binaryGap(4)).isEqualTo(0);
    }

    @Test
    void for5() {
        assertThat(binaryGap(5)).isEqualTo(1);
    }

    @Test
    void for6() {
        assertThat(binaryGap(6)).isEqualTo(0);
    }

    @Test
    void for7() {
        assertThat(binaryGap(7)).isEqualTo(0);
    }

    @Test
    void for8() {
        assertThat(binaryGap(8)).isEqualTo(0);
    }

    @Test
    void for9() {
        assertThat(binaryGap(9)).isEqualTo(2);
    }

    @Test
    void for2_147_483_619() {
        assertThat(binaryGap(2_147_483_619)).isEqualTo(3);
    }
}
