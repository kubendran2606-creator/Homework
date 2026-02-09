import java.util.Scanner;

class Spotify
{
    public static void main(String[] args)
	{

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Spotify Music App");
        System.out.println("Select Music Director:");
        System.out.println("1. A R Rahman");
        System.out.println("2. Anirudh");
        System.out.println("3. Yuvan Shankar Raja");

        System.out.print("Enter your fav: ");
        int director = sc.nextInt();

        switch (director)
		{

            case 1:
                System.out.println("Selected: A R Rahman");
                System.out.println("1. Melody");
                System.out.println("2. Folk");
                System.out.print("Select music type: ");
                int type1 = sc.nextInt();

                if (type1 == 1)
				{
                    System.out.println("1. Munbe Vaa");
                    System.out.println("2. Ennavale adi ennavale");
                    System.out.print("Select song: ");
                    int song1 = sc.nextInt();

                    if (song1 == 1)
                        System.out.println("Now Playing : Munbe Vaa");
                    else if (song1 == 2)
                        System.out.println("Now Playing : Ennavale adi ennavale");
                    else
                        System.out.println("Invalid song selection");

                }
				else if (type1 == 2)
				{
                    System.out.println("1. Pettai rap");
                    System.out.println("2. Aathangara marame");
                    System.out.print("Select song: ");
                    int song2 = sc.nextInt();

                    if (song2 == 1)
                        System.out.println("Now Playing : Pettai rap");
                    else if (song2 == 2)
                        System.out.println("Now Playing : Aathangara marame");
                    else
                        System.out.println("Invalid song selection");

                }
				else
				{
                    System.out.println("Invalid music type");
                }
				break;

            case 2:
                System.out.println("Selected: Anirudh");
                System.out.println("1. Melody");
                System.out.println("2. Folk");
                System.out.print("Select music type: ");
                int type2 = sc.nextInt();

                if (type2 == 1)
				{
                    System.out.println("1. Kannazhaga");
                    System.out.println("2. Nenjukkul peidhidum");
                    System.out.print("Select song: ");
                    int song3 = sc.nextInt();

                    if (song3 == 1)
                        System.out.println("Now Playing : Kannazhaga");
                    else if (song3 == 2)
                        System.out.println("Now Playing : Nenjukkul peidhidum");
                    else
                        System.out.println("Invalid song selection");

                }
				else if (type2 == 2)
				{
                    System.out.println("1. Aaluma Doluma");
                    System.out.println("2. Why this kolaveri di");
                    System.out.print("Select song: ");
                    int song4 = sc.nextInt();

                    if (song4 == 1)
                        System.out.println("Now Playing : Aaluma Doluma");
                    else if (song4 == 2)
                        System.out.println("Now Playing : Why this kolaveri di");
                    else
                        System.out.println("Invalid song selection");

                }
				else
				{
                    System.out.println("Invalid music type");
                }
				break;

            case 3:
                System.out.println("Selected: Yuvan Shankar Raja");
                System.out.println("1. Melody");
                System.out.println("2. Folk");
                System.out.print("Select music type: ");
                int type3 = sc.nextInt();

                if (type3 == 1)
				{
                    System.out.println("1. Idhu varai");
                    System.out.println("2. En Kadhal Solla");
                    System.out.print("Select song: ");
                    int song5 = sc.nextInt();

                    if (song5 == 1)
                        System.out.println("Now Playing : Idhu varai");
                    else if (song5 == 2)
                        System.out.println("Now Playing : En Kadhal Solla");
                    else
                        System.out.println("Invalid song selection");

                }
				else if (type3 == 2)
				{
                    System.out.println("1. Otha sollala");
                    System.out.println("2. Vilayaadu mankatha");
                    System.out.print("Select song: ");
                    int song6 = sc.nextInt();

                    if (song6 == 1)
                        System.out.println("Now Playing : Otha sollala");
                    else if (song6 == 2)
                        System.out.println("Now Playing : Vilayaadu mankatha");
                    else
                        System.out.println("Invalid song selection");

                }
				else
				{
                    System.out.println("Invalid music type");
                }
				break;
               
            default:
                System.out.println("Invalid music director");
        }
    }
}