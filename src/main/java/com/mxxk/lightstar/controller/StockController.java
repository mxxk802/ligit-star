package com.mxxk.lightstar.controller;

import com.mxxk.lightstar.entity.Shares;
import com.mxxk.lightstar.service.stock.SharesJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

/**
 * StockController
 *
 * @auther zhang
 * @date 2020/6/21
 **/
@Controller
@RequestMapping("stock")
public class StockController {
    private static final Logger logger=LoggerFactory.getLogger(StockController.class);

    @Autowired
    private SharesJpaRepository sharesJpaRepository;

    @RequestMapping(value="getAllStock")
    @ResponseBody
    public Object getStockInfo(){
        List<Shares> sharesList=sharesJpaRepository.findAll();
        System.out.println(sharesList.toString());
        System.out.println("得到所有的信息");
        return sharesList;
    }
    @RequestMapping(value="getOneDetail/{id:^\\d+$}")
    @ResponseBody
    public Object getStockDetailInfo(@PathVariable("id") Integer id){
        Boolean exists=sharesJpaRepository.existsById(id);
        Optional<Shares> shares=null;
        if(exists){
            shares=sharesJpaRepository.findById(id);
        }
        return shares;
    }
}
