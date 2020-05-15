package p000;

/* renamed from: btaj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btaj extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final btaj f147985d;

    /* renamed from: e */
    private static volatile bxxk f147986e;

    /* renamed from: a */
    public String f147987a = "";

    /* renamed from: b */
    public btbo f147988b;

    /* renamed from: c */
    public bszs f147989c;

    static {
        btaj btaj = new btaj();
        f147985d = btaj;
        GeneratedMessageLite.m124024a(btaj.class, btaj);
    }

    private btaj() {
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
            return GeneratedMessageLite.m124022a(f147985d, "\u0000\u0003\u0000\u0000\u0001?\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\t?\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new btaj();
        } else {
            if (i2 == 4) {
                return new bxvd(f147985d);
            }
            if (i2 == 5) {
                return f147985d;
            }
            bxxk bxxk = f147986e;
            if (bxxk == null) {
                synchronized (btaj.class) {
                    bxxk = f147986e;
                    if (bxxk == null) {
                        bxxk = new bxve(f147985d);
                        f147986e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
