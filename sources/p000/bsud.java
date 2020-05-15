package p000;

/* renamed from: bsud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsud extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bsud f147106f;

    /* renamed from: g */
    private static volatile bxxk f147107g;

    /* renamed from: a */
    public String f147108a = "";

    /* renamed from: b */
    public String f147109b = "";

    /* renamed from: c */
    public bxtx f147110c = bxtx.f164797b;

    /* renamed from: d */
    public String f147111d = "";

    /* renamed from: e */
    public String f147112e = "";

    static {
        bsud bsud = new bsud();
        f147106f = bsud;
        bxvk.m124024a(bsud.class, bsud);
    }

    private bsud() {
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
            return bxvk.m124022a(f147106f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\n\u0004Ȉ\u0005Ȉ", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bsud();
        } else {
            if (i2 == 4) {
                return new bxvd(f147106f);
            }
            if (i2 == 5) {
                return f147106f;
            }
            bxxk bxxk = f147107g;
            if (bxxk == null) {
                synchronized (bsud.class) {
                    bxxk = f147107g;
                    if (bxxk == null) {
                        bxxk = new bxve(f147106f);
                        f147107g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
