package StringCalculator

import fizzBuzz.FizzBuzz
import spock.lang.Specification


class CalculatorTest extends Specification {
    def it
    def result
    def setup(){
        it = new Calculator()
    }
    def "should return 0 when given empty string"(){
        when: 'given empty string'
        result = it.add('')
        then: 'return 0'
        result == 0

    }
}
