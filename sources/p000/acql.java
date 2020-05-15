package p000;

/* renamed from: acql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acql extends bxvk implements bxxd {

    /* renamed from: d */
    public static final acql f60491d;

    /* renamed from: e */
    private static volatile bxxk f60492e;

    /* renamed from: a */
    public int f60493a;

    /* renamed from: b */
    public caef f60494b;

    /* renamed from: c */
    public int f60495c;

    static {
        acql acql = new acql();
        f60491d = acql;
        bxvk.m124024a(acql.class, acql);
    }

    private acql() {
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
            return bxvk.m124022a(f60491d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", acqj.f60490a});
        } else if (i2 == 3) {
            return new acql();
        } else {
            if (i2 == 4) {
                return new bxvd(f60491d);
            }
            if (i2 == 5) {
                return f60491d;
            }
            bxxk bxxk = f60492e;
            if (bxxk == null) {
                synchronized (acql.class) {
                    bxxk = f60492e;
                    if (bxxk == null) {
                        bxxk = new bxve(f60491d);
                        f60492e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
