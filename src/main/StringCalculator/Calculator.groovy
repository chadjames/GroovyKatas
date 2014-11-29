package StringCalculator

//String Calculator Kata - http://osherove.com/tdd-kata-1/
class Calculator {

    def add(String numbers){

        def result = 0
        numbers.split(',') .each{
            result += it ? Integer.parseInt(it) : 0

        }
        result
    }
}
