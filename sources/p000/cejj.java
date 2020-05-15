package p000;

/* renamed from: cejj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cejj extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cejj f182771b;

    /* renamed from: c */
    private static volatile bxxk f182772c;

    /* renamed from: a */
    public bxww f182773a = bxww.f165013b;

    static {
        cejj cejj = new cejj();
        f182771b = cejj;
        GeneratedMessageLite.m124024a(cejj.class, cejj);
    }

    private cejj() {
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
            return GeneratedMessageLite.m124022a(f182771b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", ceji.f182770a});
        } else if (i2 == 3) {
            return new cejj();
        } else {
            if (i2 == 4) {
                return new bxvd(f182771b);
            }
            if (i2 == 5) {
                return f182771b;
            }
            bxxk bxxk = f182772c;
            if (bxxk == null) {
                synchronized (cejj.class) {
                    bxxk = f182772c;
                    if (bxxk == null) {
                        bxxk = new bxve(f182771b);
                        f182772c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final boolean mo79188a(int i) {
        return this.f182773a.containsKey(Integer.valueOf(i));
    }
}
