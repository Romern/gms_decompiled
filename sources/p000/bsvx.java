package p000;

/* renamed from: bsvx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsvx extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bsvx f147351c;

    /* renamed from: d */
    private static volatile bxxk f147352d;

    /* renamed from: a */
    public int f147353a = 0;

    /* renamed from: b */
    public Object f147354b;

    static {
        bsvx bsvx = new bsvx();
        f147351c = bsvx;
        bxvk.m124024a(bsvx.class, bsvx);
    }

    private bsvx() {
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
            return bxvk.m124022a(f147351c, "\u0001\u0012\u0001\u0000\u0001\u0012\u0012\u0000\u0000\u0000\u0001ျ\u0000\u0002ြ\u0000\u0003်\u0000\u0004ြ\u0000\u0005့\u0000\u0006ြ\u0000\u0007့\u0000\bြ\u0000\t့\u0000\nြ\u0000\u000b့\u0000\fြ\u0000\rဳ\u0000\u000eြ\u0000\u000fဴ\u0000\u0010ြ\u0000\u0011ဵ\u0000\u0012ြ\u0000", new Object[]{"b", "a", bsyb.class, bsuu.class, bsvk.class, bsvc.class, bsxx.class, bswj.class, bsvw.class, bsvz.class, bswp.class});
        } else if (i2 == 3) {
            return new bsvx();
        } else {
            if (i2 == 4) {
                return new bxvd(f147351c);
            }
            if (i2 == 5) {
                return f147351c;
            }
            bxxk bxxk = f147352d;
            if (bxxk == null) {
                synchronized (bsvx.class) {
                    bxxk = f147352d;
                    if (bxxk == null) {
                        bxxk = new bxve(f147351c);
                        f147352d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
