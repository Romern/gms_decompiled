package p000;

import android.app.PendingIntent;
import com.google.android.gms.location.internal.LocationRequestInternal;

/* renamed from: aejj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aejj extends aeid {

    /* renamed from: a */
    final /* synthetic */ LocationRequestInternal f63452a;

    /* renamed from: b */
    final /* synthetic */ PendingIntent f63453b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aejj(rkb rkb, LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent) {
        super(rkb);
        this.f63452a = locationRequestInternal;
        this.f63453b = pendingIntent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        ((aekl) rjd).mo34254a(this.f63452a, this.f63453b, new aejm(this));
    }
}
