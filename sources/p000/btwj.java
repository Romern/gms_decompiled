package p000;

/* renamed from: btwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btwj extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final btwj f152707b;

    /* renamed from: c */
    private static volatile bxxk f152708c;

    /* renamed from: a */
    public btwd f152709a;

    static {
        btwj btwj = new btwj();
        f152707b = btwj;
        GeneratedMessageLite.m124024a(btwj.class, btwj);
    }

    private btwj() {
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
            return GeneratedMessageLite.m124022a(f152707b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btwj();
        } else {
            if (i2 == 4) {
                return new bxvd(f152707b);
            }
            if (i2 == 5) {
                return f152707b;
            }
            bxxk bxxk = f152708c;
            if (bxxk == null) {
                synchronized (btwj.class) {
                    bxxk = f152708c;
                    if (bxxk == null) {
                        bxxk = new bxve(f152707b);
                        f152708c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
