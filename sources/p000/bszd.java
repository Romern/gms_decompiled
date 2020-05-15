package p000;

/* renamed from: bszd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bszd extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bszd f147794h;

    /* renamed from: i */
    private static volatile bxxk f147795i;

    /* renamed from: a */
    public int f147796a;

    /* renamed from: b */
    public String f147797b = "";

    /* renamed from: c */
    public bzrv f147798c;

    /* renamed from: d */
    public bzrv f147799d;

    /* renamed from: e */
    public String f147800e;

    /* renamed from: f */
    public int f147801f;

    /* renamed from: g */
    public String f147802g;

    static {
        bszd bszd = new bszd();
        f147794h = bszd;
        bxvk.m124024a(bszd.class, bszd);
    }

    private bszd() {
        bxxn bxxn = bxxn.f165040b;
        this.f147800e = "";
        this.f147802g = "";
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
            return bxvk.m124022a(f147794h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဈ\u0003\u0007ဋ\u0005\bဈ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bszd();
        } else {
            if (i2 == 4) {
                return new bxvd(f147794h);
            }
            if (i2 == 5) {
                return f147794h;
            }
            bxxk bxxk = f147795i;
            if (bxxk == null) {
                synchronized (bszd.class) {
                    bxxk = f147795i;
                    if (bxxk == null) {
                        bxxk = new bxve(f147794h);
                        f147795i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
