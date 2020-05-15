package p000;

/* renamed from: bvzn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvzn extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvzn f158530d;

    /* renamed from: e */
    private static volatile bxxk f158531e;

    /* renamed from: a */
    public int f158532a;

    /* renamed from: b */
    public bvzq f158533b;

    /* renamed from: c */
    public int f158534c = 2;

    static {
        bvzn bvzn = new bvzn();
        f158530d = bvzn;
        GeneratedMessageLite.m124024a(bvzn.class, bvzn);
    }

    private bvzn() {
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
            return GeneratedMessageLite.m124022a(f158530d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", bvzp.f158540a});
        } else if (i2 == 3) {
            return new bvzn();
        } else {
            if (i2 == 4) {
                return new bxvd(f158530d);
            }
            if (i2 == 5) {
                return f158530d;
            }
            bxxk bxxk = f158531e;
            if (bxxk == null) {
                synchronized (bvzn.class) {
                    bxxk = f158531e;
                    if (bxxk == null) {
                        bxxk = new bxve(f158530d);
                        f158531e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
