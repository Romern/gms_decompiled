package p000;

import android.content.Context;

/* renamed from: aopx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aopx {

    /* renamed from: b */
    private static volatile aopx f78671b;

    /* renamed from: a */
    public final beju f78672a;

    private aopx(Context context) {
        bejv bejv = new bejv();
        bejv.f111685a = snp.m35702a(10);
        bejv.f111686b = new befa(bngx.m109356a(beff.m94940a(context).mo60653a()));
        bejv.mo60768a(beku.f111735a);
        this.f78672a = bejv.mo60766a();
    }

    /* renamed from: a */
    public static synchronized aopx m66281a(Context context) {
        aopx aopx;
        synchronized (aopx.class) {
            if (f78671b == null) {
                f78671b = new aopx(context.getApplicationContext());
            }
            aopx = f78671b;
        }
        return aopx;
    }
}
