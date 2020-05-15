package p000;

/* renamed from: bpov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpov extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bpov f138576d;

    /* renamed from: e */
    private static volatile bxxk f138577e;

    /* renamed from: a */
    public int f138578a;

    /* renamed from: b */
    public String f138579b = "";

    /* renamed from: c */
    public int f138580c;

    static {
        bpov bpov = new bpov();
        f138576d = bpov;
        bxvk.m124024a(bpov.class, bpov);
    }

    private bpov() {
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
            return bxvk.m124022a(f138576d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", bpou.f138575a});
        } else if (i2 == 3) {
            return new bpov();
        } else {
            if (i2 == 4) {
                return new bxvd(f138576d);
            }
            if (i2 == 5) {
                return f138576d;
            }
            bxxk bxxk = f138577e;
            if (bxxk == null) {
                synchronized (bpov.class) {
                    bxxk = f138577e;
                    if (bxxk == null) {
                        bxxk = new bxve(f138576d);
                        f138577e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
