package p000;

/* renamed from: bswa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bswa extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bswa f147363e;

    /* renamed from: f */
    private static volatile bxxk f147364f;

    /* renamed from: a */
    public int f147365a;

    /* renamed from: b */
    public bsxj f147366b;

    /* renamed from: c */
    public bsxn f147367c;

    /* renamed from: d */
    public bxwc f147368d = bxxn.f165040b;

    static {
        bswa bswa = new bswa();
        f147363e = bswa;
        bxvk.m124024a(bswa.class, bswa);
    }

    private bswa() {
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
            return bxvk.m124022a(f147363e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"a", "b", "c", "d", bsxo.class});
        } else if (i2 == 3) {
            return new bswa();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (int[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f147363e;
            }
            bxxk bxxk = f147364f;
            if (bxxk == null) {
                synchronized (bswa.class) {
                    bxxk = f147364f;
                    if (bxxk == null) {
                        bxxk = new bxve(f147363e);
                        f147364f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
