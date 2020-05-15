package p000;

/* renamed from: bzlh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzlh extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bzlh f170528a;

    /* renamed from: e */
    private static volatile bxxk f170529e;

    /* renamed from: b */
    private int f170530b;

    /* renamed from: c */
    private bzli f170531c;

    /* renamed from: d */
    private byte f170532d = 2;

    static {
        bzlh bzlh = new bzlh();
        f170528a = bzlh;
        GeneratedMessageLite.m124024a(bzlh.class, bzlh);
    }

    private bzlh() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f170532d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f170532d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f170528a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
        } else if (i2 == 3) {
            return new bzlh();
        } else {
            if (i2 == 4) {
                return new bxvd(f170528a);
            }
            if (i2 == 5) {
                return f170528a;
            }
            bxxk bxxk = f170529e;
            if (bxxk == null) {
                synchronized (bzlh.class) {
                    bxxk = f170529e;
                    if (bxxk == null) {
                        bxxk = new bxve(f170528a);
                        f170529e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
