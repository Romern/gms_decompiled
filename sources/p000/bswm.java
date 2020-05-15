package p000;

/* renamed from: bswm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bswm extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bswm f147452b;

    /* renamed from: c */
    private static volatile bxxk f147453c;

    /* renamed from: a */
    public bxwc f147454a = bxxn.f165040b;

    static {
        bswm bswm = new bswm();
        f147452b = bswm;
        bxvk.m124024a(bswm.class, bswm);
    }

    private bswm() {
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
            return bxvk.m124022a(f147452b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bswn.class});
        } else if (i2 == 3) {
            return new bswm();
        } else {
            if (i2 == 4) {
                return new bxvd(f147452b);
            }
            if (i2 == 5) {
                return f147452b;
            }
            bxxk bxxk = f147453c;
            if (bxxk == null) {
                synchronized (bswm.class) {
                    bxxk = f147453c;
                    if (bxxk == null) {
                        bxxk = new bxve(f147452b);
                        f147453c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
