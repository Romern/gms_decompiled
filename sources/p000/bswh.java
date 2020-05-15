package p000;

/* renamed from: bswh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bswh extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bswh f147430g;

    /* renamed from: h */
    private static volatile bxxk f147431h;

    /* renamed from: a */
    public int f147432a;

    /* renamed from: b */
    public int f147433b;

    /* renamed from: c */
    public String f147434c = "";

    /* renamed from: d */
    public int f147435d;

    /* renamed from: e */
    public int f147436e;

    /* renamed from: f */
    public String f147437f = "";

    static {
        bswh bswh = new bswh();
        f147430g = bswh;
        bxvk.m124024a(bswh.class, bswh);
    }

    private bswh() {
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
            return bxvk.m124022a(f147430g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003င\u0003\u0004င\u0004\u0005ဈ\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bswh();
        } else {
            if (i2 == 4) {
                return new bxvd(f147430g);
            }
            if (i2 == 5) {
                return f147430g;
            }
            bxxk bxxk = f147431h;
            if (bxxk == null) {
                synchronized (bswh.class) {
                    bxxk = f147431h;
                    if (bxxk == null) {
                        bxxk = new bxve(f147430g);
                        f147431h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
