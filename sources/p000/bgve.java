package p000;

import android.app.PendingIntent;
import com.google.android.gms.location.places.NearbyAlertRequest;

/* renamed from: bgve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgve implements Runnable {

    /* renamed from: a */
    final /* synthetic */ PendingIntent f117627a;

    /* renamed from: b */
    final /* synthetic */ NearbyAlertRequest f117628b;

    /* renamed from: c */
    final /* synthetic */ bgvf f117629c;

    public bgve(bgvf bgvf, PendingIntent pendingIntent, NearbyAlertRequest nearbyAlertRequest) {
        this.f117629c = bgvf;
        this.f117627a = pendingIntent;
        this.f117628b = nearbyAlertRequest;
    }

    public final void run() {
        bgvf bgvf = this.f117629c;
        bgvf.f117631b = null;
        if (((long) bgvf.f117632c) < chcs.f188354a.mo6606a().mo85039aA()) {
            bgvf bgvf2 = this.f117629c;
            bgvf2.f117632c++;
            bgvf2.mo63269a(this.f117627a, this.f117628b);
        }
    }
}
