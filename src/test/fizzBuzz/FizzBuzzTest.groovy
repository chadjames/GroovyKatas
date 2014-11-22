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

    def "should return list of numbers when given list of numbers"(){
        when:
            result = it.fizzBuzz([1,2])
        then:
            result == [1,2]

    }

    def "should return list of numbers replacing 3 with fizz when given list of numbers containing 3"(){
        when:
        result = it.fizzBuzz([1,2,3])
        then:
        result == [1,2,'fizz']

    }

    def "should return list of buzz when given 5"() {
        when:
            result = it.fizzBuzz([5])
        then:
            result == ["buzz"]
    }

    def "should return list of fizz when given 6"(){
        when:
            result = it.fizzBuzz([6])
        then:
            result == ["fizz"]

    }

    def "should return list of buzz when given 10"(){
        when:
            result = it.fizzBuzz([10])
        then:
            result == ["buzz"]

    }

    def "should return list of fizzbuzz when given 15"(){
        when:
            result = it.fizzBuzz([15])
        then:
            result == ["fizzbuzz"]

    }




}
