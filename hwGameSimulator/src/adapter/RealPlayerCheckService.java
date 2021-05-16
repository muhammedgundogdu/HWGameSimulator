package adapter;

import business.abstarct.PlayerCheckService;
import entities.concrete.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;



public class RealPlayerCheckService implements PlayerCheckService {

	

	@Override
	public boolean checkIfRealPerson(Player player) {
		KPSPublicSoapProxy proxy= new KPSPublicSoapProxy();
		boolean result= false;
		try 
		{
			result = proxy.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()),player.getFirstName().toUpperCase(),player.getLastName().toUpperCase(), player.getBirthDate());
		} 
		catch (Exception e) 
		{
			System.out.println("Üye Bilgileri Hatalý");
		}
		return result;
	}
	

}
