public class KataClass {
    public static void main(String[] args) {
        high("what time are we climbing up to the volcano");
    }
    public static String high(String s) {
        String[] subStr;
        Integer max = 0;
        Integer maxIndex = -1;
        String delimeter = " "; // Разделитель
        subStr = s.split(delimeter);
        Integer[] maxValue = new Integer[subStr.length];
        for(int i = 0; i < subStr.length; i++)
        {
            int x = 0;
            char[] subChar = subStr[i].toCharArray();
            for (int j = 0; j < subChar.length; j++)
            {
                x+= subChar[j]-96;
            }
            maxValue[i] = x;
        }
        for (int i = 0; i<maxValue.length;i++)
        {
            if(max < maxValue[i])
            {
                max = maxValue[i];
                maxIndex = i;
            }
        }
        System.out.println(subStr[maxIndex]);
        return subStr[maxIndex] ;
    }
}
