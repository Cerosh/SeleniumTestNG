package com.mercury.demo.utils.Elements;

public interface ITextBox {	
   
	public String getText();

    public void clear();
    
    public void click();
    
    public boolean isDisplayed();
    
    public boolean isEnabled();
    
    public void type(String... keyword); 

}
