package p000;

/* renamed from: bsub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsub extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bsub f147101b;

    /* renamed from: c */
    private static volatile bxxk f147102c;

    /* renamed from: a */
    public String f147103a = "";

    static {
        bsub bsub = new bsub();
        f147101b = bsub;
        GeneratedMessageLite.m124024a(bsub.class, bsub);
    }

    private bsub() {
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
            return GeneratedMessageLite.m124022a(f147101b, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0000\u0000\u0003Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bsub();
        } else {
            if (i2 == 4) {
                return new bxvd(f147101b);
            }
            if (i2 == 5) {
                return f147101b;
            }
            bxxk bxxk = f147102c;
            if (bxxk == null) {
                synchronized (bsub.class) {
                    bxxk = f147102c;
                    if (bxxk == null) {
                        bxxk = new bxve(f147101b);
                        f147102c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
