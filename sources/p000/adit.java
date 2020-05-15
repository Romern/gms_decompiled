package p000;

/* renamed from: adit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adit extends bxvk implements bxxd {

    /* renamed from: b */
    public static final adit f61842b;

    /* renamed from: c */
    private static volatile bxxk f61843c;

    /* renamed from: a */
    public bxwc f61844a = bxxn.f165040b;

    static {
        adit adit = new adit();
        f61842b = adit;
        bxvk.m124024a(adit.class, adit);
    }

    private adit() {
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
            return bxvk.m124022a(f61842b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"a"});
        } else if (i2 == 3) {
            return new adit();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (int[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f61842b;
            }
            bxxk bxxk = f61843c;
            if (bxxk == null) {
                synchronized (adit.class) {
                    bxxk = f61843c;
                    if (bxxk == null) {
                        bxxk = new bxve(f61842b);
                        f61843c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
