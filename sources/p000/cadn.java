package p000;

/* renamed from: cadn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cadn extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final cadn f172699j;

    /* renamed from: k */
    private static volatile bxxk f172700k;

    /* renamed from: a */
    public int f172701a;

    /* renamed from: b */
    public long f172702b;

    /* renamed from: c */
    public long f172703c;

    /* renamed from: d */
    public bxwc f172704d = bxxn.f165040b;

    /* renamed from: e */
    public caae f172705e;

    /* renamed from: f */
    public caae f172706f;

    /* renamed from: g */
    public long f172707g;

    /* renamed from: h */
    public long f172708h;

    /* renamed from: i */
    public ByteString f172709i = ByteString.f164797b;

    static {
        cadn cadn = new cadn();
        f172699j = cadn;
        GeneratedMessageLite.m124024a(cadn.class, cadn);
    }

    private cadn() {
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
            return GeneratedMessageLite.m124022a(f172699j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003\u001b\u0005ဉ\u0002\u0007ဉ\u0003\bဂ\u0004\tဂ\u0005\nည\u0006", new Object[]{"a", "b", "c", "d", caaw.class, "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new cadn();
        } else {
            if (i2 == 4) {
                return new cadm();
            }
            if (i2 == 5) {
                return f172699j;
            }
            bxxk bxxk = f172700k;
            if (bxxk == null) {
                synchronized (cadn.class) {
                    bxxk = f172700k;
                    if (bxxk == null) {
                        bxxk = new bxve(f172699j);
                        f172700k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: c */
    public final void mo74615c() {
        if (!this.f172704d.mo73666a()) {
            this.f172704d = GeneratedMessageLite.m124021a(this.f172704d);
        }
    }
}
