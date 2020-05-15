package p000;

/* renamed from: bsyh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsyh extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bsyh f147675c;

    /* renamed from: d */
    private static volatile bxxk f147676d;

    /* renamed from: a */
    public int f147677a;

    /* renamed from: b */
    public int f147678b;

    static {
        bsyh bsyh = new bsyh();
        f147675c = bsyh;
        GeneratedMessageLite.m124024a(bsyh.class, bsyh);
    }

    private bsyh() {
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
            return GeneratedMessageLite.m124022a(f147675c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bsyh();
        } else {
            if (i2 == 4) {
                return new bxvd(f147675c);
            }
            if (i2 == 5) {
                return f147675c;
            }
            bxxk bxxk = f147676d;
            if (bxxk == null) {
                synchronized (bsyh.class) {
                    bxxk = f147676d;
                    if (bxxk == null) {
                        bxxk = new bxve(f147675c);
                        f147676d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
