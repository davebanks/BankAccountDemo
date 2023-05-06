public class Phone {
    private String name;
    private int ROMSize;
    private int RAMSize;
    private String modelNumber;


    public Phone(String name,int ROMSize,int RAMSize,String modelNumber){
        this.name =name;
        this.ROMSize = ROMSize;
        this.RAMSize = RAMSize;
        this.modelNumber = modelNumber;
    }

    public void playMusic(String song){
        System.out.println("Playing "+song);

    }
}
