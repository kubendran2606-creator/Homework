class InsertElement
{
    public static void main(String[] args)
	{

        int ar[] = {10, 20, 30, 40, 50};
        int element = 25;
        int pos = 3;

        int br[] = new int[ar.length + 1];

        for (int i=0; i<pos-1; i++)
		{
			br[i] = ar[i];
		}
		br[pos-1] = element;
		
		for(int i=pos;i<br.length;i++)
		{
			br[i] = ar[i-1];
		}
		for (int i = 0; i < br.length; i++)
		{
			System.out.print(br[i] + " ");
		}
		
    }
}