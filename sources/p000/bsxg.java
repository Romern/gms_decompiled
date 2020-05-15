package p000;

/* renamed from: bsxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsxg extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bsxg f147545e;

    /* renamed from: f */
    private static volatile bxxk f147546f;

    /* renamed from: a */
    public int f147547a;

    /* renamed from: b */
    public bswh f147548b;

    /* renamed from: c */
    public String f147549c = "";

    /* renamed from: d */
    public String f147550d = "";

    static {
        bsxg bsxg = new bsxg();
        f147545e = bsxg;
        GeneratedMessageLite.m124024a(bsxg.class, bsxg);
    }

    private bsxg() {
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
            return GeneratedMessageLite.m124022a(f147545e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bsxg();
        } else {
            if (i2 == 4) {
                return new bxvd(f147545e);
            }
            if (i2 == 5) {
                return f147545e;
            }
            bxxk bxxk = f147546f;
            if (bxxk == null) {
                synchronized (bsxg.class) {
                    bxxk = f147546f;
                    if (bxxk == null) {
                        bxxk = new bxve(f147545e);
                        f147546f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
