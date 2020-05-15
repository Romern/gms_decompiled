package p000;

/* renamed from: bswk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bswk extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bswk f147445c;

    /* renamed from: e */
    private static volatile bxxk f147446e;

    /* renamed from: a */
    public int f147447a;

    /* renamed from: b */
    public String f147448b = "";

    /* renamed from: d */
    private bsxn f147449d;

    static {
        bswk bswk = new bswk();
        f147445c = bswk;
        GeneratedMessageLite.m124024a(bswk.class, bswk);
    }

    private bswk() {
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
            return GeneratedMessageLite.m124022a(f147445c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "d"});
        } else if (i2 == 3) {
            return new bswk();
        } else {
            if (i2 == 4) {
                return new bxvd(f147445c);
            }
            if (i2 == 5) {
                return f147445c;
            }
            bxxk bxxk = f147446e;
            if (bxxk == null) {
                synchronized (bswk.class) {
                    bxxk = f147446e;
                    if (bxxk == null) {
                        bxxk = new bxve(f147445c);
                        f147446e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
