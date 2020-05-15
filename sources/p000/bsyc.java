package p000;

/* renamed from: bsyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsyc extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bsyc f147652g;

    /* renamed from: h */
    private static volatile bxxk f147653h;

    /* renamed from: a */
    public int f147654a;

    /* renamed from: b */
    public String f147655b = "";

    /* renamed from: c */
    public bzrt f147656c;

    /* renamed from: d */
    public bswh f147657d;

    /* renamed from: e */
    public int f147658e;

    /* renamed from: f */
    public bsyl f147659f;

    static {
        bsyc bsyc = new bsyc();
        f147652g = bsyc;
        bxvk.m124024a(bsyc.class, bsyc);
    }

    private bsyc() {
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
            return bxvk.m124022a(f147652g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဌ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", "c", "d", "e", bsyj.f147683a, "f"});
        } else if (i2 == 3) {
            return new bsyc();
        } else {
            if (i2 == 4) {
                return new bxvd(f147652g);
            }
            if (i2 == 5) {
                return f147652g;
            }
            bxxk bxxk = f147653h;
            if (bxxk == null) {
                synchronized (bsyc.class) {
                    bxxk = f147653h;
                    if (bxxk == null) {
                        bxxk = new bxve(f147652g);
                        f147653h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
