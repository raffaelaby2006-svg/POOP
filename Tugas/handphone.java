package Tugas;

public class handphone extends perangkatElektronik {
    private int tahun;

    public void tahunRilis(int year){
        tahun = year;
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("tahun Rilis : ");
    }
}
