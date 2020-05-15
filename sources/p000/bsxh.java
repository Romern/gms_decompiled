package p000;

/* renamed from: bsxh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsxh extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bsxh f147551g;

    /* renamed from: h */
    private static volatile bxxk f147552h;

    /* renamed from: a */
    public int f147553a;

    /* renamed from: b */
    public long f147554b;

    /* renamed from: c */
    public String f147555c = "";

    /* renamed from: d */
    public bsxe f147556d;

    /* renamed from: e */
    public String f147557e = "";

    /* renamed from: f */
    public bsxn f147558f;

    static {
        bsxh bsxh = new bsxh();
        f147551g = bsxh;
        GeneratedMessageLite.m124024a(bsxh.class, bsxh);
    }

    private bsxh() {
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
            return GeneratedMessageLite.m124022a(f147551g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bsxh();
        } else {
            if (i2 == 4) {
                return new bxvd(f147551g);
            }
            if (i2 == 5) {
                return f147551g;
            }
            bxxk bxxk = f147552h;
            if (bxxk == null) {
                synchronized (bsxh.class) {
                    bxxk = f147552h;
                    if (bxxk == null) {
                        bxxk = new bxve(f147551g);
                        f147552h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
