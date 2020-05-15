package p000;

/* renamed from: btai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btai extends bxvk implements bxxd {

    /* renamed from: d */
    public static final btai f147980d;

    /* renamed from: e */
    private static volatile bxxk f147981e;

    /* renamed from: a */
    public String f147982a = "";

    /* renamed from: b */
    public bszo f147983b;

    /* renamed from: c */
    public bszs f147984c;

    static {
        btai btai = new btai();
        f147980d = btai;
        bxvk.m124024a(btai.class, btai);
    }

    private btai() {
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
            return bxvk.m124022a(f147980d, "\u0000\u0003\u0000\u0000\u0001?\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\t?\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new btai();
        } else {
            if (i2 == 4) {
                return new bxvd(f147980d);
            }
            if (i2 == 5) {
                return f147980d;
            }
            bxxk bxxk = f147981e;
            if (bxxk == null) {
                synchronized (btai.class) {
                    bxxk = f147981e;
                    if (bxxk == null) {
                        bxxk = new bxve(f147980d);
                        f147981e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
