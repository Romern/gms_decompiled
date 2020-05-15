package p000;

/* renamed from: bswr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bswr extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bswr f147479e;

    /* renamed from: f */
    private static volatile bxxk f147480f;

    /* renamed from: a */
    public int f147481a;

    /* renamed from: b */
    public int f147482b;

    /* renamed from: c */
    public bsvy f147483c;

    /* renamed from: d */
    public bswc f147484d;

    static {
        bswr bswr = new bswr();
        f147479e = bswr;
        bxvk.m124024a(bswr.class, bswr);
    }

    private bswr() {
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
            return bxvk.m124022a(f147479e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bswr();
        } else {
            if (i2 == 4) {
                return new bxvd(f147479e);
            }
            if (i2 == 5) {
                return f147479e;
            }
            bxxk bxxk = f147480f;
            if (bxxk == null) {
                synchronized (bswr.class) {
                    bxxk = f147480f;
                    if (bxxk == null) {
                        bxxk = new bxve(f147479e);
                        f147480f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
