package p000;

/* renamed from: bxkl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxkl extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bxkl f163759b;

    /* renamed from: c */
    public static final bxvj f163760c;

    /* renamed from: d */
    private static volatile bxxk f163761d;

    /* renamed from: a */
    public bxwc f163762a = bxxn.f165040b;

    static {
        bxkl bxkl = new bxkl();
        f163759b = bxkl;
        GeneratedMessageLite.m124024a(bxkl.class, bxkl);
        bxcf bxcf = bxcf.f162779a;
        bxkl bxkl2 = f163759b;
        f163760c = GeneratedMessageLite.m124006a(bxcf, bxkl2, bxkl2, 77815057, bxzf.MESSAGE);
    }

    private bxkl() {
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
            return GeneratedMessageLite.m124022a(f163759b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", bxkj.class});
        } else if (i2 == 3) {
            return new bxkl();
        } else {
            if (i2 == 4) {
                return new bxkk();
            }
            if (i2 == 5) {
                return f163759b;
            }
            bxxk bxxk = f163761d;
            if (bxxk == null) {
                synchronized (bxkl.class) {
                    bxxk = f163761d;
                    if (bxxk == null) {
                        bxxk = new bxve(f163759b);
                        f163761d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo73584a() {
        if (!this.f163762a.mo73666a()) {
            this.f163762a = GeneratedMessageLite.m124021a(this.f163762a);
        }
    }
}
