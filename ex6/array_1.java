public class array_1 {
    private int score;
    
    public array_1() {
        this.score = 0;
    }
    
    public int calculate(int[] arr) {
        for (int index = 0; index < arr.length; index++) {
            if ((arr[index] % 10 == 4) || (arr[index] % 10 == 9)) { //ลงท้ายด้วย 4, 9s
                this.score += 1;
            } else if ((arr[index] % 7 == 0)) { //7 หารลงตัว
                this.score += 2;
            }
        }
        return this.score;
    }
}
