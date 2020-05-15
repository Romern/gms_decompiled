package p000;

/* renamed from: bsxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsxw extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bsxw f147632a;

    /* renamed from: d */
    private static volatile bxxk f147633d;

    /* renamed from: b */
    private int f147634b;

    /* renamed from: c */
    private bsut f147635c;

    static {
        bsxw bsxw = new bsxw();
        f147632a = bsxw;
        GeneratedMessageLite.m124024a(bsxw.class, bsxw);
    }

    private bsxw() {
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
            return GeneratedMessageLite.m124022a(f147632a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0001", new Object[]{"b", "c"});
        } else if (i2 == 3) {
            return new bsxw();
        } else {
            if (i2 == 4) {
                return new bxvd(f147632a);
            }
            if (i2 == 5) {
                return f147632a;
            }
            bxxk bxxk = f147633d;
            if (bxxk == null) {
                synchronized (bsxw.class) {
                    bxxk = f147633d;
                    if (bxxk == null) {
                        bxxk = new bxve(f147632a);
                        f147633d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
