package p000;

/* renamed from: byrv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byrv extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final byrv f167517d;

    /* renamed from: f */
    private static volatile bxxk f167518f;

    /* renamed from: a */
    public int f167519a;

    /* renamed from: b */
    public int f167520b;

    /* renamed from: c */
    public int f167521c;

    /* renamed from: e */
    private byte f167522e = 2;

    static {
        byrv byrv = new byrv();
        f167517d = byrv;
        GeneratedMessageLite.m124024a(byrv.class, byrv);
    }

    private byrv() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m125232a(byrv byrv) {
        byrv.f167519a |= 2;
        byrv.f167521c = 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f167522e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f167522e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f167517d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔌ\u0000\u0002င\u0001", new Object[]{"a", "b", byrw.f167523a, "c"});
        } else if (i2 == 3) {
            return new byrv();
        } else {
            if (i2 == 4) {
                return new bxvd(f167517d);
            }
            if (i2 == 5) {
                return f167517d;
            }
            bxxk bxxk = f167518f;
            if (bxxk == null) {
                synchronized (byrv.class) {
                    bxxk = f167518f;
                    if (bxxk == null) {
                        bxxk = new bxve(f167517d);
                        f167518f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
