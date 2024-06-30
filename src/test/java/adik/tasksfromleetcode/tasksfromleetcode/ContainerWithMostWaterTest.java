package adik.tasksfromleetcode.tasksfromleetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ContainerWithMostWaterTest {

    @Test
    public void testOne() {
        ContainerWithMostWater container = new ContainerWithMostWater();

        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = container.maxArea(height);
        int expectedOutput = 49;
        assertThat(result).isEqualTo(expectedOutput);
    }

    @Test
    public void testTwo() {
        ContainerWithMostWater container = new ContainerWithMostWater();

        int[] height = {1,1};
        int result = container.maxArea(height);
        int expectedOutput = 1;
        assertThat(result).isEqualTo(expectedOutput);
    }

}