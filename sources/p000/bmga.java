package p000;

/* renamed from: bmga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmga extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bmga f129208b;

    /* renamed from: d */
    private static volatile bxxk f129209d;

    /* renamed from: a */
    public int f129210a;

    /* renamed from: c */
    private int f129211c;

    static {
        bmga bmga = new bmga();
        f129208b = bmga;
        GeneratedMessageLite.m124024a(bmga.class, bmga);
    }

    private bmga() {
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
            return GeneratedMessageLite.m124022a(f129208b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bmga();
        } else {
            if (i2 == 4) {
                return new bxvd(f129208b);
            }
            if (i2 == 5) {
                return f129208b;
            }
            bxxk bxxk = f129209d;
            if (bxxk == null) {
                synchronized (bmga.class) {
                    bxxk = f129209d;
                    if (bxxk == null) {
                        bxxk = new bxve(f129208b);
                        f129209d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
