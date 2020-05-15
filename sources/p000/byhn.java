package p000;

/* renamed from: byhn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byhn extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final byhn f166478e;

    /* renamed from: f */
    private static volatile bxxk f166479f;

    /* renamed from: a */
    public int f166480a;

    /* renamed from: b */
    public int f166481b;

    /* renamed from: c */
    public int f166482c;

    /* renamed from: d */
    public int f166483d;

    static {
        byhn byhn = new byhn();
        f166478e = byhn;
        GeneratedMessageLite.m124024a(byhn.class, byhn);
    }

    private byhn() {
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
            return GeneratedMessageLite.m124022a(f166478e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", byhm.m124817b()});
        } else if (i2 == 3) {
            return new byhn();
        } else {
            if (i2 == 4) {
                return new bxvd(f166478e);
            }
            if (i2 == 5) {
                return f166478e;
            }
            bxxk bxxk = f166479f;
            if (bxxk == null) {
                synchronized (byhn.class) {
                    bxxk = f166479f;
                    if (bxxk == null) {
                        bxxk = new bxve(f166478e);
                        f166479f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
