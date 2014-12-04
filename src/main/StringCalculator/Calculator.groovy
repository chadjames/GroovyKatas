package StringCalculator

//String Calculator Kata - http://osherove.com/tdd-kata-1/
class Calculator {

    def delimiter

    def add(String numbers) {

        delimiter = getDelimiter(numbers)
        def result = 0
        cleanData(numbers).split(delimiter).each {
            if(it.contains('-')){
                throw new NumberFormatException(it)
            }
            result += it ? Integer.parseInt(it) : 0
        }
        result
    }

    def getDelimiter(String numbers) {
        if (numbers.startsWith('//')) {
            return numbers[2]
        }
        return ','
    }

    def String cleanData(String numbers) {
        numbers.collectReplacements { it == '\n' || it == '/' ? delimiter : null }
    }
}
