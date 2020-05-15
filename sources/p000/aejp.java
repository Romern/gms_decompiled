package p000;

import android.app.PendingIntent;
import com.google.android.gms.location.GeofencingRequest;

/* renamed from: aejp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aejp extends aejr {

    /* renamed from: a */
    final /* synthetic */ GeofencingRequest f63457a;

    /* renamed from: b */
    final /* synthetic */ PendingIntent f63458b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aejp(rkb rkb, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        super(rkb);
        this.f63457a = geofencingRequest;
        this.f63458b = pendingIntent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        ((aekl) rjd).mo34252a(this.f63457a, this.f63458b, this);
    }
}
