package ImplementasiQueue;

class queue {
    private int maxSize;
    private String[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public queue(int size){
        this.maxSize=size;
        queArray=new String[maxSize];
        front=0;
        rear=-1;
        nItems=0;
    }

    public void insert(String value){
        if(isFull()){
            System.out.println("Maaf "+value+ ", antrian masih penuh");
        }else{
            queArray[++rear]=value;
            System.out.println(value+" masuk antrian");
            nItems++;
        }
    }
    public String remove(){
        String temp=queArray[front];
        queArray[front]="kosong";
        front++;
        if(front==maxSize){
            front=0;
        }
        nItems--;
        System.out.println(temp+" keluar Antrian");
        return temp;
    }

    public void display(){
        int temp=this.front;
        for(int i=0; i<=rear; i++){
            System.out.print(queArray[front++]);
            if(front==maxSize){
                front=0;
            }
            System.out.print(", ");
        }
        System.out.println();
        front=temp;

    }
    public String peekFront(){
        return queArray[front];
    }
    public boolean isEmpty(){
        return (nItems==0);
    }
    public boolean isFull(){
        return (nItems==maxSize);
    }
    public int size() {
        return nItems;
    }
}
