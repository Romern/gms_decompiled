package p000;

/* renamed from: bswt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bswt extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bswt f147489f;

    /* renamed from: g */
    private static volatile bxxk f147490g;

    /* renamed from: a */
    public int f147491a;

    /* renamed from: b */
    public long f147492b;

    /* renamed from: c */
    public bxwc f147493c = bxxn.f165040b;

    /* renamed from: d */
    public String f147494d = "";

    /* renamed from: e */
    public String f147495e = "";

    static {
        bswt bswt = new bswt();
        f147489f = bswt;
        bxvk.m124024a(bswt.class, bswt);
    }

    private bswt() {
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
            return bxvk.m124022a(f147489f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"a", "b", "c", bswu.class, "d", "e"});
        } else if (i2 == 3) {
            return new bswt();
        } else {
            if (i2 == 4) {
                return new bxvd(f147489f);
            }
            if (i2 == 5) {
                return f147489f;
            }
            bxxk bxxk = f147490g;
            if (bxxk == null) {
                synchronized (bswt.class) {
                    bxxk = f147490g;
                    if (bxxk == null) {
                        bxxk = new bxve(f147489f);
                        f147490g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
