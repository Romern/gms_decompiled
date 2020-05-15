package p000;

/* renamed from: bsti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsti extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bsti f147013e;

    /* renamed from: f */
    private static volatile bxxk f147014f;

    /* renamed from: a */
    public String f147015a = "";

    /* renamed from: b */
    public bxtx f147016b = bxtx.f164797b;

    /* renamed from: c */
    public bxwc f147017c = bxxn.f165040b;

    /* renamed from: d */
    public int f147018d;

    static {
        bsti bsti = new bsti();
        f147013e = bsti;
        bxvk.m124024a(bsti.class, bsti);
    }

    private bsti() {
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
            return bxvk.m124022a(f147013e, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0001\u0000\u0001Ȉ\u0003\n\u0004Ț\u0005\f", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bsti();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (char[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f147013e;
            }
            bxxk bxxk = f147014f;
            if (bxxk == null) {
                synchronized (bsti.class) {
                    bxxk = f147014f;
                    if (bxxk == null) {
                        bxxk = new bxve(f147013e);
                        f147014f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
