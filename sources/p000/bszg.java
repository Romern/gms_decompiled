package p000;

/* renamed from: bszg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bszg extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bszg f147814g;

    /* renamed from: h */
    private static volatile bxxk f147815h;

    /* renamed from: a */
    public String f147816a = "";

    /* renamed from: b */
    public String f147817b = "";

    /* renamed from: c */
    public String f147818c = "";

    /* renamed from: d */
    public String f147819d = "";

    /* renamed from: e */
    public String f147820e = "";

    /* renamed from: f */
    public int f147821f;

    static {
        bszg bszg = new bszg();
        f147814g = bszg;
        bxvk.m124024a(bszg.class, bszg);
    }

    private bszg() {
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
            return bxvk.m124022a(f147814g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\f", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bszg();
        } else {
            if (i2 == 4) {
                return new bxvd(f147814g);
            }
            if (i2 == 5) {
                return f147814g;
            }
            bxxk bxxk = f147815h;
            if (bxxk == null) {
                synchronized (bszg.class) {
                    bxxk = f147815h;
                    if (bxxk == null) {
                        bxxk = new bxve(f147814g);
                        f147815h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
