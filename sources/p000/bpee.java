package p000;

/* renamed from: bpee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpee extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bpee f137262c;

    /* renamed from: d */
    private static volatile bxxk f137263d;

    /* renamed from: a */
    public int f137264a;

    /* renamed from: b */
    public int f137265b;

    static {
        bpee bpee = new bpee();
        f137262c = bpee;
        bxvk.m124024a(bpee.class, bpee);
    }

    private bpee() {
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
            return bxvk.m124022a(f137262c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpee();
        } else {
            if (i2 == 4) {
                return new bxvd(f137262c);
            }
            if (i2 == 5) {
                return f137262c;
            }
            bxxk bxxk = f137263d;
            if (bxxk == null) {
                synchronized (bpee.class) {
                    bxxk = f137263d;
                    if (bxxk == null) {
                        bxxk = new bxve(f137262c);
                        f137263d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
