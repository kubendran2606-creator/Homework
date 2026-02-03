class VotingEligibility
{
    public static void main(String[] args) 
	{

        int age = 20;
        boolean citizen = true;

        
        boolean eligible = (age >= 18) && citizen;

        
        System.out.println(eligible && true ? "Eligible to Vote" : "Not Eligible to Vote");
    }
}