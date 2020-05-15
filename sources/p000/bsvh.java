package p000;

/* renamed from: bsvh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsvh extends GeneratedMessageLite implements bxxd {

    /* renamed from: l */
    public static final bsvh f147251l;

    /* renamed from: q */
    private static volatile bxxk f147252q;

    /* renamed from: a */
    public int f147253a;

    /* renamed from: b */
    public bsxn f147254b;

    /* renamed from: c */
    public bsxn f147255c;

    /* renamed from: d */
    public bsxn f147256d;

    /* renamed from: e */
    public bsxn f147257e;

    /* renamed from: f */
    public bsxn f147258f;

    /* renamed from: g */
    public bsxp f147259g;

    /* renamed from: h */
    public bswk f147260h;

    /* renamed from: i */
    public bsxn f147261i;

    /* renamed from: j */
    public bsxn f147262j;

    /* renamed from: k */
    public bsxn f147263k;

    /* renamed from: m */
    private bsxn f147264m;

    /* renamed from: n */
    private bsxn f147265n;

    /* renamed from: o */
    private bsxn f147266o;

    /* renamed from: p */
    private bsxn f147267p;

    static {
        bsvh bsvh = new bsvh();
        f147251l = bsvh;
        GeneratedMessageLite.m124024a(bsvh.class, bsvh);
    }

    private bsvh() {
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
            return GeneratedMessageLite.m124022a(f147251l, "\u0001\u000e\u0000\u0001\u0001\u0010\u000e\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဉ\u0002\u0006ဉ\u0005\u0007ဉ\u0003\bဉ\u0006\tဉ\t\nဉ\n\u000bဉ\u000b\fဉ\u0007\rဉ\b\u000eဉ\f\u000fဉ\r\u0010ဉ\u000e", new Object[]{"a", "b", "c", "d", "f", "e", "g", "n", "o", "i", "m", "h", "j", "k", "p"});
        } else if (i2 == 3) {
            return new bsvh();
        } else {
            if (i2 == 4) {
                return new bxvd(f147251l);
            }
            if (i2 == 5) {
                return f147251l;
            }
            bxxk bxxk = f147252q;
            if (bxxk == null) {
                synchronized (bsvh.class) {
                    bxxk = f147252q;
                    if (bxxk == null) {
                        bxxk = new bxve(f147251l);
                        f147252q = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
