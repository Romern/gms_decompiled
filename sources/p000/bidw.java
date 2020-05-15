package p000;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlaceRequest;
import com.google.android.gms.location.places.PlacesClientIdentifier;
import com.google.android.gms.location.places.fencing.PlacefencingRequest;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.places.service.TransformNearbyAlertIntentOperation;
import com.google.android.places.service.TransformSemanticLocationEventIntentOperation;

/* renamed from: bidw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bidw extends aenh implements aaai {

    /* renamed from: a */
    private final aaag f120344a;

    /* renamed from: b */
    private final bidi f120345b;

    /* renamed from: c */
    private final bidx f120346c;

    /* renamed from: d */
    private final bhpt f120347d;

    public bidw(bidx bidx, bidi bidi, aaag aaag, bhpt bhpt) {
        this.f120346c = bidx;
        this.f120345b = bidi;
        this.f120344a = aaag;
        this.f120347d = bhpt;
    }

    /* renamed from: a */
    private static void m102029a(aenr aenr) {
        bioc.m102645a(9004, "The supplied PendingIntent was not created by your application.", aenr);
    }

    /* renamed from: b */
    public final void mo34359b(PlacesParams placesParams, PendingIntent pendingIntent, aenr aenr) {
        if (m102031a(pendingIntent, placesParams)) {
            this.f120344a.mo16658a(new bife(pendingIntent, bifp.m102273a(this.f120345b.f120298a, placesParams.f79572b, placesParams.f79574d), placesParams, aenr, this.f120345b, this.f120346c, this.f120347d));
            return;
        }
        m102029a(aenr);
    }

    /* renamed from: a */
    private final void m102030a(PlacesParams placesParams, bieq bieq, String str) {
        this.f120344a.mo16658a(new biew(placesParams, this.f120345b, this.f120346c, bieq, str, this.f120347d));
    }

    /* renamed from: a */
    private final boolean m102031a(PendingIntent pendingIntent, PlacesParams placesParams) {
        return this.f120345b.f120299b.equals("com.google.android.gms") || pendingIntent.getTargetPackage().equals(placesParams.f79572b);
    }

    /* renamed from: a */
    public final void mo34349a(NearbyAlertRequest nearbyAlertRequest, PlacesParams placesParams, PendingIntent pendingIntent, aenr aenr) {
        Intent startIntent = IntentOperation.getStartIntent(this.f120345b.f120298a, TransformNearbyAlertIntentOperation.class, "com.google.android.places.service.ACTION_NEARBY_ALERT_EVENT");
        startIntent.setPackage("com.google.android.gms");
        this.f120344a.mo16658a(new bifl(nearbyAlertRequest, startIntent, pendingIntent, bifp.m102273a(this.f120345b.f120298a, placesParams.f79572b, placesParams.f79574d), placesParams, aenr, this.f120345b, this.f120346c, this.f120347d));
    }

    /* renamed from: a */
    public final void mo34350a(PlaceFilter placeFilter, PlacesParams placesParams, aenr aenr) {
        m102030a(placesParams, new bies(this.f120347d, placeFilter, aenr), "GetCurrentPlace");
    }

    /* renamed from: a */
    public final void mo34351a(PlaceReport placeReport, PlacesParams placesParams, aenr aenr) {
        m102030a(placesParams, new bifj(placeReport, aenr), "ReportDeviceAtPlace");
    }

    /* renamed from: a */
    public final void mo34352a(PlaceRequest placeRequest, PlacesParams placesParams, PendingIntent pendingIntent, aenr aenr) {
        Intent startIntent = IntentOperation.getStartIntent(this.f120345b.f120298a, TransformSemanticLocationEventIntentOperation.class, "com.google.android.places.service.ACTION_SEMANTIC_LOCATION_EVENT");
        startIntent.setPackage("com.google.android.gms");
        this.f120344a.mo16658a(new bifn(placeRequest, startIntent, pendingIntent, bifp.m102273a(this.f120345b.f120298a, placesParams.f79572b, placesParams.f79574d), aenr, placesParams, this.f120345b, this.f120346c, this.f120347d));
    }

    @Deprecated
    /* renamed from: a */
    public final void mo34353a(PlacesClientIdentifier placesClientIdentifier, PlacesParams placesParams, aenr aenr) {
        m102030a(placesParams, new bieu(placesClientIdentifier, aenr), "HasPersonalizedDataAccess");
    }

    /* renamed from: a */
    public final void mo34354a(PlacesClientIdentifier placesClientIdentifier, PlacesParams placesParams, rnt rnt) {
        m102030a(placesParams, new bieu(placesClientIdentifier, rnt), "HasPersonalizedDataAccess");
    }

    /* renamed from: a */
    public final void mo34355a(PlacefencingRequest placefencingRequest, PlacesParams placesParams, PendingIntent pendingIntent, aenr aenr) {
        if (m102031a(pendingIntent, placesParams)) {
            this.f120344a.mo16658a(new biey(placefencingRequest, pendingIntent, bifp.m102273a(this.f120345b.f120298a, placesParams.f79572b, placesParams.f79574d), placesParams, aenr, this.f120345b, this.f120346c, this.f120347d));
            return;
        }
        m102029a(aenr);
    }

    /* renamed from: a */
    public final void mo34356a(PlacesParams placesParams, PendingIntent pendingIntent, aenr aenr) {
        this.f120344a.mo16658a(new bifg(pendingIntent, bifp.m102273a(this.f120345b.f120298a, placesParams.f79572b, placesParams.f79574d), aenr, placesParams, this.f120345b, this.f120346c, this.f120347d));
    }

    /* renamed from: a */
    public final void mo34357a(PlacesParams placesParams, String str, aenr aenr) {
        this.f120344a.mo16658a(new bifa(str, bifp.m102273a(this.f120345b.f120298a, placesParams.f79572b, placesParams.f79574d), placesParams, aenr, this.f120345b, this.f120346c, this.f120347d));
    }

    /* renamed from: a */
    public final void mo34358a(rnt rnt) {
        rnt.mo11797a(Status.f30112f);
    }
}
