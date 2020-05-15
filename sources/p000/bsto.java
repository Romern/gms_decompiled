package p000;

/* renamed from: bsto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsto extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bsto f147037c;

    /* renamed from: d */
    private static volatile bxxk f147038d;

    /* renamed from: a */
    public String f147039a = "";

    /* renamed from: b */
    public bsud f147040b;

    static {
        bsto bsto = new bsto();
        f147037c = bsto;
        GeneratedMessageLite.m124024a(bsto.class, bsto);
    }

    private bsto() {
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
            return GeneratedMessageLite.m124022a(f147037c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bsto();
        } else {
            if (i2 == 4) {
                return new bxvd(f147037c);
            }
            if (i2 == 5) {
                return f147037c;
            }
            bxxk bxxk = f147038d;
            if (bxxk == null) {
                synchronized (bsto.class) {
                    bxxk = f147038d;
                    if (bxxk == null) {
                        bxxk = new bxve(f147037c);
                        f147038d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
