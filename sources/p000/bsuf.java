package p000;

/* renamed from: bsuf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsuf extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bsuf f147117c;

    /* renamed from: d */
    private static volatile bxxk f147118d;

    /* renamed from: a */
    public String f147119a = "";

    /* renamed from: b */
    public bsud f147120b;

    static {
        bsuf bsuf = new bsuf();
        f147117c = bsuf;
        GeneratedMessageLite.m124024a(bsuf.class, bsuf);
    }

    private bsuf() {
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
            return GeneratedMessageLite.m124022a(f147117c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bsuf();
        } else {
            if (i2 == 4) {
                return new bxvd(f147117c);
            }
            if (i2 == 5) {
                return f147117c;
            }
            bxxk bxxk = f147118d;
            if (bxxk == null) {
                synchronized (bsuf.class) {
                    bxxk = f147118d;
                    if (bxxk == null) {
                        bxxk = new bxve(f147117c);
                        f147118d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
