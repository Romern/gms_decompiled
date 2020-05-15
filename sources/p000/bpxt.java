package p000;

/* renamed from: bpxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpxt extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bpxt f139777e;

    /* renamed from: f */
    private static volatile bxxk f139778f;

    /* renamed from: a */
    public int f139779a;

    /* renamed from: b */
    public bxwc f139780b = bxxn.f165040b;

    /* renamed from: c */
    public long f139781c;

    /* renamed from: d */
    public long f139782d;

    static {
        bpxt bpxt = new bpxt();
        f139777e = bpxt;
        bxvk.m124024a(bpxt.class, bpxt);
    }

    private bpxt() {
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
            return bxvk.m124022a(f139777e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဃ\u0000\u0003ဃ\u0001", new Object[]{"a", "b", bpxs.class, "c", "d"});
        } else if (i2 == 3) {
            return new bpxt();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null, (byte[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f139777e;
            }
            bxxk bxxk = f139778f;
            if (bxxk == null) {
                synchronized (bpxt.class) {
                    bxxk = f139778f;
                    if (bxxk == null) {
                        bxxk = new bxve(f139777e);
                        f139778f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
