package com.app.dhsloader.dto;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.usertype.UserType;

public class DHSCompType implements UserType {

	private int[] types = { Types.VARCHAR };

	@Override
	public Object assemble(Serializable arg0, Object arg1) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object deepCopy(Object arg0) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Serializable disassemble(Object arg0) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(Object a, Object b) throws HibernateException {
		return (a == b) || ((a != null) && (b != null) && (a.equals(b)));
	}

	@Override
	public int hashCode(Object obj) throws HibernateException {
		return obj.hashCode();
	}

	@Override
	public boolean isMutable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object nullSafeGet(ResultSet arg0, String[] arg1, SessionImplementor arg2, Object arg3) throws HibernateException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void nullSafeSet(PreparedStatement ps, Object arg1, int arg2, SessionImplementor arg3) throws HibernateException, SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public Object replace(Object arg0, Object arg1, Object arg2) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class returnedClass() {
		// TODO Auto-generated method stub
		return DHSComp.class;
	}

	@Override
	public int[] sqlTypes() {
		// TODO Auto-generated method stub
		return types;
	}

}
