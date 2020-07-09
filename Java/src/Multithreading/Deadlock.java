package Multithreading;

/*
 * Solution to this deadlock issue is to reorder how we use the resources we can have thread 1
 * lock resource B first and then resource A so that thread 2 cannot access the resource B since thread 1
 * has a lock on that resource already.
 */
public class Deadlock {
    public static void main(String[] args) {  
        final String resourceA = "resourceA";  
        final String resourceB = "resourceB";  
        
        Thread thread1 = new Thread() {  
            public void run() {  
                synchronized (resourceA) {  
                 System.out.println("Thread 1 using resource A");  
        
                 try { 
                     Thread.sleep(200);
                     } 
                 catch (Exception e) {}  
        
                 synchronized (resourceB) {  
                  System.out.println("Thread 1 using resource B");  
                 }  
               }  
                
            }  
          };  
          
          Thread thread2 = new Thread() {  
              public void run() {  
                synchronized (resourceB) {  
                  System.out.println("Thread 2 using resource B");  
          
                  try { 
                      Thread.sleep(200);
                      } 
                  catch (Exception e) {}  
          
                  synchronized (resourceA) {  
                    System.out.println("Thread 2 using resource A");  
                  }  
                }  
              }  
            };  
            
            thread1.start();  
            thread2.start();  

}
}
