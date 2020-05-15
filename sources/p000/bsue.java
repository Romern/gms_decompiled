package p000;

/* renamed from: bsue */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsue extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bsue f147113c;

    /* renamed from: d */
    private static volatile bxxk f147114d;

    /* renamed from: a */
    public String f147115a = "";

    /* renamed from: b */
    public bsua f147116b;

    static {
        bsue bsue = new bsue();
        f147113c = bsue;
        GeneratedMessageLite.m124024a(bsue.class, bsue);
    }

    private bsue() {
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
            return GeneratedMessageLite.m124022a(f147113c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bsue();
        } else {
            if (i2 == 4) {
                return new bxvd(f147113c);
            }
            if (i2 == 5) {
                return f147113c;
            }
            bxxk bxxk = f147114d;
            if (bxxk == null) {
                synchronized (bsue.class) {
                    bxxk = f147114d;
                    if (bxxk == null) {
                        bxxk = new bxve(f147113c);
                        f147114d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
