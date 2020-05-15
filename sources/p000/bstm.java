package p000;

/* renamed from: bstm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bstm extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bstm f147030b;

    /* renamed from: c */
    private static volatile bxxk f147031c;

    /* renamed from: a */
    public String f147032a = "";

    static {
        bstm bstm = new bstm();
        f147030b = bstm;
        bxvk.m124024a(bstm.class, bstm);
    }

    private bstm() {
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
            return bxvk.m124022a(f147030b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bstm();
        } else {
            if (i2 == 4) {
                return new bxvd(f147030b);
            }
            if (i2 == 5) {
                return f147030b;
            }
            bxxk bxxk = f147031c;
            if (bxxk == null) {
                synchronized (bstm.class) {
                    bxxk = f147031c;
                    if (bxxk == null) {
                        bxxk = new bxve(f147030b);
                        f147031c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
