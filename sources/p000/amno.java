package p000;

/* renamed from: amno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amno extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final amno f75521d;

    /* renamed from: e */
    private static volatile bxxk f75522e;

    /* renamed from: a */
    public int f75523a;

    /* renamed from: b */
    public int f75524b;

    /* renamed from: c */
    public long f75525c;

    static {
        amno amno = new amno();
        f75521d = amno;
        GeneratedMessageLite.m124024a(amno.class, amno);
    }

    private amno() {
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
            return GeneratedMessageLite.m124022a(f75521d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", amnn.f75520a, "c"});
        } else if (i2 == 3) {
            return new amno();
        } else {
            if (i2 == 4) {
                return new bxvd(f75521d);
            }
            if (i2 == 5) {
                return f75521d;
            }
            bxxk bxxk = f75522e;
            if (bxxk == null) {
                synchronized (amno.class) {
                    bxxk = f75522e;
                    if (bxxk == null) {
                        bxxk = new bxve(f75521d);
                        f75522e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
