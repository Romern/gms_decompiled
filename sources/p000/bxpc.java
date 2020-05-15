package p000;

/* renamed from: bxpc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxpc extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bxpc f164232g;

    /* renamed from: h */
    private static volatile bxxk f164233h;

    /* renamed from: a */
    public int f164234a;

    /* renamed from: b */
    public String f164235b = "";

    /* renamed from: c */
    public bxpb f164236c;

    /* renamed from: d */
    public bxvt f164237d = bxvm.f164965b;

    /* renamed from: e */
    public bxok f164238e;

    /* renamed from: f */
    public boolean f164239f;

    static {
        bxpc bxpc = new bxpc();
        f164232g = bxpc;
        GeneratedMessageLite.m124024a(bxpc.class, bxpc);
    }

    private bxpc() {
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
            return GeneratedMessageLite.m124022a(f164232g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003\u001e\u0004ဉ\u0002\u0005ဇ\u0003", new Object[]{"a", "b", "c", "d", bxqc.m122976b(), "e", "f"});
        } else if (i2 == 3) {
            return new bxpc();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (int[][][]) null);
            }
            if (i2 == 5) {
                return f164232g;
            }
            bxxk bxxk = f164233h;
            if (bxxk == null) {
                synchronized (bxpc.class) {
                    bxxk = f164233h;
                    if (bxxk == null) {
                        bxxk = new bxve(f164232g);
                        f164233h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo73599a() {
        if (!this.f164237d.mo73666a()) {
            this.f164237d = GeneratedMessageLite.m124019a(this.f164237d);
        }
    }
}
