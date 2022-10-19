package test;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * @author liyumin
 * @date 2022/09/14 15:40
 */
public class DataSourceTest {

    //读取配置文件
    ResourceBundle rb = ResourceBundle.getBundle("jdbc");
    String driver = rb.getString("jdbc.driver");
    String url = rb.getString("jdbc.url");
    String username = rb.getString("jdbc.username");
    String password = rb.getString("jdbc.password");

    @Test
    public void test01() {
        //手动测试c3p0数据源
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        try {
            dataSource.setDriverClass(driver);
            dataSource.setJdbcUrl(url);
            dataSource.setUser(username);
            dataSource.setPassword(password);
            Connection connection = dataSource.getConnection();
            System.out.println(connection);
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test02() throws SQLException {
        //手动测试Druid数据源
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    @Test
    public void test03() {
        //手动使用spring配置文件测试c3p0数据源
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ComboPooledDataSource dataSource = (ComboPooledDataSource) ac.getBean("comboPooledDataSource");
        try {
            Connection connection = dataSource.getConnection();
            System.out.println(connection);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test04() {
        //手动使用spring配置文件测试druid数据源
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        DruidDataSource dataSource = (DruidDataSource) ac.getBean("druidDataSource");
        DruidPooledConnection connection = null;
        try {
            connection = dataSource.getConnection();
            System.out.println(connection);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
