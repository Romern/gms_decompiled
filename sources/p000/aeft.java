package p000;

import android.app.PendingIntent;
import com.google.android.gms.location.ActivityTransitionRequest;

/* renamed from: aeft */
public final /* synthetic */ class aeft implements roo {

    /* renamed from: a */
    private final ActivityTransitionRequest f63339a;

    /* renamed from: b */
    private final PendingIntent f63340b;

    public aeft(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent) {
        this.f63339a = activityTransitionRequest;
        this.f63340b = pendingIntent;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        ActivityTransitionRequest activityTransitionRequest = this.f63339a;
        PendingIntent pendingIntent = this.f63340b;
        aekl aekl = (aekl) obj;
        aefx aefx = new aefx((aucf) obj2);
        aekl.mo25288A();
        sdo.checkIfNull(aefx, "ResultHolder not provided.");
        ((aekb) aekl.mo25289B()).mo34219a(activityTransitionRequest, pendingIntent, new ros(aefx));
    }
}
