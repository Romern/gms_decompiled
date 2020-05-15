package p000;

/* renamed from: bsve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsve extends bxvk implements bxxd {

    /* renamed from: m */
    public static final bsve f147234m;

    /* renamed from: n */
    private static volatile bxxk f147235n;

    /* renamed from: a */
    public int f147236a;

    /* renamed from: b */
    public boolean f147237b;

    /* renamed from: c */
    public boolean f147238c;

    /* renamed from: d */
    public boolean f147239d;

    /* renamed from: e */
    public boolean f147240e;

    /* renamed from: f */
    public boolean f147241f;

    /* renamed from: g */
    public boolean f147242g;

    /* renamed from: h */
    public boolean f147243h;

    /* renamed from: i */
    public boolean f147244i;

    /* renamed from: j */
    public boolean f147245j;

    /* renamed from: k */
    public boolean f147246k;

    /* renamed from: l */
    public boolean f147247l;

    static {
        bsve bsve = new bsve();
        f147234m = bsve;
        bxvk.m124024a(bsve.class, bsve);
    }

    private bsve() {
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
            return bxvk.m124022a(f147234m, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nဇ\t\u000bဇ\n\fဇ\u000b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        } else if (i2 == 3) {
            return new bsve();
        } else {
            if (i2 == 4) {
                return new bxvd(f147234m);
            }
            if (i2 == 5) {
                return f147234m;
            }
            bxxk bxxk = f147235n;
            if (bxxk == null) {
                synchronized (bsve.class) {
                    bxxk = f147235n;
                    if (bxxk == null) {
                        bxxk = new bxve(f147234m);
                        f147235n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
