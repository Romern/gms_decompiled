package p000;

/* renamed from: bmnc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmnc extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bmnc f130080d;

    /* renamed from: e */
    private static volatile bxxk f130081e;

    /* renamed from: a */
    public int f130082a;

    /* renamed from: b */
    public bmmw f130083b;

    /* renamed from: c */
    public boolean f130084c;

    static {
        bmnc bmnc = new bmnc();
        f130080d = bmnc;
        GeneratedMessageLite.m124024a(bmnc.class, bmnc);
    }

    private bmnc() {
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
            return GeneratedMessageLite.m124022a(f130080d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bmnc();
        } else {
            if (i2 == 4) {
                return new bxvd(f130080d);
            }
            if (i2 == 5) {
                return f130080d;
            }
            bxxk bxxk = f130081e;
            if (bxxk == null) {
                synchronized (bmnc.class) {
                    bxxk = f130081e;
                    if (bxxk == null) {
                        bxxk = new bxve(f130080d);
                        f130081e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
