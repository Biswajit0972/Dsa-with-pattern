package OOPs;


public class AccessModifiers {
   public String name = "Roni";
  public   void print () {
        System.out.println(name);

    }

    public static void main(String[] args) {
     GF g = new GF();

    }
}

class  GF {
   private String GFNAME;

   String getGFNAME () {
       return GFNAME;
   }

   void setGFNAME (String gf) {
       GFNAME = gf;
   }

   void printGFNAME () {
       System.out.println(GFNAME);
   }
}