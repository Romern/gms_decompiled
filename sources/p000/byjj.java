package p000;

/* renamed from: byjj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byjj extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final byjj f166658c;

    /* renamed from: d */
    private static volatile bxxk f166659d;

    /* renamed from: a */
    public int f166660a = 0;

    /* renamed from: b */
    public Object f166661b;

    static {
        byjj byjj = new byjj();
        f166658c = byjj;
        GeneratedMessageLite.m124024a(byjj.class, byjj);
    }

    private byjj() {
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
            return GeneratedMessageLite.m124022a(f166658c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", byju.class, byhu.class});
        } else if (i2 == 3) {
            return new byjj();
        } else {
            if (i2 == 4) {
                return new bxvd(f166658c);
            }
            if (i2 == 5) {
                return f166658c;
            }
            bxxk bxxk = f166659d;
            if (bxxk == null) {
                synchronized (byjj.class) {
                    bxxk = f166659d;
                    if (bxxk == null) {
                        bxxk = new bxve(f166658c);
                        f166659d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
