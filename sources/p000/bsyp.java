package p000;

/* renamed from: bsyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsyp extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bsyp f147693e;

    /* renamed from: f */
    private static volatile bxxk f147694f;

    /* renamed from: a */
    public int f147695a;

    /* renamed from: b */
    public bsxn f147696b;

    /* renamed from: c */
    public String f147697c = "";

    /* renamed from: d */
    public bswh f147698d;

    static {
        bsyp bsyp = new bsyp();
        f147693e = bsyp;
        GeneratedMessageLite.m124024a(bsyp.class, bsyp);
    }

    private bsyp() {
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
            return GeneratedMessageLite.m124022a(f147693e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bsyp();
        } else {
            if (i2 == 4) {
                return new bxvd(f147693e);
            }
            if (i2 == 5) {
                return f147693e;
            }
            bxxk bxxk = f147694f;
            if (bxxk == null) {
                synchronized (bsyp.class) {
                    bxxk = f147694f;
                    if (bxxk == null) {
                        bxxk = new bxve(f147693e);
                        f147694f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
