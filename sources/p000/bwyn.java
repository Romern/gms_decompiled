package p000;

/* renamed from: bwyn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwyn extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bwyn f161499b;

    /* renamed from: c */
    public static final bxvj f161500c;

    /* renamed from: d */
    private static volatile bxxk f161501d;

    /* renamed from: a */
    public bxwc f161502a = bxxn.f165040b;

    static {
        bwyn bwyn = new bwyn();
        f161499b = bwyn;
        GeneratedMessageLite.m124024a(bwyn.class, bwyn);
        bwny bwny = bwny.f160414k;
        bwyn bwyn2 = f161499b;
        f161500c = GeneratedMessageLite.m124006a(bwny, bwyn2, bwyn2, 223344553, bxzf.MESSAGE);
    }

    private bwyn() {
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
            return GeneratedMessageLite.m124022a(f161499b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bwyu.class});
        } else if (i2 == 3) {
            return new bwyn();
        } else {
            if (i2 == 4) {
                return new bxvd(f161499b);
            }
            if (i2 == 5) {
                return f161499b;
            }
            bxxk bxxk = f161501d;
            if (bxxk == null) {
                synchronized (bwyn.class) {
                    bxxk = f161501d;
                    if (bxxk == null) {
                        bxxk = new bxve(f161499b);
                        f161501d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
