package p000;

/* renamed from: bnzb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bnzb {

    /* renamed from: a */
    private static final char[] f132392a = "0123456789abcdef".toCharArray();

    /* renamed from: a */
    private static int m110867a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("Illegal hexadecimal character: ");
        sb.append(c);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    static bnzb m110872b(byte[] bArr) {
        return new bnyy(bArr);
    }

    /* renamed from: a */
    public abstract int mo68738a();

    /* renamed from: a */
    public abstract boolean mo68739a(bnzb bnzb);

    /* renamed from: b */
    public abstract byte[] mo68740b();

    /* renamed from: c */
    public abstract int mo68741c();

    /* renamed from: d */
    public abstract long mo68742d();

    /* renamed from: e */
    public byte[] mo68743e() {
        return mo68740b();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bnzb) {
            bnzb bnzb = (bnzb) obj;
            return mo68738a() == bnzb.mo68738a() && mo68739a(bnzb);
        }
    }

    public final int hashCode() {
        if (mo68738a() >= 32) {
            return mo68741c();
        }
        byte[] e = mo68743e();
        byte b = e[0] & 255;
        for (int i = 1; i < e.length; i++) {
            b |= (e[i] & 255) << (i * 8);
        }
        return b;
    }

    public final String toString() {
        byte[] e = mo68743e();
        int length = e.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : e) {
            sb.append(f132392a[(b >> 4) & 15]);
            sb.append(f132392a[b & 15]);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static bnzb m110868a(int i) {
        return new bnyz(i);
    }

    /* renamed from: a */
    public static bnzb m110869a(long j) {
        return new bnza(j);
    }

    /* renamed from: a */
    public static bnzb m110870a(String str) {
        boolean z;
        boolean z2 = true;
        if (str.length() >= 2) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108596a(z, "input string (%s) must have at least 2 characters", str);
        if (str.length() % 2 != 0) {
            z2 = false;
        }
        bmxy.m108596a(z2, "input string (%s) must have an even number of characters", str);
        byte[] bArr = new byte[(str.length() / 2)];
        for (int i = 0; i < str.length(); i += 2) {
            bArr[i / 2] = (byte) ((m110867a(str.charAt(i)) << 4) + m110867a(str.charAt(i + 1)));
        }
        return m110872b(bArr);
    }

    /* renamed from: a */
    public static bnzb m110871a(byte[] bArr) {
        bmxy.m108589a(bArr.length > 0, "A HashCode must contain at least 1 byte.");
        return m110872b((byte[]) bArr.clone());
    }
}
