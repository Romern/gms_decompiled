package p000;

import java.util.Arrays;
import javax.crypto.SecretKey;

/* renamed from: vow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vow {

    /* renamed from: a */
    public final SecretKey f49687a;

    /* renamed from: b */
    public final String f49688b;

    /* renamed from: c */
    public final byte[] f49689c;

    public vow(SecretKey secretKey, String str, byte[] bArr) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (str != null) {
            z = false;
        } else {
            z = true;
        }
        if (bArr != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        sdo.m34975b(z == z2 ? true : z3, "Both parameters and initVector must be set or neither can be");
        sdo.m34959a(secretKey);
        this.f49687a = secretKey;
        this.f49688b = str;
        this.f49689c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            vow vow = (vow) obj;
            if (this.f49687a.equals(vow.f49687a)) {
                String str = this.f49688b;
                if (str == null ? vow.f49688b == null : str.equals(vow.f49688b)) {
                    return Arrays.equals(this.f49689c, vow.f49689c);
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f49687a.hashCode() * 31;
        String str = this.f49688b;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        byte[] bArr = this.f49689c;
        if (bArr != null) {
            i = Arrays.hashCode(bArr);
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String algorithm = this.f49687a.getAlgorithm();
        String str = this.f49688b;
        StringBuilder sb = new StringBuilder(String.valueOf(algorithm).length() + 36 + String.valueOf(str).length());
        sb.append("EncryptionSpec[encryptionAlgorithm=");
        sb.append(algorithm);
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
