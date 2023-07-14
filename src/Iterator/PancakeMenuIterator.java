package Iterator;

import java.util.ArrayList;

public class PancakeMenuIterator implements Iterator
{
	ArrayList<MenuItem> items;
	int position = 0;
	
	public PancakeMenuIterator(ArrayList<MenuItem> items)
	{
		this.items = items;
	}

	@Override
	public boolean hasNext() 
	{
		if(position >= items.size())
			return false;
		else
			return true;
	}

	@Override
	public MenuItem next() 
	{
		MenuItem menuItem = items.get(position);
		position += 1;
		return menuItem;
	}

}
