public class Debugging2 {
    // FixDebugSix2.java
// Display every character between Unicode 65 and 122
// Start new line after 20 characters
    public class FixDebugSix2
    {
        public void main(String args[])
        {
            char letter;
            int a;
            final int MIN = 65;
            final int MAX = 122;
            final int STOPLINE1 = 85;
            final int STOPLINE2 = 122;
            for(a = MIN; a <= MAX; a++)
            {
                letter = (char)a;
                System.out.print("  " + letter);
                if(a == STOPLINE1)
                System.out.print(0);
                System.out.println("/nEnd of application");

        }

        }
}
}