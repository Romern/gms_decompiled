package p000;

/* renamed from: kzw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kzw extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final kzw f25486g;

    /* renamed from: h */
    private static volatile bxxk f25487h;

    /* renamed from: a */
    public int f25488a;

    /* renamed from: b */
    public String f25489b = "";

    /* renamed from: c */
    public String f25490c = "";

    /* renamed from: d */
    public String f25491d = "";

    /* renamed from: e */
    public bxvt f25492e = bxvm.f164965b;

    /* renamed from: f */
    public bxwc f25493f = bxxn.f165040b;

    static {
        kzw kzw = new kzw();
        f25486g = kzw;
        GeneratedMessageLite.m124024a(kzw.class, kzw);
    }

    private kzw() {
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
            return GeneratedMessageLite.m124022a(f25486g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u0018\u0005\u001b", new Object[]{"a", "b", "c", "d", "e", "f", kzv.class});
        } else if (i2 == 3) {
            return new kzw();
        } else {
            if (i2 == 4) {
                return new bxvd(f25486g);
            }
            if (i2 == 5) {
                return f25486g;
            }
            bxxk bxxk = f25487h;
            if (bxxk == null) {
                synchronized (kzw.class) {
                    bxxk = f25487h;
                    if (bxxk == null) {
                        bxxk = new bxve(f25486g);
                        f25487h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
