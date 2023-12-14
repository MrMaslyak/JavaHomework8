 class Student {
    private String fName;
     private String sName;
     private double avarageBall;

     public Student(String fName, String sName, double avarageBall) {
         this.fName = fName;
         this.sName = sName;
         this.avarageBall = avarageBall;
     }
     public String getFirstName() {
         return fName;
     }
     public String getSecondName() {
         return sName;
     }
     public double getAvarageBall() {
         return avarageBall;
     }
     void displayInfo() {
         System.out.println("Student: " + fName + " " + sName + ", Average Grade: " + avarageBall);
     }
 }

