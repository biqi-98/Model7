package www.lagou.app;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.junit.Test;
import www.lagou.entity.Account;
import www.lagou.utils.DateUtils;
import www.lagou.utils.DruidUtils;

import java.sql.SQLException;

/**
 * 4)  按照步骤 实现卡号：1122334455向55443332211转账5000元的操作；
 */
public class TransactionTest {

    @Test
    public void test01() throws SQLException {

        //a) 使用连接池创建QueryRunner对象；
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        //b) 判断转出方是否有足够余额，如果不足，提示信息：”余额不足！”，并结束程序；
        String sql = "select * from account where card = ?";

        Account account = qr.query(sql, new BeanHandler<Account>(Account.class), 1122334455);

        if(account.getBalance()<5000){
            System.out.println("余额不足！");
            return;

        }
        //c) 通过卡号 进行转账的操作；
        sql="update account set balance=balance-5000 where card =  ?";
        qr.update(sql,"1122334455");
        sql="update account set balance=balance+5000 where card =  ?";
        qr.update(sql,"55443332211");

        //d) 转账结束后, 将转入、转出记录分别写入到Transaction表中。
        String insertSql="insert  into TRANSACTION (cardid,tratype,tramoney,tradate)  values (?,?,?,?)";
        qr.update(insertSql,"1122334455","转出",5000, DateUtils.getDateFormart());
        qr.update(insertSql,"55443332211","转入",5000, DateUtils.getDateFormart());
        System.out.println("转账成功！");
    }
}
