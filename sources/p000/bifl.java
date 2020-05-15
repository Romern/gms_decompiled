package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.NearbyAlertFilter;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.UserLocationNearbyAlertFilter;
import com.google.android.gms.userlocation.UserLocationNearbyAlertRequest;
import java.util.ArrayList;

/* renamed from: bifl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bifl extends bien {

    /* renamed from: b */
    private final bidi f120451b;

    /* renamed from: c */
    private final NearbyAlertRequest f120452c;

    /* renamed from: d */
    private final Intent f120453d;

    /* renamed from: e */
    private final PendingIntent f120454e;

    /* renamed from: f */
    private final aenr f120455f;

    /* renamed from: g */
    private final bifo f120456g;

    public bifl(NearbyAlertRequest nearbyAlertRequest, Intent intent, PendingIntent pendingIntent, bifo bifo, PlacesParams placesParams, aenr aenr, bidi bidi, bidx bidx, bhpt bhpt) {
        super(67, "RequestNearbyAlerts", placesParams, bidi, bidx, "android.permission.ACCESS_FINE_LOCATION", bhpt);
        sdo.m34959a(nearbyAlertRequest);
        sdo.m34959a(pendingIntent);
        sdo.m34959a(aenr);
        this.f120453d = intent;
        this.f120452c = nearbyAlertRequest;
        this.f120454e = pendingIntent;
        this.f120455f = aenr;
        this.f120451b = bidi;
        this.f120456g = bifo;
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
     arg types: [com.google.android.gms.location.places.NearbyAlertRequest, com.google.android.gms.location.places.internal.PlacesParams, int]
     candidates:
      bhqq.a(int, int, com.google.android.gms.location.places.internal.PlacesParams):bpqk
      bhqq.a(int, java.lang.String, java.lang.String):bprg
      bhqq.a(bxvd, android.location.Location, com.google.android.gms.location.WifiScan):void
      bhqq.a(com.google.android.gms.location.places.NearbyAlertRequest, com.google.android.gms.location.places.internal.PlacesParams, boolean):bpqk */
    /* renamed from: c */
    public final bpqk mo64564c() {
        return bhqq.m101352a(this.f120452c, this.f120388a, true);
    }

    /* renamed from: e */
    public final boolean mo64566e() {
        return true;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        boolean z;
        super.mo6502a(context);
        try {
            PlacesParams placesParams = this.f120388a;
            if (!this.f120451b.f120299b.equals("com.google.android.gms")) {
                sdo.m34975b(this.f120454e.getTargetPackage().equals(placesParams.f79572b), "The supplied PendingIntent was not created by your application.");
            }
            NearbyAlertFilter nearbyAlertFilter = this.f120452c.f79469c;
            sdo.m34959a(nearbyAlertFilter);
            int g = (int) cgfr.m145052g();
            if (nearbyAlertFilter.f79465e.size() <= g) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34976b(z, "Too many place IDs specified in NearbyAlertFilter. Maximum allowed is %d.", Integer.valueOf(g));
            sdo.m34975b(true, "Nearby Alerts does not support personalization.");
            PendingIntent service = PendingIntent.getService(context, 0, this.f120453d, 134217728);
            bifo bifo = this.f120456g;
            NearbyAlertRequest nearbyAlertRequest = this.f120452c;
            int i = nearbyAlertRequest.f79467a;
            NearbyAlertFilter nearbyAlertFilter2 = nearbyAlertRequest.f79469c;
            UserLocationNearbyAlertRequest a = UserLocationNearbyAlertRequest.m93775a(i, new UserLocationNearbyAlertFilter(new ArrayList(nearbyAlertFilter2.f79465e), new ArrayList(nearbyAlertFilter2.f79466f), nearbyAlertFilter2.f79463c, nearbyAlertFilter2.f79464d), nearbyAlertRequest.f79468b, nearbyAlertRequest.f79470d, nearbyAlertRequest.f79471e, nearbyAlertRequest.f79472f);
            PendingIntent pendingIntent = this.f120454e;
            avwu avwu = bifo.f120464a;
            roz b = rpa.m34196b();
            b.f43472a = new avwk(avwu, a, service, pendingIntent);
            avwu.mo24732b(b.mo24977a()).mo50371a(new bifk(this));
        } catch (IllegalArgumentException | NullPointerException e) {
            throw new aaaj(9004, e.getMessage());
        }
    }

    /* renamed from: b */
    public final void mo64581b(Status status) {
        bioc.m102645a(status.f30115i, status.f30116j, this.f120455f);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        mo64581b(status);
    }
}
