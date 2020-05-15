package p000;

/* renamed from: caef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caef extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final caef f172809f;

    /* renamed from: g */
    private static volatile bxxk f172810g;

    /* renamed from: a */
    public int f172811a;

    /* renamed from: b */
    public String f172812b = "";

    /* renamed from: c */
    public String f172813c = "";

    /* renamed from: d */
    public bxwc f172814d = bxxn.f165040b;

    /* renamed from: e */
    public caeb f172815e;

    static {
        caef caef = new caef();
        f172809f = caef;
        GeneratedMessageLite.m124024a(caef.class, caef);
    }

    private caef() {
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
            return GeneratedMessageLite.m124022a(f172809f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဉ\u0002", new Object[]{"a", "b", "c", "d", caed.class, "e"});
        } else if (i2 == 3) {
            return new caef();
        } else {
            if (i2 == 4) {
                return new caee();
            }
            if (i2 == 5) {
                return f172809f;
            }
            bxxk bxxk = f172810g;
            if (bxxk == null) {
                synchronized (caef.class) {
                    bxxk = f172810g;
                    if (bxxk == null) {
                        bxxk = new bxve(f172809f);
                        f172810g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: c */
    public final void mo74633c() {
        if (!this.f172814d.mo73666a()) {
            this.f172814d = GeneratedMessageLite.m124021a(this.f172814d);
        }
    }
}
