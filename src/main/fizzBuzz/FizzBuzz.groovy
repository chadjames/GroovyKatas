package fizzBuzz

class FizzBuzz {
    def fizzBuzz(ArrayList<Integer> integers) {
        def result = []
        integers.each {
            switch (it) {
                case { !(it % 3) && !(it %5) }:
                    result << 'fizzbuzz'
                    break
                case { !(it % 3) }:
                    result << 'fizz'
                    break
                case { !(it % 5) }:
                    result << 'buzz'
                    break
                default:
                    result << it

            }
        }
        result
    }

}