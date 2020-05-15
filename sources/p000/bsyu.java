package p000;

/* renamed from: bsyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsyu extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bsyu f147722a;

    /* renamed from: e */
    private static volatile bxxk f147723e;

    /* renamed from: b */
    private int f147724b;

    /* renamed from: c */
    private bsxn f147725c;

    /* renamed from: d */
    private bsyt f147726d;

    static {
        bsyu bsyu = new bsyu();
        f147722a = bsyu;
        bxvk.m124024a(bsyu.class, bsyu);
    }

    private bsyu() {
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
            return bxvk.m124022a(f147722a, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0000\u0005ဉ\u0005\u0006ဉ\u0001", new Object[]{"b", "d", "c"});
        } else if (i2 == 3) {
            return new bsyu();
        } else {
            if (i2 == 4) {
                return new bxvd(f147722a);
            }
            if (i2 == 5) {
                return f147722a;
            }
            bxxk bxxk = f147723e;
            if (bxxk == null) {
                synchronized (bsyu.class) {
                    bxxk = f147723e;
                    if (bxxk == null) {
                        bxxk = new bxve(f147722a);
                        f147723e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
