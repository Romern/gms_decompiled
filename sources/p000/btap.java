package p000;

/* renamed from: btap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btap extends bxvk implements bxxd {

    /* renamed from: h */
    public static final btap f148027h;

    /* renamed from: i */
    private static volatile bxxk f148028i;

    /* renamed from: a */
    public bxwc f148029a = bxxn.f165040b;

    /* renamed from: b */
    public long f148030b;

    /* renamed from: c */
    public String f148031c = "";

    /* renamed from: d */
    public String f148032d = "";

    /* renamed from: e */
    public bszh f148033e;

    /* renamed from: f */
    public long f148034f;

    /* renamed from: g */
    public int f148035g;

    static {
        btap btap = new btap();
        f148027h = btap;
        bxvk.m124024a(btap.class, btap);
    }

    private btap() {
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
            return bxvk.m124022a(f148027h, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ț\u0002\u0002\u0003Ȉ\u0004Ȉ\u0005\t\u0006\u0002\u0007\u0004", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new btap();
        } else {
            if (i2 == 4) {
                return new bxvd(f148027h);
            }
            if (i2 == 5) {
                return f148027h;
            }
            bxxk bxxk = f148028i;
            if (bxxk == null) {
                synchronized (btap.class) {
                    bxxk = f148028i;
                    if (bxxk == null) {
                        bxxk = new bxve(f148027h);
                        f148028i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
