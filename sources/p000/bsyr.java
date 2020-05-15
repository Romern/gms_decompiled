package p000;

/* renamed from: bsyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsyr extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bsyr f147703e;

    /* renamed from: f */
    private static volatile bxxk f147704f;

    /* renamed from: a */
    public int f147705a;

    /* renamed from: b */
    public boolean f147706b;

    /* renamed from: c */
    public boolean f147707c;

    /* renamed from: d */
    public boolean f147708d;

    static {
        bsyr bsyr = new bsyr();
        f147703e = bsyr;
        bxvk.m124024a(bsyr.class, bsyr);
    }

    private bsyr() {
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
            return bxvk.m124022a(f147703e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bsyr();
        } else {
            if (i2 == 4) {
                return new bxvd(f147703e);
            }
            if (i2 == 5) {
                return f147703e;
            }
            bxxk bxxk = f147704f;
            if (bxxk == null) {
                synchronized (bsyr.class) {
                    bxxk = f147704f;
                    if (bxxk == null) {
                        bxxk = new bxve(f147703e);
                        f147704f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
