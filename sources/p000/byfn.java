package p000;

/* renamed from: byfn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byfn extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final byfn f166050a;

    /* renamed from: c */
    private static volatile bxxk f166051c;

    /* renamed from: b */
    private byte f166052b = 2;

    static {
        byfn byfn = new byfn();
        f166050a = byfn;
        GeneratedMessageLite.m124024a(byfn.class, byfn);
    }

    private byfn() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f166052b);
        }
        byte b = 1;
        if (i2 == 1) {
            if (obj == null) {
                b = 0;
            }
            this.f166052b = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f166050a, "\u0001\u0000", (Object[]) null);
        } else {
            if (i2 == 3) {
                return new byfn();
            }
            if (i2 == 4) {
                return new bxvd(f166050a);
            }
            if (i2 == 5) {
                return f166050a;
            }
            bxxk bxxk = f166051c;
            if (bxxk == null) {
                synchronized (byfn.class) {
                    bxxk = f166051c;
                    if (bxxk == null) {
                        bxxk = new bxve(f166050a);
                        f166051c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
