package p000;

/* renamed from: bsxy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsxy extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bsxy f147639a;

    /* renamed from: b */
    private static volatile bxxk f147640b;

    static {
        bsxy bsxy = new bsxy();
        f147639a = bsxy;
        bxvk.m124024a(bsxy.class, bsxy);
    }

    private bsxy() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f147639a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bsxy();
        }
        if (i2 == 4) {
            return new bxvd(f147639a);
        }
        if (i2 == 5) {
            return f147639a;
        }
        bxxk bxxk = f147640b;
        if (bxxk == null) {
            synchronized (bsxy.class) {
                bxxk = f147640b;
                if (bxxk == null) {
                    bxxk = new bxve(f147639a);
                    f147640b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
