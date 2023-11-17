package hw3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import tasks.hw3.SomeNumber;
import static org.assertj.core.api.Assertions.*;


public class SomeNumberTest {
    private SomeNumber someNumber;

    @BeforeEach
    void setup(){
        someNumber = new SomeNumber();
    }
    @ParameterizedTest
    @ValueSource(ints = {6,4,2})
    void evenNumberTest(int n){
        assertThat(someNumber.evenOddNumber(n)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {15,3,1})
    void oddNumberTest(int n){
        assertThat(someNumber.evenOddNumber(n)).isFalse();
    }

    @ParameterizedTest
    @ValueSource(ints = {28,50,99})
    void numberInInterval(int n){
        assertThat(someNumber.numberInInterval(n)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {25,3,100})
    void numberOutOfInterval(int n){
        assertThat(someNumber.numberInInterval(n)).isFalse();
    }

}
