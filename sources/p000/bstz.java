package p000;

/* renamed from: bstz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bstz extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bstz f147086g;

    /* renamed from: h */
    private static volatile bxxk f147087h;

    /* renamed from: a */
    public qui f147088a;

    /* renamed from: b */
    public int f147089b;

    /* renamed from: c */
    public qui f147090c;

    /* renamed from: d */
    public int f147091d;

    /* renamed from: e */
    public String f147092e = "";

    /* renamed from: f */
    public long f147093f;

    static {
        bstz bstz = new bstz();
        f147086g = bstz;
        bxvk.m124024a(bstz.class, bstz);
    }

    private bstz() {
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
            return bxvk.m124022a(f147086g, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001\t\u0002\f\u0003\t\u0005\u0004\u0006Ȉ\u0007\u0002", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bstz();
        } else {
            if (i2 == 4) {
                return new bxvd(f147086g);
            }
            if (i2 == 5) {
                return f147086g;
            }
            bxxk bxxk = f147087h;
            if (bxxk == null) {
                synchronized (bstz.class) {
                    bxxk = f147087h;
                    if (bxxk == null) {
                        bxxk = new bxve(f147086g);
                        f147087h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
