package p000;

import com.google.android.gms.location.places.internal.PlacesParams;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: bibz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bibz implements Callable {

    /* renamed from: a */
    private final bibq f120178a;

    /* renamed from: b */
    private final PlacesParams f120179b;

    /* renamed from: c */
    private final List f120180c;

    public bibz(bibq bibq, List list, PlacesParams placesParams) {
        this.f120178a = bibq;
        this.f120180c = list;
        this.f120179b = placesParams;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        bibq bibq = this.f120178a;
        List list = this.f120180c;
        bvua bvua = (bvua) bibq.mo64508a(new bicf(bibq.f120155b, list), this.f120179b);
        if (bvua == null || bvua.f157645a.size() == 0) {
            return bngx.m109376e();
        }
        return bvua.f157645a;
    }
}
