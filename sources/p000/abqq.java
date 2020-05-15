package p000;

/* renamed from: abqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abqq extends bxvk implements bxxd {

    /* renamed from: c */
    public static final abqq f58001c;

    /* renamed from: d */
    private static volatile bxxk f58002d;

    /* renamed from: a */
    public int f58003a = 0;

    /* renamed from: b */
    public Object f58004b;

    static {
        abqq abqq = new abqq();
        f58001c = abqq;
        bxvk.m124024a(abqq.class, abqq);
    }

    private abqq() {
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
            return bxvk.m124022a(f58001c, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"b", "a", abqu.class, abqu.class, abqs.class, abqr.class, abqt.class, abqu.class});
        } else if (i2 == 3) {
            return new abqq();
        } else {
            if (i2 == 4) {
                return new bxvd(f58001c);
            }
            if (i2 == 5) {
                return f58001c;
            }
            bxxk bxxk = f58002d;
            if (bxxk == null) {
                synchronized (abqq.class) {
                    bxxk = f58002d;
                    if (bxxk == null) {
                        bxxk = new bxve(f58001c);
                        f58002d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
