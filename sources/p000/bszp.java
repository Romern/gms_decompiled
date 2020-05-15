package p000;

/* renamed from: bszp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bszp extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bszp f147875f;

    /* renamed from: g */
    private static volatile bxxk f147876g;

    /* renamed from: a */
    public String f147877a = "";

    /* renamed from: b */
    public String f147878b = "";

    /* renamed from: c */
    public String f147879c = "";

    /* renamed from: d */
    public String f147880d = "";

    /* renamed from: e */
    public bxwc f147881e = bxxn.f165040b;

    static {
        bszp bszp = new bszp();
        f147875f = bszp;
        bxvk.m124024a(bszp.class, bszp);
    }

    private bszp() {
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
            return bxvk.m124022a(f147875f, "\u0000\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0005Ȉ\u0006Ț", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bszp();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (char[][]) null);
            }
            if (i2 == 5) {
                return f147875f;
            }
            bxxk bxxk = f147876g;
            if (bxxk == null) {
                synchronized (bszp.class) {
                    bxxk = f147876g;
                    if (bxxk == null) {
                        bxxk = new bxve(f147875f);
                        f147876g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
