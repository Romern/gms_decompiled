package p000;

/* renamed from: qum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qum extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final qum f42162a;

    /* renamed from: b */
    private static volatile bxxk f42163b;

    static {
        qum qum = new qum();
        f42162a = qum;
        GeneratedMessageLite.m124024a(qum.class, qum);
    }

    private qum() {
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
            return GeneratedMessageLite.m124022a(f42162a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new qum();
        }
        if (i2 == 4) {
            return new bxvd(f42162a);
        }
        if (i2 == 5) {
            return f42162a;
        }
        bxxk bxxk = f42163b;
        if (bxxk == null) {
            synchronized (qum.class) {
                bxxk = f42163b;
                if (bxxk == null) {
                    bxxk = new bxve(f42162a);
                    f42163b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
