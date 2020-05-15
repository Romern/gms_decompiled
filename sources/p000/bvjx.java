package p000;

/* renamed from: bvjx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvjx extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvjx f156362d;

    /* renamed from: e */
    private static volatile bxxk f156363e;

    /* renamed from: a */
    public String f156364a = "";

    /* renamed from: b */
    public boolean f156365b;

    /* renamed from: c */
    public boolean f156366c;

    static {
        bvjx bvjx = new bvjx();
        f156362d = bvjx;
        GeneratedMessageLite.m124024a(bvjx.class, bvjx);
    }

    private bvjx() {
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
            return GeneratedMessageLite.m124022a(f156362d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\u0007", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvjx();
        } else {
            if (i2 == 4) {
                return new bxvd(f156362d);
            }
            if (i2 == 5) {
                return f156362d;
            }
            bxxk bxxk = f156363e;
            if (bxxk == null) {
                synchronized (bvjx.class) {
                    bxxk = f156363e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156362d);
                        f156363e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
