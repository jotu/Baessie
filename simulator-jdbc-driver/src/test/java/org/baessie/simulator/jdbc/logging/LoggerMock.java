package org.baessie.simulator.jdbc.logging;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.Marker;

public class LoggerMock implements Logger {
	private final List<String> loggedMessages = new ArrayList<String>();

	public void reset() {
		this.loggedMessages.clear();
	}

	public boolean wasLogged(final String expectedLogMessage, final String expectedLevel) {
		return loggedMessages.contains(expectedLevel + ": " + expectedLogMessage);
	}

	@Override
	public void trace(String msg) {
		loggedMessages.add("TRACE: " + msg);
	}

	@Override
	public String getName() {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public boolean isTraceEnabled() {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void trace(String format, Object arg) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void trace(String format, Object arg1, Object arg2) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void trace(String format, Object[] argArray) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void trace(String msg, Throwable t) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public boolean isTraceEnabled(Marker marker) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void trace(Marker marker, String msg) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void trace(Marker marker, String format, Object arg) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void trace(Marker marker, String format, Object arg1, Object arg2) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void trace(Marker marker, String format, Object[] argArray) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void trace(Marker marker, String msg, Throwable t) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public boolean isDebugEnabled() {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void debug(String msg) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void debug(String format, Object arg) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void debug(String format, Object arg1, Object arg2) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void debug(String format, Object[] argArray) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void debug(String msg, Throwable t) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public boolean isDebugEnabled(Marker marker) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void debug(Marker marker, String msg) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void debug(Marker marker, String format, Object arg) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void debug(Marker marker, String format, Object arg1, Object arg2) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void debug(Marker marker, String format, Object[] argArray) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void debug(Marker marker, String msg, Throwable t) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public boolean isInfoEnabled() {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void info(String msg) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void info(String format, Object arg) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void info(String format, Object arg1, Object arg2) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void info(String format, Object[] argArray) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void info(String msg, Throwable t) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public boolean isInfoEnabled(Marker marker) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void info(Marker marker, String msg) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void info(Marker marker, String format, Object arg) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void info(Marker marker, String format, Object arg1, Object arg2) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void info(Marker marker, String format, Object[] argArray) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void info(Marker marker, String msg, Throwable t) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public boolean isWarnEnabled() {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void warn(String msg) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void warn(String format, Object arg) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void warn(String format, Object[] argArray) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void warn(String format, Object arg1, Object arg2) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void warn(String msg, Throwable t) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public boolean isWarnEnabled(Marker marker) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void warn(Marker marker, String msg) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void warn(Marker marker, String format, Object arg) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void warn(Marker marker, String format, Object arg1, Object arg2) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void warn(Marker marker, String format, Object[] argArray) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void warn(Marker marker, String msg, Throwable t) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public boolean isErrorEnabled() {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void error(String msg) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void error(String format, Object arg) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void error(String format, Object arg1, Object arg2) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void error(String format, Object[] argArray) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void error(String msg, Throwable t) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public boolean isErrorEnabled(Marker marker) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void error(Marker marker, String msg) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void error(Marker marker, String format, Object arg) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void error(Marker marker, String format, Object arg1, Object arg2) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void error(Marker marker, String format, Object[] argArray) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

	@Override
	public void error(Marker marker, String msg, Throwable t) {
		throw new UnsupportedOperationException("Not yet implemented!!!");
	}

}
