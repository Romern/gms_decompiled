package p000;

/* renamed from: bszj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bszj extends GeneratedMessageLite implements bxxd {

    /* renamed from: l */
    public static final bszj f147827l;

    /* renamed from: m */
    private static volatile bxxk f147828m;

    /* renamed from: a */
    public String f147829a = "";

    /* renamed from: b */
    public String f147830b = "";

    /* renamed from: c */
    public int f147831c;

    /* renamed from: d */
    public long f147832d;

    /* renamed from: e */
    public long f147833e;

    /* renamed from: f */
    public String f147834f = "";

    /* renamed from: g */
    public int f147835g;

    /* renamed from: h */
    public long f147836h;

    /* renamed from: i */
    public long f147837i;

    /* renamed from: j */
    public bxwc f147838j = bxxn.f165040b;

    /* renamed from: k */
    public int f147839k;

    static {
        bszj bszj = new bszj();
        f147827l = bszj;
        GeneratedMessageLite.m124024a(bszj.class, bszj);
    }

    private bszj() {
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
            return GeneratedMessageLite.m124022a(f147827l, "\u0000\u000b\u0000\u0000\u0001\u0013\u000b\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004\u0002\u0005\u0002\u0006Ȉ\u0007\f\t\u0002\n\u0002\u000e\u001b\u0013\f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", btay.class, "k"});
        } else if (i2 == 3) {
            return new bszj();
        } else {
            if (i2 == 4) {
                return new bxvd(f147827l);
            }
            if (i2 == 5) {
                return f147827l;
            }
            bxxk bxxk = f147828m;
            if (bxxk == null) {
                synchronized (bszj.class) {
                    bxxk = f147828m;
                    if (bxxk == null) {
                        bxxk = new bxve(f147827l);
                        f147828m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
