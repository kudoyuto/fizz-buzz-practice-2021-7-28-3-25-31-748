package tdd.fizzbuzz;

import javafx.beans.binding.BooleanExpression;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//You are a PE teacher.Five minutes before your class is dismissed, you decides to play a game with all students at your class. The rule is as below:
//        Let all the students stand in one line and everyone counts off in order.
//        During counting off, if the number is the multiples of the first special number, number three (3), then the student should say Fizz; if the number is the multiples of the second special number, number five (5), say Buzz; if the multiples of the third special number, number seven (7), say Whizz.
//        During counting off, if the number is the multiples of two special numbers, eg. the first and second numbers, t
//        hen a student should say FizzBuzz instead of this number, so on and so forth. If the number is the multiples of three special numbers, say FizzBuzzWhizz.
public class FizzBuzzTest {
    @Test
    void should_return_Whizz_when_count_off_given_order_number_multiple_of_7 (){
        //Given
        int orderNumber =7;
        //When
        String result = FizzBuzz.countOff(orderNumber);
        //Then
        assertThat(result).isEqualTo("7");

    }



}
