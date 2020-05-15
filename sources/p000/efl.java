package p000;

import java.util.Collection;

/* renamed from: efl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class efl extends drx implements dpv {

    /* renamed from: c */
    private final drb f14834c;

    /* renamed from: d */
    private final Collection f14835d;

    /* renamed from: e */
    private final doh f14836e;

    public efl(drb drb, Collection collection, doh doh, dpv dpv) {
        super("ConsumerSyncOperation", dpv);
        sdo.m34959a(drb);
        this.f14834c = drb;
        sdo.m34959a(collection);
        this.f14835d = collection;
        sdo.m34959a(doh);
        this.f14836e = doh;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9410a() {
        this.f14834c.mo9473a(this.f14836e, this.f14835d, this, dwq.m9667k());
    }

    /* renamed from: b */
    public final void mo9428b() {
        sdo.m34959a(this.f13912a);
        dpy.m9065a(this.f13912a, dwq.m9667k(), mo9513a("successCallback"));
    }

    /* renamed from: a */
    public final void mo9427a(int i) {
        sdo.m34959a(this.f13912a);
        dpy.m9066b(this.f13912a, dwq.m9667k(), mo9513a("failureCallback"));
    }
}
