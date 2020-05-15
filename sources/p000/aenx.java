package p000;

import android.app.PendingIntent;
import com.google.android.gms.location.places.PlaceRequest;

/* renamed from: aenx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aenx extends aeme {

    /* renamed from: a */
    final /* synthetic */ PlaceRequest f63543a;

    /* renamed from: b */
    final /* synthetic */ PendingIntent f63544b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aenx(rjo rjo, rkb rkb, PlaceRequest placeRequest, PendingIntent pendingIntent) {
        super(rjo, rkb);
        this.f63543a = placeRequest;
        this.f63544b = pendingIntent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        aeoa aeoa = (aeoa) rjd;
        aemf aemf = new aemf((aeme) this);
        PlaceRequest placeRequest = this.f63543a;
        PendingIntent pendingIntent = this.f63544b;
        sdo.checkIfNull(aemf, "callback == null");
        ((aeni) aeoa.mo25289B()).mo34352a(placeRequest, aeoa.f63545a, pendingIntent, aemf);
    }
}
