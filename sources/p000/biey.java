package p000;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.fencing.PlacefencingRequest;
import com.google.android.gms.location.places.internal.PlacesParams;

/* renamed from: biey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biey extends bien {

    /* renamed from: b */
    private final PlacefencingRequest f120419b;

    /* renamed from: c */
    private final PendingIntent f120420c;

    /* renamed from: d */
    private final aenr f120421d;

    /* renamed from: e */
    private final bifo f120422e;

    public biey(PlacefencingRequest placefencingRequest, PendingIntent pendingIntent, bifo bifo, PlacesParams placesParams, aenr aenr, bidi bidi, bidx bidx, bhpt bhpt) {
        super(67, "proxyAddPlacefencesByRequest", placesParams, bidi, bidx, "android.permission.ACCESS_FINE_LOCATION", bhpt);
        sdo.m34959a(placefencingRequest);
        sdo.m34959a(pendingIntent);
        sdo.m34959a(aenr);
        this.f120419b = placefencingRequest;
        this.f120420c = pendingIntent;
        this.f120421d = aenr;
        this.f120422e = bifo;
    }

    /* renamed from: a */
    public final int mo64562a() {
        return 2;
    }

    /* renamed from: b */
    public final int mo64563b() {
        return 2;
    }

    /* renamed from: c */
    public final bpqk mo64564c() {
        return null;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        super.mo6502a(context);
        bifo bifo = this.f120422e;
        PlacefencingRequest placefencingRequest = this.f120419b;
        PendingIntent pendingIntent = this.f120420c;
        avwu avwu = bifo.f120464a;
        roz b = rpa.m34196b();
        b.f43472a = new avwi(avwu, placefencingRequest, pendingIntent);
        b.f43473b = new Feature[]{avvz.f93998b};
        avwu.mo24732b(b.mo24977a()).mo50371a(new biex(this));
    }

    /* renamed from: b */
    public final void mo64576b(Status status) {
        bioc.m102645a(status.f30115i, status.f30116j, this.f120421d);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        mo64576b(status);
    }
}
