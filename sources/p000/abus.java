package p000;

/* renamed from: abus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abus extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final abus f58460b;

    /* renamed from: c */
    private static volatile bxxk f58461c;

    /* renamed from: a */
    public bxwc f58462a = bxxn.f165040b;

    static {
        abus abus = new abus();
        f58460b = abus;
        GeneratedMessageLite.m124024a(abus.class, abus);
    }

    private abus() {
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
            return GeneratedMessageLite.m124022a(f58460b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", abur.class});
        } else if (i2 == 3) {
            return new abus();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (boolean[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f58460b;
            }
            bxxk bxxk = f58461c;
            if (bxxk == null) {
                synchronized (abus.class) {
                    bxxk = f58461c;
                    if (bxxk == null) {
                        bxxk = new bxve(f58460b);
                        f58461c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
