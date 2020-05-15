package p000;

/* renamed from: bkzc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkzc extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bkzc f125552d;

    /* renamed from: e */
    private static volatile bxxk f125553e;

    /* renamed from: a */
    public int f125554a;

    /* renamed from: b */
    public int f125555b;

    /* renamed from: c */
    public int f125556c;

    static {
        bkzc bkzc = new bkzc();
        f125552d = bkzc;
        GeneratedMessageLite.m124024a(bkzc.class, bkzc);
    }

    private bkzc() {
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
            return GeneratedMessageLite.m124022a(f125552d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", blaj.f125775a, "c", blak.f125776a});
        } else if (i2 == 3) {
            return new bkzc();
        } else {
            if (i2 == 4) {
                return new bxvd(f125552d);
            }
            if (i2 == 5) {
                return f125552d;
            }
            bxxk bxxk = f125553e;
            if (bxxk == null) {
                synchronized (bkzc.class) {
                    bxxk = f125553e;
                    if (bxxk == null) {
                        bxxk = new bxve(f125552d);
                        f125553e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
