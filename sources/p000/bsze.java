package p000;

/* renamed from: bsze */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsze extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bsze f147803f;

    /* renamed from: g */
    private static volatile bxxk f147804g;

    /* renamed from: a */
    public int f147805a;

    /* renamed from: b */
    public bzrv f147806b;

    /* renamed from: c */
    public String f147807c = "";

    /* renamed from: d */
    public int f147808d;

    /* renamed from: e */
    public String f147809e;

    static {
        bsze bsze = new bsze();
        f147803f = bsze;
        bxvk.m124024a(bsze.class, bsze);
    }

    private bsze() {
        bxvm bxvm = bxvm.f164965b;
        this.f147809e = "";
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
            return bxvk.m124022a(f147803f, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဈ\u0002\u0006ဋ\u0003\u0007ဈ\u0004", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bsze();
        } else {
            if (i2 == 4) {
                return new bxvd(f147803f);
            }
            if (i2 == 5) {
                return f147803f;
            }
            bxxk bxxk = f147804g;
            if (bxxk == null) {
                synchronized (bsze.class) {
                    bxxk = f147804g;
                    if (bxxk == null) {
                        bxxk = new bxve(f147803f);
                        f147804g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
