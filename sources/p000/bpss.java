package p000;

/* renamed from: bpss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpss extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bpss f139006d;

    /* renamed from: e */
    public static final bxvj f139007e;

    /* renamed from: f */
    private static volatile bxxk f139008f;

    /* renamed from: a */
    public int f139009a;

    /* renamed from: b */
    public bpsr f139010b;

    /* renamed from: c */
    public bpsq f139011c;

    static {
        bpss bpss = new bpss();
        f139006d = bpss;
        bxvk.m124024a(bpss.class, bpss);
        bpcb bpcb = bpcb.f135695g;
        bpss bpss2 = f139006d;
        f139007e = bxvk.m124006a(bpcb, bpss2, bpss2, 477, bxzf.MESSAGE);
    }

    private bpss() {
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
            return bxvk.m124022a(f139006d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bpss();
        } else {
            if (i2 == 4) {
                return new bxvd(f139006d);
            }
            if (i2 == 5) {
                return f139006d;
            }
            bxxk bxxk = f139008f;
            if (bxxk == null) {
                synchronized (bpss.class) {
                    bxxk = f139008f;
                    if (bxxk == null) {
                        bxxk = new bxve(f139006d);
                        f139008f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
