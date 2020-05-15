package p000;

import android.content.Context;

/* renamed from: svr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class svr {

    /* renamed from: a */
    public static svr f45246a = new svr();

    /* renamed from: b */
    private svq f45247b = null;

    /* renamed from: b */
    public static svq m36484b(Context context) {
        return f45246a.mo26181a(context);
    }

    /* renamed from: a */
    public synchronized svq mo26181a(Context context) {
        if (this.f45247b == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f45247b = new svq(context);
        }
        return this.f45247b;
    }
}
