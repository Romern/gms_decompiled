package p000;

/* renamed from: bolf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bolf extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bolf f133514e;

    /* renamed from: f */
    private static volatile bxxk f133515f;

    /* renamed from: a */
    public int f133516a;

    /* renamed from: b */
    public long f133517b;

    /* renamed from: c */
    public bold f133518c;

    /* renamed from: d */
    public bxwc f133519d = bxxn.f165040b;

    static {
        bolf bolf = new bolf();
        f133514e = bolf;
        bxvk.m124024a(bolf.class, bolf);
    }

    private bolf() {
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
            return bxvk.m124022a(f133514e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0004\u001b\u0006ဉ\u0001", new Object[]{"a", "b", "d", bolh.class, "c"});
        } else if (i2 == 3) {
            return new bolf();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (byte[][]) null);
            }
            if (i2 == 5) {
                return f133514e;
            }
            bxxk bxxk = f133515f;
            if (bxxk == null) {
                synchronized (bolf.class) {
                    bxxk = f133515f;
                    if (bxxk == null) {
                        bxxk = new bxve(f133514e);
                        f133515f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
