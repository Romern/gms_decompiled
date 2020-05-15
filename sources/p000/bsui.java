package p000;

/* renamed from: bsui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsui extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bsui f147128e;

    /* renamed from: f */
    private static volatile bxxk f147129f;

    /* renamed from: a */
    public int f147130a;

    /* renamed from: b */
    public String f147131b = "";

    /* renamed from: c */
    public bswh f147132c;

    /* renamed from: d */
    public bsxn f147133d;

    static {
        bsui bsui = new bsui();
        f147128e = bsui;
        bxvk.m124024a(bsui.class, bsui);
    }

    private bsui() {
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
            return bxvk.m124022a(f147128e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bsui();
        } else {
            if (i2 == 4) {
                return new bxvd(f147128e);
            }
            if (i2 == 5) {
                return f147128e;
            }
            bxxk bxxk = f147129f;
            if (bxxk == null) {
                synchronized (bsui.class) {
                    bxxk = f147129f;
                    if (bxxk == null) {
                        bxxk = new bxve(f147128e);
                        f147129f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
