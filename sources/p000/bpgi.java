package p000;

/* renamed from: bpgi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpgi extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bpgi f137493c;

    /* renamed from: d */
    private static volatile bxxk f137494d;

    /* renamed from: a */
    public int f137495a;

    /* renamed from: b */
    public int f137496b;

    static {
        bpgi bpgi = new bpgi();
        f137493c = bpgi;
        bxvk.m124024a(bpgi.class, bpgi);
    }

    private bpgi() {
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
            return bxvk.m124022a(f137493c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bzzv.m126374b()});
        } else if (i2 == 3) {
            return new bpgi();
        } else {
            if (i2 == 4) {
                return new bxvd(f137493c);
            }
            if (i2 == 5) {
                return f137493c;
            }
            bxxk bxxk = f137494d;
            if (bxxk == null) {
                synchronized (bpgi.class) {
                    bxxk = f137494d;
                    if (bxxk == null) {
                        bxxk = new bxve(f137493c);
                        f137494d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
