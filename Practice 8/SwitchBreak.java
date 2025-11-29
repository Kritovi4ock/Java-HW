public class SwitchBreak {
    public static void main(String[] args) {
        int value = 2;
        int i = 0;
        
        switch(value) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
            case 3:
                i = 3;  // case 2 без break -> провалится в case 3 при вызове value от 2
                break;
            case 4:
                i = 4;
                break;
        }
    }

}