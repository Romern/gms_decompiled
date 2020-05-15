package p000;

/* renamed from: dcq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dcq extends bxvk implements bxxd {

    /* renamed from: c */
    public static final dcq f12871c;

    /* renamed from: d */
    public static final bxvj f12872d;

    /* renamed from: e */
    private static volatile bxxk f12873e;

    /* renamed from: a */
    public int f12874a;

    /* renamed from: b */
    public String f12875b = "";

    static {
        dcq dcq = new dcq();
        f12871c = dcq;
        bxvk.m124024a(dcq.class, dcq);
        dcs dcs = dcs.f12877a;
        dcq dcq2 = f12871c;
        f12872d = bxvk.m124006a(dcs, dcq2, dcq2, 228908424, bxzf.MESSAGE);
    }

    private dcq() {
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
            return bxvk.m124022a(f12871c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new dcq();
        } else {
            if (i2 == 4) {
                return new bxvd(f12871c);
            }
            if (i2 == 5) {
                return f12871c;
            }
            bxxk bxxk = f12873e;
            if (bxxk == null) {
                synchronized (dcq.class) {
                    bxxk = f12873e;
                    if (bxxk == null) {
                        bxxk = new bxve(f12871c);
                        f12873e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
