package p000;

/* renamed from: blqm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blqm extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final blqm f127369a;

    /* renamed from: c */
    private static volatile bxxk f127370c;

    /* renamed from: b */
    private byte f127371b = 2;

    static {
        blqm blqm = new blqm();
        f127369a = blqm;
        GeneratedMessageLite.m124024a(blqm.class, blqm);
    }

    private blqm() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127371b);
        }
        byte b = 1;
        if (i2 == 1) {
            if (obj == null) {
                b = 0;
            }
            this.f127371b = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f127369a, "\u0001\u0000", (Object[]) null);
        } else {
            if (i2 == 3) {
                return new blqm();
            }
            if (i2 == 4) {
                return new bxvd(f127369a);
            }
            if (i2 == 5) {
                return f127369a;
            }
            bxxk bxxk = f127370c;
            if (bxxk == null) {
                synchronized (blqm.class) {
                    bxxk = f127370c;
                    if (bxxk == null) {
                        bxxk = new bxve(f127369a);
                        f127370c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
