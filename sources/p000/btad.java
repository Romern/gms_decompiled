package p000;

/* renamed from: btad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btad extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final btad f147938g;

    /* renamed from: h */
    private static volatile bxxk f147939h;

    /* renamed from: a */
    public bygc f147940a;

    /* renamed from: b */
    public int f147941b;

    /* renamed from: c */
    public String f147942c = "";

    /* renamed from: d */
    public long f147943d;

    /* renamed from: e */
    public int f147944e;

    /* renamed from: f */
    public String f147945f = "";

    static {
        btad btad = new btad();
        f147938g = btad;
        GeneratedMessageLite.m124024a(btad.class, btad);
    }

    private btad() {
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
            return GeneratedMessageLite.m124022a(f147938g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0002\f\u0003Ȉ\u0004\u0002\u0005\u0004\u0006Ȉ", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new btad();
        } else {
            if (i2 == 4) {
                return new bxvd(f147938g);
            }
            if (i2 == 5) {
                return f147938g;
            }
            bxxk bxxk = f147939h;
            if (bxxk == null) {
                synchronized (btad.class) {
                    bxxk = f147939h;
                    if (bxxk == null) {
                        bxxk = new bxve(f147938g);
                        f147939h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
