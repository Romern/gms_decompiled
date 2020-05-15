package p000;

/* renamed from: cbhb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbhb extends bxvk implements bxxd {

    /* renamed from: e */
    public static final cbhb f177109e;

    /* renamed from: f */
    private static volatile bxxk f177110f;

    /* renamed from: a */
    public int f177111a;

    /* renamed from: b */
    public cbhu f177112b;

    /* renamed from: c */
    public String f177113c = "";

    /* renamed from: d */
    public bxwc f177114d = bxxn.f165040b;

    static {
        cbhb cbhb = new cbhb();
        f177109e = cbhb;
        bxvk.m124024a(cbhb.class, cbhb);
    }

    private cbhb() {
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
            return bxvk.m124022a(f177109e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0002\t\u0003Ȉ\u0004\u001b", new Object[]{"a", "b", "c", "d", cbkj.class});
        } else if (i2 == 3) {
            return new cbhb();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (float[]) null);
            }
            if (i2 == 5) {
                return f177109e;
            }
            bxxk bxxk = f177110f;
            if (bxxk == null) {
                synchronized (cbhb.class) {
                    bxxk = f177110f;
                    if (bxxk == null) {
                        bxxk = new bxve(f177109e);
                        f177110f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
