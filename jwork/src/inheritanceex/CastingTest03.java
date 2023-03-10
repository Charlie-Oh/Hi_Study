package inheritanceex;

//private접근제어자 : getter, setter접근
class Person1 {
   private String name;//Duly

   public Person1(String name) {
      this.name = name;
   }
   
   public void setName(String name) {
      this.name = name;
   }
   
   public String getName() {
      return name;
   }
}

class Student1 extends Person1 {
   private String dept;

   public Student1(String name) {
      super(name);
   }
   
   public void setDept(String dept) {
      this.dept = dept;
   }
   
   public String getDept() {
      return dept;
   }
}

public class CastingTest03 {
   public static void main(String[] args) {
      // 업캐스팅 선행
      Person1 Person1 = new Student1("Duly");

      // 다운캐스팅
      Student1 Student1 = (Student1) Person1;
//      Student1 Student1 = (Student1) new Person1("MadPlay");

//      Student1.setName("Cogildong");
      String strName = Student1.getName();

//      Student1.setDept("Computer Eng");
      String strDept = Student1.getDept();
      System.out.println(strName + ", " + strDept);
   }
}