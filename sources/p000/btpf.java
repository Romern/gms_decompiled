package p000;

/* renamed from: btpf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btpf extends bxvk implements bxxd {

    /* renamed from: d */
    public static final btpf f149840d;

    /* renamed from: e */
    private static volatile bxxk f149841e;

    /* renamed from: a */
    public btiy f149842a;

    /* renamed from: b */
    public btpe f149843b;

    /* renamed from: c */
    public bxtx f149844c = bxtx.f164797b;

    static {
        btpf btpf = new btpf();
        f149840d = btpf;
        bxvk.m124024a(btpf.class, btpf);
    }

    private btpf() {
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
            return bxvk.m124022a(f149840d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\n", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new btpf();
        } else {
            if (i2 == 4) {
                return new bxvd(f149840d);
            }
            if (i2 == 5) {
                return f149840d;
            }
            bxxk bxxk = f149841e;
            if (bxxk == null) {
                synchronized (btpf.class) {
                    bxxk = f149841e;
                    if (bxxk == null) {
                        bxxk = new bxve(f149840d);
                        f149841e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
