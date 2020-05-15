package p000;

/* renamed from: bzjm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzjm extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzjm f170307c;

    /* renamed from: d */
    private static volatile bxxk f170308d;

    /* renamed from: a */
    public int f170309a;

    /* renamed from: b */
    public int f170310b;

    static {
        bzjm bzjm = new bzjm();
        f170307c = bzjm;
        GeneratedMessageLite.m124024a(bzjm.class, bzjm);
    }

    private bzjm() {
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
            return GeneratedMessageLite.m124022a(f170307c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002င\u0001", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzjm();
        } else {
            if (i2 == 4) {
                return new bxvd(f170307c);
            }
            if (i2 == 5) {
                return f170307c;
            }
            bxxk bxxk = f170308d;
            if (bxxk == null) {
                synchronized (bzjm.class) {
                    bxxk = f170308d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170307c);
                        f170308d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
