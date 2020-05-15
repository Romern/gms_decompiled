package p000;

/* renamed from: bswe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bswe extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bswe f147383c;

    /* renamed from: e */
    private static volatile bxxk f147384e;

    /* renamed from: a */
    public String f147385a = "";

    /* renamed from: b */
    public String f147386b = "";

    /* renamed from: d */
    private int f147387d;

    static {
        bswe bswe = new bswe();
        f147383c = bswe;
        bxvk.m124024a(bswe.class, bswe);
    }

    private bswe() {
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
            return bxvk.m124022a(f147383c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bswe();
        } else {
            if (i2 == 4) {
                return new bxvd(f147383c);
            }
            if (i2 == 5) {
                return f147383c;
            }
            bxxk bxxk = f147384e;
            if (bxxk == null) {
                synchronized (bswe.class) {
                    bxxk = f147384e;
                    if (bxxk == null) {
                        bxxk = new bxve(f147383c);
                        f147384e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
