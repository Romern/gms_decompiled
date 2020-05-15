package p000;

/* renamed from: bswc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bswc extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bswc f147374c;

    /* renamed from: d */
    private static volatile bxxk f147375d;

    /* renamed from: a */
    public int f147376a;

    /* renamed from: b */
    public int f147377b;

    static {
        bswc bswc = new bswc();
        f147374c = bswc;
        bxvk.m124024a(bswc.class, bswc);
    }

    private bswc() {
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
            return bxvk.m124022a(f147374c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bswc();
        } else {
            if (i2 == 4) {
                return new bxvd(f147374c);
            }
            if (i2 == 5) {
                return f147374c;
            }
            bxxk bxxk = f147375d;
            if (bxxk == null) {
                synchronized (bswc.class) {
                    bxxk = f147375d;
                    if (bxxk == null) {
                        bxxk = new bxve(f147374c);
                        f147375d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
