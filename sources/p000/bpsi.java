package p000;

/* renamed from: bpsi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpsi extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bpsi f138959d;

    /* renamed from: e */
    private static volatile bxxk f138960e;

    /* renamed from: a */
    public int f138961a;

    /* renamed from: b */
    public int f138962b;

    /* renamed from: c */
    public long f138963c;

    static {
        bpsi bpsi = new bpsi();
        f138959d = bpsi;
        bxvk.m124024a(bpsi.class, bpsi);
    }

    private bpsi() {
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
            return bxvk.m124022a(f138959d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဂ\u0002", new Object[]{"a", "b", bpsd.f138943a, "c"});
        } else if (i2 == 3) {
            return new bpsi();
        } else {
            if (i2 == 4) {
                return new bxvd(f138959d);
            }
            if (i2 == 5) {
                return f138959d;
            }
            bxxk bxxk = f138960e;
            if (bxxk == null) {
                synchronized (bpsi.class) {
                    bxxk = f138960e;
                    if (bxxk == null) {
                        bxxk = new bxve(f138959d);
                        f138960e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
