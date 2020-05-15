package p000;

/* renamed from: bmis */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmis extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bmis f129626h;

    /* renamed from: i */
    private static volatile bxxk f129627i;

    /* renamed from: a */
    public int f129628a;

    /* renamed from: b */
    public String f129629b = "";

    /* renamed from: c */
    public bmit f129630c;

    /* renamed from: d */
    public ByteString f129631d = ByteString.f164797b;

    /* renamed from: e */
    public bxwc f129632e = bxxn.f165040b;

    /* renamed from: f */
    public int f129633f;

    /* renamed from: g */
    public bmiq f129634g;

    static {
        bmis bmis = new bmis();
        f129626h = bmis;
        GeneratedMessageLite.m124024a(bmis.class, bmis);
    }

    private bmis() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f129626h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0004ည\u0002\u0005\u001b\u0006ဉ\u0001\u0007ဌ\u0003\bဉ\u0004", new Object[]{"a", "b", "d", "e", bmir.class, "c", "f", bmip.f129614a, "g"});
        } else if (i2 == 3) {
            return new bmis();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (char[][][]) null);
            }
            if (i2 == 5) {
                return f129626h;
            }
            bxxk bxxk = f129627i;
            if (bxxk == null) {
                synchronized (bmis.class) {
                    bxxk = f129627i;
                    if (bxxk == null) {
                        bxxk = new bxve(f129626h);
                        f129627i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
