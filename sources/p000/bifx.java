package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.userlocation.LegacySemanticLocationEventSubscription;
import java.util.concurrent.ExecutionException;

/* renamed from: bifx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bifx implements bieq {

    /* renamed from: a */
    private final PendingIntent f120484a;

    /* renamed from: b */
    private final rnt f120485b;

    public bifx(PendingIntent pendingIntent, rnt rnt) {
        sdo.m34959a(pendingIntent);
        sdo.m34959a(rnt);
        this.f120484a = pendingIntent;
        this.f120485b = rnt;
    }

    /* renamed from: b */
    private final void m102330b(Status status) {
        try {
            this.f120485b.mo11797a(status);
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
        return false;
    }

    /* renamed from: a */
    public final void mo64571a(Context context, bidp bidp, PlacesParams placesParams) {
        try {
            m102330b((Status) bidp.mo64553b(new LegacySemanticLocationEventSubscription(LegacySemanticLocationEventSubscription.f151708a, placesParams, null, this.f120484a)).get());
        } catch (InterruptedException e) {
            throw new biem(14);
        } catch (ExecutionException e2) {
            throw new aaaj(13, e2.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo64572a(Status status) {
        m102330b(status);
    }
}
