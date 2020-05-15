package p000;

/* renamed from: btah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btah extends bxvk implements bxxd {

    /* renamed from: e */
    public static final btah f147974e;

    /* renamed from: f */
    private static volatile bxxk f147975f;

    /* renamed from: a */
    public String f147976a = "";

    /* renamed from: b */
    public btbo f147977b;

    /* renamed from: c */
    public bszp f147978c;

    /* renamed from: d */
    public bszs f147979d;

    static {
        btah btah = new btah();
        f147974e = btah;
        bxvk.m124024a(btah.class, btah);
    }

    private btah() {
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
            return bxvk.m124022a(f147974e, "\u0000\u0004\u0000\u0000\u0001?\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0004\t?\t", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new btah();
        } else {
            if (i2 == 4) {
                return new bxvd(f147974e);
            }
            if (i2 == 5) {
                return f147974e;
            }
            bxxk bxxk = f147975f;
            if (bxxk == null) {
                synchronized (btah.class) {
                    bxxk = f147975f;
                    if (bxxk == null) {
                        bxxk = new bxve(f147974e);
                        f147975f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
