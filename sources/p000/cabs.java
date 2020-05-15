package p000;

/* renamed from: cabs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cabs extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cabs f172471d;

    /* renamed from: f */
    private static volatile bxxk f172472f;

    /* renamed from: a */
    public int f172473a;

    /* renamed from: b */
    public String f172474b = "";

    /* renamed from: c */
    public cabr f172475c;

    /* renamed from: e */
    private byte f172476e = 2;

    static {
        cabs cabs = new cabs();
        f172471d = cabs;
        bxvk.m124024a(cabs.class, cabs);
    }

    private cabs() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f172476e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f172476e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f172471d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cabs();
        } else {
            if (i2 == 4) {
                return new bxvd(f172471d);
            }
            if (i2 == 5) {
                return f172471d;
            }
            bxxk bxxk = f172472f;
            if (bxxk == null) {
                synchronized (cabs.class) {
                    bxxk = f172472f;
                    if (bxxk == null) {
                        bxxk = new bxve(f172471d);
                        f172472f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
