package p000;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.location.places.NearbyAlertRequest;
import java.util.concurrent.ScheduledFuture;

/* renamed from: bgvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgvf {

    /* renamed from: a */
    public final snf f117630a;

    /* renamed from: b */
    public ScheduledFuture f117631b;

    /* renamed from: c */
    public int f117632c = 0;

    /* renamed from: d */
    public final bgva f117633d;

    public bgvf(Context context) {
        bgva bgva = new bgva(context);
        snf a = snp.m35703a(1, 10);
        this.f117633d = bgva;
        this.f117630a = a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo63269a(PendingIntent pendingIntent, NearbyAlertRequest nearbyAlertRequest) {
        if (pendingIntent != null) {
            this.f117633d.mo63265a().mo34299a(nearbyAlertRequest, pendingIntent).mo50371a(new bgvd(this, pendingIntent, nearbyAlertRequest));
        } else {
            bgur.m100025c("GCoreUlr", "Invalid parameters given. Not registering for nearby alerts");
        }
    }
}
