package p000;

/* renamed from: bstq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bstq extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bstq f147044a;

    /* renamed from: b */
    private static volatile bxxk f147045b;

    static {
        bstq bstq = new bstq();
        f147044a = bstq;
        GeneratedMessageLite.m124024a(bstq.class, bstq);
    }

    private bstq() {
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
            return GeneratedMessageLite.m124022a(f147044a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bstq();
        }
        if (i2 == 4) {
            return new bxvd(f147044a);
        }
        if (i2 == 5) {
            return f147044a;
        }
        bxxk bxxk = f147045b;
        if (bxxk == null) {
            synchronized (bstq.class) {
                bxxk = f147045b;
                if (bxxk == null) {
                    bxxk = new bxve(f147044a);
                    f147045b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
