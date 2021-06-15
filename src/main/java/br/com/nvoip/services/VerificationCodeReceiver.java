package br.com.nvoip.services;

import java.io.IOException;

public interface VerificationCodeReceiver {

	 /** Returns the redirect URI. */
	  String getRedirectUri() throws IOException;

	  /** Waits for a verification code. */
	  String waitForCode() throws IOException;

	  /** Releases any resources and stops any processes started. */
	  void stop() throws IOException;
}
