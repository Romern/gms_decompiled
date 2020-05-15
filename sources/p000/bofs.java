package p000;

/* renamed from: bofs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bofs extends bxvk implements bxxd {

    /* renamed from: j */
    public static final bofs f132937j;

    /* renamed from: k */
    private static volatile bxxk f132938k;

    /* renamed from: a */
    public int f132939a;

    /* renamed from: b */
    public long f132940b;

    /* renamed from: c */
    public String f132941c = "";

    /* renamed from: d */
    public String f132942d = "";

    /* renamed from: e */
    public int f132943e;

    /* renamed from: f */
    public String f132944f = "";

    /* renamed from: g */
    public boolean f132945g;

    /* renamed from: h */
    public boolean f132946h;

    /* renamed from: i */
    public int f132947i;

    static {
        bofs bofs = new bofs();
        f132937j = bofs;
        bxvk.m124024a(bofs.class, bofs);
    }

    private bofs() {
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
            return bxvk.m124022a(f132937j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဌ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", bofr.f132936a});
        } else if (i2 == 3) {
            return new bofs();
        } else {
            if (i2 == 4) {
                return new bxvd(f132937j);
            }
            if (i2 == 5) {
                return f132937j;
            }
            bxxk bxxk = f132938k;
            if (bxxk == null) {
                synchronized (bofs.class) {
                    bxxk = f132938k;
                    if (bxxk == null) {
                        bxxk = new bxve(f132937j);
                        f132938k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
