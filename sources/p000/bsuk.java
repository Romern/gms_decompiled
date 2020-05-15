package p000;

/* renamed from: bsuk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsuk extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bsuk f147137d;

    /* renamed from: e */
    private static volatile bxxk f147138e;

    /* renamed from: a */
    public int f147139a;

    /* renamed from: b */
    public String f147140b = "";

    /* renamed from: c */
    public bswh f147141c;

    static {
        bsuk bsuk = new bsuk();
        f147137d = bsuk;
        GeneratedMessageLite.m124024a(bsuk.class, bsuk);
    }

    private bsuk() {
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
            return GeneratedMessageLite.m124022a(f147137d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bsuk();
        } else {
            if (i2 == 4) {
                return new bxvd(f147137d);
            }
            if (i2 == 5) {
                return f147137d;
            }
            bxxk bxxk = f147138e;
            if (bxxk == null) {
                synchronized (bsuk.class) {
                    bxxk = f147138e;
                    if (bxxk == null) {
                        bxxk = new bxve(f147137d);
                        f147138e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
