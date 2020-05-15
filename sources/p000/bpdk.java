package p000;

/* renamed from: bpdk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpdk extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bpdk f136254a;

    /* renamed from: b */
    private static volatile bxxk f136255b;

    static {
        bpdk bpdk = new bpdk();
        f136254a = bpdk;
        GeneratedMessageLite.m124024a(bpdk.class, bpdk);
    }

    private bpdk() {
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
            return GeneratedMessageLite.m124022a(f136254a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bpdk();
        }
        if (i2 == 4) {
            return new bxvd(f136254a);
        }
        if (i2 == 5) {
            return f136254a;
        }
        bxxk bxxk = f136255b;
        if (bxxk == null) {
            synchronized (bpdk.class) {
                bxxk = f136255b;
                if (bxxk == null) {
                    bxxk = new bxve(f136254a);
                    f136255b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
