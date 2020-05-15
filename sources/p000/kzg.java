package p000;

/* renamed from: kzg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kzg extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final kzg f25449b;

    /* renamed from: c */
    private static volatile bxxk f25450c;

    /* renamed from: a */
    public bxwc f25451a = bxxn.f165040b;

    static {
        kzg kzg = new kzg();
        f25449b = kzg;
        GeneratedMessageLite.m124024a(kzg.class, kzg);
    }

    private kzg() {
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
            return GeneratedMessageLite.m124022a(f25449b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", kzf.class});
        } else if (i2 == 3) {
            return new kzg();
        } else {
            if (i2 == 4) {
                return new bxvd(f25449b);
            }
            if (i2 == 5) {
                return f25449b;
            }
            bxxk bxxk = f25450c;
            if (bxxk == null) {
                synchronized (kzg.class) {
                    bxxk = f25450c;
                    if (bxxk == null) {
                        bxxk = new bxve(f25449b);
                        f25450c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
