package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.location.places.NearbyAlertSubscription;
import java.util.concurrent.ExecutionException;

/* renamed from: bifw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bifw implements bieq {

    /* renamed from: a */
    private final PendingIntent f120482a;

    /* renamed from: b */
    private final rnt f120483b;

    public bifw(PendingIntent pendingIntent, rnt rnt) {
        sdo.m34959a(pendingIntent);
        sdo.m34959a(rnt);
        this.f120482a = pendingIntent;
        this.f120483b = rnt;
    }

    /* renamed from: b */
    private final void m102322b(Status status) {
        try {
            this.f120483b.mo11797a(status);
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
        return 1;
    }

    /* renamed from: c */
    public final String mo64574c() {
        return "";
    }

    /* renamed from: d */
    public final boolean mo64575d() {
        return false;
    }

    /* renamed from: a */
    public final void mo64571a(Context context, bidp bidp, PlacesParams placesParams) {
        try {
            m102322b((Status) bidp.mo64553b(new NearbyAlertSubscription(NearbyAlertSubscription.f150835a, PlacesParams.f79571a, null, this.f120482a)).get());
        } catch (InterruptedException e) {
            throw new biem(14);
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2.getCause());
        }
    }

    /* renamed from: a */
    public final void mo64572a(Status status) {
        m102322b(status);
    }
}
