package p000;

/* renamed from: bsvn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsvn extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bsvn f147304i;

    /* renamed from: j */
    private static volatile bxxk f147305j;

    /* renamed from: a */
    public int f147306a;

    /* renamed from: b */
    public String f147307b = "";

    /* renamed from: c */
    public String f147308c = "";

    /* renamed from: d */
    public String f147309d = "";

    /* renamed from: e */
    public String f147310e = "";

    /* renamed from: f */
    public String f147311f = "";

    /* renamed from: g */
    public String f147312g = "";

    /* renamed from: h */
    public String f147313h = "";

    static {
        bsvn bsvn = new bsvn();
        f147304i = bsvn;
        bxvk.m124024a(bsvn.class, bsvn);
    }

    private bsvn() {
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
            return bxvk.m124022a(f147304i, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0003\u0004ဈ\u0004\tဈ\u0005\nဈ\u0006\u000bဈ\u0002", new Object[]{"a", "b", "c", "e", "f", "g", "h", "d"});
        } else if (i2 == 3) {
            return new bsvn();
        } else {
            if (i2 == 4) {
                return new bxvd(f147304i);
            }
            if (i2 == 5) {
                return f147304i;
            }
            bxxk bxxk = f147305j;
            if (bxxk == null) {
                synchronized (bsvn.class) {
                    bxxk = f147305j;
                    if (bxxk == null) {
                        bxxk = new bxve(f147304i);
                        f147305j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
