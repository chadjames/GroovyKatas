package romanNumber

class RomanNumberConverter {
    def toRoman(i){
        def result = ''
        i.each{
            result += 'I'
        }
        result
    }
}
