package p000;

/* renamed from: bvyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvyl extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bvyl f158186b;

    /* renamed from: d */
    private static volatile bxxk f158187d;

    /* renamed from: a */
    public bvxn f158188a;

    /* renamed from: c */
    private int f158189c;

    static {
        bvyl bvyl = new bvyl();
        f158186b = bvyl;
        GeneratedMessageLite.m124024a(bvyl.class, bvyl);
    }

    private bvyl() {
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
            return GeneratedMessageLite.m124022a(f158186b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bvyl();
        } else {
            if (i2 == 4) {
                return new bxvd(f158186b);
            }
            if (i2 == 5) {
                return f158186b;
            }
            bxxk bxxk = f158187d;
            if (bxxk == null) {
                synchronized (bvyl.class) {
                    bxxk = f158187d;
                    if (bxxk == null) {
                        bxxk = new bxve(f158186b);
                        f158187d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
