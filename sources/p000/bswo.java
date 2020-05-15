package p000;

/* renamed from: bswo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bswo extends bxvk implements bxxd {

    /* renamed from: k */
    public static final bswo f147460k;

    /* renamed from: l */
    private static volatile bxxk f147461l;

    /* renamed from: a */
    public int f147462a;

    /* renamed from: b */
    public bswh f147463b;

    /* renamed from: c */
    public String f147464c = "";

    /* renamed from: d */
    public bxwc f147465d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f147466e = bxxn.f165040b;

    /* renamed from: f */
    public bsxz f147467f;

    /* renamed from: g */
    public bswh f147468g;

    /* renamed from: h */
    public bswh f147469h;

    /* renamed from: i */
    public int f147470i;

    /* renamed from: j */
    public bxwc f147471j = bxxn.f165040b;

    static {
        bswo bswo = new bswo();
        f147460k = bswo;
        bxvk.m124024a(bswo.class, bswo);
    }

    private bswo() {
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
            return bxvk.m124022a(f147460k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0003\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003\u001a\u0004\u001a\u0005ဉ\u0002\u0006ဉ\u0003\u0007င\u0005\t\u001b\nဉ\u0004", new Object[]{"a", "b", "c", "d", "e", "f", "g", "i", "j", bsyc.class, "h"});
        } else if (i2 == 3) {
            return new bswo();
        } else {
            if (i2 == 4) {
                return new bxvd(f147460k);
            }
            if (i2 == 5) {
                return f147460k;
            }
            bxxk bxxk = f147461l;
            if (bxxk == null) {
                synchronized (bswo.class) {
                    bxxk = f147461l;
                    if (bxxk == null) {
                        bxxk = new bxve(f147460k);
                        f147461l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
