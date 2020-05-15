package p000;

/* renamed from: bsws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsws extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bsws f147485c;

    /* renamed from: d */
    private static volatile bxxk f147486d;

    /* renamed from: a */
    public int f147487a;

    /* renamed from: b */
    public boolean f147488b;

    static {
        bsws bsws = new bsws();
        f147485c = bsws;
        GeneratedMessageLite.m124024a(bsws.class, bsws);
    }

    private bsws() {
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
            return GeneratedMessageLite.m124022a(f147485c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bsws();
        } else {
            if (i2 == 4) {
                return new bxvd(f147485c);
            }
            if (i2 == 5) {
                return f147485c;
            }
            bxxk bxxk = f147486d;
            if (bxxk == null) {
                synchronized (bsws.class) {
                    bxxk = f147486d;
                    if (bxxk == null) {
                        bxxk = new bxve(f147485c);
                        f147486d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
