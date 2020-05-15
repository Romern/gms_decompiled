package com.google.android.gms.org.conscrypt;

import java.net.Socket;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.UnrecoverableEntryException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedKeyManager;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class KeyManagerImpl extends X509ExtendedKeyManager {
    private final HashMap hash = new HashMap();

    public KeyManagerImpl(KeyStore keyStore, char[] cArr) {
        KeyStore.PrivateKeyEntry privateKeyEntry;
        try {
            Enumeration<String> aliases = keyStore.aliases();
            while (aliases.hasMoreElements()) {
                String nextElement = aliases.nextElement();
                try {
                    if (keyStore.entryInstanceOf(nextElement, KeyStore.PrivateKeyEntry.class)) {
                        try {
                            privateKeyEntry = (KeyStore.PrivateKeyEntry) keyStore.getEntry(nextElement, new KeyStore.PasswordProtection(cArr));
                        } catch (UnsupportedOperationException e) {
                            privateKeyEntry = new KeyStore.PrivateKeyEntry((PrivateKey) keyStore.getKey(nextElement, cArr), keyStore.getCertificateChain(nextElement));
                        }
                        this.hash.put(nextElement, privateKeyEntry);
                    }
                } catch (KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException e2) {
                }
            }
        } catch (KeyStoreException e3) {
        }
    }

    private String[] chooseAlias(String[] strArr, Principal[] principalArr) {
        List list;
        String str;
        String str2;
        String[] strArr2 = strArr;
        Principal[] principalArr2 = principalArr;
        if (strArr2 == null || strArr2.length == 0) {
            return null;
        }
        if (principalArr2 != null) {
            list = Arrays.asList(principalArr);
        } else {
            list = null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.hash.entrySet()) {
            String str3 = (String) entry.getKey();
            Certificate[] certificateChain = ((KeyStore.PrivateKeyEntry) entry.getValue()).getCertificateChain();
            int i = 0;
            Certificate certificate = certificateChain[0];
            String algorithm = certificate.getPublicKey().getAlgorithm();
            if (certificate instanceof X509Certificate) {
                str = ((X509Certificate) certificate).getSigAlgName().toUpperCase(Locale.US);
            } else {
                str = null;
            }
            int length = strArr2.length;
            int i2 = 0;
            while (i2 < length) {
                String str4 = strArr2[i2];
                if (str4 != null) {
                    int indexOf = str4.indexOf(95);
                    if (indexOf != -1) {
                        str2 = str4.substring(indexOf + 1);
                        str4 = str4.substring(i, indexOf);
                    } else {
                        str2 = null;
                    }
                    if (algorithm.equals(str4) && (str2 == null || str == null || str.contains(str2))) {
                        if (principalArr2 == null || principalArr2.length == 0) {
                            arrayList.add(str3);
                        } else {
                            for (Certificate certificate2 : certificateChain) {
                                if ((certificate2 instanceof X509Certificate) && list.contains(((X509Certificate) certificate2).getIssuerX500Principal())) {
                                    arrayList.add(str3);
                                }
                            }
                        }
                    }
                }
                i2++;
                i = 0;
            }
        }
        if (!arrayList.isEmpty()) {
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        return null;
    }

    public String chooseClientAlias(String[] strArr, Principal[] principalArr, Socket socket) {
        String[] chooseAlias = chooseAlias(strArr, principalArr);
        if (chooseAlias != null) {
            return chooseAlias[0];
        }
        return null;
    }

    public String chooseEngineClientAlias(String[] strArr, Principal[] principalArr, SSLEngine sSLEngine) {
        String[] chooseAlias = chooseAlias(strArr, principalArr);
        if (chooseAlias != null) {
            return chooseAlias[0];
        }
        return null;
    }

    public String chooseEngineServerAlias(String str, Principal[] principalArr, SSLEngine sSLEngine) {
        String[] chooseAlias = chooseAlias(new String[]{str}, principalArr);
        if (chooseAlias != null) {
            return chooseAlias[0];
        }
        return null;
    }

    public String chooseServerAlias(String str, Principal[] principalArr, Socket socket) {
        String[] chooseAlias = chooseAlias(new String[]{str}, principalArr);
        if (chooseAlias != null) {
            return chooseAlias[0];
        }
        return null;
    }

    public X509Certificate[] getCertificateChain(String str) {
        X509Certificate[] x509CertificateArr = null;
        if (str != null && this.hash.containsKey(str)) {
            Certificate[] certificateChain = ((KeyStore.PrivateKeyEntry) this.hash.get(str)).getCertificateChain();
            if (certificateChain[0] instanceof X509Certificate) {
                x509CertificateArr = new X509Certificate[certificateChain.length];
                for (int i = 0; i < certificateChain.length; i++) {
                    x509CertificateArr[i] = (X509Certificate) certificateChain[i];
                }
            }
        }
        return x509CertificateArr;
    }

    public String[] getClientAliases(String str, Principal[] principalArr) {
        return chooseAlias(new String[]{str}, principalArr);
    }

    public PrivateKey getPrivateKey(String str) {
        if (str == null || !this.hash.containsKey(str)) {
            return null;
        }
        return ((KeyStore.PrivateKeyEntry) this.hash.get(str)).getPrivateKey();
    }

    public String[] getServerAliases(String str, Principal[] principalArr) {
        return chooseAlias(new String[]{str}, principalArr);
    }
}
