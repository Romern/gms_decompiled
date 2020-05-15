package p000;

/* renamed from: bsva */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsva extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bsva f147219b;

    /* renamed from: c */
    private static volatile bxxk f147220c;

    /* renamed from: a */
    public bxwc f147221a = bxxn.f165040b;

    static {
        bsva bsva = new bsva();
        f147219b = bsva;
        GeneratedMessageLite.m124024a(bsva.class, bsva);
    }

    private bsva() {
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
            return GeneratedMessageLite.m124022a(f147219b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bsuv.class});
        } else if (i2 == 3) {
            return new bsva();
        } else {
            if (i2 == 4) {
                return new bxvd(f147219b);
            }
            if (i2 == 5) {
                return f147219b;
            }
            bxxk bxxk = f147220c;
            if (bxxk == null) {
                synchronized (bsva.class) {
                    bxxk = f147220c;
                    if (bxxk == null) {
                        bxxk = new bxve(f147219b);
                        f147220c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
