package p000;

/* renamed from: bsym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsym extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bsym f147688a;

    /* renamed from: b */
    private static volatile bxxk f147689b;

    static {
        bsym bsym = new bsym();
        f147688a = bsym;
        bxvk.m124024a(bsym.class, bsym);
    }

    private bsym() {
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
            return bxvk.m124022a(f147688a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bsym();
        }
        if (i2 == 4) {
            return new bxvd(f147688a);
        }
        if (i2 == 5) {
            return f147688a;
        }
        bxxk bxxk = f147689b;
        if (bxxk == null) {
            synchronized (bsym.class) {
                bxxk = f147689b;
                if (bxxk == null) {
                    bxxk = new bxve(f147688a);
                    f147689b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
