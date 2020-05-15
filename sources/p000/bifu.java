package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.SemanticLocationEventRequest;
import com.google.android.userlocation.LegacySemanticLocationEventSubscription;
import java.util.concurrent.ExecutionException;

/* renamed from: bifu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bifu implements bieq {

    /* renamed from: a */
    private final SemanticLocationEventRequest f120476a;

    /* renamed from: b */
    private final rnt f120477b;

    /* renamed from: c */
    private final PendingIntent f120478c;

    /* renamed from: d */
    private final PendingIntent f120479d;

    public bifu(SemanticLocationEventRequest semanticLocationEventRequest, rnt rnt, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        sdo.m34959a(semanticLocationEventRequest);
        sdo.m34959a(rnt);
        sdo.m34959a(pendingIntent);
        sdo.m34959a(pendingIntent2);
        this.f120476a = semanticLocationEventRequest;
        this.f120477b = rnt;
        this.f120478c = pendingIntent;
        this.f120479d = pendingIntent2;
    }

    /* renamed from: b */
    private final void m102306b(Status status) {
        try {
            this.f120477b.mo11797a(status);
        } catch (RemoteException e) {
        }
    }

    /* renamed from: a */
    public final int mo64569a() {
        return 3;
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
            m102306b((Status) bidp.mo64551a(new LegacySemanticLocationEventSubscription(this.f120476a, placesParams, this.f120478c, this.f120479d)).get());
        } catch (InterruptedException e) {
            throw new biem(14);
        } catch (ExecutionException e2) {
            throw new aaaj(13, e2.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo64572a(Status status) {
        m102306b(status);
    }
}
