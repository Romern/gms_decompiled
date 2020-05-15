package p000;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.internal.PlacesParams;

/* renamed from: bife */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bife extends bien {

    /* renamed from: b */
    private final PendingIntent f120434b;

    /* renamed from: c */
    private final aenr f120435c;

    /* renamed from: d */
    private final bifo f120436d;

    public bife(PendingIntent pendingIntent, bifo bifo, PlacesParams placesParams, aenr aenr, bidi bidi, bidx bidx, bhpt bhpt) {
        super(67, "RemoveNearbyAlerts", placesParams, bidi, bidx, "", bhpt);
        sdo.m34959a(pendingIntent);
        this.f120434b = pendingIntent;
        this.f120436d = bifo;
        this.f120435c = aenr;
    }

    /* renamed from: a */
    public final int mo64562a() {
        return 2;
    }

    /* renamed from: b */
    public final int mo64563b() {
        return 1;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bhqq.a(com.google.android.gms.location.places.NearbyAlertRequest, com.google.android.gms.location.places.internal.PlacesParams, boolean):bpqk
     arg types: [?[OBJECT, ARRAY], com.google.android.gms.location.places.internal.PlacesParams, int]
     candidates:
      bhqq.a(int, int, com.google.android.gms.location.places.internal.PlacesParams):bpqk
      bhqq.a(int, java.lang.String, java.lang.String):bprg
      bhqq.a(bxvd, android.location.Location, com.google.android.gms.location.WifiScan):void
      bhqq.a(com.google.android.gms.location.places.NearbyAlertRequest, com.google.android.gms.location.places.internal.PlacesParams, boolean):bpqk */
    /* renamed from: c */
    public final bpqk mo64564c() {
        return bhqq.m101352a((NearbyAlertRequest) null, this.f120388a, false);
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        super.mo6502a(context);
        this.f120436d.mo64584b(this.f120434b).mo50371a(new bifd(this));
    }

    /* renamed from: b */
    public final void mo64578b(Status status) {
        bioc.m102645a(status.f30115i, status.f30116j, this.f120435c);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        mo64578b(status);
    }
}
