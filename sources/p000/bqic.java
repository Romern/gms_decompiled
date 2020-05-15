package p000;

/* renamed from: bqic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqic extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bqic f140767c;

    /* renamed from: d */
    private static volatile bxxk f140768d;

    /* renamed from: a */
    public long f140769a;

    /* renamed from: b */
    public String f140770b = "";

    static {
        bqic bqic = new bqic();
        f140767c = bqic;
        bxvk.m124024a(bqic.class, bqic);
    }

    private bqic() {
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
            return bxvk.m124022a(f140767c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bqic();
        } else {
            if (i2 == 4) {
                return new bxvd(f140767c);
            }
            if (i2 == 5) {
                return f140767c;
            }
            bxxk bxxk = f140768d;
            if (bxxk == null) {
                synchronized (bqic.class) {
                    bxxk = f140768d;
                    if (bxxk == null) {
                        bxxk = new bxve(f140767c);
                        f140768d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
