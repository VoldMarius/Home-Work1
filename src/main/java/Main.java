import java.sql.SQLOutput;
import java.util.Random;
import Operations.GetBitNumber;
import Operations.FindAllMultiplesNumbers;
import Operations.FindNonMultiplesNumbers;
public class Main {
    public static void main(String[] args) {
//       1.Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        int i = new Random().nextInt(0, 200);
        String str = String.format("Целое число в диапазоне от 0 до 2000  ==>  " + i);
        System.out.println(str);
        System.out.println();

//      2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        GetBitNumber number = new GetBitNumber();
        System.out.println("номер старшего значащего бита выпавшего числа ==>  "+number.get_bit_number(i));
        System.out.println();

//      3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        FindAllMultiplesNumbers num = new FindAllMultiplesNumbers();
        System.out.print("все кратные выпавшего числа от i до Short.MAX_VALUE ==>   ");
        num.findnAllumbers(i);
        System.out.println();
        System.out.println();



//        4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        FindNonMultiplesNumbers non_num = new FindNonMultiplesNumbers();
        System.out.print("все не кратные выпавшего числа от Short.MIN_VALUE до i ==>   ");
        non_num.nonMultiplesNumbers(i);

    }
}
