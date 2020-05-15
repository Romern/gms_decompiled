package p000;

/* renamed from: bwmr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwmr extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bxvu f160299d = new bwmp();

    /* renamed from: e */
    public static final bwmr f160300e;

    /* renamed from: f */
    public static final bxvj f160301f;

    /* renamed from: g */
    private static volatile bxxk f160302g;

    /* renamed from: a */
    public int f160303a;

    /* renamed from: b */
    public int f160304b;

    /* renamed from: c */
    public bxvt f160305c = bxvm.f164965b;

    static {
        bwmr bwmr = new bwmr();
        f160300e = bwmr;
        GeneratedMessageLite.m124024a(bwmr.class, bwmr);
        bwog bwog = bwog.f160437f;
        bwmr bwmr2 = f160300e;
        f160301f = GeneratedMessageLite.m124006a(bwog, bwmr2, bwmr2, 260216772, bxzf.MESSAGE);
    }

    private bwmr() {
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
            return GeneratedMessageLite.m124022a(f160300e, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001e", new Object[]{"a", "b", bwmu.m122116b(), "c", bwmu.m122116b()});
        } else if (i2 == 3) {
            return new bwmr();
        } else {
            if (i2 == 4) {
                return new bwmq();
            }
            if (i2 == 5) {
                return f160300e;
            }
            bxxk bxxk = f160302g;
            if (bxxk == null) {
                synchronized (bwmr.class) {
                    bxxk = f160302g;
                    if (bxxk == null) {
                        bxxk = new bxve(f160300e);
                        f160302g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo73529a() {
        if (!this.f160305c.mo73666a()) {
            this.f160305c = GeneratedMessageLite.m124019a(this.f160305c);
        }
    }
}
