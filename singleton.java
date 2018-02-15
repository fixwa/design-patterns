public class SingletonSample {
   private static SingletonSample instance = null;

   private SingletonSample() {
   }

   public static SingletonSample getInstance() {
      if(instance == null) {
         instance = new SingletonSample();
      }
      return instance;
   }
}