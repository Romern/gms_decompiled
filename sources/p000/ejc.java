package p000;

import android.content.Context;

/* renamed from: ejc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ejc {

    /* renamed from: b */
    private static volatile ejd f15117b = null;

    /* renamed from: a */
    public final ekn f15118a;

    public ejc(ekn ekn, ekr ekr) {
        this.f15118a = ekn;
        ekr.f15212a.execute(new ekp(ekr));
    }

    /* renamed from: a */
    public static ejc m10523a() {
        ejd ejd = f15117b;
        if (ejd != null) {
            return (ejc) ejd.f15119a.mo6445a();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: a */
    public static void m10524a(Context context) {
        if (f15117b == null) {
            synchronized (ejc.class) {
                if (f15117b == null) {
                    eiu eiu = new eiu();
                    cazf.m127594a(context);
                    eiu.f15101a = context;
                    cazf.m127595a(eiu.f15101a, Context.class);
                    f15117b = new ejd(eiu.f15101a);
                }
            }
        }
    }
}
