package ListClass;

public class MyList <T>{
    Object[] array;
    int size=10;
    int index=-1;

    public MyList() {
        this.array=new Object[size];
    }

    public MyList(int size) {
        this.size = size;
        this.array=new Object[size];
    }
    public int size(){
        return this.index+1;
    }
    public int getCapacity(){
        return this.size;
    }
    public void add(T data){
        if((this.index+1)==this.size){
            Object[] array2 =new Object[this.size*2];
            System.arraycopy(this.array, 0, array2, 0, this.array.length);

            this.size*=2;
            this.array=array2;
        }
        this.index++;
        this.array[this.index]=data;


    }
    public Object get(int index1){
       return array[index1];
    }
    public void remove(int index1){
        if(!(this.index==-1)) {
            if (this.size > index1) {
                this.index--;
                Object[] array2 = new Object[this.size];
                for (int i = 0; i < this.size - 1; i++) {
                    if (i < index1) {
                        array2[i] = this.array[i];
                    } else {
                        array2[i] = this.array[i + 1];
                    }
                }
                this.array = array2;
            }
        }
    }
    public String toString(){
        if (this.array == null)
            return "null";


        if (index == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(String.valueOf(this.array[i]));
            if (i == this.index)
                return b.append(']').toString();
            b.append(",");
        }

    }
    public void set(int index1,T elem){
        if(index1<this.size) {
            this.array[index1] = elem;
        }
    }
    public int indexOf(T data){
        for(int i=0;i<this.array.length;i++){
            if(data==this.array[i]){
                return i;
            }
        }
        return -1;
    }
    public int lastIndexOf(T data){
        int result =-1;
        for(int i=0;i<this.array.length;i++){
            if(data==this.array[i]){
                result=i;
            }
        }
    return result;
    }
    public boolean isEmpty(){
        return this.index==-1;
    }
    public boolean contains(T data){
        for (Object o : this.array) {
            if (data == o) {
                return true;
            }
        }
        return false;
    }
    MyList<T> subList(int start,int finish){
        MyList<T> array2 = new MyList<>(this.size);
        for(int i=start;i<finish+1;i++){
            array2.array[i]=this.array[i];

        }
        array2.index=finish-start;
        return array2;
    }
    public void clear(){
        this.size=10;
        this.index=-1;
        this.array = new Object[this.size];
    }
    public Object[] toArray(){

        return  this.array;
    }


}