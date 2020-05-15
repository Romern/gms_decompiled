package p000;

import android.content.Context;
import android.content.Intent;

/* renamed from: afze */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afze implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f65000a;

    public afze(Context context) {
        this.f65000a = context;
    }

    public final void run() {
        Context context = this.f65000a;
        Intent a = afzn.m53751a(context, false, cakk.m126724a(((Integer) afzd.f64994h.mo10351a()).intValue()), cakk.RETRY_AFTER_SERVER_DELAY, afzq.m53764b(context), afzw.m53778a(context));
        if (a != null) {
            int i = eoa.f15378a;
            asfd.m73947b(this.f65000a, a);
        }
    }
}
