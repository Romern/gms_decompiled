package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.fencing.PlacefencingRequest;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.places.placefencing.PlacefencingSubscription;
import java.util.concurrent.ExecutionException;

/* renamed from: bifs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bifs implements bieq {

    /* renamed from: a */
    private final PlacefencingRequest f120469a;

    /* renamed from: b */
    private final PendingIntent f120470b;

    /* renamed from: c */
    private final rnt f120471c;

    public bifs(PlacefencingRequest placefencingRequest, PendingIntent pendingIntent, rnt rnt) {
        sdo.m34959a(placefencingRequest);
        sdo.m34959a(pendingIntent);
        sdo.m34959a(rnt);
        this.f120469a = placefencingRequest;
        this.f120470b = pendingIntent;
        this.f120471c = rnt;
    }

    /* renamed from: b */
    private final void m102290b(Status status) {
        try {
            this.f120471c.mo11797a(status);
        } catch (RemoteException e) {
        }
    }

    /* renamed from: a */
    public final int mo64569a() {
        return 2;
    }

    /* renamed from: a */
    public final bpqk mo64570a(PlacesParams placesParams) {
        return null;
    }

    /* renamed from: b */
    public final int mo64573b() {
        return 2;
    }

    /* renamed from: c */
    public final String mo64574c() {
        return "android.permission.ACCESS_FINE_LOCATION";
    }

    /* renamed from: d */
    public final boolean mo64575d() {
        return true;
    }

    /* renamed from: a */
    public final void mo64571a(Context context, bidp bidp, PlacesParams placesParams) {
        try {
            m102290b((Status) bidp.mo64551a(PlacefencingSubscription.m117719a(this.f120469a, placesParams, this.f120470b)).get());
        } catch (InterruptedException e) {
            throw new biem(14);
        } catch (ExecutionException e2) {
            throw new aaaj(13, e2.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo64572a(Status status) {
        m102290b(status);
    }
}
