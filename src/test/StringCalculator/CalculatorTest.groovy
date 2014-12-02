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

    def "should return 1 when given 1"(){
        when: 'given empty string'
        result = it.add('1')
        then: 'return 1'
        result == 1

    }

    def "should return 2 when given 1,1"(){
        when: 'given 1,1'
        result = it.add('1,1')
        then: 'return 2'
        result == 2
    }

    def "should handle new lines as delimiter"(){
        when:'given 1\n1'
        result = it.add('1\n1')
        then: 'return 2'
        result == 2
    }

    def "should handle custom delimiter"(){
        when:
        result = it.add('//,\n1,2')
        then:
        result == 3
    }


}
