package p000;

/* renamed from: cakh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cakh extends bxvk implements bxxd {

    /* renamed from: e */
    public static final cakh f174981e;

    /* renamed from: f */
    private static volatile bxxk f174982f;

    /* renamed from: a */
    public int f174983a;

    /* renamed from: b */
    public long f174984b;

    /* renamed from: c */
    public String f174985c = "";

    /* renamed from: d */
    public boolean f174986d;

    static {
        cakh cakh = new cakh();
        f174981e = cakh;
        bxvk.m124024a(cakh.class, cakh);
    }

    private cakh() {
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
            return bxvk.m124022a(f174981e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001စ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new cakh();
        } else {
            if (i2 == 4) {
                return new bxvd(f174981e);
            }
            if (i2 == 5) {
                return f174981e;
            }
            bxxk bxxk = f174982f;
            if (bxxk == null) {
                synchronized (cakh.class) {
                    bxxk = f174982f;
                    if (bxxk == null) {
                        bxxk = new bxve(f174981e);
                        f174982f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
