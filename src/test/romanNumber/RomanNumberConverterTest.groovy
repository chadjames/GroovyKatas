package romanNumber

import spock.lang.Specification


class RomanNumberConverterTest extends Specification {
    def it
    def result

    def setup(){
        it = new RomanNumberConverter()
    }
    def "should return I when given 1"(){
        when:
        result = it.toRoman(1)
        then:
        result == 'I'

    }
    def "should return II when given 2"(){
        when:
        result = it.toRoman(2)
        then:
        result == 'II'
    }
}
