package p000;

/* renamed from: sfj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sfj extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final sfj f44114c;

    /* renamed from: d */
    private static volatile bxxk f44115d;

    /* renamed from: a */
    public bxwc f44116a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f44117b = bxxn.f165040b;

    static {
        sfj sfj = new sfj();
        f44114c = sfj;
        GeneratedMessageLite.m124024a(sfj.class, sfj);
    }

    private sfj() {
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
            return GeneratedMessageLite.m124022a(f44114c, "\u0001\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u001b\u0003\u001b", new Object[]{"a", sfk.class, "b", sfm.class});
        } else if (i2 == 3) {
            return new sfj();
        } else {
            if (i2 == 4) {
                return new bxvd(f44114c);
            }
            if (i2 == 5) {
                return f44114c;
            }
            bxxk bxxk = f44115d;
            if (bxxk == null) {
                synchronized (sfj.class) {
                    bxxk = f44115d;
                    if (bxxk == null) {
                        bxxk = new bxve(f44114c);
                        f44115d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
