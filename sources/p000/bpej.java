package p000;

/* renamed from: bpej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpej extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bpej f137288f;

    /* renamed from: g */
    private static volatile bxxk f137289g;

    /* renamed from: a */
    public int f137290a;

    /* renamed from: b */
    public int f137291b;

    /* renamed from: c */
    public boolean f137292c;

    /* renamed from: d */
    public bpeg f137293d;

    /* renamed from: e */
    public int f137294e;

    static {
        bpej bpej = new bpej();
        f137288f = bpej;
        bxvk.m124024a(bpej.class, bpej);
    }

    private bpej() {
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
            return bxvk.m124022a(f137288f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bpej();
        } else {
            if (i2 == 4) {
                return new bxvd(f137288f);
            }
            if (i2 == 5) {
                return f137288f;
            }
            bxxk bxxk = f137289g;
            if (bxxk == null) {
                synchronized (bpej.class) {
                    bxxk = f137289g;
                    if (bxxk == null) {
                        bxxk = new bxve(f137288f);
                        f137289g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
