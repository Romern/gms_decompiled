package p000;

/* renamed from: aape */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aape extends bxvk implements bxxd {

    /* renamed from: f */
    public static final aape f28742f;

    /* renamed from: g */
    private static volatile bxxk f28743g;

    /* renamed from: a */
    public int f28744a;

    /* renamed from: b */
    public int f28745b;

    /* renamed from: c */
    public long f28746c;

    /* renamed from: d */
    public long f28747d;

    /* renamed from: e */
    public long f28748e;

    static {
        aape aape = new aape();
        f28742f = aape;
        bxvk.m124024a(aape.class, aape);
    }

    private aape() {
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
            return bxvk.m124022a(f28742f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", aapd.f28741a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new aape();
        } else {
            if (i2 == 4) {
                return new bxvd(f28742f);
            }
            if (i2 == 5) {
                return f28742f;
            }
            bxxk bxxk = f28743g;
            if (bxxk == null) {
                synchronized (aape.class) {
                    bxxk = f28743g;
                    if (bxxk == null) {
                        bxxk = new bxve(f28742f);
                        f28743g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
