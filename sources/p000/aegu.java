package p000;

import com.google.android.gms.location.internal.LocationRequestInternal;

/* renamed from: aegu */
public final /* synthetic */ class aegu implements roo {

    /* renamed from: a */
    private final aehe f63372a;

    /* renamed from: b */
    private final aehy f63373b;

    /* renamed from: c */
    private final LocationRequestInternal f63374c;

    /* renamed from: d */
    private final rod f63375d;

    /* renamed from: e */
    private final rjx f63376e;

    public aegu(rjx rjx, aehe aehe, aehy aehy, LocationRequestInternal locationRequestInternal, rod rod) {
        this.f63376e = rjx;
        this.f63372a = aehe;
        this.f63373b = aehy;
        this.f63374c = locationRequestInternal;
        this.f63375d = rod;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        rjx rjx = this.f63376e;
        aehe aehe = this.f63372a;
        aehy aehy = this.f63373b;
        LocationRequestInternal locationRequestInternal = this.f63374c;
        rod rod = this.f63375d;
        aehb aehb = new aehb((aucf) obj2, new aegs(rjx, aehe, aehy));
        locationRequestInternal.f79429k = rjx.f43169x;
        ((aekl) obj).mo34257b(locationRequestInternal, rod, aehb);
    }
}
