package p000;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;

/* renamed from: bifg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bifg extends bien {

    /* renamed from: b */
    private final PendingIntent f120438b;

    /* renamed from: c */
    private final aenr f120439c;

    /* renamed from: d */
    private final bifo f120440d;

    public bifg(PendingIntent pendingIntent, bifo bifo, aenr aenr, PlacesParams placesParams, bidi bidi, bidx bidx, bhpt bhpt) {
        super(67, "RemovePlaceUpdates", placesParams, bidi, bidx, "android.permission.ACCESS_FINE_LOCATION", bhpt);
        sdo.m34959a(pendingIntent);
        sdo.m34959a(aenr);
        this.f120440d = bifo;
        this.f120438b = pendingIntent;
        this.f120439c = aenr;
        this.f120388a = placesParams;
    }

    /* renamed from: a */
    public final int mo64562a() {
        return 2;
    }

    /* renamed from: b */
    public final int mo64563b() {
        return 1;
    }

    /* renamed from: c */
    public final bpqk mo64564c() {
        return bhqq.m101357a(null, null, this.f120388a, false);
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        super.mo6502a(context);
        this.f120440d.mo64583a(this.f120438b).mo50371a(new biff(this));
    }

    /* renamed from: b */
    public final void mo64579b(Status status) {
        bioc.m102645a(status.f30115i, status.f30116j, this.f120439c);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        mo64579b(status);
    }
}
