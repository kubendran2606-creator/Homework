class RevArray
{
    public static void main(String[] args) 
	{

        int arr[]= {11, 22, 33, 44, 55, 66};

        int n = arr.length;   

        for (int i = 0; i < n / 2; i++) 
		{

            int back = n - 1 - i;   
            int temp = arr[i];      

            arr[i] = arr[back];     
            arr[back] = temp;       
        }

        for (int i = 0; i < n; i++) 
		{
            System.out.print(arr[i] + " ");
        }
    }
}