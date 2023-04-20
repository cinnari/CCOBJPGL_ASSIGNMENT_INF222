public class test{
    static boolean iwillBehave = true;
    static boolean IwillGraduate = true;

    public static void main(String[] args) throws Exception{
        //precondition
        assert iwillBehave == true : "I will listen to class attentively";

        //method
        College();

        //postcondition
        assert IwillGraduate == true : "I didn't pass the needed exercises";
    }

    static void College(){
        IwillGraduate = false;
        System.out.println("It's graduation day");
    }
}
