package p000;

/* renamed from: blff */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blff extends bxvk implements bxxd {

    /* renamed from: e */
    public static final blff f126351e;

    /* renamed from: f */
    private static volatile bxxk f126352f;

    /* renamed from: a */
    public int f126353a;

    /* renamed from: b */
    public bleu f126354b;

    /* renamed from: c */
    public String f126355c = "";

    /* renamed from: d */
    public String f126356d = "";

    static {
        blff blff = new blff();
        f126351e = blff;
        bxvk.m124024a(blff.class, blff);
    }

    private blff() {
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
            return bxvk.m124022a(f126351e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new blff();
        } else {
            if (i2 == 4) {
                return new bxvd(f126351e);
            }
            if (i2 == 5) {
                return f126351e;
            }
            bxxk bxxk = f126352f;
            if (bxxk == null) {
                synchronized (blff.class) {
                    bxxk = f126352f;
                    if (bxxk == null) {
                        bxxk = new bxve(f126351e);
                        f126352f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
