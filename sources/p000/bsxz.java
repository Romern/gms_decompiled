package p000;

/* renamed from: bsxz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsxz extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bsxz f147641e;

    /* renamed from: f */
    private static volatile bxxk f147642f;

    /* renamed from: a */
    public int f147643a;

    /* renamed from: b */
    public String f147644b = "";

    /* renamed from: c */
    public bswh f147645c;

    /* renamed from: d */
    public bzrt f147646d;

    static {
        bsxz bsxz = new bsxz();
        f147641e = bsxz;
        bxvk.m124024a(bsxz.class, bsxz);
    }

    private bsxz() {
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
            return bxvk.m124022a(f147641e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bsxz();
        } else {
            if (i2 == 4) {
                return new bxvd(f147641e);
            }
            if (i2 == 5) {
                return f147641e;
            }
            bxxk bxxk = f147642f;
            if (bxxk == null) {
                synchronized (bsxz.class) {
                    bxxk = f147642f;
                    if (bxxk == null) {
                        bxxk = new bxve(f147641e);
                        f147642f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
