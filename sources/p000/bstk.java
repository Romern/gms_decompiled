package p000;

/* renamed from: bstk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bstk extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bstk f147023b;

    /* renamed from: c */
    private static volatile bxxk f147024c;

    /* renamed from: a */
    public bxwc f147025a = bxxn.f165040b;

    static {
        bstk bstk = new bstk();
        f147023b = bstk;
        bxvk.m124024a(bstk.class, bstk);
    }

    private bstk() {
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
            return bxvk.m124022a(f147023b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bsue.class});
        } else if (i2 == 3) {
            return new bstk();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (boolean[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f147023b;
            }
            bxxk bxxk = f147024c;
            if (bxxk == null) {
                synchronized (bstk.class) {
                    bxxk = f147024c;
                    if (bxxk == null) {
                        bxxk = new bxve(f147023b);
                        f147024c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
