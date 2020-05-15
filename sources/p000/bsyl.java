package p000;

/* renamed from: bsyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsyl extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bsyl f147684b;

    /* renamed from: d */
    private static volatile bxxk f147685d;

    /* renamed from: a */
    public int f147686a;

    /* renamed from: c */
    private int f147687c;

    static {
        bsyl bsyl = new bsyl();
        f147684b = bsyl;
        bxvk.m124024a(bsyl.class, bsyl);
    }

    private bsyl() {
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
            return bxvk.m124022a(f147684b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bsyl();
        } else {
            if (i2 == 4) {
                return new bxvd(f147684b);
            }
            if (i2 == 5) {
                return f147684b;
            }
            bxxk bxxk = f147685d;
            if (bxxk == null) {
                synchronized (bsyl.class) {
                    bxxk = f147685d;
                    if (bxxk == null) {
                        bxxk = new bxve(f147684b);
                        f147685d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
