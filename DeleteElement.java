//deletes an element from a an array

public class DeleteElement {

	int number=0;
	int [] arr = {};
	
	public DeleteElement(int[]nums,int number)
	{
		this.number = number;
		arr= nums;
	}
	
	
		 public int removeElement() 
		 {
			    
				
		        int  i=0;
				for (int j:arr)
				{
					if(j != number)
					{
						arr[i]= j;
						i++;
					}
		          
				}
			return i;
		}
		
		
	}
	

