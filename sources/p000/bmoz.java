package p000;

/* renamed from: bmoz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmoz extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bmoz f130272c;

    /* renamed from: e */
    private static volatile bxxk f130273e;

    /* renamed from: a */
    public long f130274a;

    /* renamed from: b */
    public int f130275b;

    /* renamed from: d */
    private int f130276d;

    static {
        bmoz bmoz = new bmoz();
        f130272c = bmoz;
        GeneratedMessageLite.m124024a(bmoz.class, bmoz);
    }

    private bmoz() {
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
            return GeneratedMessageLite.m124022a(f130272c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", bmox.f130271a});
        } else if (i2 == 3) {
            return new bmoz();
        } else {
            if (i2 == 4) {
                return new bxvd(f130272c);
            }
            if (i2 == 5) {
                return f130272c;
            }
            bxxk bxxk = f130273e;
            if (bxxk == null) {
                synchronized (bmoz.class) {
                    bxxk = f130273e;
                    if (bxxk == null) {
                        bxxk = new bxve(f130272c);
                        f130273e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
