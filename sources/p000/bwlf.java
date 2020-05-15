package p000;

/* renamed from: bwlf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwlf extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bwlf f160106i;

    /* renamed from: k */
    private static volatile bxxk f160107k;

    /* renamed from: a */
    public int f160108a;

    /* renamed from: b */
    public bxwc f160109b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f160110c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f160111d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f160112e = bxxn.f165040b;

    /* renamed from: f */
    public bxwc f160113f = bxxn.f165040b;

    /* renamed from: g */
    public bmlz f160114g;

    /* renamed from: h */
    public bmkw f160115h;

    /* renamed from: j */
    private byte f160116j = 2;

    static {
        bwlf bwlf = new bwlf();
        f160106i = bwlf;
        bxvk.m124024a(bwlf.class, bwlf);
    }

    private bwlf() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f160116j);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f160116j = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f160106i, "\u0001\u0007\u0000\u0001\u0001\f\u0007\u0000\u0005\u0002\u0001\u001b\u0002Л\u0004ဉ\u0000\u0005\u001b\u0007\u001b\u000b\u001b\fᐉ\u0001", new Object[]{"a", "b", bmlv.class, "c", bmeb.class, "g", "f", bmem.class, "e", bmde.class, "d", bmof.class, "h"});
        } else if (i2 == 3) {
            return new bwlf();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null);
            }
            if (i2 == 5) {
                return f160106i;
            }
            bxxk bxxk = f160107k;
            if (bxxk == null) {
                synchronized (bwlf.class) {
                    bxxk = f160107k;
                    if (bxxk == null) {
                        bxxk = new bxve(f160106i);
                        f160107k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
