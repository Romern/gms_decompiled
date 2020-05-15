package p000;

import java.util.Arrays;

/* renamed from: ahfv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahfv {

    /* renamed from: a */
    public final byte[] f67128a;

    public ahfv(ByteString bxtx) {
        this.f67128a = bxtx.getKey();
    }

    /* renamed from: a */
    public static ahfv m55670a(String str) {
        try {
            return new ahfv(sqd.m35971c(str));
        } catch (IllegalArgumentException e) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Bad base64 token: ") : "Bad base64 token: ".concat(valueOf), e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahfv) {
            return Arrays.equals(((ahfv) obj).f67128a, this.f67128a);
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (byte b : this.f67128a) {
            i = (i * 31) + b;
        }
        return i;
    }

    public final String toString() {
        String a = mo36407a();
        String arrays = Arrays.toString(this.f67128a);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 25 + String.valueOf(arrays).length());
        sb.append("TokenId [string=");
        sb.append(a);
        sb.append(", bytes=");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }

    public ahfv(byte[] bArr) {
        this.f67128a = bArr;
    }

    /* renamed from: a */
    public final String mo36407a() {
        return sqd.m35972d(this.f67128a);
    }
}
