package com.mercury.demo.utils.Elements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;

public class ListBox implements IListBox {
	private Select list;
	private WebElement element;

	public ListBox(WebElement e) {
		this.element = e;
		String tag = e.getTagName();

		if (tag.equalsIgnoreCase("select") == false)
			throw new UnexpectedTagNameException("select", tag);

		this.list = new Select(e);
	}

	@Override
	public void select(String text) {
		this.selectByVisibleText(text);
	}

	@Override
	public void select(int i) {
		this.selectByIndex(i);
	}

	@Override
	public void select() {
		int from = 0;
		int to = size() - 1;
		if (isFirstOptionEmpty())
			from = 1;
		//this.selectByIndex(new Random().integer(from, to));
	}

	@Override
	public boolean isFirstOptionEmpty() {
		WebElement option = this.list.getOptions().get(0);
		return option.getText().trim().isEmpty();
	}

	@Override
	public void selectByVisibleText(String text) {
		this.list.selectByVisibleText(text);

	}

	@Override
	public void selectByIndex(int index) {
		this.list.selectByIndex(index);
	}

	@Override
	public String getFirstSelectedText() {
		return this.list.getFirstSelectedOption().getText().toLowerCase();
	}

	@Override
	public String selectedText() {
		return this.list.getFirstSelectedOption().getText();
	}

	@Override
	public int size() {
		return this.list.getOptions().size();
	}

	@Override
	public boolean isDisplayed() {
		return this.element.isDisplayed();
	}

}
