package p000;

/* renamed from: byml */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byml extends bxvk implements bxxd {

    /* renamed from: b */
    public static final byml f167033b;

    /* renamed from: c */
    private static volatile bxxk f167034c;

    /* renamed from: a */
    public bxwc f167035a = bxxn.f165040b;

    static {
        byml byml = new byml();
        f167033b = byml;
        bxvk.m124024a(byml.class, byml);
    }

    private byml() {
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
            return bxvk.m124022a(f167033b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", bymm.class});
        } else if (i2 == 3) {
            return new byml();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null, (char[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f167033b;
            }
            bxxk bxxk = f167034c;
            if (bxxk == null) {
                synchronized (byml.class) {
                    bxxk = f167034c;
                    if (bxxk == null) {
                        bxxk = new bxve(f167033b);
                        f167034c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
