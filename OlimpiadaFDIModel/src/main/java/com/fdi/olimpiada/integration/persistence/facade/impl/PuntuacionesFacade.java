package com.fdi.olimpiada.integration.persistence.facade.impl;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fdi.olimpiada.integration.persistence.dao.iface.IPuntuacionesDAO;
import com.fdi.olimpiada.integration.persistence.entity.Puntuaciones;
import com.fdi.olimpiada.integration.persistence.facade.iface.IPuntuacionesFacade;

/**
 * 
 * @author agonzalez
 *
 */

@Service(value = "puntuacionesFacade")
public class PuntuacionesFacade implements IPuntuacionesFacade {
	
	@Autowired
	private IPuntuacionesDAO chatDAO;

	
	@Transactional
	public void guardarPuntuacion(String user, String puntuacion) throws Exception {
		
		Puntuaciones puntuacionSave = new Puntuaciones();
		puntuacionSave.setId(String.valueOf(Calendar.getInstance().getTimeInMillis()));
		puntuacionSave.setUser(user);
		
		chatDAO.save(puntuacionSave);
		
	}	

}
