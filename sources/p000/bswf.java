package p000;

/* renamed from: bswf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bswf extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bswf f147388f;

    /* renamed from: g */
    private static volatile bxxk f147389g;

    /* renamed from: a */
    public int f147390a;

    /* renamed from: b */
    public bswh f147391b;

    /* renamed from: c */
    public bswe f147392c;

    /* renamed from: d */
    public bswh f147393d;

    /* renamed from: e */
    public bswd f147394e;

    static {
        bswf bswf = new bswf();
        f147388f = bswf;
        bxvk.m124024a(bswf.class, bswf);
    }

    private bswf() {
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
            return bxvk.m124022a(f147388f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bswf();
        } else {
            if (i2 == 4) {
                return new bxvd(f147388f);
            }
            if (i2 == 5) {
                return f147388f;
            }
            bxxk bxxk = f147389g;
            if (bxxk == null) {
                synchronized (bswf.class) {
                    bxxk = f147389g;
                    if (bxxk == null) {
                        bxxk = new bxve(f147388f);
                        f147389g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
