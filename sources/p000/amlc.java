package p000;

/* renamed from: amlc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amlc extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final amlc f75159h;

    /* renamed from: i */
    private static volatile bxxk f75160i;

    /* renamed from: a */
    public int f75161a;

    /* renamed from: b */
    public int f75162b;

    /* renamed from: c */
    public int f75163c;

    /* renamed from: d */
    public int f75164d;

    /* renamed from: e */
    public long f75165e;

    /* renamed from: f */
    public int f75166f;

    /* renamed from: g */
    public int f75167g;

    static {
        amlc amlc = new amlc();
        f75159h = amlc;
        GeneratedMessageLite.m124024a(amlc.class, amlc);
    }

    private amlc() {
    }

    /* renamed from: a */
    public final int mo41213a() {
        int a = amjr.m62980a(this.f75163c);
        if (a == 0) {
            return 1;
        }
        return a;
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
            return GeneratedMessageLite.m124022a(f75159h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"a", "b", amjo.f75001a, "c", amjq.f75002a, "d", amjn.f75000a, "e", "f", "g"});
        } else if (i2 == 3) {
            return new amlc();
        } else {
            if (i2 == 4) {
                return new bxvd(f75159h);
            }
            if (i2 == 5) {
                return f75159h;
            }
            bxxk bxxk = f75160i;
            if (bxxk == null) {
                synchronized (amlc.class) {
                    bxxk = f75160i;
                    if (bxxk == null) {
                        bxxk = new bxve(f75159h);
                        f75160i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo41214a(int i) {
        this.f75163c = 1;
        this.f75161a |= 2;
    }

    /* renamed from: a */
    public final void mo41215a(long j) {
        this.f75161a |= 8;
        this.f75165e = j;
    }
}
