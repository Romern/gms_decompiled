package p000;

/* renamed from: bsur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsur extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bsur f147174f;

    /* renamed from: h */
    private static volatile bxxk f147175h;

    /* renamed from: a */
    public String f147176a = "";

    /* renamed from: b */
    public int f147177b;

    /* renamed from: c */
    public int f147178c;

    /* renamed from: d */
    public bxvt f147179d = bxvm.f164965b;

    /* renamed from: e */
    public bxvt f147180e = bxvm.f164965b;

    /* renamed from: g */
    private int f147181g;

    static {
        bsur bsur = new bsur();
        f147174f = bsur;
        GeneratedMessageLite.m124024a(bsur.class, bsur);
    }

    private bsur() {
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
            return GeneratedMessageLite.m124022a(f147174f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004\u0016\u0005\u0016", new Object[]{"g", "a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bsur();
        } else {
            if (i2 == 4) {
                return new bxvd(f147174f);
            }
            if (i2 == 5) {
                return f147174f;
            }
            bxxk bxxk = f147175h;
            if (bxxk == null) {
                synchronized (bsur.class) {
                    bxxk = f147175h;
                    if (bxxk == null) {
                        bxxk = new bxve(f147174f);
                        f147175h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
