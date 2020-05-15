package com.google.android.gms.org.conscrypt;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class CryptoUpcalls {
    private static final Logger logger = Logger.getLogger(CryptoUpcalls.class.getName());

    private CryptoUpcalls() {
    }

    static byte[] ecSignDigestWithPrivateKey(PrivateKey privateKey, byte[] bArr) {
        if ("EC".equals(privateKey.getAlgorithm())) {
            return signDigestWithPrivateKey(privateKey, bArr, "NONEwithECDSA");
        }
        String valueOf = String.valueOf(privateKey.toString());
        throw new RuntimeException(valueOf.length() == 0 ? new String("Unexpected key type: ") : "Unexpected key type: ".concat(valueOf));
    }

    private static ArrayList getExternalProviders(String str) {
        ArrayList arrayList = new ArrayList(1);
        Provider[] providers = Security.getProviders(str);
        for (Provider provider : providers) {
            if (!Conscrypt.isConscrypt(provider)) {
                arrayList.add(provider);
            }
        }
        if (arrayList.isEmpty()) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(str);
            logger2.logp(level, "com.google.android.gms.org.conscrypt.CryptoUpcalls", "getExternalProviders", valueOf.length() == 0 ? new String("Could not find external provider for algorithm: ") : "Could not find external provider for algorithm: ".concat(valueOf));
        }
        return arrayList;
    }

    static byte[] rsaDecryptWithPrivateKey(PrivateKey privateKey, int i, byte[] bArr) {
        return rsaOpWithPrivateKey(privateKey, i, 2, bArr);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.security.InvalidKeyException]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Exception]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    private static byte[] rsaOpWithPrivateKey(PrivateKey privateKey, int i, int i2, byte[] bArr) {
        String str;
        Cipher cipher;
        String algorithm = privateKey.getAlgorithm();
        if (!"RSA".equals(algorithm)) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(algorithm);
            logger2.logp(level, "com.google.android.gms.org.conscrypt.CryptoUpcalls", "rsaOpWithPrivateKey", valueOf.length() == 0 ? new String("Unexpected key type: ") : "Unexpected key type: ".concat(valueOf));
            return null;
        }
        if (i == 1) {
            str = "PKCS1Padding";
        } else if (i == 3) {
            str = "NoPadding";
        } else if (i != 4) {
            Logger logger3 = logger;
            Level level2 = Level.WARNING;
            StringBuilder sb = new StringBuilder(50);
            sb.append("Unsupported OpenSSL/BoringSSL padding: ");
            sb.append(i);
            logger3.logp(level2, "com.google.android.gms.org.conscrypt.CryptoUpcalls", "rsaOpWithPrivateKey", sb.toString());
            return null;
        } else {
            str = "OAEPPadding";
        }
        String str2 = str.length() == 0 ? new String("RSA/ECB/") : "RSA/ECB/".concat(str);
        try {
            cipher = Cipher.getInstance(str2);
            cipher.init(i2, privateKey);
            if (Conscrypt.isConscrypt(cipher.getProvider())) {
                cipher = null;
            }
        } catch (NoSuchAlgorithmException e) {
            Logger logger4 = logger;
            Level level3 = Level.WARNING;
            String valueOf2 = String.valueOf(str2);
            logger4.logp(level3, "com.google.android.gms.org.conscrypt.CryptoUpcalls", "rsaOpWithPrivateKey", valueOf2.length() == 0 ? new String("Unsupported cipher algorithm: ") : "Unsupported cipher algorithm: ".concat(valueOf2));
            return null;
        } catch (NoSuchPaddingException e2) {
            Logger logger5 = logger;
            Level level4 = Level.WARNING;
            String valueOf3 = String.valueOf(str2);
            logger5.logp(level4, "com.google.android.gms.org.conscrypt.CryptoUpcalls", "rsaOpWithPrivateKey", valueOf3.length() == 0 ? new String("Unsupported cipher algorithm: ") : "Unsupported cipher algorithm: ".concat(valueOf3));
            return null;
        } catch (InvalidKeyException e3) {
            logger.logp(Level.WARNING, "com.google.android.gms.org.conscrypt.CryptoUpcalls", "rsaOpWithPrivateKey", "Preferred provider doesn't support key:", (Throwable) e3);
            cipher = null;
        }
        if (cipher == null) {
            String valueOf4 = String.valueOf(str2);
            ArrayList externalProviders = getExternalProviders(valueOf4.length() == 0 ? new String("Cipher.") : "Cipher.".concat(valueOf4));
            int size = externalProviders.size();
            int i3 = 0;
            while (i3 < size) {
                try {
                    cipher = Cipher.getInstance(str2, (Provider) externalProviders.get(i3));
                    cipher.init(i2, privateKey);
                    break;
                } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e4) {
                    i3++;
                    cipher = null;
                }
            }
            if (cipher == null) {
                Logger logger6 = logger;
                Level level5 = Level.WARNING;
                String valueOf5 = String.valueOf(str2);
                logger6.logp(level5, "com.google.android.gms.org.conscrypt.CryptoUpcalls", "rsaOpWithPrivateKey", valueOf5.length() == 0 ? new String("Could not find provider for algorithm: ") : "Could not find provider for algorithm: ".concat(valueOf5));
                return null;
            }
        }
        try {
            return cipher.doFinal(bArr);
        } catch (Exception e5) {
            Logger logger7 = logger;
            Level level6 = Level.WARNING;
            String algorithm2 = privateKey.getAlgorithm();
            StringBuilder sb2 = new StringBuilder(String.valueOf(algorithm2).length() + 60 + String.valueOf(str2).length());
            sb2.append("Exception while decrypting message with ");
            sb2.append(algorithm2);
            sb2.append(" private key using ");
            sb2.append(str2);
            sb2.append(":");
            logger7.logp(level6, "com.google.android.gms.org.conscrypt.CryptoUpcalls", "rsaOpWithPrivateKey", sb2.toString(), (Throwable) e5);
            return null;
        }
    }

    static byte[] rsaSignDigestWithPrivateKey(PrivateKey privateKey, int i, byte[] bArr) {
        return rsaOpWithPrivateKey(privateKey, i, 1, bArr);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Exception]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    private static byte[] signDigestWithPrivateKey(PrivateKey privateKey, byte[] bArr, String str) {
        Signature signature;
        int i;
        try {
            signature = Signature.getInstance(str);
            signature.initSign(privateKey);
            if (Conscrypt.isConscrypt(signature.getProvider())) {
                signature = null;
            }
        } catch (NoSuchAlgorithmException e) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(str);
            logger2.logp(level, "com.google.android.gms.org.conscrypt.CryptoUpcalls", "signDigestWithPrivateKey", valueOf.length() == 0 ? new String("Unsupported signature algorithm: ") : "Unsupported signature algorithm: ".concat(valueOf));
            return null;
        } catch (InvalidKeyException e2) {
            logger.logp(Level.WARNING, "com.google.android.gms.org.conscrypt.CryptoUpcalls", "signDigestWithPrivateKey", "Preferred provider doesn't support key:");
            bqye.m113758a(e2);
            signature = null;
        }
        if (signature == null) {
            String valueOf2 = String.valueOf(str);
            ArrayList externalProviders = getExternalProviders(valueOf2.length() == 0 ? new String("Signature.") : "Signature.".concat(valueOf2));
            int size = externalProviders.size();
            i = 0;
            RuntimeException runtimeException = null;
            while (i < size) {
                try {
                    signature = Signature.getInstance(str, (Provider) externalProviders.get(i));
                    signature.initSign(privateKey);
                    break;
                } catch (InvalidKeyException | NoSuchAlgorithmException e3) {
                } catch (RuntimeException e4) {
                    if (runtimeException == null) {
                        runtimeException = e4;
                    }
                }
            }
            if (signature == null) {
                if (runtimeException == null) {
                    Logger logger3 = logger;
                    Level level2 = Level.WARNING;
                    String valueOf3 = String.valueOf(str);
                    logger3.logp(level2, "com.google.android.gms.org.conscrypt.CryptoUpcalls", "signDigestWithPrivateKey", valueOf3.length() == 0 ? new String("Could not find provider for algorithm: ") : "Could not find provider for algorithm: ".concat(valueOf3));
                    return null;
                }
                throw runtimeException;
            }
        }
        try {
            signature.update(bArr);
            return signature.sign();
        } catch (Exception e5) {
            Logger logger4 = logger;
            Level level3 = Level.WARNING;
            String algorithm = privateKey.getAlgorithm();
            StringBuilder sb = new StringBuilder(String.valueOf(algorithm).length() + 50);
            sb.append("Exception while signing message with ");
            sb.append(algorithm);
            sb.append(" private key:");
            logger4.logp(level3, "com.google.android.gms.org.conscrypt.CryptoUpcalls", "signDigestWithPrivateKey", sb.toString(), (Throwable) e5);
            return null;
        }
        i++;
        signature = null;
    }
}
