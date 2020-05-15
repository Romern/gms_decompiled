package p000;

/* renamed from: btac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btac extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final btac f147931d;

    /* renamed from: g */
    private static volatile bxxk f147932g;

    /* renamed from: a */
    public bxwc f147933a = bxxn.f165040b;

    /* renamed from: b */
    public long f147934b;

    /* renamed from: c */
    public int f147935c;

    /* renamed from: e */
    private bszw f147936e;

    /* renamed from: f */
    private byte f147937f = 2;

    static {
        btac btac = new btac();
        f147931d = btac;
        GeneratedMessageLite.m124024a(btac.class, btac);
    }

    private btac() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f147937f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f147937f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f147931d, "\u0000\u0004\u0000\u0000\u0002\u0005\u0004\u0000\u0001\u0001\u0002Л\u0003\t\u0004\u0002\u0005\u0004", new Object[]{"a", btbe.class, "e", "b", "c"});
        } else if (i2 == 3) {
            return new btac();
        } else {
            if (i2 == 4) {
                return new bxvd(f147931d);
            }
            if (i2 == 5) {
                return f147931d;
            }
            bxxk bxxk = f147932g;
            if (bxxk == null) {
                synchronized (btac.class) {
                    bxxk = f147932g;
                    if (bxxk == null) {
                        bxxk = new bxve(f147931d);
                        f147932g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
