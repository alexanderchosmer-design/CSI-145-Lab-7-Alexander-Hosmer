public class LinkedListTester {
    public static void main(String[] args){
        stepSixTest();
        stepEightTest();
        stepTenTest();
        stepTwelveTest();
        stepFourteenTest();
        stepSixteenTest();
    }
    public static IntegerLinkedList newLinkedList(boolean shouldPrint){
        IntegerLinkedList testMe = new IntegerLinkedList();
        for(int i = 0; i<6; i++){
            testMe.insertFront(i);
            if(shouldPrint){
                testMe.print();
            }
        }
        return testMe;
    }
    public static void stepSixTest(){
        System.out.println("Test 6");
        IntegerLinkedList testSix = newLinkedList(true);
    }
    public static void stepEightTest(){
        System.out.println("Test 8");
        IntegerLinkedList testEight = newLinkedList(false);
        testEight.print();
        for(int i = 0; i<6; i++){
            testEight.insertBack(i+10);
            testEight.print();
        }
    }
    public static void stepTenTest(){
        System.out.println("Test 10");
        IntegerLinkedList testTen = newLinkedList(false);
        System.out.println(testTen.get(0));
        System.out.println(testTen.get(4));
        System.out.println(testTen.get(5));
        System.out.println(testTen.get(10));
    }
    public static void stepTwelveTest(){
        System.out.println("Test 12");
        IntegerLinkedList testTwelve = newLinkedList(false);
        for(int i=0; i<7; i++){
            testTwelve.removeFront();
            testTwelve.print();
        }
    }
    public static void stepFourteenTest(){
        System.out.println("Test 14");
        IntegerLinkedList testFourteen = newLinkedList(false);
        testFourteen.print();
        for(int i = 0; i<7; i++){
            testFourteen.removeBack();
            testFourteen.print();
        }
    }
    public static void stepSixteenTest(){
        System.out.println("Test 16");
        System.out.println("baseline");
        IntegerLinkedList testSixteen = newLinkedList(false);
        testSixteen.print();
        System.out.println("Removing 3 elements starting at index 2");
        for(int i = 2; i<5; i++){
            testSixteen.removeAt(2);
            testSixteen.print();
        }
        System.out.println("Testing out of bounds");
        testSixteen.removeAt(10);
        testSixteen.print();
        System.out.println("Removing 3 elements starting at index 0");
        for(int i = 0; i<3; i++){
            testSixteen.removeAt(0);
            testSixteen.print();
        }
        System.out.println("Testing empty list");
        testSixteen.removeAt(5);
        System.out.println();

    }
}
