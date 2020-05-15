package p000;

/* renamed from: bmom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmom extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bmom f130237c;

    /* renamed from: e */
    private static volatile bxxk f130238e;

    /* renamed from: a */
    public bmnr f130239a;

    /* renamed from: b */
    public int f130240b;

    /* renamed from: d */
    private int f130241d;

    static {
        bmom bmom = new bmom();
        f130237c = bmom;
        GeneratedMessageLite.m124024a(bmom.class, bmom);
    }

    private bmom() {
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
            return GeneratedMessageLite.m124022a(f130237c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bmom();
        } else {
            if (i2 == 4) {
                return new bxvd(f130237c);
            }
            if (i2 == 5) {
                return f130237c;
            }
            bxxk bxxk = f130238e;
            if (bxxk == null) {
                synchronized (bmom.class) {
                    bxxk = f130238e;
                    if (bxxk == null) {
                        bxxk = new bxve(f130237c);
                        f130238e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
