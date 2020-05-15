package p000;

/* renamed from: blrd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blrd extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final blrd f127436a;

    /* renamed from: c */
    private static volatile bxxk f127437c;

    /* renamed from: b */
    private byte f127438b = 2;

    static {
        blrd blrd = new blrd();
        f127436a = blrd;
        GeneratedMessageLite.m124024a(blrd.class, blrd);
    }

    private blrd() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127438b);
        }
        byte b = 1;
        if (i2 == 1) {
            if (obj == null) {
                b = 0;
            }
            this.f127438b = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f127436a, "\u0001\u0000", (Object[]) null);
        } else {
            if (i2 == 3) {
                return new blrd();
            }
            if (i2 == 4) {
                return new bxvd(f127436a);
            }
            if (i2 == 5) {
                return f127436a;
            }
            bxxk bxxk = f127437c;
            if (bxxk == null) {
                synchronized (blrd.class) {
                    bxxk = f127437c;
                    if (bxxk == null) {
                        bxxk = new bxve(f127436a);
                        f127437c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
