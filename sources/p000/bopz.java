package p000;

/* renamed from: bopz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bopz extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bopz f134219c;

    /* renamed from: d */
    private static volatile bxxk f134220d;

    /* renamed from: a */
    public int f134221a = 0;

    /* renamed from: b */
    public Object f134222b;

    static {
        bopz bopz = new bopz();
        f134219c = bopz;
        GeneratedMessageLite.m124024a(bopz.class, bopz);
    }

    private bopz() {
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
            return GeneratedMessageLite.m124022a(f134219c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002ျ\u0000", new Object[]{"b", "a"});
        } else if (i2 == 3) {
            return new bopz();
        } else {
            if (i2 == 4) {
                return new bxvd(f134219c);
            }
            if (i2 == 5) {
                return f134219c;
            }
            bxxk bxxk = f134220d;
            if (bxxk == null) {
                synchronized (bopz.class) {
                    bxxk = f134220d;
                    if (bxxk == null) {
                        bxxk = new bxve(f134219c);
                        f134220d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
