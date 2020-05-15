package p000;

/* renamed from: bszo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bszo extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bszo f147869e;

    /* renamed from: f */
    private static volatile bxxk f147870f;

    /* renamed from: a */
    public int f147871a;

    /* renamed from: b */
    public int f147872b;

    /* renamed from: c */
    public String f147873c = "";

    /* renamed from: d */
    public String f147874d = "";

    static {
        bszo bszo = new bszo();
        f147869e = bszo;
        bxvk.m124024a(bszo.class, bszo);
    }

    private bszo() {
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
            return bxvk.m124022a(f147869e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\f\u0003Ȉ\u0004Ȉ", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bszo();
        } else {
            if (i2 == 4) {
                return new bxvd(f147869e);
            }
            if (i2 == 5) {
                return f147869e;
            }
            bxxk bxxk = f147870f;
            if (bxxk == null) {
                synchronized (bszo.class) {
                    bxxk = f147870f;
                    if (bxxk == null) {
                        bxxk = new bxve(f147869e);
                        f147870f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
