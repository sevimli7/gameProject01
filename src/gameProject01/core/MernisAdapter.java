package gameProject01.core;

import java.rmi.RemoteException;

import gameProject01.business.abstracts.GamerCheckService;
import gameProject01.entities.concretes.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapter implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		boolean result;
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy(); 
		
		try { 
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(
					Long.parseLong(gamer.getNationalityId()),					
					gamer.getFirstName().toUpperCase(),
					gamer.getLastName().toUpperCase(),
					gamer.getDateOfBirth().getYear()); 
		}
	    catch (RemoteException e) { 
			result = false; 
			e.printStackTrace(); 
		}
		
		return result;
	
	}

}
