package p000;

/* renamed from: ayer */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayer extends bxvk implements bxxd {

    /* renamed from: f */
    public static final ayer f97351f;

    /* renamed from: g */
    private static volatile bxxk f97352g;

    /* renamed from: a */
    public int f97353a;

    /* renamed from: b */
    public bxtx f97354b = bxtx.f164797b;

    /* renamed from: c */
    public bxtx f97355c = bxtx.f164797b;

    /* renamed from: d */
    public boolean f97356d;

    /* renamed from: e */
    public int f97357e;

    static {
        ayer ayer = new ayer();
        f97351f = ayer;
        bxvk.m124024a(ayer.class, ayer);
    }

    private ayer() {
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
            return bxvk.m124022a(f97351f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ဇ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", "e", ayep.f97350a});
        } else if (i2 == 3) {
            return new ayer();
        } else {
            if (i2 == 4) {
                return new bxvd(f97351f);
            }
            if (i2 == 5) {
                return f97351f;
            }
            bxxk bxxk = f97352g;
            if (bxxk == null) {
                synchronized (ayer.class) {
                    bxxk = f97352g;
                    if (bxxk == null) {
                        bxxk = new bxve(f97351f);
                        f97352g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
