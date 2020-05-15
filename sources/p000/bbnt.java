package p000;

/* renamed from: bbnt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbnt extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bbnt f102975e;

    /* renamed from: f */
    private static volatile bxxk f102976f;

    /* renamed from: a */
    public int f102977a;

    /* renamed from: b */
    public int f102978b;

    /* renamed from: c */
    public long f102979c;

    /* renamed from: d */
    public long f102980d;

    static {
        bbnt bbnt = new bbnt();
        f102975e = bbnt;
        GeneratedMessageLite.m124024a(bbnt.class, bbnt);
    }

    private bbnt() {
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
            return GeneratedMessageLite.m124022a(f102975e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bbnt();
        } else {
            if (i2 == 4) {
                return new bxvd(f102975e);
            }
            if (i2 == 5) {
                return f102975e;
            }
            bxxk bxxk = f102976f;
            if (bxxk == null) {
                synchronized (bbnt.class) {
                    bxxk = f102976f;
                    if (bxxk == null) {
                        bxxk = new bxve(f102975e);
                        f102976f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
