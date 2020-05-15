package p000;

/* renamed from: bvjv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvjv extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvjv f156354d;

    /* renamed from: e */
    private static volatile bxxk f156355e;

    /* renamed from: a */
    public String f156356a = "";

    /* renamed from: b */
    public bxwc f156357b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f156358c = bxxn.f165040b;

    static {
        bvjv bvjv = new bvjv();
        f156354d = bvjv;
        GeneratedMessageLite.m124024a(bvjv.class, bvjv);
    }

    private bvjv() {
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
            return GeneratedMessageLite.m124022a(f156354d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001Ȉ\u0002Ț\u0003Ț", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvjv();
        } else {
            if (i2 == 4) {
                return new bvju();
            }
            if (i2 == 5) {
                return f156354d;
            }
            bxxk bxxk = f156355e;
            if (bxxk == null) {
                synchronized (bvjv.class) {
                    bxxk = f156355e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156354d);
                        f156355e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
