package p000;

/* renamed from: ciwz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciwz extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final ciwz f191633f;

    /* renamed from: g */
    private static volatile bxxk f191634g;

    /* renamed from: a */
    public int f191635a;

    /* renamed from: b */
    public ByteString f191636b = ByteString.f164797b;

    /* renamed from: c */
    public ByteString f191637c = ByteString.f164797b;

    /* renamed from: d */
    public ciwx f191638d;

    /* renamed from: e */
    public bxwc f191639e = bxxn.f165040b;

    static {
        ciwz ciwz = new ciwz();
        f191633f = ciwz;
        GeneratedMessageLite.m124024a(ciwz.class, ciwz);
    }

    private ciwz() {
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
            return GeneratedMessageLite.m124022a(f191633f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ည\u0000\u0002ည\u0001\u0003ဉ\u0002\u0004\u001b", new Object[]{"a", "b", "c", "d", "e", ciwy.class});
        } else if (i2 == 3) {
            return new ciwz();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (boolean[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f191633f;
            }
            bxxk bxxk = f191634g;
            if (bxxk == null) {
                synchronized (ciwz.class) {
                    bxxk = f191634g;
                    if (bxxk == null) {
                        bxxk = new bxve(f191633f);
                        f191634g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: c */
    public final void mo86620c() {
        if (!this.f191639e.mo73666a()) {
            this.f191639e = GeneratedMessageLite.m124021a(this.f191639e);
        }
    }
}
