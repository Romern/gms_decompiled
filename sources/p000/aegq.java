package p000;

import com.google.android.gms.location.internal.LocationRequestInternal;

/* renamed from: aegq */
public final /* synthetic */ class aegq implements roo {

    /* renamed from: a */
    private final aehe f63361a;

    /* renamed from: b */
    private final rod f63362b;

    /* renamed from: c */
    private final LocationRequestInternal f63363c;

    /* renamed from: d */
    private final rjx f63364d;

    public aegq(rjx rjx, aehe aehe, rod rod, LocationRequestInternal locationRequestInternal) {
        this.f63364d = rjx;
        this.f63361a = aehe;
        this.f63362b = rod;
        this.f63363c = locationRequestInternal;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        rjx rjx = this.f63364d;
        aehe aehe = this.f63361a;
        rod rod = this.f63362b;
        LocationRequestInternal locationRequestInternal = this.f63363c;
        aehb aehb = new aehb((aucf) obj2, new aegr(rjx, aehe, rod));
        locationRequestInternal.f79429k = rjx.f43169x;
        ((aekl) obj).mo34255a(locationRequestInternal, rod, aehb);
    }
}
