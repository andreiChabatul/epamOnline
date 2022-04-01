package epam.javatutor.module3.part2;

public class task2 {

/*    В строке вставить после каждого символа 'a' символ 'b'.*/

    public static void main(String[] args) {

        String str = "sdfsdf, te, dsa,fsd hgd,dsf, gfd,asdf ,rwedfsd g,ger asdfa,dasd,g regwfdsafwg, we aaaa";
        String resultStr;

        resultStr = str.replace("a","ab");

        System.out.println("Original string: " + str);
        System.out.println("Modified string: " + resultStr);
        }
    }