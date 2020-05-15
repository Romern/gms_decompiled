package p000;

/* renamed from: ajnm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajnm extends bxvk implements bxxd {

    /* renamed from: d */
    public static final ajnm f70986d;

    /* renamed from: e */
    private static volatile bxxk f70987e;

    /* renamed from: a */
    public int f70988a;

    /* renamed from: b */
    public bxtx f70989b = bxtx.f164797b;

    /* renamed from: c */
    public bxtx f70990c = bxtx.f164797b;

    static {
        ajnm ajnm = new ajnm();
        f70986d = ajnm;
        bxvk.m124024a(ajnm.class, ajnm);
    }

    private ajnm() {
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
            return bxvk.m124022a(f70986d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new ajnm();
        } else {
            if (i2 == 4) {
                return new bxvd(f70986d);
            }
            if (i2 == 5) {
                return f70986d;
            }
            bxxk bxxk = f70987e;
            if (bxxk == null) {
                synchronized (ajnm.class) {
                    bxxk = f70987e;
                    if (bxxk == null) {
                        bxxk = new bxve(f70986d);
                        f70987e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
