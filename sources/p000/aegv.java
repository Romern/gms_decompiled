package p000;

import android.app.PendingIntent;
import com.google.android.gms.location.internal.LocationRequestInternal;

/* renamed from: aegv */
public final /* synthetic */ class aegv implements roo {

    /* renamed from: a */
    private final LocationRequestInternal f63377a;

    /* renamed from: b */
    private final PendingIntent f63378b;

    /* renamed from: c */
    private final rjx f63379c;

    public aegv(rjx rjx, LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent) {
        this.f63379c = rjx;
        this.f63377a = locationRequestInternal;
        this.f63378b = pendingIntent;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        rjx rjx = this.f63379c;
        LocationRequestInternal locationRequestInternal = this.f63377a;
        PendingIntent pendingIntent = this.f63378b;
        aehd aehd = new aehd((aucf) obj2);
        locationRequestInternal.f79429k = rjx.f43169x;
        ((aekl) obj).mo34254a(locationRequestInternal, pendingIntent, aehd);
    }
}
