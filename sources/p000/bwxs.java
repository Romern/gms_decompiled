package p000;

/* renamed from: bwxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwxs extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwxs f161407d;

    /* renamed from: e */
    private static volatile bxxk f161408e;

    /* renamed from: a */
    public int f161409a;

    /* renamed from: b */
    public int f161410b;

    /* renamed from: c */
    public bxwc f161411c = bxxn.f165040b;

    static {
        bwxs bwxs = new bwxs();
        f161407d = bwxs;
        GeneratedMessageLite.m124024a(bwxs.class, bwxs);
    }

    private bwxs() {
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
            return GeneratedMessageLite.m124022a(f161407d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001င\u0000\u0003\u001b", new Object[]{"a", "b", "c", bwxq.class});
        } else if (i2 == 3) {
            return new bwxs();
        } else {
            if (i2 == 4) {
                return new bwxr();
            }
            if (i2 == 5) {
                return f161407d;
            }
            bxxk bxxk = f161408e;
            if (bxxk == null) {
                synchronized (bwxs.class) {
                    bxxk = f161408e;
                    if (bxxk == null) {
                        bxxk = new bxve(f161407d);
                        f161408e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
