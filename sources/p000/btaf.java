package p000;

/* renamed from: btaf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btaf extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final btaf f147952j;

    /* renamed from: k */
    private static volatile bxxk f147953k;

    /* renamed from: a */
    public String f147954a = "";

    /* renamed from: b */
    public String f147955b = "";

    /* renamed from: c */
    public String f147956c = "";

    /* renamed from: d */
    public boolean f147957d;

    /* renamed from: e */
    public long f147958e;

    /* renamed from: f */
    public String f147959f = "";

    /* renamed from: g */
    public String f147960g = "";

    /* renamed from: h */
    public long f147961h;

    /* renamed from: i */
    public int f147962i;

    static {
        btaf btaf = new btaf();
        f147952j = btaf;
        GeneratedMessageLite.m124024a(btaf.class, btaf);
    }

    private btaf() {
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
            return GeneratedMessageLite.m124022a(f147952j, "\u0000\t\u0000\u0000\u0001\u0010\t\u0000\u0000\u0000\u0001Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0007\u0007\u0002\fȈ\rȈ\u000f\u0002\u0010\u0004", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new btaf();
        } else {
            if (i2 == 4) {
                return new bxvd(f147952j);
            }
            if (i2 == 5) {
                return f147952j;
            }
            bxxk bxxk = f147953k;
            if (bxxk == null) {
                synchronized (btaf.class) {
                    bxxk = f147953k;
                    if (bxxk == null) {
                        bxxk = new bxve(f147952j);
                        f147953k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
