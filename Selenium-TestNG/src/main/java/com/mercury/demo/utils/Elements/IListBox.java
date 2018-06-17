package com.mercury.demo.utils.Elements;

public interface IListBox {
	public void select(String text);

	public void select(int i);

	public void select();

	public boolean isFirstOptionEmpty();

	public void selectByVisibleText(String text);

	public void selectByIndex(int index);

	public String getFirstSelectedText();

	public String selectedText();

	public int size();

	public boolean isDisplayed();

}
