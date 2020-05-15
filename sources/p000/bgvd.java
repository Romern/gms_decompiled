package p000;

import android.app.PendingIntent;
import com.google.android.gms.location.places.NearbyAlertRequest;
import java.util.concurrent.TimeUnit;

/* renamed from: bgvd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgvd implements aubq {

    /* renamed from: a */
    final /* synthetic */ PendingIntent f117624a;

    /* renamed from: b */
    final /* synthetic */ NearbyAlertRequest f117625b;

    /* renamed from: c */
    final /* synthetic */ bgvf f117626c;

    public bgvd(bgvf bgvf, PendingIntent pendingIntent, NearbyAlertRequest nearbyAlertRequest) {
        this.f117626c = bgvf;
        this.f117624a = pendingIntent;
        this.f117625b = nearbyAlertRequest;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        if (!aucb.mo50384b()) {
            bgur.m100025c("GCoreUlr", "Registration for Nearby Alerts failed.");
            if (chcs.f188354a.mo6606a().mo85041aC() && this.f117626c.f117631b == null) {
                long x = chcs.m148252x();
                StringBuilder sb = new StringBuilder(46);
                sb.append("Retrying again in ");
                sb.append(x);
                sb.append(" seconds");
                bgur.m100011a("GCoreUlr", sb.toString());
                bgvf bgvf = this.f117626c;
                bgvf.f117631b = bgvf.f117630a.mo25814a(new bgve(bgvf, this.f117624a, this.f117625b), chcs.m148252x(), TimeUnit.SECONDS);
                return;
            }
            return;
        }
        this.f117626c.f117632c = 0;
    }
}
