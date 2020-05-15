package p000;

/* renamed from: blpg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blpg extends bxvk implements bxxd {

    /* renamed from: a */
    public static final blpg f127216a;

    /* renamed from: c */
    private static volatile bxxk f127217c;

    /* renamed from: b */
    private byte f127218b = 2;

    static {
        blpg blpg = new blpg();
        f127216a = blpg;
        bxvk.m124024a(blpg.class, blpg);
    }

    private blpg() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127218b);
        }
        byte b = 1;
        if (i2 == 1) {
            if (obj == null) {
                b = 0;
            }
            this.f127218b = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f127216a, "\u0001\u0000", (Object[]) null);
        } else {
            if (i2 == 3) {
                return new blpg();
            }
            if (i2 == 4) {
                return new bxvd(f127216a);
            }
            if (i2 == 5) {
                return f127216a;
            }
            bxxk bxxk = f127217c;
            if (bxxk == null) {
                synchronized (blpg.class) {
                    bxxk = f127217c;
                    if (bxxk == null) {
                        bxxk = new bxve(f127216a);
                        f127217c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
