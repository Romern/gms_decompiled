package com.google.android.gms.org.conscrypt;

import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAPublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ChainStrengthAnalyzer {
    private static final int MIN_DSA_P_LEN_BITS = 1024;
    private static final int MIN_DSA_Q_LEN_BITS = 160;
    private static final int MIN_EC_FIELD_SIZE_BITS = 160;
    private static final int MIN_RSA_MODULUS_LEN_BITS = 1024;
    private static final String[] SIGNATURE_ALGORITHM_OID_BLACKLIST = {"1.2.840.113549.1.1.2", "1.2.840.113549.1.1.3", "1.2.840.113549.1.1.4", "1.2.840.113549.1.1.5", "1.2.840.10040.4.3", "1.2.840.10045.4.1"};

    public static final void check(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            X509Certificate x509Certificate = (X509Certificate) it.next();
            try {
                checkCert(x509Certificate);
            } catch (CertificateException e) {
                String valueOf = String.valueOf(x509Certificate.getSubjectX500Principal());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
                sb.append("Unacceptable certificate: ");
                sb.append(valueOf);
                throw new CertificateException(sb.toString(), e);
            }
        }
    }

    public static final void checkCert(X509Certificate x509Certificate) {
        checkKeyLength(x509Certificate);
        checkSignatureAlgorithm(x509Certificate);
    }

    private static void checkKeyLength(X509Certificate x509Certificate) {
        PublicKey publicKey = x509Certificate.getPublicKey();
        if (publicKey instanceof RSAPublicKey) {
            if (((RSAPublicKey) publicKey).getModulus().bitLength() < 1024) {
                throw new CertificateException("RSA modulus is < 1024 bits");
            }
        } else if (publicKey instanceof ECPublicKey) {
            if (((ECPublicKey) publicKey).getParams().getCurve().getField().getFieldSize() < 160) {
                throw new CertificateException("EC key field size is < 160 bits");
            }
        } else if (publicKey instanceof DSAPublicKey) {
            DSAPublicKey dSAPublicKey = (DSAPublicKey) publicKey;
            int bitLength = dSAPublicKey.getParams().getP().bitLength();
            int bitLength2 = dSAPublicKey.getParams().getQ().bitLength();
            if (bitLength < 1024 || bitLength2 < 160) {
                throw new CertificateException("DSA key length is < (1024, 160) bits");
            }
        } else {
            String valueOf = String.valueOf(publicKey.getClass().getName());
            throw new CertificateException(valueOf.length() == 0 ? new String("Rejecting unknown key class ") : "Rejecting unknown key class ".concat(valueOf));
        }
    }

    private static void checkSignatureAlgorithm(X509Certificate x509Certificate) {
        String sigAlgOID = x509Certificate.getSigAlgOID();
        for (String str : SIGNATURE_ALGORITHM_OID_BLACKLIST) {
            if (sigAlgOID.equals(str)) {
                String valueOf = String.valueOf(sigAlgOID);
                throw new CertificateException(valueOf.length() == 0 ? new String("Signature uses an insecure hash function: ") : "Signature uses an insecure hash function: ".concat(valueOf));
            }
        }
    }

    public static final void check(X509Certificate[] x509CertificateArr) {
        int length = x509CertificateArr.length;
        int i = 0;
        while (i < length) {
            X509Certificate x509Certificate = x509CertificateArr[i];
            try {
                checkCert(x509Certificate);
                i++;
            } catch (CertificateException e) {
                String valueOf = String.valueOf(x509Certificate.getSubjectX500Principal());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
                sb.append("Unacceptable certificate: ");
                sb.append(valueOf);
                throw new CertificateException(sb.toString(), e);
            }
        }
    }
}
