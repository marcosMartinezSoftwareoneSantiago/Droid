public class Droid{
    String name;
    int batteryLevel;
  
    public Droid(String droidName){
      name = droidName;
      batteryLevel = 100;
    }
  
    public void performTask(String task){
      System.out.println(this.name + " is performing task: " + task);
      this.batteryLevel -= 10;
    }
  
    public int energyReport(){
      return this.batteryLevel;
    }
  
    public void energyTransfer(Droid receiverDroid, int batteryLevelToTransfer){
      receiverDroid.batteryLevel += batteryLevelToTransfer;
      this.batteryLevel -= batteryLevelToTransfer;
    }
  
    public String toString(){
      return "Hello, I'm droid: " + this.name;
    }
  
    public static void main(String[] args){
      Droid codey = new Droid("Codey");
      System.out.println(codey);
      codey.performTask("dancing");
      codey.performTask("reading");
      codey.performTask("ridding a bike");
  
      Droid carlos = new Droid("Carlos");
      Droid paco = new Droid("Paco");
      System.out.println(carlos.toString());
      System.out.println(paco.toString());
      carlos.performTask("doing the first task");
      carlos.performTask("doing the second task");
      System.out.println(carlos.toString() + " and I have " + carlos.energyReport() + " level of battery.");
      System.out.println(paco.toString() + " and I have " + paco.energyReport() + " level of battery.");
      paco.energyTransfer(carlos, 5);
      System.out.println(carlos.toString() + " and I have " + carlos.energyReport() + " level of battery.");
      System.out.println(paco.toString() + " and I have " + paco.energyReport() + " level of battery.");
    }
  }