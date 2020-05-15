package p000;

/* renamed from: abtd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abtd extends bxvk implements bxxd {

    /* renamed from: j */
    public static final abtd f58201j;

    /* renamed from: k */
    private static volatile bxxk f58202k;

    /* renamed from: a */
    public int f58203a;

    /* renamed from: b */
    public String f58204b = "";

    /* renamed from: c */
    public String f58205c = "";

    /* renamed from: d */
    public int f58206d;

    /* renamed from: e */
    public int f58207e;

    /* renamed from: f */
    public int f58208f;

    /* renamed from: g */
    public String f58209g = "";

    /* renamed from: h */
    public String f58210h = "";

    /* renamed from: i */
    public String f58211i = "";

    static {
        abtd abtd = new abtd();
        f58201j = abtd;
        bxvk.m124024a(abtd.class, abtd);
    }

    private abtd() {
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
            return bxvk.m124022a(f58201j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0002\u0003င\u0003\u0004င\u0004\u0005ဈ\u0005\u0006ဈ\u0006\u0007ဈ\u0007\bဈ\u0001", new Object[]{"a", "b", "d", "e", "f", "g", "h", "i", "c"});
        } else if (i2 == 3) {
            return new abtd();
        } else {
            if (i2 == 4) {
                return new bxvd(f58201j);
            }
            if (i2 == 5) {
                return f58201j;
            }
            bxxk bxxk = f58202k;
            if (bxxk == null) {
                synchronized (abtd.class) {
                    bxxk = f58202k;
                    if (bxxk == null) {
                        bxxk = new bxve(f58201j);
                        f58202k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
