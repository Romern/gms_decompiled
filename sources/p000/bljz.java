package p000;

/* renamed from: bljz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bljz extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bljz f126712i;

    /* renamed from: j */
    private static volatile bxxk f126713j;

    /* renamed from: a */
    public int f126714a;

    /* renamed from: b */
    public long f126715b;

    /* renamed from: c */
    public long f126716c;

    /* renamed from: d */
    public bxwc f126717d = bxxn.f165040b;

    /* renamed from: e */
    public long f126718e;

    /* renamed from: f */
    public long f126719f;

    /* renamed from: g */
    public blim f126720g;

    /* renamed from: h */
    public int f126721h;

    static {
        bljz bljz = new bljz();
        f126712i = bljz;
        bxvk.m124024a(bljz.class, bljz);
    }

    private bljz() {
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
            return bxvk.m124022a(f126712i, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0001\u0000\u0001စ\u0000\u0002စ\u0001\u0003\u001b\u0004ဂ\u0002\u0005ဂ\u0003\nဉ\u0004\u000bဌ\u0005", new Object[]{"a", "b", "c", "d", bliz.class, "e", "f", "g", "h", bljy.f126711a});
        } else if (i2 == 3) {
            return new bljz();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null);
            }
            if (i2 == 5) {
                return f126712i;
            }
            bxxk bxxk = f126713j;
            if (bxxk == null) {
                synchronized (bljz.class) {
                    bxxk = f126713j;
                    if (bxxk == null) {
                        bxxk = new bxve(f126712i);
                        f126713j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
