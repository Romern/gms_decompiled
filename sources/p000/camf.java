package p000;

/* renamed from: camf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class camf extends bxvk implements bxxd {

    /* renamed from: b */
    public static final camf f175264b;

    /* renamed from: c */
    private static volatile bxxk f175265c;

    /* renamed from: a */
    public bxtx f175266a = bxtx.f164797b;

    static {
        camf camf = new camf();
        f175264b = camf;
        bxvk.m124024a(camf.class, camf);
    }

    private camf() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f175264b, "\u0000\u0001\u0000\u0000\t\t\u0001\u0000\u0000\u0000\t\n", new Object[]{"a"});
        } else if (i2 == 3) {
            return new camf();
        } else {
            if (i2 == 4) {
                return new bxvd(f175264b);
            }
            if (i2 == 5) {
                return f175264b;
            }
            bxxk bxxk = f175265c;
            if (bxxk == null) {
                synchronized (camf.class) {
                    bxxk = f175265c;
                    if (bxxk == null) {
                        bxxk = new bxve(f175264b);
                        f175265c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
