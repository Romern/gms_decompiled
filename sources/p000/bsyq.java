package p000;

/* renamed from: bsyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsyq extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bsyq f147699c;

    /* renamed from: d */
    private static volatile bxxk f147700d;

    /* renamed from: a */
    public int f147701a;

    /* renamed from: b */
    public String f147702b = "";

    static {
        bsyq bsyq = new bsyq();
        f147699c = bsyq;
        GeneratedMessageLite.m124024a(bsyq.class, bsyq);
    }

    private bsyq() {
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
            return GeneratedMessageLite.m124022a(f147699c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bsyq();
        } else {
            if (i2 == 4) {
                return new bxvd(f147699c);
            }
            if (i2 == 5) {
                return f147699c;
            }
            bxxk bxxk = f147700d;
            if (bxxk == null) {
                synchronized (bsyq.class) {
                    bxxk = f147700d;
                    if (bxxk == null) {
                        bxxk = new bxve(f147699c);
                        f147700d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
