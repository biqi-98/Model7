package www.lagou.app;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;
import www.lagou.entity.Phone;
import www.lagou.utils.DruidUtils;

import java.sql.SQLException;
import java.util.List;

public class PhoneTest {
    @Test
    public void test01() throws SQLException {

        //a) 使用连接池创建QueryRunner对象；
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        //2) 需求1:  查询价格高于2000元，生产日期是2019年之前的所有手机
        String sql = "SELECT *FROM phone WHERE price>? AND prodate<?";
        List<Phone> phoneList = (List<Phone>) qr.query(sql, new BeanListHandler<Phone>(Phone.class), 2000,"2019-01-01");

        System.out.println(phoneList);
        //3) 需求2:  查询所有颜色是白色的手机信息
        String sql1 = "SELECT *FROM phone WHERE color=?";
        List<Phone> phoneList1 = (List<Phone>) qr.query(sql1, new BeanListHandler<Phone>(Phone.class), "白色");

        System.out.println(phoneList1);
    }
}
