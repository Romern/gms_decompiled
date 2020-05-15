package p000;

/* renamed from: bwwe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwwe extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bwwe f161226c;

    /* renamed from: e */
    private static volatile bxxk f161227e;

    /* renamed from: a */
    public boolean f161228a;

    /* renamed from: b */
    public boolean f161229b;

    /* renamed from: d */
    private int f161230d;

    static {
        bwwe bwwe = new bwwe();
        f161226c = bwwe;
        GeneratedMessageLite.m124024a(bwwe.class, bwwe);
    }

    private bwwe() {
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
            return GeneratedMessageLite.m124022a(f161226c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bwwe();
        } else {
            if (i2 == 4) {
                return new bxvd(f161226c);
            }
            if (i2 == 5) {
                return f161226c;
            }
            bxxk bxxk = f161227e;
            if (bxxk == null) {
                synchronized (bwwe.class) {
                    bxxk = f161227e;
                    if (bxxk == null) {
                        bxxk = new bxve(f161226c);
                        f161227e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
