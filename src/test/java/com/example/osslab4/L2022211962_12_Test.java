package com.example.osslab4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L2022211962_12_Test {
    /**
     * 测试最一般的情况
     */
    @Test
    public void testMultiply_ValidInputs() {
        Solution solution = new Solution();
        assertEquals("6", solution.multiply("2", "3"));
        assertEquals("56088", solution.multiply("123", "456"));
    }

    /**
     * 测试特殊情况：含0式
     */
    @Test
    public void testMultiply_ZeroInput() {
        Solution solution = new Solution();
        assertEquals("0", solution.multiply("0", "5"));
        assertEquals("0", solution.multiply("5", "0"));
        assertEquals("0", solution.multiply("0", "0"));
    }

    /**
     * 测试特殊情况：不超过数据类型上限前提下的较大值
     */
    @Test
    public void testMultiply_LargeNumbers() {
        Solution solution = new Solution();
        assertEquals("1000000", solution.multiply("1000", "1000"));
    }
}
