package p000;

/* renamed from: bmnf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmnf extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bmnf f130097c;

    /* renamed from: e */
    private static volatile bxxk f130098e;

    /* renamed from: a */
    public long f130099a;

    /* renamed from: b */
    public bxvw f130100b = bxwq.f165002b;

    /* renamed from: d */
    private int f130101d;

    static {
        bmnf bmnf = new bmnf();
        f130097c = bmnf;
        GeneratedMessageLite.m124024a(bmnf.class, bmnf);
    }

    private bmnf() {
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
            return GeneratedMessageLite.m124022a(f130097c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဂ\u0000\u0002%", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bmnf();
        } else {
            if (i2 == 4) {
                return new bxvd(f130097c);
            }
            if (i2 == 5) {
                return f130097c;
            }
            bxxk bxxk = f130098e;
            if (bxxk == null) {
                synchronized (bmnf.class) {
                    bxxk = f130098e;
                    if (bxxk == null) {
                        bxxk = new bxve(f130097c);
                        f130098e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
