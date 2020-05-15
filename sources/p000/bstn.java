package p000;

/* renamed from: bstn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bstn extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bstn f147033c;

    /* renamed from: d */
    private static volatile bxxk f147034d;

    /* renamed from: a */
    public String f147035a = "";

    /* renamed from: b */
    public bsua f147036b;

    static {
        bstn bstn = new bstn();
        f147033c = bstn;
        bxvk.m124024a(bstn.class, bstn);
    }

    private bstn() {
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
            return bxvk.m124022a(f147033c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bstn();
        } else {
            if (i2 == 4) {
                return new bxvd(f147033c);
            }
            if (i2 == 5) {
                return f147033c;
            }
            bxxk bxxk = f147034d;
            if (bxxk == null) {
                synchronized (bstn.class) {
                    bxxk = f147034d;
                    if (bxxk == null) {
                        bxxk = new bxve(f147033c);
                        f147034d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
