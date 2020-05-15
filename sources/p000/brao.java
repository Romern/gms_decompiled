package p000;

/* renamed from: brao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brao extends bxvk implements bxxd {

    /* renamed from: b */
    public static final brao f142163b;

    /* renamed from: d */
    private static volatile bxxk f142164d;

    /* renamed from: a */
    public int f142165a;

    /* renamed from: c */
    private int f142166c;

    static {
        brao brao = new brao();
        f142163b = brao;
        bxvk.m124024a(brao.class, brao);
    }

    private brao() {
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
            return bxvk.m124022a(f142163b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", bram.f142162a});
        } else if (i2 == 3) {
            return new brao();
        } else {
            if (i2 == 4) {
                return new bxvd(f142163b);
            }
            if (i2 == 5) {
                return f142163b;
            }
            bxxk bxxk = f142164d;
            if (bxxk == null) {
                synchronized (brao.class) {
                    bxxk = f142164d;
                    if (bxxk == null) {
                        bxxk = new bxve(f142163b);
                        f142164d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
