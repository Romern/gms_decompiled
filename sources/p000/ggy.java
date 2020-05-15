package p000;

/* renamed from: ggy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ggy extends bxvk implements bxxd {

    /* renamed from: d */
    public static final ggy f18153d;

    /* renamed from: e */
    private static volatile bxxk f18154e;

    /* renamed from: a */
    public int f18155a;

    /* renamed from: b */
    public String f18156b = "";

    /* renamed from: c */
    public ggz f18157c;

    static {
        ggy ggy = new ggy();
        f18153d = ggy;
        bxvk.m124024a(ggy.class, ggy);
    }

    private ggy() {
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
            return bxvk.m124022a(f18153d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new ggy();
        } else {
            if (i2 == 4) {
                return new bxvd(f18153d);
            }
            if (i2 == 5) {
                return f18153d;
            }
            bxxk bxxk = f18154e;
            if (bxxk == null) {
                synchronized (ggy.class) {
                    bxxk = f18154e;
                    if (bxxk == null) {
                        bxxk = new bxve(f18153d);
                        f18154e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
