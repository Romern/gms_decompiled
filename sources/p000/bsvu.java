package p000;

/* renamed from: bsvu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsvu extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bsvu f147338g;

    /* renamed from: h */
    private static volatile bxxk f147339h;

    /* renamed from: a */
    public int f147340a;

    /* renamed from: b */
    public String f147341b = "";

    /* renamed from: c */
    public String f147342c = "";

    /* renamed from: d */
    public bswh f147343d;

    /* renamed from: e */
    public String f147344e = "";

    /* renamed from: f */
    public bsxn f147345f;

    static {
        bsvu bsvu = new bsvu();
        f147338g = bsvu;
        GeneratedMessageLite.m124024a(bsvu.class, bsvu);
    }

    private bsvu() {
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
            return GeneratedMessageLite.m124022a(f147338g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဈ\u0004\u0005ဉ\u0006", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bsvu();
        } else {
            if (i2 == 4) {
                return new bxvd(f147338g);
            }
            if (i2 == 5) {
                return f147338g;
            }
            bxxk bxxk = f147339h;
            if (bxxk == null) {
                synchronized (bsvu.class) {
                    bxxk = f147339h;
                    if (bxxk == null) {
                        bxxk = new bxve(f147338g);
                        f147339h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
