package p000;

/* renamed from: bsvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsvj extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final bsvj f147277k;

    /* renamed from: l */
    private static volatile bxxk f147278l;

    /* renamed from: a */
    public int f147279a;

    /* renamed from: b */
    public bswh f147280b;

    /* renamed from: c */
    public String f147281c = "";

    /* renamed from: d */
    public bxwc f147282d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f147283e = bxxn.f165040b;

    /* renamed from: f */
    public bsxz f147284f;

    /* renamed from: g */
    public bzrt f147285g;

    /* renamed from: h */
    public boolean f147286h;

    /* renamed from: i */
    public bsxn f147287i;

    /* renamed from: j */
    public bxwc f147288j = bxxn.f165040b;

    static {
        bsvj bsvj = new bsvj();
        f147277k = bsvj;
        GeneratedMessageLite.m124024a(bsvj.class, bsvj);
    }

    private bsvj() {
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
            return GeneratedMessageLite.m124022a(f147277k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0003\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003\u001a\u0004\u001a\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဇ\u0004\bဉ\u0005\t\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", bsyc.class});
        } else if (i2 == 3) {
            return new bsvj();
        } else {
            if (i2 == 4) {
                return new bxvd(f147277k);
            }
            if (i2 == 5) {
                return f147277k;
            }
            bxxk bxxk = f147278l;
            if (bxxk == null) {
                synchronized (bsvj.class) {
                    bxxk = f147278l;
                    if (bxxk == null) {
                        bxxk = new bxve(f147277k);
                        f147278l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
