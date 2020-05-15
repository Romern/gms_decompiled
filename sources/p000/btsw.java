package p000;

/* renamed from: btsw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btsw extends bxvk implements bxxd {

    /* renamed from: e */
    public static final btsw f150294e;

    /* renamed from: f */
    private static volatile bxxk f150295f;

    /* renamed from: a */
    public int f150296a;

    /* renamed from: b */
    public btsi f150297b;

    /* renamed from: c */
    public bzvu f150298c;

    /* renamed from: d */
    public String f150299d = "";

    static {
        btsw btsw = new btsw();
        f150294e = btsw;
        bxvk.m124024a(btsw.class, btsw);
    }

    private btsw() {
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
            return bxvk.m124022a(f150294e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new btsw();
        } else {
            if (i2 == 4) {
                return new bxvd(f150294e);
            }
            if (i2 == 5) {
                return f150294e;
            }
            bxxk bxxk = f150295f;
            if (bxxk == null) {
                synchronized (btsw.class) {
                    bxxk = f150295f;
                    if (bxxk == null) {
                        bxxk = new bxve(f150294e);
                        f150295f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
