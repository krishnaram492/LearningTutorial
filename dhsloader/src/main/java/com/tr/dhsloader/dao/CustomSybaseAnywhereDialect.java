package com.tr.dhsloader.dao;

import java.sql.Types;

import org.hibernate.dialect.SybaseAnywhereDialect;
import org.hibernate.dialect.function.StandardSQLFunction;

public class CustomSybaseAnywhereDialect extends SybaseAnywhereDialect {
	public CustomSybaseAnywhereDialect() {
		//registerColumnType(Types.BINARY, "String");
		registerFunction("String", new StandardSQLFunction("strtobin"));
	}
}
