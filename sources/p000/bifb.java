package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.SemanticLocationEventRequest;
import com.google.android.userlocation.SemanticLocationEventSubscription;
import java.util.concurrent.ExecutionException;

/* renamed from: bifb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bifb implements bieq {

    /* renamed from: a */
    private final SemanticLocationEventRequest f120427a;

    /* renamed from: b */
    private final rnt f120428b;

    /* renamed from: c */
    private final PendingIntent f120429c;

    public bifb(SemanticLocationEventRequest semanticLocationEventRequest, rnt rnt, PendingIntent pendingIntent) {
        sdo.m34959a(semanticLocationEventRequest);
        sdo.m34959a(rnt);
        sdo.m34959a(pendingIntent);
        this.f120427a = semanticLocationEventRequest;
        this.f120428b = rnt;
        this.f120429c = pendingIntent;
    }

    /* renamed from: b */
    private final void m102207b(Status status) {
        try {
            this.f120428b.mo11797a(status);
        } catch (RemoteException e) {
        }
    }

    /* renamed from: a */
    public final int mo64569a() {
        return 2;
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

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bhqq.a(com.google.android.gms.location.places.internal.PlacesParams, boolean):bpqk
     arg types: [com.google.android.gms.location.places.internal.PlacesParams, int]
     candidates:
      bhqq.a(int, java.lang.String):bpov
      bhqq.a(java.util.Collection, boolean):bppt
      bhqq.a(int, com.google.android.gms.location.places.internal.PlacesParams):bpqk
      bhqq.a(com.google.android.gms.location.places.PlaceFilter, com.google.android.gms.location.places.internal.PlacesParams):bpqk
      bhqq.a(com.google.android.gms.location.places.internal.PlacesParams, int):bpqk
      bhqq.a(com.google.android.gms.location.places.internal.PlacesParams, java.util.List):bpqk
      bhqq.a(java.util.List, com.google.android.gms.location.places.internal.PlacesParams):bpqk
      bhqq.a(com.google.android.gms.location.places.internal.PlacesParams, boolean):bpqk */
    /* renamed from: a */
    public final bpqk mo64570a(PlacesParams placesParams) {
        return bhqq.m101356a(placesParams, true);
    }

    /* renamed from: a */
    public final void mo64571a(Context context, bidp bidp, PlacesParams placesParams) {
        try {
            m102207b((Status) bidp.mo64551a(new SemanticLocationEventSubscription(this.f120427a, placesParams, this.f120429c)).get());
        } catch (InterruptedException e) {
            throw new biem(14);
        } catch (ExecutionException e2) {
            throw new aaaj(13, e2.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo64572a(Status status) {
        m102207b(status);
    }
}
