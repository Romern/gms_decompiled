package p000;

/* renamed from: bxrl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxrl extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bxrl f164570d;

    /* renamed from: e */
    private static volatile bxxk f164571e;

    /* renamed from: a */
    public int f164572a;

    /* renamed from: b */
    public int f164573b;

    /* renamed from: c */
    public int f164574c;

    static {
        bxrl bxrl = new bxrl();
        f164570d = bxrl;
        GeneratedMessageLite.m124024a(bxrl.class, bxrl);
    }

    private bxrl() {
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
            return GeneratedMessageLite.m124022a(f164570d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", bxrk.m123036b(), "c", bxrh.f164558a});
        } else if (i2 == 3) {
            return new bxrl();
        } else {
            if (i2 == 4) {
                return new bxvd(f164570d);
            }
            if (i2 == 5) {
                return f164570d;
            }
            bxxk bxxk = f164571e;
            if (bxxk == null) {
                synchronized (bxrl.class) {
                    bxxk = f164571e;
                    if (bxxk == null) {
                        bxxk = new bxve(f164570d);
                        f164571e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
