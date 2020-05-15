package p000;

/* renamed from: bsyz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsyz extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bsyz f147775c;

    /* renamed from: d */
    private static volatile bxxk f147776d;

    /* renamed from: a */
    public int f147777a;

    /* renamed from: b */
    public bzrv f147778b;

    static {
        bsyz bsyz = new bsyz();
        f147775c = bsyz;
        GeneratedMessageLite.m124024a(bsyz.class, bsyz);
    }

    private bsyz() {
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
            return GeneratedMessageLite.m124022a(f147775c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bsyz();
        } else {
            if (i2 == 4) {
                return new bxvd(f147775c);
            }
            if (i2 == 5) {
                return f147775c;
            }
            bxxk bxxk = f147776d;
            if (bxxk == null) {
                synchronized (bsyz.class) {
                    bxxk = f147776d;
                    if (bxxk == null) {
                        bxxk = new bxve(f147775c);
                        f147776d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
