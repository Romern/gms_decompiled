package p000;

/* renamed from: bpjd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpjd extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bpjd f137839e;

    /* renamed from: f */
    private static volatile bxxk f137840f;

    /* renamed from: a */
    public int f137841a;

    /* renamed from: b */
    public int f137842b;

    /* renamed from: c */
    public int f137843c;

    /* renamed from: d */
    public int f137844d;

    static {
        bpjd bpjd = new bpjd();
        f137839e = bpjd;
        bxvk.m124024a(bpjd.class, bpjd);
    }

    private bpjd() {
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
            return bxvk.m124022a(f137839e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", bphy.f137713a, "c", "d"});
        } else if (i2 == 3) {
            return new bpjd();
        } else {
            if (i2 == 4) {
                return new bxvd(f137839e);
            }
            if (i2 == 5) {
                return f137839e;
            }
            bxxk bxxk = f137840f;
            if (bxxk == null) {
                synchronized (bpjd.class) {
                    bxxk = f137840f;
                    if (bxxk == null) {
                        bxxk = new bxve(f137839e);
                        f137840f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
