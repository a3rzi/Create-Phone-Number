import org.junit.jupiter.api.Test;

public class FunctionTest {
    @Test
    void test1() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String result = createPhoneNum(numbers);
        System.out.println(result);
    }

    private String createPhoneNum(int[] numbers) {

        StringBuilder sb = new StringBuilder();

        sb.append("a").append("b").append("c");
        //sb.append(numbers);
        return sb.toString();
    }
}
