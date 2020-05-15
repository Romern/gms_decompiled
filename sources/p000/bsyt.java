package p000;

/* renamed from: bsyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsyt extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bsyt f147718a;

    /* renamed from: d */
    private static volatile bxxk f147719d;

    /* renamed from: b */
    private int f147720b;

    /* renamed from: c */
    private bsxn f147721c;

    static {
        bsyt bsyt = new bsyt();
        f147718a = bsyt;
        GeneratedMessageLite.m124024a(bsyt.class, bsyt);
    }

    private bsyt() {
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
            return GeneratedMessageLite.m124022a(f147718a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဉ\u0004", new Object[]{"b", "c"});
        } else if (i2 == 3) {
            return new bsyt();
        } else {
            if (i2 == 4) {
                return new bxvd(f147718a);
            }
            if (i2 == 5) {
                return f147718a;
            }
            bxxk bxxk = f147719d;
            if (bxxk == null) {
                synchronized (bsyt.class) {
                    bxxk = f147719d;
                    if (bxxk == null) {
                        bxxk = new bxve(f147718a);
                        f147719d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
