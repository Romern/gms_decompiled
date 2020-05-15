package p000;

/* renamed from: bsvq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsvq extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bsvq f147320e;

    /* renamed from: f */
    private static volatile bxxk f147321f;

    /* renamed from: a */
    public int f147322a;

    /* renamed from: b */
    public bswh f147323b;

    /* renamed from: c */
    public String f147324c = "";

    /* renamed from: d */
    public bsxn f147325d;

    static {
        bsvq bsvq = new bsvq();
        f147320e = bsvq;
        GeneratedMessageLite.m124024a(bsvq.class, bsvq);
    }

    private bsvq() {
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
            return GeneratedMessageLite.m124022a(f147320e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bsvq();
        } else {
            if (i2 == 4) {
                return new bxvd(f147320e);
            }
            if (i2 == 5) {
                return f147320e;
            }
            bxxk bxxk = f147321f;
            if (bxxk == null) {
                synchronized (bsvq.class) {
                    bxxk = f147321f;
                    if (bxxk == null) {
                        bxxk = new bxve(f147320e);
                        f147321f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
