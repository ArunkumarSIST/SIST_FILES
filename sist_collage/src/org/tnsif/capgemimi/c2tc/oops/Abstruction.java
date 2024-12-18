package org.tnsif.capgemimi.c2tc.oops;

public class Abstruction {

	public static void main(String[] args) {
		MaheshDemo obj=new RameshDemo();
		obj.calling();
		obj.AIIntegration();
		obj.Satellitecomm();
		obj.HealtMontoring();

	}

}
abstract class MaheshDemo{
	public void calling()
	{
		System.out.println("calling");
	}
	
	public abstract void AIIntegration();
	public abstract void Satellitecomm();
	public abstract void HealtMontoring();
}

abstract class SureshDemo extends MaheshDemo 
{
	public void AIIntegration()
	{
		System.out.println("Phone is integrated with AIIntegration");
	}
}

class RameshDemo extends SureshDemo
{
	public void Satellitecomm() {
		System.out.println("Phonr is integrated with Satellitecomm");
	}
	

	@Override
	public void HealtMontoring() {
		System.out.println(" Phone is integrated with HealthMontoring");
		
	}
}

