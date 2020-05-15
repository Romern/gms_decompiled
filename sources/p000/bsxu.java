package p000;

/* renamed from: bsxu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsxu extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bsxu f147617e;

    /* renamed from: f */
    private static volatile bxxk f147618f;

    /* renamed from: a */
    public int f147619a;

    /* renamed from: b */
    public bxwc f147620b = bxxn.f165040b;

    /* renamed from: c */
    public bswf f147621c;

    /* renamed from: d */
    public bswh f147622d;

    static {
        bsxu bsxu = new bsxu();
        f147617e = bsxu;
        bxvk.m124024a(bsxu.class, bsxu);
    }

    private bsxu() {
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
            return bxvk.m124022a(f147617e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"a", "b", bsxv.class, "c", "d"});
        } else if (i2 == 3) {
            return new bsxu();
        } else {
            if (i2 == 4) {
                return new bxvd(f147617e);
            }
            if (i2 == 5) {
                return f147617e;
            }
            bxxk bxxk = f147618f;
            if (bxxk == null) {
                synchronized (bsxu.class) {
                    bxxk = f147618f;
                    if (bxxk == null) {
                        bxxk = new bxve(f147617e);
                        f147618f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
