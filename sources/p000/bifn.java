package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceRequest;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.SemanticLocationEventRequest;

/* renamed from: bifn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bifn extends bien {

    /* renamed from: b */
    private final bidi f120458b;

    /* renamed from: c */
    private final PlaceRequest f120459c;

    /* renamed from: d */
    private final PendingIntent f120460d;

    /* renamed from: e */
    private final Intent f120461e;

    /* renamed from: f */
    private final aenr f120462f;

    /* renamed from: g */
    private final bifo f120463g;

    public bifn(PlaceRequest placeRequest, Intent intent, PendingIntent pendingIntent, bifo bifo, aenr aenr, PlacesParams placesParams, bidi bidi, bidx bidx, bhpt bhpt) {
        super(67, "RequestPlaceUpdates", placesParams, bidi, bidx, "android.permission.ACCESS_FINE_LOCATION", bhpt);
        sdo.m34959a(placeRequest);
        sdo.m34959a(pendingIntent);
        sdo.m34959a(intent);
        sdo.m34959a(aenr);
        this.f120459c = placeRequest;
        this.f120463g = bifo;
        this.f120460d = pendingIntent;
        this.f120461e = intent;
        this.f120462f = aenr;
        this.f120388a = placesParams;
        this.f120458b = bidi;
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
        return bhqq.m101357a(Integer.valueOf(this.f120459c.f79492c), Long.valueOf(this.f120459c.f79491b), this.f120388a, true);
    }

    /* renamed from: e */
    public final boolean mo64566e() {
        return true;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        int i;
        boolean z;
        super.mo6502a(context);
        try {
            PlacesParams placesParams = this.f120388a;
            if (!this.f120458b.f120299b.equals("com.google.android.gms")) {
                sdo.m34975b(this.f120460d.getTargetPackage().equals(placesParams.f79572b), "The supplied PendingIntent was not created by your application.");
            }
            PlaceFilter placeFilter = this.f120459c.f79490a;
            if (placeFilter != null) {
                int g = (int) cgfr.m145052g();
                if (placeFilter.f79479g.size() <= g) {
                    z = true;
                } else {
                    z = false;
                }
                sdo.m34976b(z, "Too many place IDs specified in PlaceFilter. Maximum allowed is %d.", Integer.valueOf(g));
                if (!placeFilter.f79478f.isEmpty()) {
                    sdo.m34975b(placesParams.f79574d != null, "PlaceFilter requires UserData but no account is specified.");
                }
            }
            PendingIntent service = PendingIntent.getService(context, 0, this.f120461e, 134217728);
            PlaceRequest placeRequest = this.f120459c;
            avwg avwg = new avwg();
            int i2 = placeRequest.f79492c;
            if (i2 == 100 || i2 == 102 || i2 == 104) {
                i = 2;
            } else {
                i = 1;
            }
            avwg.f94016a = i;
            avwg.mo51668a(15);
            avwg.f94018c = placeRequest.f79495f;
            avwg.f94017b = true;
            avwg.mo51669a("unused");
            SemanticLocationEventRequest a = avwg.mo51667a();
            bifo bifo = this.f120463g;
            PendingIntent pendingIntent = this.f120460d;
            avwu avwu = bifo.f120464a;
            avwu.mo24732b(new avwn(avwu, a, service, pendingIntent)).mo50371a(new bifm(this));
        } catch (IllegalArgumentException | NullPointerException e) {
            throw new aaaj(9004, e.getMessage());
        }
    }

    /* renamed from: b */
    public final void mo64582b(Status status) {
        bioc.m102645a(status.f30115i, status.f30116j, this.f120462f);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        mo64582b(status);
    }
}
