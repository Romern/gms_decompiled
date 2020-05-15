package p000;

/* renamed from: bsuo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsuo extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bsuo f147154j;

    /* renamed from: k */
    private static volatile bxxk f147155k;

    /* renamed from: a */
    public int f147156a;

    /* renamed from: b */
    public String f147157b = "";

    /* renamed from: c */
    public String f147158c = "";

    /* renamed from: d */
    public String f147159d = "";

    /* renamed from: e */
    public String f147160e = "";

    /* renamed from: f */
    public String f147161f = "";

    /* renamed from: g */
    public bxww f147162g = bxww.f165013b;

    /* renamed from: h */
    public bxwc f147163h = bxxn.f165040b;

    /* renamed from: i */
    public boolean f147164i;

    static {
        bsuo bsuo = new bsuo();
        f147154j = bsuo;
        GeneratedMessageLite.m124024a(bsuo.class, bsuo);
    }

    private bsuo() {
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
            return GeneratedMessageLite.m124022a(f147154j, "\u0001\b\u0000\u0001\u0001\b\b\u0001\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003ဈ\u0001\u0004ဈ\u0003\u0005ဈ\u0004\u00062\u0007\u001a\bဇ\u0005", new Object[]{"a", "b", "d", "c", "e", "f", "g", bsun.f147153a, "h", "i"});
        } else if (i2 == 3) {
            return new bsuo();
        } else {
            if (i2 == 4) {
                return new bsum();
            }
            if (i2 == 5) {
                return f147154j;
            }
            bxxk bxxk = f147155k;
            if (bxxk == null) {
                synchronized (bsuo.class) {
                    bxxk = f147155k;
                    if (bxxk == null) {
                        bxxk = new bxve(f147154j);
                        f147155k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
