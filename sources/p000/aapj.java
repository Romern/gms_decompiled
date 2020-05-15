package p000;

/* renamed from: aapj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aapj extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final aapj f28776e;

    /* renamed from: f */
    private static volatile bxxk f28777f;

    /* renamed from: a */
    public int f28778a;

    /* renamed from: b */
    public long f28779b;

    /* renamed from: c */
    public long f28780c;

    /* renamed from: d */
    public boolean f28781d;

    static {
        aapj aapj = new aapj();
        f28776e = aapj;
        GeneratedMessageLite.m124024a(aapj.class, aapj);
    }

    private aapj() {
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
            return GeneratedMessageLite.m124022a(f28776e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new aapj();
        } else {
            if (i2 == 4) {
                return new bxvd(f28776e);
            }
            if (i2 == 5) {
                return f28776e;
            }
            bxxk bxxk = f28777f;
            if (bxxk == null) {
                synchronized (aapj.class) {
                    bxxk = f28777f;
                    if (bxxk == null) {
                        bxxk = new bxve(f28776e);
                        f28777f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
