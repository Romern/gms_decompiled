package p000;

/* renamed from: cakm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cakm extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final cakm f175019a;

    /* renamed from: b */
    private static volatile bxxk f175020b;

    static {
        cakm cakm = new cakm();
        f175019a = cakm;
        GeneratedMessageLite.m124024a(cakm.class, cakm);
    }

    private cakm() {
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
            return GeneratedMessageLite.m124022a(f175019a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cakm();
        }
        if (i2 == 4) {
            return new bxvd(f175019a);
        }
        if (i2 == 5) {
            return f175019a;
        }
        bxxk bxxk = f175020b;
        if (bxxk == null) {
            synchronized (cakm.class) {
                bxxk = f175020b;
                if (bxxk == null) {
                    bxxk = new bxve(f175019a);
                    f175020b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
