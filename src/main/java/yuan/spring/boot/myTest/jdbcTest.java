package yuan.spring.boot.myTest;

import java.sql.*;

/**
 * Created by yuanxin on 16/8/24.
 */
public class jdbcTest
{

    public static void main(String[] args)
        throws Exception
    {
        Connection conn = null;
        String sql;
        // MySQL的JDBC URL编写方式：jdbc:mysql://主机名称：连接端口/数据库的名称?参数=值
        // 避免中文乱码要指定useUnicode和characterEncoding
        // 执行数据库操作之前要在数据库管理系统上创建一个数据库，名字自己定，
        // 下面语句之前就要先创建javademo数据库
        String url = "jdbc:mysql://localhost:3306/mytest?"
            + "user=root&password=yuan&useUnicode=true&characterEncoding=UTF8";

        try
        {
            // 之所以要使用下面这条语句，是因为要使用MySQL的驱动，所以我们要把它驱动起来，
            // 可以通过Class.forName把它加载进去，也可以通过初始化来驱动起来，下面三种形式都可以
            Class.forName("com.mysql.jdbc.Driver");// 动态加载mysql驱动
            // or:
            // com.mysql.jdbc.Driver driver = new com.mysql.jdbc.Driver();
            // or：
            // new com.mysql.jdbc.Driver();

            System.out.println("成功加载MySQL驱动程序");
              // 一个Connection代表一个数据库连接
            conn = DriverManager.getConnection(url);
            conn.setAutoCommit(false);
            conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            // Statement里面带有很多方法，比如executeUpdate可以实现插入，更新和删除等
            Statement stmt = conn.createStatement();
            sql = "select * from user";
            ResultSet rs = stmt.executeQuery(sql);// executeQuery会返回结果的集合，否则返回空值
            System.out.println("id\t姓名\t年龄\t密码");
            while (rs.next())
            {
                System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" +
                    rs.getString(4));// 入如果返回的是int类型可以用getInt()
            }

            sql = "update user set name = 'yuanyuan' where id = 1";
            int j = stmt.executeUpdate(sql);
            Savepoint svpt = conn.setSavepoint("savePoint1");
            sql = "update user set name = 'xin' where id = 1";
            int i = stmt.executeUpdate(sql);
            if (i == -1)
            {
                System.out.println("更新成功");
            }
            conn.rollback(svpt);
            conn.commit();
        }
        catch (SQLException e)
        {
            System.out.println("MySQL操作错误");
            e.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            conn.rollback();
        }
        finally
        {
            conn.close();
        }

    }







    private void test()
    {

       System.out.println();
        System.out.println();
    }
}
