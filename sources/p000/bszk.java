package p000;

/* renamed from: bszk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bszk extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bszk f147840b;

    /* renamed from: c */
    private static volatile bxxk f147841c;

    /* renamed from: a */
    public String f147842a = "";

    static {
        bszk bszk = new bszk();
        f147840b = bszk;
        GeneratedMessageLite.m124024a(bszk.class, bszk);
    }

    private bszk() {
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
            return GeneratedMessageLite.m124022a(f147840b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bszk();
        } else {
            if (i2 == 4) {
                return new bxvd(f147840b);
            }
            if (i2 == 5) {
                return f147840b;
            }
            bxxk bxxk = f147841c;
            if (bxxk == null) {
                synchronized (bszk.class) {
                    bxxk = f147841c;
                    if (bxxk == null) {
                        bxxk = new bxve(f147840b);
                        f147841c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
