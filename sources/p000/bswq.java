package p000;

/* renamed from: bswq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bswq extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bswq f147475c;

    /* renamed from: d */
    private static volatile bxxk f147476d;

    /* renamed from: a */
    public int f147477a;

    /* renamed from: b */
    public String f147478b = "";

    static {
        bswq bswq = new bswq();
        f147475c = bswq;
        bxvk.m124024a(bswq.class, bswq);
    }

    private bswq() {
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
            return bxvk.m124022a(f147475c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bswq();
        } else {
            if (i2 == 4) {
                return new bxvd(f147475c);
            }
            if (i2 == 5) {
                return f147475c;
            }
            bxxk bxxk = f147476d;
            if (bxxk == null) {
                synchronized (bswq.class) {
                    bxxk = f147476d;
                    if (bxxk == null) {
                        bxxk = new bxve(f147475c);
                        f147476d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
