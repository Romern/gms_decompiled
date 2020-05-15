package p000;

/* renamed from: bsuc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsuc extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bsuc f147104a;

    /* renamed from: b */
    private static volatile bxxk f147105b;

    static {
        bsuc bsuc = new bsuc();
        f147104a = bsuc;
        GeneratedMessageLite.m124024a(bsuc.class, bsuc);
    }

    private bsuc() {
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
            return GeneratedMessageLite.m124022a(f147104a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bsuc();
        }
        if (i2 == 4) {
            return new bxvd(f147104a);
        }
        if (i2 == 5) {
            return f147104a;
        }
        bxxk bxxk = f147105b;
        if (bxxk == null) {
            synchronized (bsuc.class) {
                bxxk = f147105b;
                if (bxxk == null) {
                    bxxk = new bxve(f147104a);
                    f147105b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
