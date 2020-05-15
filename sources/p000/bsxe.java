package p000;

/* renamed from: bsxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsxe extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bsxe f147538c;

    /* renamed from: d */
    private static volatile bxxk f147539d;

    /* renamed from: a */
    public int f147540a = 0;

    /* renamed from: b */
    public Object f147541b;

    static {
        bsxe bsxe = new bsxe();
        f147538c = bsxe;
        GeneratedMessageLite.m124024a(bsxe.class, bsxe);
    }

    private bsxe() {
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
            return GeneratedMessageLite.m124022a(f147538c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", bsxg.class, bsxi.class});
        } else if (i2 == 3) {
            return new bsxe();
        } else {
            if (i2 == 4) {
                return new bxvd(f147538c);
            }
            if (i2 == 5) {
                return f147538c;
            }
            bxxk bxxk = f147539d;
            if (bxxk == null) {
                synchronized (bsxe.class) {
                    bxxk = f147539d;
                    if (bxxk == null) {
                        bxxk = new bxve(f147538c);
                        f147539d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
