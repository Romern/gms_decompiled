package p000;

/* renamed from: bswl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bswl extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bswl f147450a;

    /* renamed from: b */
    private static volatile bxxk f147451b;

    static {
        bswl bswl = new bswl();
        f147450a = bswl;
        GeneratedMessageLite.m124024a(bswl.class, bswl);
    }

    private bswl() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f147450a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bswl();
        }
        if (i2 == 4) {
            return new bxvd(f147450a);
        }
        if (i2 == 5) {
            return f147450a;
        }
        bxxk bxxk = f147451b;
        if (bxxk == null) {
            synchronized (bswl.class) {
                bxxk = f147451b;
                if (bxxk == null) {
                    bxxk = new bxve(f147450a);
                    f147451b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
