import java.util.Arrays;

public class array_2 {
    public int frequency;
    public int[] freqArr;
    public int max;
    
    public array_2() {
        this.frequency = 0;
        this.max = 0;
        freqArr = new int[4];
    }
    public int freq(int[] arrUsr, int[] arrInt) {
        for (int i = 0; i < arrUsr.length; i++) {
            for (int j = 0; j < arrInt.length; j++) {
                if (arrUsr[i] == arrInt[j]) { // ถ้าค่าที่กรอก เท่ากับใน intArray
                    this.frequency += 1;
                }
            }
            freqArr[i] = this.frequency;
            this.frequency = 0;
        }
        Arrays.sort(freqArr);
        this.max = freqArr[freqArr.length -1];
        return this.max;
    }
}
