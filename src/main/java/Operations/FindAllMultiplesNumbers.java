package Operations;
//метод решающий задачу : Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
public class FindAllMultiplesNumbers {
    public void findnAllumbers (int i) {
        String intBits = Integer.toBinaryString(i);
        int n = intBits.length();
        int count = 0;
        for (int j=i; j< Short.MAX_VALUE; j++) {
            if (j % n== 0) {
                count++;
            }
        }
        Integer[] m1 = new Integer[count];
        int z = 0;
        for (int j=i; j< Short.MAX_VALUE; j++) {
            if (j % n== 0) {
                m1[z] = j;
                z ++;
            }
        }
        for (int j = 0; j < m1.length; j++) {
            System.out.print(m1[j]+ " ");
        }
    }
}
