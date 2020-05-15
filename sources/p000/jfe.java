package p000;

/* renamed from: jfe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jfe extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final jfe f22359b;

    /* renamed from: e */
    private static volatile bxxk f22360e;

    /* renamed from: a */
    public String f22361a = "";

    /* renamed from: c */
    private int f22362c;

    /* renamed from: d */
    private byte f22363d = 2;

    static {
        jfe jfe = new jfe();
        f22359b = jfe;
        GeneratedMessageLite.m124024a(jfe.class, jfe);
    }

    private jfe() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f22363d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f22363d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f22359b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔈ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new jfe();
        } else {
            if (i2 == 4) {
                return new bxvd(f22359b);
            }
            if (i2 == 5) {
                return f22359b;
            }
            bxxk bxxk = f22360e;
            if (bxxk == null) {
                synchronized (jfe.class) {
                    bxxk = f22360e;
                    if (bxxk == null) {
                        bxxk = new bxve(f22359b);
                        f22360e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
