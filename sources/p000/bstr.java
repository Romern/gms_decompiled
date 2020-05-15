package p000;

/* renamed from: bstr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bstr extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bstr f147046d;

    /* renamed from: e */
    private static volatile bxxk f147047e;

    /* renamed from: a */
    public String f147048a = "";

    /* renamed from: b */
    public qui f147049b;

    /* renamed from: c */
    public long f147050c;

    static {
        bstr bstr = new bstr();
        f147046d = bstr;
        GeneratedMessageLite.m124024a(bstr.class, bstr);
    }

    private bstr() {
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
            return GeneratedMessageLite.m124022a(f147046d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\u0002", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bstr();
        } else {
            if (i2 == 4) {
                return new bxvd(f147046d);
            }
            if (i2 == 5) {
                return f147046d;
            }
            bxxk bxxk = f147047e;
            if (bxxk == null) {
                synchronized (bstr.class) {
                    bxxk = f147047e;
                    if (bxxk == null) {
                        bxxk = new bxve(f147046d);
                        f147047e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
