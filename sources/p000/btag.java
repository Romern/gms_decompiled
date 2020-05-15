package p000;

/* renamed from: btag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btag extends bxvk implements bxxd {

    /* renamed from: j */
    public static final btag f147963j;

    /* renamed from: k */
    private static volatile bxxk f147964k;

    /* renamed from: a */
    public String f147965a = "";

    /* renamed from: b */
    public bxwc f147966b = bxxn.f165040b;

    /* renamed from: c */
    public bszw f147967c;

    /* renamed from: d */
    public bxyk f147968d;

    /* renamed from: e */
    public String f147969e = "";

    /* renamed from: f */
    public btbp f147970f;

    /* renamed from: g */
    public long f147971g;

    /* renamed from: h */
    public int f147972h;

    /* renamed from: i */
    public int f147973i;

    static {
        btag btag = new btag();
        f147963j = btag;
        bxvk.m124024a(btag.class, btag);
    }

    private btag() {
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
            return bxvk.m124022a(f147963j, "\u0000\t\u0000\u0000\u0001\u0011\t\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0006\t\b\t\nȈ\f\t\u000f\u0002\u0010\u0004\u0011\f", new Object[]{"a", "b", bszj.class, "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new btag();
        } else {
            if (i2 == 4) {
                return new bxvd(f147963j);
            }
            if (i2 == 5) {
                return f147963j;
            }
            bxxk bxxk = f147964k;
            if (bxxk == null) {
                synchronized (btag.class) {
                    bxxk = f147964k;
                    if (bxxk == null) {
                        bxxk = new bxve(f147963j);
                        f147964k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
