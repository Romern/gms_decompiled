package p000;

/* renamed from: btal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btal extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final btal f147995i;

    /* renamed from: j */
    private static volatile bxxk f147996j;

    /* renamed from: a */
    public String f147997a = "";

    /* renamed from: b */
    public String f147998b = "";

    /* renamed from: c */
    public String f147999c = "";

    /* renamed from: d */
    public long f148000d;

    /* renamed from: e */
    public String f148001e = "";

    /* renamed from: f */
    public String f148002f = "";

    /* renamed from: g */
    public long f148003g;

    /* renamed from: h */
    public int f148004h;

    static {
        btal btal = new btal();
        f147995i = btal;
        GeneratedMessageLite.m124024a(btal.class, btal);
    }

    private btal() {
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
            return GeneratedMessageLite.m124022a(f147995i, "\u0000\b\u0000\u0000\u0001\r\b\u0000\u0000\u0000\u0001Ȉ\u0003Ȉ\u0004Ȉ\u0006\u0002\bȈ\nȈ\f\u0002\r\u0004", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new btal();
        } else {
            if (i2 == 4) {
                return new bxvd(f147995i);
            }
            if (i2 == 5) {
                return f147995i;
            }
            bxxk bxxk = f147996j;
            if (bxxk == null) {
                synchronized (btal.class) {
                    bxxk = f147996j;
                    if (bxxk == null) {
                        bxxk = new bxve(f147995i);
                        f147996j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
