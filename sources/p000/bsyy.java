package p000;

/* renamed from: bsyy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsyy extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bxvu f147768b = new bsyv();

    /* renamed from: e */
    public static final bsyy f147769e;

    /* renamed from: g */
    private static volatile bxxk f147770g;

    /* renamed from: a */
    public bxvt f147771a = bxvm.f164965b;

    /* renamed from: c */
    public String f147772c = "";

    /* renamed from: d */
    public String f147773d = "";

    /* renamed from: f */
    private int f147774f;

    static {
        bsyy bsyy = new bsyy();
        f147769e = bsyy;
        GeneratedMessageLite.m124024a(bsyy.class, bsyy);
    }

    private bsyy() {
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
            return GeneratedMessageLite.m124022a(f147769e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000\u0003ဈ\u0001", new Object[]{"f", "a", bsyx.m116327b(), "c", "d"});
        } else if (i2 == 3) {
            return new bsyy();
        } else {
            if (i2 == 4) {
                return new bxvd(f147769e);
            }
            if (i2 == 5) {
                return f147769e;
            }
            bxxk bxxk = f147770g;
            if (bxxk == null) {
                synchronized (bsyy.class) {
                    bxxk = f147770g;
                    if (bxxk == null) {
                        bxxk = new bxve(f147769e);
                        f147770g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
