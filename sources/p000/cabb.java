package p000;

/* renamed from: cabb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cabb extends bxvk implements bxxd {

    /* renamed from: e */
    public static final cabb f172405e;

    /* renamed from: f */
    private static volatile bxxk f172406f;

    /* renamed from: a */
    public int f172407a;

    /* renamed from: b */
    public bxvw f172408b = bxwq.f165002b;

    /* renamed from: c */
    public bxvw f172409c = bxwq.f165002b;

    /* renamed from: d */
    public int f172410d;

    static {
        cabb cabb = new cabb();
        f172405e = cabb;
        bxvk.m124024a(cabb.class, cabb);
    }

    private cabb() {
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
            return bxvk.m124022a(f172405e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u0014\u0002\u0014\u0003င\u0000", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new cabb();
        } else {
            if (i2 == 4) {
                return new caba();
            }
            if (i2 == 5) {
                return f172405e;
            }
            bxxk bxxk = f172406f;
            if (bxxk == null) {
                synchronized (cabb.class) {
                    bxxk = f172406f;
                    if (bxxk == null) {
                        bxxk = new bxve(f172405e);
                        f172406f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
