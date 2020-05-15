package p000;

/* renamed from: bxyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxyl extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bxyl f165099b;

    /* renamed from: c */
    private static volatile bxxk f165100c;

    /* renamed from: a */
    public long f165101a;

    static {
        bxyl bxyl = new bxyl();
        f165099b = bxyl;
        GeneratedMessageLite.m124024a(bxyl.class, bxyl);
    }

    private bxyl() {
    }

    /* renamed from: a */
    public static bxyl m124413a(long j) {
        bxvd da = f165099b.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bxyl) da.f164949b).f165101a = j;
        return (bxyl) da.mo74062i();
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
            return GeneratedMessageLite.m124022a(f165099b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bxyl();
        } else {
            if (i2 == 4) {
                return new bxvd(f165099b);
            }
            if (i2 == 5) {
                return f165099b;
            }
            bxxk bxxk = f165100c;
            if (bxxk == null) {
                synchronized (bxyl.class) {
                    bxxk = f165100c;
                    if (bxxk == null) {
                        bxxk = new bxve(f165099b);
                        f165100c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
