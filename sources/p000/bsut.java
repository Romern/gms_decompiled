package p000;

/* renamed from: bsut */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsut extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bsut f147187e;

    /* renamed from: f */
    private static volatile bxxk f147188f;

    /* renamed from: a */
    public int f147189a;

    /* renamed from: b */
    public int f147190b = 0;

    /* renamed from: c */
    public Object f147191c;

    /* renamed from: d */
    public bsxn f147192d;

    static {
        bsut bsut = new bsut();
        f147187e = bsut;
        GeneratedMessageLite.m124024a(bsut.class, bsut);
    }

    private bsut() {
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
            return GeneratedMessageLite.m124022a(f147187e, "\u0001\u0012\u0001\u0001\u0001\u0013\u0012\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\u000bဉ\u0011\fြ\u0000\rြ\u0000\u000eြ\u0000\u000fြ\u0000\u0010ြ\u0000\u0011ြ\u0000\u0013ြ\u0000", new Object[]{"c", "b", "a", bsvu.class, bswi.class, bsvv.class, bsya.class, bswo.class, bsvi.class, bsym.class, bsuk.class, bsuj.class, bsxb.class, "d", bsxd.class, bsxy.class, bsvt.class, bsvp.class, bswm.class, bsvs.class, bsvr.class});
        } else if (i2 == 3) {
            return new bsut();
        } else {
            if (i2 == 4) {
                return new bxvd(f147187e);
            }
            if (i2 == 5) {
                return f147187e;
            }
            bxxk bxxk = f147188f;
            if (bxxk == null) {
                synchronized (bsut.class) {
                    bxxk = f147188f;
                    if (bxxk == null) {
                        bxxk = new bxve(f147187e);
                        f147188f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
