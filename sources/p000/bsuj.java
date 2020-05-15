package p000;

/* renamed from: bsuj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsuj extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bsuj f147134b;

    /* renamed from: c */
    private static volatile bxxk f147135c;

    /* renamed from: a */
    public bxwc f147136a = bxxn.f165040b;

    static {
        bsuj bsuj = new bsuj();
        f147134b = bsuj;
        GeneratedMessageLite.m124024a(bsuj.class, bsuj);
    }

    private bsuj() {
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
            return GeneratedMessageLite.m124022a(f147134b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bsui.class});
        } else if (i2 == 3) {
            return new bsuj();
        } else {
            if (i2 == 4) {
                return new bxvd(f147134b);
            }
            if (i2 == 5) {
                return f147134b;
            }
            bxxk bxxk = f147135c;
            if (bxxk == null) {
                synchronized (bsuj.class) {
                    bxxk = f147135c;
                    if (bxxk == null) {
                        bxxk = new bxve(f147134b);
                        f147135c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
