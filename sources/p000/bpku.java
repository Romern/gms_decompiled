package p000;

/* renamed from: bpku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpku extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bpku f138014c;

    /* renamed from: d */
    private static volatile bxxk f138015d;

    /* renamed from: a */
    public int f138016a;

    /* renamed from: b */
    public int f138017b;

    static {
        bpku bpku = new bpku();
        f138014c = bpku;
        bxvk.m124024a(bpku.class, bpku);
    }

    private bpku() {
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
            return bxvk.m124022a(f138014c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bpkt.f138013a});
        } else if (i2 == 3) {
            return new bpku();
        } else {
            if (i2 == 4) {
                return new bxvd(f138014c);
            }
            if (i2 == 5) {
                return f138014c;
            }
            bxxk bxxk = f138015d;
            if (bxxk == null) {
                synchronized (bpku.class) {
                    bxxk = f138015d;
                    if (bxxk == null) {
                        bxxk = new bxve(f138014c);
                        f138015d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
