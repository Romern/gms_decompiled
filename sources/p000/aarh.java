package p000;

import android.app.Activity;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* renamed from: aarh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aarh {

    /* renamed from: a */
    public final Activity f56364a;

    /* renamed from: b */
    private final Object f56365b;

    public aarh(com.google.android.chimera.Activity activity) {
        this.f56365b = activity;
        this.f56364a = activity.getContainerActivity();
    }

    /* renamed from: a */
    public final void mo31646a(Intent intent) {
        abcb abcb;
        if (!intent.getAction().equals("com.google.android.gms.googlehelp.HELP") || !intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            throw new IllegalArgumentException("The intent you are trying to launch is not GoogleHelp intent! This class only supports GoogleHelp intents.");
        }
        int i = abcc.f57035a;
        int i2 = rfx.f42891a;
        Object obj = this.f56365b;
        if (obj == null) {
            abcb = aarj.m46791a(this.f56364a);
        } else {
            abcb = aarj.m46793a((com.google.android.chimera.Activity) obj);
        }
        sdo.m34959a(abcb.f57034b);
        rkb rkb = abcb.f43165D;
        abbu abbu = new abbu(rkb, intent, new WeakReference(abcb.f57034b));
        rkb.mo24787a((rle) abbu);
        sdl.m34954a(abbu);
    }
}
