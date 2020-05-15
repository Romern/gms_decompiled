package p000;

/* renamed from: bsuy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsuy extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bsuy f147211a;

    /* renamed from: b */
    private static volatile bxxk f147212b;

    static {
        bsuy bsuy = new bsuy();
        f147211a = bsuy;
        GeneratedMessageLite.m124024a(bsuy.class, bsuy);
    }

    private bsuy() {
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
            return GeneratedMessageLite.m124022a(f147211a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bsuy();
        }
        if (i2 == 4) {
            return new bxvd(f147211a);
        }
        if (i2 == 5) {
            return f147211a;
        }
        bxxk bxxk = f147212b;
        if (bxxk == null) {
            synchronized (bsuy.class) {
                bxxk = f147212b;
                if (bxxk == null) {
                    bxxk = new bxve(f147211a);
                    f147212b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
