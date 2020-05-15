package p000;

/* renamed from: abqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abqe extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final abqe f57949g;

    /* renamed from: h */
    private static volatile bxxk f57950h;

    /* renamed from: a */
    public int f57951a;

    /* renamed from: b */
    public int f57952b;

    /* renamed from: c */
    public String f57953c = "";

    /* renamed from: d */
    public int f57954d = 1;

    /* renamed from: e */
    public bxwc f57955e = bxxn.f165040b;

    /* renamed from: f */
    public long f57956f;

    static {
        abqe abqe = new abqe();
        f57949g = abqe;
        GeneratedMessageLite.m124024a(abqe.class, abqe);
    }

    private abqe() {
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
            return GeneratedMessageLite.m124022a(f57949g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဋ\u0002\u0004\u001b\u0006ဃ\u0003", new Object[]{"a", "b", "c", "d", "e", abqd.class, "f"});
        } else if (i2 == 3) {
            return new abqe();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null, (char[][]) null);
            }
            if (i2 == 5) {
                return f57949g;
            }
            bxxk bxxk = f57950h;
            if (bxxk == null) {
                synchronized (abqe.class) {
                    bxxk = f57950h;
                    if (bxxk == null) {
                        bxxk = new bxve(f57949g);
                        f57950h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo32283a() {
        if (!this.f57955e.mo73666a()) {
            this.f57955e = GeneratedMessageLite.m124021a(this.f57955e);
        }
    }
}
