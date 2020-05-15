package p000;

/* renamed from: bwca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwca extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bwca f158803c;

    /* renamed from: d */
    private static volatile bxxk f158804d;

    /* renamed from: a */
    public int f158805a;

    /* renamed from: b */
    public String f158806b = "";

    static {
        bwca bwca = new bwca();
        f158803c = bwca;
        GeneratedMessageLite.m124024a(bwca.class, bwca);
    }

    private bwca() {
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
            return GeneratedMessageLite.m124022a(f158803c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bwca();
        } else {
            if (i2 == 4) {
                return new bxvd(f158803c);
            }
            if (i2 == 5) {
                return f158803c;
            }
            bxxk bxxk = f158804d;
            if (bxxk == null) {
                synchronized (bwca.class) {
                    bxxk = f158804d;
                    if (bxxk == null) {
                        bxxk = new bxve(f158803c);
                        f158804d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
