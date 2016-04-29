
public class Player
	{
		private String name;
		private String college;
		private  int drawpercent;
		public Player (String nm, String c, int dp)
		{
			name=nm;
			setCollege(c);
			drawpercent=dp;
					
		}
		
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}

		public String getCollege()
			{
					return college;
			}

		public void setCollege(String college)
			{
					this.college = college;
			}
		public int getDrawpercent()
			{
				return drawpercent;
			}
		public void setDrawpercent(int drawpercent)
			{
				this.drawpercent = drawpercent;
			}
	}
