package p000;

/* renamed from: bstg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bstg extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bstg f147003d;

    /* renamed from: e */
    private static volatile bxxk f147004e;

    /* renamed from: a */
    public String f147005a = "";

    /* renamed from: b */
    public int f147006b;

    /* renamed from: c */
    public String f147007c = "";

    static {
        bstg bstg = new bstg();
        f147003d = bstg;
        bxvk.m124024a(bstg.class, bstg);
    }

    private bstg() {
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
            return bxvk.m124022a(f147003d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bstg();
        } else {
            if (i2 == 4) {
                return new bxvd(f147003d);
            }
            if (i2 == 5) {
                return f147003d;
            }
            bxxk bxxk = f147004e;
            if (bxxk == null) {
                synchronized (bstg.class) {
                    bxxk = f147004e;
                    if (bxxk == null) {
                        bxxk = new bxve(f147003d);
                        f147004e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
