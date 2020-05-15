package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.UserLocationNearbyAlertFilter;
import com.google.android.gms.userlocation.UserLocationNearbyAlertRequest;
import com.google.android.location.places.NearbyAlertSubscription;
import java.util.concurrent.ExecutionException;

/* renamed from: bift */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bift implements bieq {

    /* renamed from: a */
    private final UserLocationNearbyAlertRequest f120472a;

    /* renamed from: b */
    private final PendingIntent f120473b;

    /* renamed from: c */
    private final PendingIntent f120474c;

    /* renamed from: d */
    private final rnt f120475d;

    public bift(UserLocationNearbyAlertRequest userLocationNearbyAlertRequest, PendingIntent pendingIntent, PendingIntent pendingIntent2, rnt rnt) {
        this.f120472a = userLocationNearbyAlertRequest;
        this.f120473b = pendingIntent;
        this.f120474c = pendingIntent2;
        this.f120475d = rnt;
    }

    /* renamed from: b */
    private final void m102298b(Status status) {
        try {
            this.f120475d.mo11797a(status);
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
        return "android.permission.ACCESS_FINE_LOCATION";
    }

    /* renamed from: d */
    public final boolean mo64575d() {
        return true;
    }

    /* renamed from: a */
    public final void mo64571a(Context context, bidp bidp, PlacesParams placesParams) {
        boolean z;
        try {
            UserLocationNearbyAlertFilter userLocationNearbyAlertFilter = this.f120472a.f109594c;
            int g = (int) cgfr.m145052g();
            if (userLocationNearbyAlertFilter.f109588a.size() <= g) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34976b(z, "Too many place IDs specified in NearbyAlertFilter. Maximum allowed is %d.", Integer.valueOf(g));
            try {
                m102298b((Status) bidp.mo64551a(new NearbyAlertSubscription(this.f120472a, placesParams, this.f120473b, this.f120474c)).get());
            } catch (InterruptedException e) {
                throw new biem(14);
            } catch (ExecutionException e2) {
                throw new aaaj(13, e2.getMessage());
            }
        } catch (IllegalArgumentException | NullPointerException e3) {
            throw new aaaj(26000, e3.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo64572a(Status status) {
        m102298b(status);
    }
}
