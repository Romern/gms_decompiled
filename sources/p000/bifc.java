package p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.SemanticLocationUpdateRequest;
import com.google.android.userlocation.SemanticLocationUpdateSubscription;
import java.util.concurrent.ExecutionException;

/* renamed from: bifc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bifc implements bieq {

    /* renamed from: a */
    private final SemanticLocationUpdateRequest f120430a;

    /* renamed from: b */
    private final rnt f120431b;

    /* renamed from: c */
    private final avxh f120432c;

    public bifc(SemanticLocationUpdateRequest semanticLocationUpdateRequest, rnt rnt, avxh avxh) {
        sdo.m34959a(semanticLocationUpdateRequest);
        sdo.m34959a(rnt);
        sdo.m34959a(avxh);
        this.f120430a = semanticLocationUpdateRequest;
        this.f120431b = rnt;
        this.f120432c = avxh;
    }

    /* renamed from: b */
    private final void m102215b(Status status) {
        try {
            this.f120431b.mo11797a(status);
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
        return false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bhqq.b(com.google.android.gms.location.places.internal.PlacesParams, boolean):bpqk
     arg types: [com.google.android.gms.location.places.internal.PlacesParams, int]
     candidates:
      bhqq.b(int, com.google.android.gms.location.places.internal.PlacesParams):bpqk
      bhqq.b(com.google.android.gms.location.places.internal.PlacesParams, boolean):bpqk */
    /* renamed from: a */
    public final bpqk mo64570a(PlacesParams placesParams) {
        return bhqq.m101364b(placesParams, true);
    }

    /* renamed from: a */
    public final void mo64571a(Context context, bidp bidp, PlacesParams placesParams) {
        try {
            m102215b((Status) bidp.mo64551a(new SemanticLocationUpdateSubscription(this.f120430a, placesParams, this.f120432c)).get());
        } catch (InterruptedException e) {
            throw new biem(14);
        } catch (ExecutionException e2) {
            throw new aaaj(13, e2.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo64572a(Status status) {
        m102215b(status);
    }
}
