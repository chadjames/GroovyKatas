package fizzBuzz

class FizzBuzz {
    def fizzBuzz(ArrayList<Integer> integers) {
        def result = []
        integers.each {
            if(!(it % 15)){
                result << 'fizzbuzz'
            }else if(!(it % 5)){
                result << 'buzz'
            }else if(!(it % 3)){
                result << 'fizz'
            }else{
                result << it
            }
        }
        result


    }
}