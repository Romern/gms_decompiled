package p000;

/* renamed from: bszt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bszt extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bszt f147886f;

    /* renamed from: g */
    private static volatile bxxk f147887g;

    /* renamed from: a */
    public int f147888a;

    /* renamed from: b */
    public boolean f147889b;

    /* renamed from: c */
    public String f147890c = "";

    /* renamed from: d */
    public String f147891d = "";

    /* renamed from: e */
    public int f147892e;

    static {
        bszt bszt = new bszt();
        f147886f = bszt;
        bxvk.m124024a(bszt.class, bszt);
    }

    private bszt() {
        bxvm bxvm = bxvm.f164965b;
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
            return bxvk.m124022a(f147886f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002\u0007\u0003Ȉ\u0004Ȉ\u0005\u0004", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bszt();
        } else {
            if (i2 == 4) {
                return new bxvd(f147886f);
            }
            if (i2 == 5) {
                return f147886f;
            }
            bxxk bxxk = f147887g;
            if (bxxk == null) {
                synchronized (bszt.class) {
                    bxxk = f147887g;
                    if (bxxk == null) {
                        bxxk = new bxve(f147886f);
                        f147887g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
