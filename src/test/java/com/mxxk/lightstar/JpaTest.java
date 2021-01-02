package com.mxxk.lightstar;

import com.mxxk.lightstar.entity.Shares;
import com.mxxk.lightstar.service.stock.SharesJpaRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * JpaTest
 *
 * @auther zhang
 * @date 2020/6/18
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = LightStarApplication.class)
public class JpaTest {



    @Autowired
    private SharesJpaRepository sharesJpaRepository;


    @Test
    public void testSaveStock() {

//        Shares stock = new Shares();
//        stock.setStockCode("300433");
//        stock.setStockName("蓝思科技");
//        stock.setEntName("蓝思科技股份有限公司");
//        stock.setIndustry("电子零部件制造");
//        stock.setStockInfo("优质的，防护玻璃，蓝宝石，金属材质外观防护零部件");
//        stock.setHoldShare("43.69忆");
//        stock.setShareBonus("10派2.58元");
//        stock.setBonusResult("已分红");
//        stock.setProfit("10亿");

        Shares stock = new Shares();
        stock.setStockCode("600011");
        stock.setStockName("华能国际");
        stock.setEntName("华能国际电力股份有限公司");
        stock.setIndustry("火电");
        stock.setStockInfo("集团在中国从事发电业务并销售电");
        stock.setHoldShare("1569809.3359万");
        stock.setShareBonus("10派1.35元");
        stock.setBonusResult("未分红");
        stock.setProfit("2亿");
        this.sharesJpaRepository.save(stock);

    }
    @Test
    public void queryDataTest(){
        List<Shares> shareLists=sharesJpaRepository.findAll();
        for(Shares share:shareLists){
            System.out.println(share.toString());
        }

    }


}
