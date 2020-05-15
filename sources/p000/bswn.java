package p000;

/* renamed from: bswn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bswn extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bswn f147455d;

    /* renamed from: e */
    private static volatile bxxk f147456e;

    /* renamed from: a */
    public int f147457a;

    /* renamed from: b */
    public bswh f147458b;

    /* renamed from: c */
    public String f147459c = "";

    static {
        bswn bswn = new bswn();
        f147455d = bswn;
        bxvk.m124024a(bswn.class, bswn);
    }

    private bswn() {
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
            return bxvk.m124022a(f147455d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bswn();
        } else {
            if (i2 == 4) {
                return new bxvd(f147455d);
            }
            if (i2 == 5) {
                return f147455d;
            }
            bxxk bxxk = f147456e;
            if (bxxk == null) {
                synchronized (bswn.class) {
                    bxxk = f147456e;
                    if (bxxk == null) {
                        bxxk = new bxve(f147455d);
                        f147456e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
