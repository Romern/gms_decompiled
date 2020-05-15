package p000;

/* renamed from: bswy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bswy extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bswy f147512a;

    /* renamed from: b */
    private static volatile bxxk f147513b;

    static {
        bswy bswy = new bswy();
        f147512a = bswy;
        bxvk.m124024a(bswy.class, bswy);
    }

    private bswy() {
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
            return bxvk.m124022a(f147512a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bswy();
        }
        if (i2 == 4) {
            return new bxvd(f147512a);
        }
        if (i2 == 5) {
            return f147512a;
        }
        bxxk bxxk = f147513b;
        if (bxxk == null) {
            synchronized (bswy.class) {
                bxxk = f147513b;
                if (bxxk == null) {
                    bxxk = new bxve(f147512a);
                    f147513b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
