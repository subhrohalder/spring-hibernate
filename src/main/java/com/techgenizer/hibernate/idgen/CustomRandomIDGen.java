package com.techgenizer.hibernate.idgen;

import java.io.Serializable;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;


public class CustomRandomIDGen implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		int id =0;
		
		Random random = new Random();
		id= random.nextInt(10000);
		return Long.valueOf(id);
	}

}
