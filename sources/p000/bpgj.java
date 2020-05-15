package p000;

/* renamed from: bpgj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpgj extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bpgj f137497e;

    /* renamed from: f */
    private static volatile bxxk f137498f;

    /* renamed from: a */
    public int f137499a;

    /* renamed from: b */
    public int f137500b;

    /* renamed from: c */
    public String f137501c = "";

    /* renamed from: d */
    public boolean f137502d;

    static {
        bpgj bpgj = new bpgj();
        f137497e = bpgj;
        bxvk.m124024a(bpgj.class, bpgj);
    }

    private bpgj() {
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
            return bxvk.m124022a(f137497e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", bzzv.m126374b(), "c", "d"});
        } else if (i2 == 3) {
            return new bpgj();
        } else {
            if (i2 == 4) {
                return new bxvd(f137497e);
            }
            if (i2 == 5) {
                return f137497e;
            }
            bxxk bxxk = f137498f;
            if (bxxk == null) {
                synchronized (bpgj.class) {
                    bxxk = f137498f;
                    if (bxxk == null) {
                        bxxk = new bxve(f137497e);
                        f137498f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
