package yuan.spring.boot.myTest;

import java.math.BigDecimal;

/**
 * Created by yuanxin on 17/4/17.
 */
public class ListTest
{
    public static void main(String[] args)
    {
        BigDecimal a = new BigDecimal("0.6701");
        BigDecimal b = a.divide(BigDecimal.ONE,2,BigDecimal.ROUND_UP);
        System.out.println(b);
    }
}
