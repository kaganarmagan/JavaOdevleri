package SalaryCalc;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;


    Employee(String name,double salary,int workHours,int hireYear){

        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }

    double tax(){
        if(this.salary>=1000){

            return this.salary*0.03;
        }

        return 0;
    }
    double bonus(){
        if(this.workHours>40){         // Bu bölüm isterde yeterince ayrıntılı açıklanmamış.Bende 40 saatin üstündeki her saat için 30 tl bonus tanımladım.
           return (this.workHours-40)*30;
        }

        return 0;
    }


    double raiseSalary(){
        int totalYear=2021-this.hireYear;
        if(totalYear<10){
            return this.salary*0.05;
        }else if(totalYear<20){
            return this.salary*0.1;
        }else{
            return this.salary*0.15;
        }
    }


    public String toString() {
        return "Adı : " +this.name+
                "\nMaaşı : "+ this.salary +
                "\nÇalışma Saati : "+ this.workHours+
                "\nBaşlangıç Yılı : "+this.hireYear+
                "\nVergi : "+tax()+
                "\nBonus : "+bonus()+
                "\nMaaş Artışı : "+raiseSalary()+
                "\nVergi ve Bonuslar ile birlikte maaş : "+(bonus()-tax()+this.salary)+
                "\nToplam Maaş : "+(this.salary+raiseSalary());
    }






}



