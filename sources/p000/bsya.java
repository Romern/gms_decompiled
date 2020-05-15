package p000;

/* renamed from: bsya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsya extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bsya f147647a;

    /* renamed from: b */
    private static volatile bxxk f147648b;

    static {
        bsya bsya = new bsya();
        f147647a = bsya;
        bxvk.m124024a(bsya.class, bsya);
    }

    private bsya() {
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
            return bxvk.m124022a(f147647a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bsya();
        }
        if (i2 == 4) {
            return new bxvd(f147647a);
        }
        if (i2 == 5) {
            return f147647a;
        }
        bxxk bxxk = f147648b;
        if (bxxk == null) {
            synchronized (bsya.class) {
                bxxk = f147648b;
                if (bxxk == null) {
                    bxxk = new bxve(f147647a);
                    f147648b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
