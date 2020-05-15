package p000;

/* renamed from: bptt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bptt extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bptt f139173e;

    /* renamed from: f */
    private static volatile bxxk f139174f;

    /* renamed from: a */
    public int f139175a;

    /* renamed from: b */
    public int f139176b;

    /* renamed from: c */
    public int f139177c;

    /* renamed from: d */
    public bxvt f139178d = bxvm.f164965b;

    static {
        bptt bptt = new bptt();
        f139173e = bptt;
        bxvk.m124024a(bptt.class, bptt);
    }

    private bptt() {
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
            return bxvk.m124022a(f139173e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003\u001e", new Object[]{"a", "b", bpfr.f137434a, "c", bpes.m111844b(), "d", bpfq.m111882b()});
        } else if (i2 == 3) {
            return new bptt();
        } else {
            if (i2 == 4) {
                return new bpts();
            }
            if (i2 == 5) {
                return f139173e;
            }
            bxxk bxxk = f139174f;
            if (bxxk == null) {
                synchronized (bptt.class) {
                    bxxk = f139174f;
                    if (bxxk == null) {
                        bxxk = new bxve(f139173e);
                        f139174f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
