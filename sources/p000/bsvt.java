package p000;

/* renamed from: bsvt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsvt extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bsvt f147332e;

    /* renamed from: f */
    private static volatile bxxk f147333f;

    /* renamed from: a */
    public int f147334a;

    /* renamed from: b */
    public bswh f147335b;

    /* renamed from: c */
    public String f147336c = "";

    /* renamed from: d */
    public String f147337d = "";

    static {
        bsvt bsvt = new bsvt();
        f147332e = bsvt;
        bxvk.m124024a(bsvt.class, bsvt);
    }

    private bsvt() {
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
            return bxvk.m124022a(f147332e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bsvt();
        } else {
            if (i2 == 4) {
                return new bxvd(f147332e);
            }
            if (i2 == 5) {
                return f147332e;
            }
            bxxk bxxk = f147333f;
            if (bxxk == null) {
                synchronized (bsvt.class) {
                    bxxk = f147333f;
                    if (bxxk == null) {
                        bxxk = new bxve(f147332e);
                        f147333f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
