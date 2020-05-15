package p000;

/* renamed from: bsxc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsxc extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bsxc f147525g;

    /* renamed from: h */
    private static volatile bxxk f147526h;

    /* renamed from: a */
    public int f147527a;

    /* renamed from: b */
    public float f147528b;

    /* renamed from: c */
    public bzrt f147529c;

    /* renamed from: d */
    public bzrt f147530d;

    /* renamed from: e */
    public String f147531e = "";

    /* renamed from: f */
    public String f147532f = "";

    static {
        bsxc bsxc = new bsxc();
        f147525g = bsxc;
        bxvk.m124024a(bsxc.class, bsxc);
    }

    private bsxc() {
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
            return bxvk.m124022a(f147525g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ခ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bsxc();
        } else {
            if (i2 == 4) {
                return new bxvd(f147525g);
            }
            if (i2 == 5) {
                return f147525g;
            }
            bxxk bxxk = f147526h;
            if (bxxk == null) {
                synchronized (bsxc.class) {
                    bxxk = f147526h;
                    if (bxxk == null) {
                        bxxk = new bxve(f147525g);
                        f147526h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
