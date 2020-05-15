package p000;

/* renamed from: bsvy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsvy extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bsvy f147355c;

    /* renamed from: e */
    private static volatile bxxk f147356e;

    /* renamed from: a */
    public String f147357a = "";

    /* renamed from: b */
    public boolean f147358b;

    /* renamed from: d */
    private int f147359d;

    static {
        bsvy bsvy = new bsvy();
        f147355c = bsvy;
        bxvk.m124024a(bsvy.class, bsvy);
    }

    private bsvy() {
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
            return bxvk.m124022a(f147355c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bsvy();
        } else {
            if (i2 == 4) {
                return new bxvd(f147355c);
            }
            if (i2 == 5) {
                return f147355c;
            }
            bxxk bxxk = f147356e;
            if (bxxk == null) {
                synchronized (bsvy.class) {
                    bxxk = f147356e;
                    if (bxxk == null) {
                        bxxk = new bxve(f147355c);
                        f147356e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
