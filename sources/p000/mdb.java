package p000;

/* renamed from: mdb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mdb extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final mdb f33467c;

    /* renamed from: d */
    private static volatile bxxk f33468d;

    /* renamed from: a */
    public int f33469a;

    /* renamed from: b */
    public int f33470b;

    static {
        mdb mdb = new mdb();
        f33467c = mdb;
        GeneratedMessageLite.m124024a(mdb.class, mdb);
    }

    private mdb() {
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
            return GeneratedMessageLite.m124022a(f33467c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", mcz.f33466a});
        } else if (i2 == 3) {
            return new mdb();
        } else {
            if (i2 == 4) {
                return new bxvd(f33467c);
            }
            if (i2 == 5) {
                return f33467c;
            }
            bxxk bxxk = f33468d;
            if (bxxk == null) {
                synchronized (mdb.class) {
                    bxxk = f33468d;
                    if (bxxk == null) {
                        bxxk = new bxve(f33467c);
                        f33468d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
