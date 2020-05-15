package p000;

/* renamed from: bsvv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsvv extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bsvv f147346a;

    /* renamed from: b */
    private static volatile bxxk f147347b;

    static {
        bsvv bsvv = new bsvv();
        f147346a = bsvv;
        GeneratedMessageLite.m124024a(bsvv.class, bsvv);
    }

    private bsvv() {
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
            return GeneratedMessageLite.m124022a(f147346a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bsvv();
        }
        if (i2 == 4) {
            return new bxvd(f147346a);
        }
        if (i2 == 5) {
            return f147346a;
        }
        bxxk bxxk = f147347b;
        if (bxxk == null) {
            synchronized (bsvv.class) {
                bxxk = f147347b;
                if (bxxk == null) {
                    bxxk = new bxve(f147346a);
                    f147347b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
