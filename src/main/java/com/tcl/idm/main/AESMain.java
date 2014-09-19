package com.tcl.idm.main;

import com.tcl.idm.util.AESUtils;

/**
 * AES CLI Main function
 */
public class AESMain
{
	private static void printUsage()
	{
		StringBuilder usageStringBuilder = new StringBuilder();
		usageStringBuilder.append("Usage:\n");
		usageStringBuilder.append("    1. aes -k SecureKey -e plaintext\n");
		usageStringBuilder.append("            -k: Secure key.\n");
		usageStringBuilder.append("            -e: Encrypt a plaintext.\n");
		usageStringBuilder.append("\n");
		usageStringBuilder.append("    2. aes -k SecureKey -d ciphertext\n");
		usageStringBuilder.append("            -k: Secure key.\n");
		usageStringBuilder.append("            -d: Decrypt a ciphertext.\n");
		usageStringBuilder.append("\n");
		usageStringBuilder.append("Description: \n");
		usageStringBuilder.append("    Encrypt a plaintext or decrypt a ciphertext with a secure key.\n");
		usageStringBuilder.append("\n");
		usageStringBuilder.append("Samples: \n");
		usageStringBuilder.append("    1. aes -k \"G34DF_sd*&G^&Vhf\" -e \"U0^GV231g^S!@\"\n");
		usageStringBuilder.append("       Encrypt \"U0^GV231g^S!@\" with secure key \"G34DF_sd*&G^&Vhf\".\n");
		usageStringBuilder
		        .append("    2. aes -k \"G34DF_sd*&G^&Vhf\" -d \"2BB27F2E1F0B46B544306689E7CEED5988F044E9BD0759C9389CF6AE50B1B5B3\"\n");
		usageStringBuilder
		        .append("       Decrypt \"2BB27F2E1F0B46B544306689E7CEED5988F044E9BD0759C9389CF6AE50B1B5B3\" with secure key \"G34DF_sd*&G^&Vhf\".\n");
		usageStringBuilder.append("\n");
		usageStringBuilder.append("Exit status: \n");
		usageStringBuilder.append("    0  if OK,\n");
		usageStringBuilder.append("    1  if minor problems (e.g., cannot access subdirectory),\n");
		usageStringBuilder.append("    2  if serious trouble (e.g., cannot access command-line argument).\n");
		usageStringBuilder.append("\n");
		usageStringBuilder.append("Author: \n");
		usageStringBuilder.append("    Yuan Huan\n");
		usageStringBuilder.append("\n");
		usageStringBuilder.append("Bug report: \n");
		usageStringBuilder.append("    yuanhuan_2005@126.com");

		System.out.println(usageStringBuilder.toString());
	}

	/**
	 * 主函数
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		// 参数至少有一个
		if (null == args || args.length != 4 || !"-k".equals(args[0]))
		{
			AESMain.printUsage();
			System.exit(1);
		}

		String secureKey = args[1];
		boolean encryptFlag = false;
		String str = "";
		if ("-e".equals(args[2]))
		{
			encryptFlag = true;
			str = args[3];
		}
		else if ("-d".equals(args[2]))
		{
			encryptFlag = false;
			str = args[3];
		}
		else
		{
			AESMain.printUsage();
			System.exit(1);
		}

		try
		{
			if (encryptFlag)
			{
				System.out.println(AESUtils.encrypt(secureKey, str));
			}
			else
			{
				System.out.println(AESUtils.decrypt(secureKey, str));
			}
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
			System.exit(2);
		}

		System.exit(0);
	}
}
