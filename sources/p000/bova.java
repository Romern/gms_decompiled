package p000;

/* renamed from: bova */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bova extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bova f134976e;

    /* renamed from: f */
    private static volatile bxxk f134977f;

    /* renamed from: a */
    public int f134978a;

    /* renamed from: b */
    public int f134979b;

    /* renamed from: c */
    public boul f134980c;

    /* renamed from: d */
    public bouy f134981d;

    static {
        bova bova = new bova();
        f134976e = bova;
        GeneratedMessageLite.m124024a(bova.class, bova);
    }

    private bova() {
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
            return GeneratedMessageLite.m124022a(f134976e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", bouz.f134975a, "c", "d"});
        } else if (i2 == 3) {
            return new bova();
        } else {
            if (i2 == 4) {
                return new bxvd(f134976e);
            }
            if (i2 == 5) {
                return f134976e;
            }
            bxxk bxxk = f134977f;
            if (bxxk == null) {
                synchronized (bova.class) {
                    bxxk = f134977f;
                    if (bxxk == null) {
                        bxxk = new bxve(f134976e);
                        f134977f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
