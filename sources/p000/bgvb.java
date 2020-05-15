package p000;

import android.app.PendingIntent;
import com.google.android.gms.location.places.NearbyAlertRequest;

/* renamed from: bgvb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgvb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ PendingIntent f117619a;

    /* renamed from: b */
    final /* synthetic */ NearbyAlertRequest f117620b;

    /* renamed from: c */
    final /* synthetic */ bgvf f117621c;

    public bgvb(bgvf bgvf, PendingIntent pendingIntent, NearbyAlertRequest nearbyAlertRequest) {
        this.f117621c = bgvf;
        this.f117619a = pendingIntent;
        this.f117620b = nearbyAlertRequest;
    }

    public final void run() {
        this.f117621c.mo63269a(this.f117619a, this.f117620b);
    }
}
