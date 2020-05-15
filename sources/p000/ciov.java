package p000;

/* renamed from: ciov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciov extends bxvk implements bxxd {

    /* renamed from: i */
    public static final ciov f191144i;

    /* renamed from: j */
    private static volatile bxxk f191145j;

    /* renamed from: a */
    public bxwc f191146a = bxxn.f165040b;

    /* renamed from: b */
    public boolean f191147b;

    /* renamed from: c */
    public bxwc f191148c = bxxn.f165040b;

    /* renamed from: d */
    public bxvt f191149d = bxvm.f164965b;

    /* renamed from: e */
    public boolean f191150e;

    /* renamed from: f */
    public String f191151f = "";

    /* renamed from: g */
    public boolean f191152g;

    /* renamed from: h */
    public int f191153h;

    static {
        ciov ciov = new ciov();
        f191144i = ciov;
        bxvk.m124024a(ciov.class, ciov);
    }

    private ciov() {
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
            return bxvk.m124022a(f191144i, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0003\u0000\u0001\u001b\u0002\u0007\u0003Ț\u0004'\u0005\u0007\u0006Ȉ\u0007\u0007\b\u0004", new Object[]{"a", cipb.class, "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new ciov();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null, (float[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f191144i;
            }
            bxxk bxxk = f191145j;
            if (bxxk == null) {
                synchronized (ciov.class) {
                    bxxk = f191145j;
                    if (bxxk == null) {
                        bxxk = new bxve(f191144i);
                        f191145j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
