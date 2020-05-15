package p000;

/* renamed from: bsuq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsuq extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bsuq f147170c;

    /* renamed from: d */
    private static volatile bxxk f147171d;

    /* renamed from: a */
    public int f147172a;

    /* renamed from: b */
    public boolean f147173b;

    static {
        bsuq bsuq = new bsuq();
        f147170c = bsuq;
        bxvk.m124024a(bsuq.class, bsuq);
    }

    private bsuq() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f147170c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bsuq();
        } else {
            if (i2 == 4) {
                return new bxvd(f147170c);
            }
            if (i2 == 5) {
                return f147170c;
            }
            bxxk bxxk = f147171d;
            if (bxxk == null) {
                synchronized (bsuq.class) {
                    bxxk = f147171d;
                    if (bxxk == null) {
                        bxxk = new bxve(f147170c);
                        f147171d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
