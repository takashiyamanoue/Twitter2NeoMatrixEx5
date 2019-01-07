package org.yamalab.twitter2neomatrixex5.twitterconnector;

public interface TwitterApplication {
	public String getOutput();
	public boolean parseCommand(String cmd, String v);
}
