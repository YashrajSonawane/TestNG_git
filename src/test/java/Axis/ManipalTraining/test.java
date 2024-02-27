package Axis.ManipalTraining;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class test {
	public int add(int a, int b) {
        return a + b;
    }
	
	public void testAddition() {
        int result = add(2, 3);
        Assert.assertEquals(result, 5, "Addition failed");
    }

	public static void main(String[] args) {
		
		test t = new test();
		t.testAddition();
	}

}
