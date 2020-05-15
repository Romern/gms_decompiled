package p000;

import java.util.Arrays;

/* renamed from: bkqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkqw {

    /* renamed from: c */
    public static final bkqw f125125c = new bkqw(null, 0);

    /* renamed from: d */
    public static final bkqw f125126d = new bkqw(null, 33);

    /* renamed from: e */
    public static final bkqw f125127e = new bkqw(null, 37);

    /* renamed from: f */
    public static final bkqw f125128f = new bkqw(null, 41);

    /* renamed from: g */
    public static final bkqw f125129g = new bkqw(null, 16);

    /* renamed from: a */
    public final String f125130a;

    /* renamed from: b */
    public final int f125131b;

    static {
        new bkqw(null, 48);
    }

    private bkqw(String str, int i) {
        this.f125130a = str;
        this.f125131b = i;
    }

    /* renamed from: a */
    public static bkqw m106336a(String str) {
        bkww.m106781a(str, "A sessionId must be specified, or OperationMetadata#anonymousRemote should be used.");
        return new bkqw(str, 0);
    }

    /* renamed from: a */
    public final boolean mo66269a() {
        return (this.f125131b & 1) != 0;
    }

    /* renamed from: b */
    public final boolean mo66270b() {
        return (this.f125131b & 32) != 0;
    }

    /* renamed from: c */
    public final boolean mo66271c() {
        return (this.f125131b & 16) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bkqw bkqw = (bkqw) obj;
        return bkwv.m106780a(this.f125130a, bkqw.f125130a, Integer.valueOf(this.f125131b), Integer.valueOf(bkqw.f125131b));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f125130a, Integer.valueOf(this.f125131b)});
    }

    public final String toString() {
        String str = this.f125130a;
        String binaryString = Integer.toBinaryString(this.f125131b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(binaryString).length());
        sb.append("OperationMetadata [sessionId=");
        sb.append(str);
        sb.append(", flags=");
        sb.append(binaryString);
        sb.append("]");
        return sb.toString();
    }
}
