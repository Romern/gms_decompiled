package p000;

/* renamed from: bzrm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzrm extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bzrm f171163e;

    /* renamed from: g */
    private static volatile bxxk f171164g;

    /* renamed from: a */
    public String f171165a = "";

    /* renamed from: b */
    public String f171166b = "";

    /* renamed from: c */
    public bzrl f171167c;

    /* renamed from: d */
    public String f171168d = "";

    /* renamed from: f */
    private int f171169f;

    static {
        bzrm bzrm = new bzrm();
        f171163e = bzrm;
        GeneratedMessageLite.m124024a(bzrm.class, bzrm);
    }

    private bzrm() {
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
            return GeneratedMessageLite.m124022a(f171163e, "\u0001\u0004\u0000\u0001\u0001\n\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0004ဈ\u0001\u0006ဉ\u0003\nဈ\u0006", new Object[]{"f", "a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bzrm();
        } else {
            if (i2 == 4) {
                return new bxvd(f171163e);
            }
            if (i2 == 5) {
                return f171163e;
            }
            bxxk bxxk = f171164g;
            if (bxxk == null) {
                synchronized (bzrm.class) {
                    bxxk = f171164g;
                    if (bxxk == null) {
                        bxxk = new bxve(f171163e);
                        f171164g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
