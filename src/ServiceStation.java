public class ServiceStation {

   public void check(Maintenance maintenance){
       maintenance.service();
    }
   public void checkAllMachinery(Maintenance[] maintenances){
        for (Maintenance maintenance : maintenances){
            maintenance.service();
            System.out.println();
   }
   }
 }

