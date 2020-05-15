package p000;

/* renamed from: bmsl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmsl extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bmsl f130698i;

    /* renamed from: k */
    private static volatile bxxk f130699k;

    /* renamed from: a */
    public int f130700a;

    /* renamed from: b */
    public String f130701b = "";

    /* renamed from: c */
    public bmno f130702c;

    /* renamed from: d */
    public bxwc f130703d = bxxn.f165040b;

    /* renamed from: e */
    public bwhm f130704e;

    /* renamed from: f */
    public bxwc f130705f = bxxn.f165040b;

    /* renamed from: g */
    public bmsg f130706g;

    /* renamed from: h */
    public bmkw f130707h;

    /* renamed from: j */
    private byte f130708j = 2;

    static {
        bmsl bmsl = new bmsl();
        f130698i = bmsl;
        bxvk.m124024a(bmsl.class, bmsl);
    }

    private bmsl() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f130708j);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f130708j = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f130698i, "\u0001\u0007\u0000\u0001\u0001\u0013\u0007\u0000\u0002\u0002\u0001ဈ\u0000\u0003Л\u0004ဉ\u0001\u0005\u001b\tဉ\u0003\fဉ\u0002\u0013ᐉ\u0004", new Object[]{"a", "b", "f", bmsk.class, "c", "d", bmnr.class, "g", "e", "h"});
        } else if (i2 == 3) {
            return new bmsl();
        } else {
            if (i2 == 4) {
                return new bxvd(f130698i);
            }
            if (i2 == 5) {
                return f130698i;
            }
            bxxk bxxk = f130699k;
            if (bxxk == null) {
                synchronized (bmsl.class) {
                    bxxk = f130699k;
                    if (bxxk == null) {
                        bxxk = new bxve(f130698i);
                        f130699k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
