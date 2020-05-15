package p000;

import android.content.Context;
import android.os.Build;

/* renamed from: ayku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayku extends svr {

    /* renamed from: b */
    private svq f97874b = null;

    /* renamed from: a */
    public final synchronized svq mo26181a(Context context) {
        svq svq;
        svq = this.f97874b;
        if (svq == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            int i = Build.VERSION.SDK_INT;
            svq = new aykt(context);
            this.f97874b = svq;
        }
        return svq;
    }
}
