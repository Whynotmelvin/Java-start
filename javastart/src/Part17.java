class Computer {
    // METHODS
    public void playMusic() {
        System.out.println("Music is Playing");
    }

    public String getMeAPen(int cost) {
        return "Pen";
    }
}

public class Part17 {
    public static void main(String[] args) {

        Computer program = new Computer();

        program.playMusic();
        
        String str = program.getMeAPen(0);
        System.out.println(str);

    }
}
