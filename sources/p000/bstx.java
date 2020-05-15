package p000;

/* renamed from: bstx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bstx extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bstx f147072d;

    /* renamed from: e */
    private static volatile bxxk f147073e;

    /* renamed from: a */
    public String f147074a = "";

    /* renamed from: b */
    public bxwc f147075b = bxxn.f165040b;

    /* renamed from: c */
    public bstz f147076c;

    static {
        bstx bstx = new bstx();
        f147072d = bstx;
        bxvk.m124024a(bstx.class, bstx);
    }

    private bstx() {
        bxtx bxtx = bxtx.f164797b;
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
            return bxvk.m124022a(f147072d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001c\u0003\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bstx();
        } else {
            if (i2 == 4) {
                return new bxvd(f147072d);
            }
            if (i2 == 5) {
                return f147072d;
            }
            bxxk bxxk = f147073e;
            if (bxxk == null) {
                synchronized (bstx.class) {
                    bxxk = f147073e;
                    if (bxxk == null) {
                        bxxk = new bxve(f147072d);
                        f147073e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
