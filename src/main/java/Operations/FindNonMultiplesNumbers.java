package Operations;
//Этот метод ищет все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
public class FindNonMultiplesNumbers {
    public void nonMultiplesNumbers (int i) {
        String intBits = Integer.toBinaryString(i);
        int n = intBits.length();
        int count = 0;
        for (int j=Short.MIN_VALUE; j< i; j++) {
            if (j % n != 0) {
                count++;
            }
        }
        Integer[] m1 = new Integer[count];
        int z = 0;
        for (int j = Short.MIN_VALUE; j< i; j++) {
            if (j % n != 0) {
                m1[z] = j;
                z ++;
            }
        }
        for (int j = 0; j < m1.length; j++) {
            System.out.print(m1[j]+ " ");
        }
}
}
