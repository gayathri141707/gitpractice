package com.calc.project1.app1;
import org.junit.Assert;
import org.junit.Test;
public class AppTest 
{ 
    @Test
    public void testsum()
    {
    	App c = new App();
    	int result = c.sum(10,5);
    	if (result != 15)
    	{
    		Assert.fail();
    	}
    }
    @Test
    public void testsub()
    {
    	App c = new App();
    	int result = c.sub(10,5);
    	int r=c.sub(5,5);
    	if (result != 5)
    	{
    		Assert.fail();
    	}
    	if(r!=0)
    	{
    		Assert.fail();
    	}
    }
    @Test
    public void testmul()
    {
    	App c = new App();
    	int result = c.multi(10,5);
    	if (result != 50)
    	{
    		Assert.fail();
    	}
    }
    @Test
    public void testdiv()
    {
    	App c = new App();
    	int result = c.div(10,5);
    	if (result != 2)
    	{
    		Assert.fail();
    	}
    }

}
