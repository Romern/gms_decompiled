package p000;

/* renamed from: bpyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpyt extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bpyt f139932a;

    /* renamed from: b */
    private static volatile bxxk f139933b;

    static {
        bpyt bpyt = new bpyt();
        f139932a = bpyt;
        GeneratedMessageLite.m124024a(bpyt.class, bpyt);
    }

    private bpyt() {
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
            return GeneratedMessageLite.m124022a(f139932a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bpyt();
        }
        if (i2 == 4) {
            return new bxvd(f139932a);
        }
        if (i2 == 5) {
            return f139932a;
        }
        bxxk bxxk = f139933b;
        if (bxxk == null) {
            synchronized (bpyt.class) {
                bxxk = f139933b;
                if (bxxk == null) {
                    bxxk = new bxve(f139932a);
                    f139933b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
