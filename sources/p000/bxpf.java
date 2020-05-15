package p000;

/* renamed from: bxpf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxpf extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bxpf f164252e;

    /* renamed from: f */
    private static volatile bxxk f164253f;

    /* renamed from: a */
    public int f164254a;

    /* renamed from: b */
    public int f164255b;

    /* renamed from: c */
    public int f164256c;

    /* renamed from: d */
    public bxun f164257d;

    static {
        bxpf bxpf = new bxpf();
        f164252e = bxpf;
        bxvk.m124024a(bxpf.class, bxpf);
    }

    private bxpf() {
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
            return bxvk.m124022a(f164252e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bxpf();
        } else {
            if (i2 == 4) {
                return new bxvd(f164252e);
            }
            if (i2 == 5) {
                return f164252e;
            }
            bxxk bxxk = f164253f;
            if (bxxk == null) {
                synchronized (bxpf.class) {
                    bxxk = f164253f;
                    if (bxxk == null) {
                        bxxk = new bxve(f164252e);
                        f164253f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
