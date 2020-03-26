package com.azad.practice.java.self_test_projects.chapter_5_7;

public class XorEncryption {

	private String message;
	private String key;

	private String encryptedMsg;
	private String decryptedMsg;

	public XorEncryption(String message) {
		this.message = message;
		this.key = "maximus0";

		this.encryptedMsg = "";
		this.decryptedMsg = "";
	}

	public XorEncryption(String message, String key) {
		
		if (key.length() < 8) {
			throw new RuntimeException("key is too small. use atleast 8 characters");
		}
		
		if (key.length() > 8) {
			key = key.substring(0, 8);
		}
		
		this.message = message;
		this.key = key;
		
		this.encryptedMsg = "";
		this.decryptedMsg = "";
	}

	public void encrypt() {
		if (!encryptedMsg.equals("")) {
			System.out.println("No need to encrypt: Message is already encrypted.");
			return;
		}

		for (int i = 0, j = 0; i < message.length(); i++) {
			encryptedMsg += (char) (message.charAt(i) ^ key.charAt(j));
			
			if (++j == 8) {
				j = 0;
			}
		}
	}

	public void decrypt() {
		if (!decryptedMsg.equals("")) {
			System.out.println("No need to decrypt: Message is not encrypted yet.");
			return;
		}

		for (int i = 0, j = 0; i < encryptedMsg.length(); i++) {
			decryptedMsg += (char) (encryptedMsg.charAt(i) ^ key.charAt(j));
			
			if (++j == 8) {
				j = 0;
			}
		}
		
		
	}

	public void showOriginal() {
		show(message);
	}

	public void showEncryptedMsg() {
		show(encryptedMsg);
	}

	public void showDecryptedMsg() {
		show(decryptedMsg);
	}

	private void show(String message) {
		System.out.println(message);
	}
}
