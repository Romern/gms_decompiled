package p000;

import android.app.PendingIntent;
import com.google.android.gms.location.places.NearbyAlertRequest;

/* renamed from: aenw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aenw extends aeme {

    /* renamed from: a */
    final /* synthetic */ NearbyAlertRequest f63541a;

    /* renamed from: b */
    final /* synthetic */ PendingIntent f63542b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aenw(rjo rjo, rkb rkb, NearbyAlertRequest nearbyAlertRequest, PendingIntent pendingIntent) {
        super(rjo, rkb);
        this.f63541a = nearbyAlertRequest;
        this.f63542b = pendingIntent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        aeoa aeoa = (aeoa) rjd;
        aemf aemf = new aemf((aeme) this);
        NearbyAlertRequest nearbyAlertRequest = this.f63541a;
        PendingIntent pendingIntent = this.f63542b;
        sdo.checkIfNull(aemf, "callback == null");
        ((aeni) aeoa.mo25289B()).mo34349a(nearbyAlertRequest, aeoa.f63545a, pendingIntent, aemf);
    }
}
