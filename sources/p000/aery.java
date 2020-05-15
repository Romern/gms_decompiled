package p000;

import android.os.Looper;
import com.google.android.gms.location.internal.LocationRequestInternal;

/* renamed from: aery */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aery extends aesg {

    /* renamed from: a */
    final /* synthetic */ LocationRequestInternal f63703a;

    /* renamed from: b */
    final /* synthetic */ aehy f63704b;

    /* renamed from: c */
    final /* synthetic */ Looper f63705c;

    /* renamed from: d */
    final /* synthetic */ aesh f63706d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aery(aesh aesh, LocationRequestInternal locationRequestInternal, aehy aehy, Looper looper) {
        super(true);
        this.f63706d = aesh;
        this.f63703a = locationRequestInternal;
        this.f63704b = aehy;
        this.f63705c = looper;
    }

    /* renamed from: a */
    public final rke mo34500a() {
        rkb rkb = this.f63706d.f63722a;
        return rkb.mo24795b(new aeji(rkb, this.f63703a, this.f63704b, this.f63705c));
    }
}
