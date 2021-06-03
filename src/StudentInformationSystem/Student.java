package StudentInformationSystem;

 class Student {
    String name;
    String stuNo;
    String classes;
    Course mat;
    Course turkce;
    Course fizik;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.mat=c1;
        this.turkce=c2;
        this.fizik=c3;
        this.average=0.0;
        this.isPass=false;

    }

    void addBulkExamNote(Course c, int midtermExam,int finalExam){
        if (finalExam>=0&&finalExam<=100||midtermExam>=0&&midtermExam<=100) {
            c.finalExam = finalExam;
            c.midtermExam = midtermExam;
        }
    }




    void isPass(){
        if (this.mat.finalExam == -1 || this.fizik.finalExam == -1 || this.turkce.finalExam == -1||this.mat.midtermExam == -1 || this.fizik.midtermExam == -1 || this.turkce.midtermExam== -1) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }



        }
     boolean isCheckPass(){
        calcAverage();
        return this.average > 55;
    }



    void calcAverage(){
       this.average=((0.2* mat.midtermExam+0.8* mat.finalExam)+(0.2* fizik.midtermExam+0.8* fizik.finalExam)+(0.2* turkce.midtermExam+0.8* turkce.finalExam))/3;

    }


    void printNote(){
        System.out.println("=========================");
        System.out.println("Adı Soyadı : "+this.name);
        System.out.println("Numarası : "+this.stuNo);
        System.out.println("Matematik \n\t Sözlü Notu :"+this.mat.midtermExam+" Yazılı Notu :"+this.mat.finalExam);
        System.out.println("Türkçe \n\t Sözlü Notu :"+this.turkce.midtermExam+" Yazılı Notu :"+this.turkce.finalExam);
        System.out.println("Fizik\n\t Sözlü Notu :"+this.fizik.midtermExam+" Yazılı Notu :"+this.fizik.finalExam);

    }

}