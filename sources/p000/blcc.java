package p000;

/* renamed from: blcc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blcc extends bxvg implements bxvh {

    /* renamed from: a */
    public static final blcc f125904a;

    /* renamed from: c */
    private static volatile bxxk f125905c;

    /* renamed from: b */
    private byte f125906b = 2;

    static {
        blcc blcc = new blcc();
        f125904a = blcc;
        GeneratedMessageLite.m124024a(blcc.class, blcc);
    }

    private blcc() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f125906b);
        }
        byte b = 1;
        if (i2 == 1) {
            if (obj == null) {
                b = 0;
            }
            this.f125906b = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f125904a, "\u0001\u0000", (Object[]) null);
        } else {
            if (i2 == 3) {
                return new blcc();
            }
            if (i2 == 4) {
                return new bxvf(f125904a);
            }
            if (i2 == 5) {
                return f125904a;
            }
            bxxk bxxk = f125905c;
            if (bxxk == null) {
                synchronized (blcc.class) {
                    bxxk = f125905c;
                    if (bxxk == null) {
                        bxxk = new bxve(f125904a);
                        f125905c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
