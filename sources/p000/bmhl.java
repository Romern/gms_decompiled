package p000;

/* renamed from: bmhl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmhl extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bmhl f129444f;

    /* renamed from: g */
    private static volatile bxxk f129445g;

    /* renamed from: a */
    public int f129446a;

    /* renamed from: b */
    public String f129447b = "";

    /* renamed from: c */
    public ByteString f129448c = ByteString.f164797b;

    /* renamed from: d */
    public bxwc f129449d = bxxn.f165040b;

    /* renamed from: e */
    public String f129450e = "";

    static {
        bmhl bmhl = new bmhl();
        f129444f = bmhl;
        GeneratedMessageLite.m124024a(bmhl.class, bmhl);
    }

    private bmhl() {
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
            return GeneratedMessageLite.m124022a(f129444f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003\u001b\u0004ဈ\u0002", new Object[]{"a", "b", "c", "d", bmhd.class, "e"});
        } else if (i2 == 3) {
            return new bmhl();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null, (byte[][]) null);
            }
            if (i2 == 5) {
                return f129444f;
            }
            bxxk bxxk = f129445g;
            if (bxxk == null) {
                synchronized (bmhl.class) {
                    bxxk = f129445g;
                    if (bxxk == null) {
                        bxxk = new bxve(f129444f);
                        f129445g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo66793a() {
        if (!this.f129449d.mo73666a()) {
            this.f129449d = GeneratedMessageLite.m124021a(this.f129449d);
        }
    }
}
