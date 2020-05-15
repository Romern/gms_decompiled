package p000;

/* renamed from: bwkw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwkw extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwkw f160057d;

    /* renamed from: e */
    private static volatile bxxk f160058e;

    /* renamed from: a */
    public int f160059a;

    /* renamed from: b */
    public bmaj f160060b;

    /* renamed from: c */
    public bwlb f160061c;

    static {
        bwkw bwkw = new bwkw();
        f160057d = bwkw;
        bxvk.m124024a(bwkw.class, bwkw);
    }

    private bwkw() {
        bxtx bxtx = bxtx.f164797b;
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
            return bxvk.m124022a(f160057d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwkw();
        } else {
            if (i2 == 4) {
                return new bxvd(f160057d);
            }
            if (i2 == 5) {
                return f160057d;
            }
            bxxk bxxk = f160058e;
            if (bxxk == null) {
                synchronized (bwkw.class) {
                    bxxk = f160058e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160057d);
                        f160058e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
