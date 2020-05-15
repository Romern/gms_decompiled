package p000;

/* renamed from: buik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buik extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final buik f153944c;

    /* renamed from: e */
    private static volatile bxxk f153945e;

    /* renamed from: a */
    public long f153946a;

    /* renamed from: b */
    public bxwc f153947b = bxxn.f165040b;

    /* renamed from: d */
    private int f153948d;

    static {
        buik buik = new buik();
        f153944c = buik;
        GeneratedMessageLite.m124024a(buik.class, buik);
    }

    private buik() {
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
            return GeneratedMessageLite.m124022a(f153944c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဃ\u0000\u0002\u001b", new Object[]{"d", "a", "b", buic.class});
        } else if (i2 == 3) {
            return new buik();
        } else {
            if (i2 == 4) {
                return new bxvd(f153944c);
            }
            if (i2 == 5) {
                return f153944c;
            }
            bxxk bxxk = f153945e;
            if (bxxk == null) {
                synchronized (buik.class) {
                    bxxk = f153945e;
                    if (bxxk == null) {
                        bxxk = new bxve(f153944c);
                        f153945e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
