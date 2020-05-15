package p000;

/* renamed from: cace */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cace extends bxvk implements bxxd {

    /* renamed from: h */
    public static final cace f172527h;

    /* renamed from: i */
    private static volatile bxxk f172528i;

    /* renamed from: a */
    public int f172529a;

    /* renamed from: b */
    public bxwc f172530b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f172531c = bxxn.f165040b;

    /* renamed from: d */
    public String f172532d = "";

    /* renamed from: e */
    public bxwc f172533e = bxxn.f165040b;

    /* renamed from: f */
    public caae f172534f;

    /* renamed from: g */
    public boolean f172535g;

    static {
        cace cace = new cace();
        f172527h = cace;
        bxvk.m124024a(cace.class, cace);
    }

    private cace() {
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
            return bxvk.m124022a(f172527h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003ဈ\u0000\u0004\u001b\u0005ဉ\u0001\u0006ဇ\u0002", new Object[]{"a", "b", caaa.class, "c", caaa.class, "d", "e", caat.class, "f", "g"});
        } else if (i2 == 3) {
            return new cace();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (char[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f172527h;
            }
            bxxk bxxk = f172528i;
            if (bxxk == null) {
                synchronized (cace.class) {
                    bxxk = f172528i;
                    if (bxxk == null) {
                        bxxk = new bxve(f172527h);
                        f172528i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
