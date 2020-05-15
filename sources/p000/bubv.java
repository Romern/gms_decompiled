package p000;

/* renamed from: bubv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bubv extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxvu f153283c = new bubu();

    /* renamed from: f */
    public static final bubv f153284f;

    /* renamed from: g */
    private static volatile bxxk f153285g;

    /* renamed from: a */
    public int f153286a;

    /* renamed from: b */
    public bxvt f153287b = bxvm.f164965b;

    /* renamed from: d */
    public long f153288d;

    /* renamed from: e */
    public int f153289e;

    static {
        bubv bubv = new bubv();
        f153284f = bubv;
        bxvk.m124024a(bubv.class, bubv);
    }

    private bubv() {
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
            return bxvk.m124022a(f153284f, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001e\u0002ဃ\u0000\u0003ဌ\u0001", new Object[]{"a", "b", buce.m119319b(), "d", "e", bucq.m119333b()});
        } else if (i2 == 3) {
            return new bubv();
        } else {
            if (i2 == 4) {
                return new bxvd(f153284f);
            }
            if (i2 == 5) {
                return f153284f;
            }
            bxxk bxxk = f153285g;
            if (bxxk == null) {
                synchronized (bubv.class) {
                    bxxk = f153285g;
                    if (bxxk == null) {
                        bxxk = new bxve(f153284f);
                        f153285g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
