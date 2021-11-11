package vezbi3.domasno;

public class PC {
    public int memorija;
    public String tipNaMemorija;
    public int hardDisk;
    public String golemina="GB";
    public String disk;
    public String ssd;

    public PC () {
        this.memorija = 2;
        this.tipNaMemorija = "DDR4";
        this.hardDisk = 160;
        this.disk="HDD";
        this.ssd="SSD m.2";
    }

    public void prvMetod(int zgolemiMemorija, int novHardDisk){
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Memorijata bese " + this.memorija + golemina + ", sega iznesuva " + (zgolemiMemorija + memorija) + golemina + ".");
        System.out.println("Tipot na memorijata e " + this.tipNaMemorija + ".");
        System.out.println("Noviot disk e "+ ssd+" i  ima golemina od " + novHardDisk + golemina + ".Prethodno imavme  " + disk+" i iznesuvase "+this.hardDisk+ golemina + ".");
        System.out.println("-------------------------------------------------------------------------------------------");
    }

}
