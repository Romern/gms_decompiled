package p000;

/* renamed from: koy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class koy extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final koy f24646c;

    /* renamed from: d */
    private static volatile bxxk f24647d;

    /* renamed from: a */
    public int f24648a;

    /* renamed from: b */
    public String f24649b = "";

    static {
        koy koy = new koy();
        f24646c = koy;
        GeneratedMessageLite.m124024a(koy.class, koy);
    }

    private koy() {
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
            return GeneratedMessageLite.m124022a(f24646c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new koy();
        } else {
            if (i2 == 4) {
                return new bxvd(f24646c);
            }
            if (i2 == 5) {
                return f24646c;
            }
            bxxk bxxk = f24647d;
            if (bxxk == null) {
                synchronized (koy.class) {
                    bxxk = f24647d;
                    if (bxxk == null) {
                        bxxk = new bxve(f24646c);
                        f24647d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
