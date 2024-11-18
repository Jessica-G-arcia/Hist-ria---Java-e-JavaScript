public class Assincrona extends Thread {
   
        public void run() {
        System.out.println("Tarefa emsegundo plano em Java!");
        }
        public static void main(String[] args) {
        Assincrona tarefa = new Assincrona();
        tarefa.start();
        }
        
        
}
