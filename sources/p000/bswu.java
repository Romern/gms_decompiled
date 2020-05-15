package p000;

/* renamed from: bswu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bswu extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bswu f147496f;

    /* renamed from: h */
    private static volatile bxxk f147497h;

    /* renamed from: a */
    public String f147498a = "";

    /* renamed from: b */
    public String f147499b = "";

    /* renamed from: c */
    public bsus f147500c;

    /* renamed from: d */
    public bsus f147501d;

    /* renamed from: e */
    public int f147502e;

    /* renamed from: g */
    private int f147503g;

    static {
        bswu bswu = new bswu();
        f147496f = bswu;
        GeneratedMessageLite.m124024a(bswu.class, bswu);
    }

    private bswu() {
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
            return GeneratedMessageLite.m124022a(f147496f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005င\u0004", new Object[]{"g", "a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bswu();
        } else {
            if (i2 == 4) {
                return new bxvd(f147496f);
            }
            if (i2 == 5) {
                return f147496f;
            }
            bxxk bxxk = f147497h;
            if (bxxk == null) {
                synchronized (bswu.class) {
                    bxxk = f147497h;
                    if (bxxk == null) {
                        bxxk = new bxve(f147496f);
                        f147497h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
