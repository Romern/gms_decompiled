package p000;

/* renamed from: adih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adih extends bxvk implements bxxd {

    /* renamed from: g */
    public static final adih f61793g;

    /* renamed from: h */
    private static volatile bxxk f61794h;

    /* renamed from: a */
    public String f61795a = "";

    /* renamed from: b */
    public int f61796b;

    /* renamed from: c */
    public String f61797c = "";

    /* renamed from: d */
    public String f61798d = "";

    /* renamed from: e */
    public long f61799e;

    /* renamed from: f */
    public bxtx f61800f = bxtx.f164797b;

    static {
        adih adih = new adih();
        f61793g = adih;
        bxvk.m124024a(adih.class, adih);
    }

    private adih() {
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
            return bxvk.m124022a(f61793g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004Ȉ\u0005\u0002\u0006\n", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new adih();
        } else {
            if (i2 == 4) {
                return new bxvd(f61793g);
            }
            if (i2 == 5) {
                return f61793g;
            }
            bxxk bxxk = f61794h;
            if (bxxk == null) {
                synchronized (adih.class) {
                    bxxk = f61794h;
                    if (bxxk == null) {
                        bxxk = new bxve(f61793g);
                        f61794h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
