package p000;

/* renamed from: bpsm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpsm extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bpsm f138981d;

    /* renamed from: e */
    private static volatile bxxk f138982e;

    /* renamed from: a */
    public int f138983a;

    /* renamed from: b */
    public int f138984b;

    /* renamed from: c */
    public int f138985c;

    static {
        bpsm bpsm = new bpsm();
        f138981d = bpsm;
        bxvk.m124024a(bpsm.class, bpsm);
    }

    private bpsm() {
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
            return bxvk.m124022a(f138981d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bpsm();
        } else {
            if (i2 == 4) {
                return new bxvd(f138981d);
            }
            if (i2 == 5) {
                return f138981d;
            }
            bxxk bxxk = f138982e;
            if (bxxk == null) {
                synchronized (bpsm.class) {
                    bxxk = f138982e;
                    if (bxxk == null) {
                        bxxk = new bxve(f138981d);
                        f138982e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
