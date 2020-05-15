package p000;

/* renamed from: buez */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buez extends bxvk implements bxxd {

    /* renamed from: d */
    public static final buez f153671d;

    /* renamed from: f */
    private static volatile bxxk f153672f;

    /* renamed from: a */
    public int f153673a;

    /* renamed from: b */
    public bxwc f153674b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f153675c = bxxn.f165040b;

    /* renamed from: e */
    private int f153676e;

    static {
        buez buez = new buez();
        f153671d = buez;
        bxvk.m124024a(buez.class, buez);
    }

    private buez() {
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
            return bxvk.m124022a(f153671d, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0002\u0000\u0002ဋ\u0001\u0003\u001b\u0005\u001b", new Object[]{"e", "a", "b", buev.class, "c", buev.class});
        } else if (i2 == 3) {
            return new buez();
        } else {
            if (i2 == 4) {
                return new bxvd(f153671d);
            }
            if (i2 == 5) {
                return f153671d;
            }
            bxxk bxxk = f153672f;
            if (bxxk == null) {
                synchronized (buez.class) {
                    bxxk = f153672f;
                    if (bxxk == null) {
                        bxxk = new bxve(f153671d);
                        f153672f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
