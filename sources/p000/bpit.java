package p000;

/* renamed from: bpit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpit extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bpit f137812e;

    /* renamed from: f */
    private static volatile bxxk f137813f;

    /* renamed from: a */
    public int f137814a;

    /* renamed from: b */
    public int f137815b;

    /* renamed from: c */
    public int f137816c;

    /* renamed from: d */
    public int f137817d = -1;

    static {
        bpit bpit = new bpit();
        f137812e = bpit;
        bxvk.m124024a(bpit.class, bpit);
    }

    private bpit() {
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
            return bxvk.m124022a(f137812e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002", new Object[]{"a", "b", bphy.f137713a, "c", bphw.f137712a, "d"});
        } else if (i2 == 3) {
            return new bpit();
        } else {
            if (i2 == 4) {
                return new bxvd(f137812e);
            }
            if (i2 == 5) {
                return f137812e;
            }
            bxxk bxxk = f137813f;
            if (bxxk == null) {
                synchronized (bpit.class) {
                    bxxk = f137813f;
                    if (bxxk == null) {
                        bxxk = new bxve(f137812e);
                        f137813f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
