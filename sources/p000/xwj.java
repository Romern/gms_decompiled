package p000;

import java.util.Random;

/* renamed from: xwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xwj {

    /* renamed from: c */
    private static final Random f53293c = bmyk.f131201a;

    /* renamed from: d */
    private static final sek f53294d = new sek(new String[]{"SessionContext"}, (short[]) null);

    /* renamed from: a */
    public final int f53295a;

    /* renamed from: b */
    public volatile byte[] f53296b;

    public xwj(int i) {
        bmxy.m108588a(i != 0);
        this.f53295a = i;
    }

    /* renamed from: a */
    public static xwj m43507a(xwi xwi) {
        return m43508a(xwi, null);
    }

    /* renamed from: a */
    public static xwj m43508a(xwi xwi, Integer num) {
        if (num == null) {
            num = Integer.valueOf(f53293c.nextInt());
        }
        f53294d.mo25412b("New SessionContext [%s, %d]", xwi, num);
        return new xwj(num.intValue());
    }
}
