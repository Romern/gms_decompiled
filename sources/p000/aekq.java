package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;

/* renamed from: aekq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aekq extends aeid {

    /* renamed from: a */
    final /* synthetic */ LocationSettingsRequest f63472a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aekq(rkb rkb, LocationSettingsRequest locationSettingsRequest) {
        super(rkb);
        this.f63472a = locationSettingsRequest;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        ((aekl) rjd).mo34253a(this.f63472a, this, (String) null);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return new LocationSettingsResult(status);
    }
}
