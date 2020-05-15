package p000;

/* renamed from: bptk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bptk extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bptk f139133d;

    /* renamed from: e */
    private static volatile bxxk f139134e;

    /* renamed from: a */
    public int f139135a;

    /* renamed from: b */
    public long f139136b;

    /* renamed from: c */
    public bxvw f139137c = bxwq.f165002b;

    static {
        bptk bptk = new bptk();
        f139133d = bptk;
        bxvk.m124024a(bptk.class, bptk);
    }

    private bptk() {
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
            return bxvk.m124022a(f139133d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001စ\u0000\u0002\u0017", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bptk();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (boolean[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f139133d;
            }
            bxxk bxxk = f139134e;
            if (bxxk == null) {
                synchronized (bptk.class) {
                    bxxk = f139134e;
                    if (bxxk == null) {
                        bxxk = new bxve(f139133d);
                        f139134e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
