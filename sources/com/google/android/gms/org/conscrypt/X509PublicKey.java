package com.google.android.gms.org.conscrypt;

import java.security.PublicKey;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class X509PublicKey implements PublicKey {
    private static final long serialVersionUID = -8610156854731664298L;
    private final String algorithm;
    private final byte[] encoded;

    public X509PublicKey(String str, byte[] bArr) {
        this.algorithm = str;
        this.encoded = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            X509PublicKey x509PublicKey = (X509PublicKey) obj;
            String str = this.algorithm;
            if (str != null) {
                if (!str.equals(x509PublicKey.algorithm)) {
                    return false;
                }
            } else if (x509PublicKey.algorithm != null) {
                return false;
            }
            if (Arrays.equals(this.encoded, x509PublicKey.encoded)) {
                return true;
            }
        }
        return false;
    }

    public String getAlgorithm() {
        return this.algorithm;
    }

    public byte[] getEncoded() {
        return this.encoded;
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        String str = this.algorithm;
        return (((str != null ? str.hashCode() : 0) + 31) * 31) + Arrays.hashCode(this.encoded);
    }

    public String toString() {
        String str = this.algorithm;
        String arrays = Arrays.toString(this.encoded);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(arrays).length());
        sb.append("X509PublicKey [algorithm=");
        sb.append(str);
        sb.append(", encoded=");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
