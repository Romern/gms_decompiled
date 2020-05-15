package p000;

/* renamed from: bswb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bswb extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bswb f147369d;

    /* renamed from: e */
    private static volatile bxxk f147370e;

    /* renamed from: a */
    public int f147371a;

    /* renamed from: b */
    public bsxk f147372b;

    /* renamed from: c */
    public bxwc f147373c = bxxn.f165040b;

    static {
        bswb bswb = new bswb();
        f147369d = bswb;
        bxvk.m124024a(bswb.class, bswb);
    }

    private bswb() {
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
            return bxvk.m124022a(f147369d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"a", "b", "c", bsxk.class});
        } else if (i2 == 3) {
            return new bswb();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (short[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f147369d;
            }
            bxxk bxxk = f147370e;
            if (bxxk == null) {
                synchronized (bswb.class) {
                    bxxk = f147370e;
                    if (bxxk == null) {
                        bxxk = new bxve(f147369d);
                        f147370e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo70715a() {
        if (!this.f147373c.mo73666a()) {
            this.f147373c = bxvk.m124021a(this.f147373c);
        }
    }
}
