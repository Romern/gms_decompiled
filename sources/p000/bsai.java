package p000;

/* renamed from: bsai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsai extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bsai f143847d;

    /* renamed from: e */
    private static volatile bxxk f143848e;

    /* renamed from: a */
    public int f143849a;

    /* renamed from: b */
    public String f143850b = "";

    /* renamed from: c */
    public bxtx f143851c = bxtx.f164797b;

    static {
        bsai bsai = new bsai();
        f143847d = bsai;
        bxvk.m124024a(bsai.class, bsai);
    }

    private bsai() {
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
            return bxvk.m124022a(f143847d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bsai();
        } else {
            if (i2 == 4) {
                return new bxvd(f143847d);
            }
            if (i2 == 5) {
                return f143847d;
            }
            bxxk bxxk = f143848e;
            if (bxxk == null) {
                synchronized (bsai.class) {
                    bxxk = f143848e;
                    if (bxxk == null) {
                        bxxk = new bxve(f143847d);
                        f143848e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
