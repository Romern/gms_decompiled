package p000;

/* renamed from: bsvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsvz extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bsvz f147360b;

    /* renamed from: c */
    private static volatile bxxk f147361c;

    /* renamed from: a */
    public bxvs f147362a = bxuz.f164939b;

    static {
        bsvz bsvz = new bsvz();
        f147360b = bsvz;
        bxvk.m124024a(bsvz.class, bsvz);
    }

    private bsvz() {
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
            return bxvk.m124022a(f147360b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0013", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bsvz();
        } else {
            if (i2 == 4) {
                return new bxvd(f147360b);
            }
            if (i2 == 5) {
                return f147360b;
            }
            bxxk bxxk = f147361c;
            if (bxxk == null) {
                synchronized (bsvz.class) {
                    bxxk = f147361c;
                    if (bxxk == null) {
                        bxxk = new bxve(f147360b);
                        f147361c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
