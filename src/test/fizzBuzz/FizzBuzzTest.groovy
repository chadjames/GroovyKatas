package fizzBuzz

import spock.lang.Specification


class FizzBuzzTest extends Specification {
    def it
    def result

    def setup(){
        it = new FizzBuzz()
    }

    def "should return list of one when given 1"(){
        when:
            result = it.fizzBuzz([1])
        then:
            result == [1]

    }

    def "should return list of 2 when given 2"(){
        when:
            result = it.fizzBuzz([2])
        then:
            result == [2]
    }

    def "should return fizz when given 3"(){
        when:
            result = it.fizzBuzz([3])
        then:
            result == ["fizz"]
    }


}
