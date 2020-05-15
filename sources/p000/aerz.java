package p000;

import android.app.PendingIntent;
import com.google.android.gms.location.internal.LocationRequestInternal;

/* renamed from: aerz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aerz extends aesg {

    /* renamed from: a */
    final /* synthetic */ LocationRequestInternal f63707a;

    /* renamed from: b */
    final /* synthetic */ PendingIntent f63708b;

    /* renamed from: c */
    final /* synthetic */ aesh f63709c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aerz(aesh aesh, LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent) {
        super(true);
        this.f63709c = aesh;
        this.f63707a = locationRequestInternal;
        this.f63708b = pendingIntent;
    }

    /* renamed from: a */
    public final rke mo34500a() {
        rkb rkb = this.f63709c.f63722a;
        return rkb.mo24795b(new aejj(rkb, this.f63707a, this.f63708b));
    }
}
