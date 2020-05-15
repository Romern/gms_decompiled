package p000;

/* renamed from: bmcf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmcf extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bmcf f128663i;

    /* renamed from: j */
    private static volatile bxxk f128664j;

    /* renamed from: a */
    public int f128665a;

    /* renamed from: b */
    public bmdn f128666b;

    /* renamed from: c */
    public String f128667c = "";

    /* renamed from: d */
    public String f128668d = "";

    /* renamed from: e */
    public String f128669e = "";

    /* renamed from: f */
    public String f128670f = "";

    /* renamed from: g */
    public bmcw f128671g;

    /* renamed from: h */
    public bmdb f128672h;

    static {
        bmcf bmcf = new bmcf();
        f128663i = bmcf;
        bxvk.m124024a(bmcf.class, bmcf);
    }

    private bmcf() {
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
            return bxvk.m124022a(f128663i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new bmcf();
        } else {
            if (i2 == 4) {
                return new bxvd(f128663i);
            }
            if (i2 == 5) {
                return f128663i;
            }
            bxxk bxxk = f128664j;
            if (bxxk == null) {
                synchronized (bmcf.class) {
                    bxxk = f128664j;
                    if (bxxk == null) {
                        bxxk = new bxve(f128663i);
                        f128664j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
