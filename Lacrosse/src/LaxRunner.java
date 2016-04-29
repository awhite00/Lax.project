import java.util.ArrayList;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class LaxRunner
	{

		
				static  ArrayList<Player>statlist=new ArrayList<Player>();
				public static void main(String[] args)
				{
				fillarray();
				printlist();
				printwhowillwin();
				pickfavoriteschool();
				cutworstplayer();
				printlist();
		        printstatechamps();
				
				}
					



					public static void printstatechamps()
					{
						  System.out.println();
						Scanner userInput=new Scanner(System.in);
						    System.out.println("Who will win the Colorado high school girls lacrosse state championship?");
						    String stateChamps=userInput.nextLine();
						    if (stateChamps.equals("Mullen"))
						    	{
						    		System.out.println("YEAH THEY WILL!! THEY ARE THE BEST!!!");
						    	}
						    else  if (stateChamps.equals("Cherry Creek"))
						    {
						    	System.out.println("EWWWWW!!! NOOOOOOOOOOOOOOOOOOOOOOO");
						    }
						    else if (stateChamps.equals("CA"))
						    	{
						    		System.out.println("Mullen will beat them!");
						    	}
						    else
						    	{
						    		System.out.println("Are you kidding??");
						    	}
						
					}





					public static void pickfavoriteschool()
					{
						Scanner userInput=new Scanner(System.in);
					    System.out.println("What is your favorite college?");
					    String favoriteSchool=userInput.nextLine();
					    if (favoriteSchool.equals("Louisville"))
							{
								System.out.println("You have the best women's draw taker in NCAA lacrosse!");
							}
						
						switch (favoriteSchool)
					{
					case "Syracuse":
						case  "North Carolina":
						case "Massachusettes":
						case "Maryland":
						case "Northwestern":
						case "Robert Morris":
						case "Johns Hopkins":
						case "Yale":
						case "USC":
								{
									System.out.println("Your women's lacrosse draw taker is in the top ten!");
									break;
								}
						case "CU Boulder":
								{
									System.out.println("SKO BUFFS ");
									break;
								}
						 default:
						 {
							 System.out.println("Your women's lacrosse team does not have a player in the top ten for draws. ");
							 break;
						 }
					}
						
						
						System.out.println();
					}




					public static void cutworstplayer()
					{
						int worstPlayer=statlist.get(0).getDrawpercent();
						for (int i=0; i<statlist.size(); i++)
							{
								if (statlist.get(i).getDrawpercent()<worstPlayer)
									{
										worstPlayer=statlist.get(i).getDrawpercent();
									}
									
										
							}
							for (int i=0; i<statlist.size(); i++)
								{
									if ((statlist.get(i).getDrawpercent()==worstPlayer))
										
										{
											statlist.remove(i);
										System.out.println("M.Michael is cut!!");
										
										}
								}
							System.out.println();
						
					}




					public static void printwhowillwin()
					{
						System.out.println();
						int randomNumber=(int)(Math.random()*10);
						System.out.println(statlist.get(randomNumber).getName()+ "wins the draw!");
						System.out.println();
					}




					public static void fillarray()
					{
						
						statlist.add(new Player("K.Morissette ", "Louisvile       ",     134 ));
						statlist.add(new Player("K.Treanor   ", " Syracuse        ",      131));
						statlist.add(new Player("S.J. Tracy   ", "North Carolina  ",  94 ));
						statlist.add(new Player("H.Murphy    ", " Massachusetts   ",84));
						statlist.add(new Player("T.Cummings   ", "Maryland        ",      77));
						statlist.add(new Player("S.Fredericks ", "Northwestern    ",  74));
						statlist.add(new Player("J.Karwaki    ", "Robert Morris   ",72));
						statlist.add(new Player("D.DiMartino  ", "Johns Hopkins   " ,70));
						statlist.add(new Player("N.Daniggelis ", "Yale            ",          69));
						statlist.add(new Player("M.Michael   ", " USC             ",  66));
						System.out.println();
					}
						
					
				public static void printlist()
					{
						for (Player p:statlist)
							{
								System.out.println(p.getName()+p.getCollege()+p.getDrawpercent());
								
							}
						
							                        	

			}

	}
