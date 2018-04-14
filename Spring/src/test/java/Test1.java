import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Qinshui on 2017/9/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/applicationContexct.xml" })
public class Test1 {
    @Test
    public  void test () {
        //emxwfzpdfcqvfiba//  uqukmbymbpbfgggc
        ApplicationContext actx = new ClassPathXmlApplicationContext(
                "classpath:spring/applicationContexct.xml");
        MailSender sender = (MailSender) actx.getBean("mailSender");
        SimpleMailMessage mailMessage = (SimpleMailMessage) actx.getBean("mailMessage");
        mailMessage.setSubject("你好");
        mailMessage.setText("这个是一个通过Spring框架来qinshuisdisfishfis发送邮件的小程序");
        mailMessage.setTo("1205395120@qq.com");
        sender.send(mailMessage);
        
    }
}
