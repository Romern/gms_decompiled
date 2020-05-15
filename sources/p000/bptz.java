package p000;

/* renamed from: bptz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bptz extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bptz f139214d;

    /* renamed from: e */
    private static volatile bxxk f139215e;

    /* renamed from: a */
    public int f139216a;

    /* renamed from: b */
    public String f139217b = "";

    /* renamed from: c */
    public int f139218c;

    static {
        bptz bptz = new bptz();
        f139214d = bptz;
        bxvk.m124024a(bptz.class, bptz);
    }

    private bptz() {
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
            return bxvk.m124022a(f139214d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", sgj.m35207b()});
        } else if (i2 == 3) {
            return new bptz();
        } else {
            if (i2 == 4) {
                return new bxvd(f139214d);
            }
            if (i2 == 5) {
                return f139214d;
            }
            bxxk bxxk = f139215e;
            if (bxxk == null) {
                synchronized (bptz.class) {
                    bxxk = f139215e;
                    if (bxxk == null) {
                        bxxk = new bxve(f139214d);
                        f139215e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
