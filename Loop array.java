public class App {
    public static void main(String[] args) throws Exception {
       
        char[]myName = {'T','A','T','I','N' };

        for (int i = 0; i < myName.length; i++) {
            System.out.println(myName[i]);
        }

        for(int i = myName.length -1 ; i >=0; i--){
            System.out.println(myName[i]);
        }
        
        for (int i = 0; i <myName.length; i++){
            if (myName[i] == 'A' || myName[i] == 'E' || myName[i] == 'I' || myName[i] == 'O' || myName[i] == 'U') {
              System.out.println(myName[i]);
            }
        }

        for (int i = 0; i < myName.length; i++){
            if (!(myName[i] == 'A' || myName[i] == 'E' || myName[i] == 'I' || myName[i] == 'O' || myName[i] == 'U')) {
                System.out.println(myName[i]);
         }
      }
    }
} 