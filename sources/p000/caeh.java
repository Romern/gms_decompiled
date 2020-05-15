package p000;

/* renamed from: caeh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caeh extends bxvk implements bxxd {

    /* renamed from: b */
    public static final caeh f172821b;

    /* renamed from: d */
    private static volatile bxxk f172822d;

    /* renamed from: a */
    public caeg f172823a;

    /* renamed from: c */
    private int f172824c;

    static {
        caeh caeh = new caeh();
        f172821b = caeh;
        bxvk.m124024a(caeh.class, caeh);
    }

    private caeh() {
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
            return bxvk.m124022a(f172821b, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0002", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new caeh();
        } else {
            if (i2 == 4) {
                return new bxvd(f172821b);
            }
            if (i2 == 5) {
                return f172821b;
            }
            bxxk bxxk = f172822d;
            if (bxxk == null) {
                synchronized (caeh.class) {
                    bxxk = f172822d;
                    if (bxxk == null) {
                        bxxk = new bxve(f172821b);
                        f172822d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
