package p000;

/* renamed from: caib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caib extends bxvk implements bxxd {

    /* renamed from: d */
    public static final caib f174620d;

    /* renamed from: e */
    private static volatile bxxk f174621e;

    /* renamed from: a */
    public int f174622a;

    /* renamed from: b */
    public String f174623b = "";

    /* renamed from: c */
    public int f174624c;

    static {
        caib caib = new caib();
        f174620d = caib;
        bxvk.m124024a(caib.class, caib);
    }

    private caib() {
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
            return bxvk.m124022a(f174620d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", caia.f174619a});
        } else if (i2 == 3) {
            return new caib();
        } else {
            if (i2 == 4) {
                return new bxvd(f174620d);
            }
            if (i2 == 5) {
                return f174620d;
            }
            bxxk bxxk = f174621e;
            if (bxxk == null) {
                synchronized (caib.class) {
                    bxxk = f174621e;
                    if (bxxk == null) {
                        bxxk = new bxve(f174620d);
                        f174621e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
