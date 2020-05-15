package p000;

/* renamed from: bvmw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvmw extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvmw f156816d;

    /* renamed from: e */
    private static volatile bxxk f156817e;

    /* renamed from: a */
    public int f156818a;

    /* renamed from: b */
    public boolean f156819b;

    /* renamed from: c */
    public bxwc f156820c = bxxn.f165040b;

    static {
        bvmw bvmw = new bvmw();
        f156816d = bvmw;
        bxvk.m124024a(bvmw.class, bvmw);
    }

    private bvmw() {
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
            return bxvk.m124022a(f156816d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001a", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvmw();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null, (char[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f156816d;
            }
            bxxk bxxk = f156817e;
            if (bxxk == null) {
                synchronized (bvmw.class) {
                    bxxk = f156817e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156816d);
                        f156817e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
