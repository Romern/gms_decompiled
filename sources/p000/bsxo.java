package p000;

/* renamed from: bsxo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsxo extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bsxo f147591c;

    /* renamed from: d */
    private static volatile bxxk f147592d;

    /* renamed from: a */
    public int f147593a;

    /* renamed from: b */
    public bsxn f147594b;

    static {
        bsxo bsxo = new bsxo();
        f147591c = bsxo;
        bxvk.m124024a(bsxo.class, bsxo);
    }

    private bsxo() {
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
            return bxvk.m124022a(f147591c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bsxo();
        } else {
            if (i2 == 4) {
                return new bxvd(f147591c);
            }
            if (i2 == 5) {
                return f147591c;
            }
            bxxk bxxk = f147592d;
            if (bxxk == null) {
                synchronized (bsxo.class) {
                    bxxk = f147592d;
                    if (bxxk == null) {
                        bxxk = new bxve(f147591c);
                        f147592d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
