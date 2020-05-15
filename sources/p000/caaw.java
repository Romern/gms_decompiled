package p000;

/* renamed from: caaw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caaw extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final caaw f172379i;

    /* renamed from: j */
    private static volatile bxxk f172380j;

    /* renamed from: a */
    public int f172381a;

    /* renamed from: b */
    public int f172382b;

    /* renamed from: c */
    public double f172383c;

    /* renamed from: d */
    public String f172384d = "";

    /* renamed from: e */
    public bxww f172385e = bxww.f165013b;

    /* renamed from: f */
    public bxvt f172386f = bxvm.f164965b;

    /* renamed from: g */
    public bxvs f172387g = bxuz.f164939b;

    /* renamed from: h */
    public ByteString f172388h = ByteString.f164797b;

    static {
        caaw caaw = new caaw();
        f172379i = caaw;
        GeneratedMessageLite.m124024a(caaw.class, caaw);
    }

    private caaw() {
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
            return GeneratedMessageLite.m124022a(f172379i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0001\u0002\u0000\u0001င\u0000\u0002က\u0001\u0003ဈ\u0002\u00042\u0005\u0016\u0006\u0013\u0007ည\u0003", new Object[]{"a", "b", "c", "d", "e", caav.f172378a, "f", "g", "h"});
        } else if (i2 == 3) {
            return new caaw();
        } else {
            if (i2 == 4) {
                return new caau();
            }
            if (i2 == 5) {
                return f172379i;
            }
            bxxk bxxk = f172380j;
            if (bxxk == null) {
                synchronized (caaw.class) {
                    bxxk = f172380j;
                    if (bxxk == null) {
                        bxxk = new bxve(f172379i);
                        f172380j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: c */
    public final bxww mo74604c() {
        bxww bxww = this.f172385e;
        if (!bxww.f165014a) {
            this.f172385e = bxww.mo74203a();
        }
        return this.f172385e;
    }
}
