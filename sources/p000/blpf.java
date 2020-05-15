package p000;

/* renamed from: blpf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blpf extends bxvk implements bxxd {

    /* renamed from: d */
    public static final blpf f127211d;

    /* renamed from: e */
    private static volatile bxxk f127212e;

    /* renamed from: a */
    public int f127213a;

    /* renamed from: b */
    public blrk f127214b;

    /* renamed from: c */
    public blox f127215c;

    static {
        blpf blpf = new blpf();
        f127211d = blpf;
        bxvk.m124024a(blpf.class, blpf);
    }

    private blpf() {
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
            return bxvk.m124022a(f127211d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new blpf();
        } else {
            if (i2 == 4) {
                return new bxvd(f127211d);
            }
            if (i2 == 5) {
                return f127211d;
            }
            bxxk bxxk = f127212e;
            if (bxxk == null) {
                synchronized (blpf.class) {
                    bxxk = f127212e;
                    if (bxxk == null) {
                        bxxk = new bxve(f127211d);
                        f127212e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
