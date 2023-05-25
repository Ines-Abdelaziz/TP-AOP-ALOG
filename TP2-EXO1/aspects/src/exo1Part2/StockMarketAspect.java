package exo1Part2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class StockMarketAspect {
  @Pointcut("execution(void Stock.setPrice(double)) && args(price)")
  public void setPricePointcut(double price) {}

 
  @After("setPricePointcut(price)")
  public void onStockPriceChangeAdvice(JoinPoint joinPoint, double price) {
    Stock stock = (Stock) joinPoint.getTarget();
    StockMarket stockMarket = StockMarket.getInstance();
    
    stockMarket.notifyClientsOfStockPriceChange(stock);
  }
  

 
}
