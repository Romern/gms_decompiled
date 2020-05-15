package p000;

/* renamed from: byyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byyx extends bxvg implements bxvh {

    /* renamed from: a */
    public static final byyx f169037a;

    /* renamed from: c */
    private static volatile bxxk f169038c;

    /* renamed from: b */
    private byte f169039b = 2;

    static {
        byyx byyx = new byyx();
        f169037a = byyx;
        GeneratedMessageLite.m124024a(byyx.class, byyx);
    }

    private byyx() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f169039b);
        }
        byte b = 1;
        if (i2 == 1) {
            if (obj == null) {
                b = 0;
            }
            this.f169039b = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f169037a, "\u0001\u0000", (Object[]) null);
        } else {
            if (i2 == 3) {
                return new byyx();
            }
            if (i2 == 4) {
                return new bxvf(f169037a);
            }
            if (i2 == 5) {
                return f169037a;
            }
            bxxk bxxk = f169038c;
            if (bxxk == null) {
                synchronized (byyx.class) {
                    bxxk = f169038c;
                    if (bxxk == null) {
                        bxxk = new bxve(f169037a);
                        f169038c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
