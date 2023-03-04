package Operations;


// метод решающий задачу - Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
public class GetBitNumber {
    public static int get_bit_number(int i) {

        String intBits = Integer.toBinaryString(i);
        System.out.println("Число   " + i + "   в битовом виде =>  "+ intBits);
        int n = intBits.length();
        return n;


    }
}


