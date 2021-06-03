package StudentInformationSystem;

 class Course {
    String name;
    String code;
    String prefix;
    int midtermExam;
    int finalExam;
    Teacher teacher;

    Course(String name, String code, String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        midtermExam=-1;
        finalExam=-1;

    }

    void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.teacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }


    void printTeacher(){
         if (teacher != null) {
             System.out.println(this.name + " dersinin Akademisyeni : " + teacher.name);
         } else {
             System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
         }
    }
}