package p000;

/* renamed from: bqyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqyt extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bqyt f141981i;

    /* renamed from: j */
    private static volatile bxxk f141982j;

    /* renamed from: a */
    public int f141983a;

    /* renamed from: b */
    public bqzn f141984b;

    /* renamed from: c */
    public bxwc f141985c = bxxn.f165040b;

    /* renamed from: d */
    public bxtx f141986d = bxtx.f164797b;

    /* renamed from: e */
    public String f141987e = "";

    /* renamed from: f */
    public bxwc f141988f;

    /* renamed from: g */
    public bxtx f141989g;

    /* renamed from: h */
    public bqyx f141990h;

    static {
        bqyt bqyt = new bqyt();
        f141981i = bqyt;
        bxvk.m124024a(bqyt.class, bqyt);
    }

    private bqyt() {
        bxvm bxvm = bxvm.f164965b;
        this.f141988f = bxxn.f165040b;
        this.f141989g = bxtx.f164797b;
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
            return bxvk.m124022a(f141981i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003ည\u0001\u0004ဈ\u0002\u0006\u001b\u0007ည\u0003\tဉ\u0004", new Object[]{"a", "b", "c", bqzl.class, "d", "e", "f", bqza.class, "g", "h"});
        } else if (i2 == 3) {
            return new bqyt();
        } else {
            if (i2 == 4) {
                return new bxvd(f141981i);
            }
            if (i2 == 5) {
                return f141981i;
            }
            bxxk bxxk = f141982j;
            if (bxxk == null) {
                synchronized (bqyt.class) {
                    bxxk = f141982j;
                    if (bxxk == null) {
                        bxxk = new bxve(f141981i);
                        f141982j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
