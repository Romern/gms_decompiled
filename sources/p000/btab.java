package p000;

/* renamed from: btab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btab extends bxvk implements bxxd {

    /* renamed from: l */
    public static final btab f147917l;

    /* renamed from: n */
    private static volatile bxxk f147918n;

    /* renamed from: a */
    public String f147919a = "";

    /* renamed from: b */
    public bxwc f147920b = bxxn.f165040b;

    /* renamed from: c */
    public bszw f147921c;

    /* renamed from: d */
    public String f147922d = "";

    /* renamed from: e */
    public String f147923e = "";

    /* renamed from: f */
    public long f147924f;

    /* renamed from: g */
    public bszz f147925g;

    /* renamed from: h */
    public bszm f147926h;

    /* renamed from: i */
    public long f147927i;

    /* renamed from: j */
    public int f147928j;

    /* renamed from: k */
    public bszn f147929k;

    /* renamed from: m */
    private byte f147930m = 2;

    static {
        btab btab = new btab();
        f147917l = btab;
        bxvk.m124024a(btab.class, btab);
    }

    private btab() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f147930m);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f147930m = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f147917l, "\u0000\u000b\u0000\u0000\u0001\f\u000b\u0000\u0001\u0001\u0001Ȉ\u0002Л\u0003\t\u0004Ȉ\u0005Ȉ\u0006\u0002\u0007\t\b\t\n\u0002\u000b\u0004\f\t", new Object[]{"a", "b", btbe.class, "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i2 == 3) {
            return new btab();
        } else {
            if (i2 == 4) {
                return new btaa();
            }
            if (i2 == 5) {
                return f147917l;
            }
            bxxk bxxk = f147918n;
            if (bxxk == null) {
                synchronized (btab.class) {
                    bxxk = f147918n;
                    if (bxxk == null) {
                        bxxk = new bxve(f147917l);
                        f147918n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
