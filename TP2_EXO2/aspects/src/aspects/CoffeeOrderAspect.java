package aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CoffeeOrderAspect {

    @Pointcut("execution(public void  CoffeeOrder.addAddon(..)) && args(addOn)")
    public void addAddOnPointcut(AddO addOn) {}

    @Pointcut("execution(public void CoffeeOrder.removeAddon(..)) && args(addOn)")
    public void removeAddOnPointcut(AddO addOn) {}

    @Before("addAddOnPointcut(addOn)")
    public void beforeAddAddOn(JoinPoint joinPoint, AddO addOn) {
        System.out.println("Adding add-on: " + addOn.getName());
        CoffeeOrder order = (CoffeeOrder) joinPoint.getTarget();
        order.getAddons().add(addOn);
        order.setPrice(order.getPrice() + addOn.getPrice());
    }
    

    @Before("removeAddOnPointcut(addOn)")
    public void beforeRemoveAddOn(JoinPoint joinPoint, AddO addOn) {
        System.out.println("Removing add-on: " + addOn.getName());
        CoffeeOrder order = (CoffeeOrder) joinPoint.getTarget();
        order.getAddons().remove(addOn);
        order.setPrice(order.getPrice() - addOn.getPrice());

    }
}