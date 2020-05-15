package p000;

/* renamed from: btae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btae extends bxvk implements bxxd {

    /* renamed from: e */
    public static final btae f147946e;

    /* renamed from: f */
    private static volatile bxxk f147947f;

    /* renamed from: a */
    public byfz f147948a;

    /* renamed from: b */
    public boolean f147949b;

    /* renamed from: c */
    public long f147950c;

    /* renamed from: d */
    public int f147951d;

    static {
        btae btae = new btae();
        f147946e = btae;
        bxvk.m124024a(btae.class, btae);
    }

    private btae() {
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
            return bxvk.m124022a(f147946e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\u0007\u0003\u0002\u0004\u0004", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new btae();
        } else {
            if (i2 == 4) {
                return new bxvd(f147946e);
            }
            if (i2 == 5) {
                return f147946e;
            }
            bxxk bxxk = f147947f;
            if (bxxk == null) {
                synchronized (btae.class) {
                    bxxk = f147947f;
                    if (bxxk == null) {
                        bxxk = new bxve(f147946e);
                        f147947f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
