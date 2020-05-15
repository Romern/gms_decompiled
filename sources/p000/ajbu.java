package p000;

import java.util.Arrays;

/* renamed from: ajbu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ajbu {

    /* renamed from: b */
    private static final char[] f70351b = "0123456789abcdef".toCharArray();

    /* renamed from: a */
    public final byte[] f70352a;

    protected ajbu(byte[] bArr) {
        this.f70352a = bArr;
    }

    /* renamed from: a */
    public static String m58474a(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : bArr) {
            sb.append(f70351b[(b >> 4) & 15]);
            sb.append(f70351b[b & 15]);
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj.getClass().isAssignableFrom(getClass())) {
            return Arrays.equals(this.f70352a, ((ajbu) obj).f70352a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f70352a);
    }

    public String toString() {
        return m58474a(this.f70352a);
    }

    /* renamed from: a */
    public final String mo38463a() {
        return m58474a(this.f70352a);
    }
}
