package p000;

/* renamed from: bsua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsua extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bsua f147094f;

    /* renamed from: g */
    private static volatile bxxk f147095g;

    /* renamed from: a */
    public String f147096a = "";

    /* renamed from: b */
    public String f147097b = "";

    /* renamed from: c */
    public ByteString f147098c = ByteString.f164797b;

    /* renamed from: d */
    public qui f147099d;

    /* renamed from: e */
    public bsub f147100e;

    static {
        bsua bsua = new bsua();
        f147094f = bsua;
        GeneratedMessageLite.m124024a(bsua.class, bsua);
    }

    private bsua() {
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
            return GeneratedMessageLite.m124022a(f147094f, "\u0000\u0005\u0000\u0000\u0001\b\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0005\n\u0006\t\b\t", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bsua();
        } else {
            if (i2 == 4) {
                return new bxvd(f147094f);
            }
            if (i2 == 5) {
                return f147094f;
            }
            bxxk bxxk = f147095g;
            if (bxxk == null) {
                synchronized (bsua.class) {
                    bxxk = f147095g;
                    if (bxxk == null) {
                        bxxk = new bxve(f147094f);
                        f147095g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
