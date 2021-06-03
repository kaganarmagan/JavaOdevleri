package StudentInformationSystem;

 class Main {
    public static void main(String[] args){
       Teacher teacher1=new Teacher("Mahmut Kaşgarlı","111","TUR");
       Teacher teacher2=new Teacher("Işık Nevtan","222","MAT");
       Teacher teacher3=new Teacher("Alper Ayıtaşıyan","333","FİZ");


       Course turkce= new Course("Türkçe","101","TUR");
       Course mat= new Course("Matematik","101","MAT");
       Course fizik= new Course("Fizik","101","FİZ");

       turkce.addTeacher(teacher1);
       mat.addTeacher(teacher2);
       fizik.addTeacher(teacher3);



       Student stu1=new Student("Ali","001","1",turkce,mat,fizik);
       stu1.addBulkExamNote( turkce,65,41);
       stu1.addBulkExamNote( fizik,52,60);
       stu1.addBulkExamNote( mat,18,75);
       stu1.isPass();

       Student stu2=new Student("Ayşe","002","1",turkce,mat,fizik);
       stu2.addBulkExamNote( turkce,62,52);
       stu2.addBulkExamNote( fizik,90,73);
       stu2.addBulkExamNote( mat,32,61);
       stu2.isPass();

       Student stu3=new Student("Mehmet","003","1",turkce,mat,fizik);
       stu3.addBulkExamNote( turkce,15,90);
       stu3.addBulkExamNote( fizik,30,80);
       stu3.addBulkExamNote( mat,48,71);
       stu3.isPass();

       Student stu4=new Student("Fatma","004","1",turkce,mat,fizik);
       stu4.addBulkExamNote( turkce,45,81);
       stu4.addBulkExamNote( fizik,80,90);
       stu4.addBulkExamNote( mat,100,45);
       stu4.isPass();





    }
}