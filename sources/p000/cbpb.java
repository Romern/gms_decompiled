package p000;

/* renamed from: cbpb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbpb extends bxvk implements bxxd {

    /* renamed from: i */
    public static final cbpb f177888i;

    /* renamed from: j */
    private static volatile bxxk f177889j;

    /* renamed from: a */
    public bxyk f177890a;

    /* renamed from: b */
    public boolean f177891b;

    /* renamed from: c */
    public boolean f177892c;

    /* renamed from: d */
    public int f177893d;

    /* renamed from: e */
    public int f177894e;

    /* renamed from: f */
    public int f177895f;

    /* renamed from: g */
    public int f177896g;

    /* renamed from: h */
    public int f177897h;

    static {
        cbpb cbpb = new cbpb();
        f177888i = cbpb;
        bxvk.m124024a(cbpb.class, cbpb);
    }

    private cbpb() {
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
            return bxvk.m124022a(f177888i, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\t\u0002\u0007\u0003\u0007\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b\u0004", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new cbpb();
        } else {
            if (i2 == 4) {
                return new bxvd(f177888i);
            }
            if (i2 == 5) {
                return f177888i;
            }
            bxxk bxxk = f177889j;
            if (bxxk == null) {
                synchronized (cbpb.class) {
                    bxxk = f177889j;
                    if (bxxk == null) {
                        bxxk = new bxve(f177888i);
                        f177889j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
