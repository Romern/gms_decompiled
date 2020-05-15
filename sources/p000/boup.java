package p000;

/* renamed from: boup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boup extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final boup f134948e;

    /* renamed from: f */
    private static volatile bxxk f134949f;

    /* renamed from: a */
    public int f134950a;

    /* renamed from: b */
    public int f134951b;

    /* renamed from: c */
    public boolean f134952c;

    /* renamed from: d */
    public int f134953d;

    static {
        boup boup = new boup();
        f134948e = boup;
        GeneratedMessageLite.m124024a(boup.class, boup);
    }

    private boup() {
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
            return GeneratedMessageLite.m124022a(f134948e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", boum.f134946a, "c", "d", boun.f134947a});
        } else if (i2 == 3) {
            return new boup();
        } else {
            if (i2 == 4) {
                return new bxvd(f134948e);
            }
            if (i2 == 5) {
                return f134948e;
            }
            bxxk bxxk = f134949f;
            if (bxxk == null) {
                synchronized (boup.class) {
                    bxxk = f134949f;
                    if (bxxk == null) {
                        bxxk = new bxve(f134948e);
                        f134949f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
