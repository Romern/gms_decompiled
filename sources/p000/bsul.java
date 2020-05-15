package p000;

/* renamed from: bsul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsul extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bsul f147142j;

    /* renamed from: k */
    private static volatile bxxk f147143k;

    /* renamed from: a */
    public int f147144a;

    /* renamed from: b */
    public bswr f147145b;

    /* renamed from: c */
    public bsvb f147146c;

    /* renamed from: d */
    public bswq f147147d;

    /* renamed from: e */
    public bsyq f147148e;

    /* renamed from: f */
    public bsvh f147149f;

    /* renamed from: g */
    public bsxs f147150g;

    /* renamed from: h */
    public bsup f147151h;

    /* renamed from: i */
    public bswz f147152i;

    static {
        bsul bsul = new bsul();
        f147142j = bsul;
        GeneratedMessageLite.m124024a(bsul.class, bsul);
    }

    private bsul() {
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
            return GeneratedMessageLite.m124022a(f147142j, "\u0001\b\u0000\u0001\u0002Ϩ\b\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\bဉ\u0006\tဉ\u0007Ϩဉ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new bsul();
        } else {
            if (i2 == 4) {
                return new bxvd(f147142j);
            }
            if (i2 == 5) {
                return f147142j;
            }
            bxxk bxxk = f147143k;
            if (bxxk == null) {
                synchronized (bsul.class) {
                    bxxk = f147143k;
                    if (bxxk == null) {
                        bxxk = new bxve(f147142j);
                        f147143k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
