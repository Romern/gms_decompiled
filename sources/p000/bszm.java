package p000;

/* renamed from: bszm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bszm extends bxvk implements bxxd {

    /* renamed from: n */
    public static final bszm f147844n;

    /* renamed from: o */
    private static volatile bxxk f147845o;

    /* renamed from: a */
    public String f147846a = "";

    /* renamed from: b */
    public int f147847b;

    /* renamed from: c */
    public long f147848c;

    /* renamed from: d */
    public String f147849d = "";

    /* renamed from: e */
    public int f147850e;

    /* renamed from: f */
    public int f147851f;

    /* renamed from: g */
    public boolean f147852g;

    /* renamed from: h */
    public bxww f147853h = bxww.f165013b;

    /* renamed from: i */
    public int f147854i;

    /* renamed from: j */
    public String f147855j = "";

    /* renamed from: k */
    public int f147856k;

    /* renamed from: l */
    public String f147857l = "";

    /* renamed from: m */
    public int f147858m;

    static {
        bszm bszm = new bszm();
        f147844n = bszm;
        bxvk.m124024a(bszm.class, bszm);
    }

    private bszm() {
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
            return bxvk.m124022a(f147844n, "\u0000\r\u0000\u0000\u0001\u000e\r\u0001\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0002\u0004Ȉ\u0005\u0004\u0006\u0004\b\u0007\t2\n\u0004\u000bȈ\f\u0004\rȈ\u000e\f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", bszl.f147843a, "i", "j", "k", "l", "m"});
        } else if (i2 == 3) {
            return new bszm();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null, (short[]) null);
            }
            if (i2 == 5) {
                return f147844n;
            }
            bxxk bxxk = f147845o;
            if (bxxk == null) {
                synchronized (bszm.class) {
                    bxxk = f147845o;
                    if (bxxk == null) {
                        bxxk = new bxve(f147844n);
                        f147845o = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
