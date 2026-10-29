class myThread extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i+"Raunak wa");
        }
    }

}
class  heello{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
         myThread obj =new myThread();
        obj.start();
        try {
            obj.join();
        } catch (Exception e) {
        }
        for(int i=0;i<5;i++){
            System.out.println(i+"aniket wa");
        }
       
    }
}
class myThread extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
       System.out.println("Downloading File... "+(i*20)+("%"));
    try {
        Thread.sleep(3000);
    } catch (Exception e) {
    }
        }
    }
}
class Download{
    public static void main(String[] args) {
        myThread obj=new myThread();
        obj.start();
for(int i=4;i>=1;i--){
       System.out.println("Timer... "+i+"sec");
    try {
        Thread.sleep(4000);
    } catch (Exception e) {

    }
   
        }
        System.out.println("Download Complete.!!!");
        
    }
    
    }