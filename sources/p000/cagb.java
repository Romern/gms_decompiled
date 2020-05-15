package p000;

/* renamed from: cagb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cagb extends bxvk implements bxxd {

    /* renamed from: e */
    public static final cagb f173068e;

    /* renamed from: g */
    private static volatile bxxk f173069g;

    /* renamed from: a */
    public int f173070a;

    /* renamed from: b */
    public int f173071b;

    /* renamed from: c */
    public cafx f173072c;

    /* renamed from: d */
    public long f173073d;

    /* renamed from: f */
    private byte f173074f = 2;

    static {
        cagb cagb = new cagb();
        f173068e = cagb;
        bxvk.m124024a(cagb.class, cagb);
    }

    private cagb() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f173074f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f173074f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f173068e, "\u0001\u0003\u0000\u0001\u0001\f\u0003\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐉ\u0003\fဂ\u0011", new Object[]{"a", "b", caga.f173067a, "c", "d"});
        } else if (i2 == 3) {
            return new cagb();
        } else {
            if (i2 == 4) {
                return new bxvd(f173068e);
            }
            if (i2 == 5) {
                return f173068e;
            }
            bxxk bxxk = f173069g;
            if (bxxk == null) {
                synchronized (cagb.class) {
                    bxxk = f173069g;
                    if (bxxk == null) {
                        bxxk = new bxve(f173068e);
                        f173069g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
