package p000;

/* renamed from: bsth */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsth extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bsth f147008d;

    /* renamed from: e */
    private static volatile bxxk f147009e;

    /* renamed from: a */
    public String f147010a = "";

    /* renamed from: b */
    public ByteString f147011b = ByteString.f164797b;

    /* renamed from: c */
    public quj f147012c;

    static {
        bsth bsth = new bsth();
        f147008d = bsth;
        GeneratedMessageLite.m124024a(bsth.class, bsth);
    }

    private bsth() {
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
            return GeneratedMessageLite.m124022a(f147008d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0004\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bsth();
        } else {
            if (i2 == 4) {
                return new bxvd(f147008d);
            }
            if (i2 == 5) {
                return f147008d;
            }
            bxxk bxxk = f147009e;
            if (bxxk == null) {
                synchronized (bsth.class) {
                    bxxk = f147009e;
                    if (bxxk == null) {
                        bxxk = new bxve(f147008d);
                        f147009e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
