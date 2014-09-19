AES CLI
======

AES encryption and decryption command line tool.

See src/main/webapp/WEB-INF/bin/aes.sh for Linux OS and aes.bat for Windows OS.


Usage:
------
    1. aes -k SecureKey -e plaintext
    
            -k: Secure key.
            
            -e: Encrypt a plaintext.
            

    2. aes -k SecureKey -d ciphertext
    
            -k: Secure key.
            
            -d: Decrypt a ciphertext.
            

Description: 
------
    Encrypt a plaintext or decrypt a ciphertext with a secure key.
    

Samples: 
------
    1. aes -k "G34DF_sd*&G^&Vhf" -e "U0^GV231g^S!@"
    
       Encrypt "U0^GV231g^S!@" with secure key "G34DF_sd*&G^&Vhf".
       
    2. aes -k "G34DF_sd*&G^&Vhf" -d "2BB27F2E1F0B46B544306689E7CEED5988F044E9BD0759C9389CF6AE50B1B5B3"
    
       Decrypt "2BB27F2E1F0B46B544306689E7CEED5988F044E9BD0759C9389CF6AE50B1B5B3" with secure key "G34DF_sd*&G^&Vhf".
       

Exit status: 
------
    0  if OK,
    
    1  if minor problems (e.g., cannot access subdirectory),
    
    2  if serious trouble (e.g., cannot access command-line argument).
    

Author: 
------
    Yuan Huan
    

Bug report: 
------
    yuanhuan_2005@126.com
