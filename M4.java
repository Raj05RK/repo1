class D
{
	int i;
	void test() throws CloneNotSupportedException
	{
	//	D d1 = clone()
			D d1 = (D) clone();
		clone();// CloneNotSupportedException
	}
}
public class M4
{
	public static void main(String[] args)
	{
		
	}
}
