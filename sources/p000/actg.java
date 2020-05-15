package p000;

/* renamed from: actg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class actg extends bxvk implements bxxd {

    /* renamed from: e */
    public static final actg f60738e;

    /* renamed from: f */
    private static volatile bxxk f60739f;

    /* renamed from: a */
    public int f60740a;

    /* renamed from: b */
    public String f60741b = "";

    /* renamed from: c */
    public long f60742c;

    /* renamed from: d */
    public actf f60743d;

    static {
        actg actg = new actg();
        f60738e = actg;
        bxvk.m124024a(actg.class, actg);
    }

    private actg() {
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
            return bxvk.m124022a(f60738e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new actg();
        } else {
            if (i2 == 4) {
                return new bxvd(f60738e);
            }
            if (i2 == 5) {
                return f60738e;
            }
            bxxk bxxk = f60739f;
            if (bxxk == null) {
                synchronized (actg.class) {
                    bxxk = f60739f;
                    if (bxxk == null) {
                        bxxk = new bxve(f60738e);
                        f60739f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
