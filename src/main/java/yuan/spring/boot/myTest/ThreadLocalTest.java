package yuan.spring.boot.myTest;

/**
 * Created by yuanxin on 16/8/24.
 */
public class ThreadLocalTest {
//    public static void main(String[] args){
//        SequenceNumber seq = new SequenceNumber();
//        TestTask task = new TestTask();
//        task.setSeq(seq);
//        Thread thread1 = new Thread(task);
//        Thread thread2 = new Thread(task);
//        Thread thread3 = new Thread(task);
//        thread1.start();
//        thread2.start();
//        thread3.start();
//    }

}
class  TestTask implements  Runnable{

    private SequenceNumber seq ;

    public void setSeq(SequenceNumber seq) {
        this.seq = seq;
    }

    @Override
    public void run() {
        for(int i = 0;i<3;i++){
            System.out.println("thread["+Thread.currentThread().getName()+"]"+"seq["+seq.getNextNum()+"]");
        }
    }
}




class SequenceNumber{

    private static  ThreadLocal<Integer> seqNum = new ThreadLocal<Integer>(){
       public Integer initialValue(){
          return  0;
       }
    };

    public int getNextNum(){
        seqNum.set(seqNum.get()+1);
        return seqNum.get();
    }

}
