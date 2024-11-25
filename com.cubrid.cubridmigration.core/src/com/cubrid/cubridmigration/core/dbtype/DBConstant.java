/*
 * Copyright (C) 2009 Search Solution Corporation. All rights reserved by Search Solution. 
 *
 * Redistribution and use in source and binary forms, with or without modification, 
 * are permitted provided that the following conditions are met: 
 *
 * - Redistributions of source code must retain the above copyright notice, 
 *   this list of conditions and the following disclaimer. 
 *
 * - Redistributions in binary form must reproduce the above copyright notice, 
 *   this list of conditions and the following disclaimer in the documentation 
 *   and/or other materials provided with the distribution. 
 *
 * - Neither the name of the <ORGANIZATION> nor the names of its contributors 
 *   may be used to endorse or promote products derived from this software without 
 *   specific prior written permission. 
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
 * IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, 
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, 
 * OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY 
 * OF SUCH DAMAGE. 
 *
 */
package com.cubrid.cubridmigration.core.dbtype;

/**
 * database constant
 * 
 * @author moulinwang
 * @version 1.0 - 2010-11-13
 */
public class DBConstant { // NOPMD

	// public static final int DBTYPE_XML_MYSQL = 4;
	public static final int DBTYPE_CUBRID = 0;
	public static final int DBTYPE_TIBERO = 1;
	
	// GDB dbtype code
	public static final int DBTYPE_GRAPH = 2;
	public static final int DBTYPE_TURBO = 3;


	// GDB in db names
	public static final String[] DB_NAMES = new String[] { "CUBRID", "TIBERO", "GRAPH", "TURBO" };

	public static final String JDBC_CLASS_CUBRID = "cubrid.jdbc.driver.CUBRIDDriver";
	public static final String JDBC_CLASS_TIBERO = "com.tmax.tibero.jdbc.TbDriver";
	public static final String JDBC_CLASS_TURBO = "turbograph.jdbc.driver.TURBOGRAPHDriver";
	// GDB driver
	public static final String JDBC_CLASS_NEO4J = "org.neo4j.jdbc.Driver";

	public static final String DEF_PORT_CUBRID = "33000";
	public static final String DEF_PORT_TIBERO = "8629";
	// GDB port
	public static final String DEF_PORT_GRAPH = "7687";
	public static final String DEF_PORT_TURBO = "30000";

	// public static final String PATTERN_JAR_FILE_MSSQL = "^sqljdbc\\S*.jar";
	// public static final String PATTERN_JAR_FILE_MYSQL = "^mysql\\S*.jar";
	// public static final String PATTERN_JAR_FILE_CUBRID = "^jdbc\\S*.jar";
	// public static final String PATTERN_JAR_FILE_ORACLE = "^ojdbc\\S*.jar";

	public static final String PREFIX_QUOTE_CUBRID = "\"";
	public static final String SUFFIX_QUOTE_CUBRID = "\"";

	public static final String DB_NULL_VALUE = "NULL";
}
