package p000;

/* renamed from: bsza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsza extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bsza f147779e;

    /* renamed from: f */
    private static volatile bxxk f147780f;

    /* renamed from: a */
    public int f147781a;

    /* renamed from: b */
    public String f147782b = "";

    /* renamed from: c */
    public bxwc f147783c = bxxn.f165040b;

    /* renamed from: d */
    public bsyz f147784d;

    static {
        bsza bsza = new bsza();
        f147779e = bsza;
        GeneratedMessageLite.m124024a(bsza.class, bsza);
    }

    private bsza() {
        bxvm bxvm = bxvm.f164965b;
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
            return GeneratedMessageLite.m124022a(f147779e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0001\u0000\u0002ဈ\u0000\u0003\u001b\u0005ဉ\u0001", new Object[]{"a", "b", "c", bsyy.class, "d"});
        } else if (i2 == 3) {
            return new bsza();
        } else {
            if (i2 == 4) {
                return new bxvd(f147779e);
            }
            if (i2 == 5) {
                return f147779e;
            }
            bxxk bxxk = f147780f;
            if (bxxk == null) {
                synchronized (bsza.class) {
                    bxxk = f147780f;
                    if (bxxk == null) {
                        bxxk = new bxve(f147779e);
                        f147780f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
