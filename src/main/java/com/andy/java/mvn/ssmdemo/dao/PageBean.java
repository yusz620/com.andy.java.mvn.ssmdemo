package com.andy.java.mvn.ssmdemo.dao;

import java.util.Collection;

public interface PageBean {
	public abstract int getCount();

	public abstract void setCount(int count);

	public abstract int getCurrent();

	public abstract void setCurrent(int current);

	public abstract int getStart();

	public abstract void setStart(int start);

	public abstract int getPrevious();

	public abstract void setPrevious(int previous);

	public abstract int getNext();

	public abstract void setNext(int next);

	public abstract int getPageCount();

	public abstract Collection<Integer> getPageNumList();

	public abstract void setRowCount(int rowCount);

	public abstract int getRowCount();

	public abstract int getEnd();

	public abstract int getMaxResult();

	public abstract void setMaxResult(int maxResult);
}
