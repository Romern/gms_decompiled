package p000;

/* renamed from: bpdz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpdz extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bpdz f136458e;

    /* renamed from: f */
    private static volatile bxxk f136459f;

    /* renamed from: a */
    public int f136460a;

    /* renamed from: b */
    public int f136461b;

    /* renamed from: c */
    public int f136462c;

    /* renamed from: d */
    public int f136463d;

    static {
        bpdz bpdz = new bpdz();
        f136458e = bpdz;
        GeneratedMessageLite.m124024a(bpdz.class, bpdz);
    }

    private bpdz() {
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
            return GeneratedMessageLite.m124022a(f136458e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bpdz();
        } else {
            if (i2 == 4) {
                return new bxvd(f136458e);
            }
            if (i2 == 5) {
                return f136458e;
            }
            bxxk bxxk = f136459f;
            if (bxxk == null) {
                synchronized (bpdz.class) {
                    bxxk = f136459f;
                    if (bxxk == null) {
                        bxxk = new bxve(f136458e);
                        f136459f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
