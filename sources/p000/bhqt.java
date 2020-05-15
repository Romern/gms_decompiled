package p000;

import android.util.Log;
import com.android.volley.VolleyError;

/* renamed from: bhqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhqt implements bial {

    /* renamed from: a */
    final /* synthetic */ boolean f119352a;

    /* renamed from: b */
    final /* synthetic */ bhvt f119353b;

    public bhqt(bhvt bhvt, boolean z) {
        this.f119353b = bhvt;
        this.f119352a = z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo64172a(Object obj) {
        bvuj bvuj = (bvuj) obj;
        bxwc bxwc = bvuj.f157701b;
        bxwc bxwc2 = bvuj.f157700a;
        this.f119353b.mo64346a((bvoa[]) bxwc.toArray(new bvoa[bxwc.size()]), (bvnp[]) bxwc2.toArray(new bvnp[bxwc2.size()]), this.f119352a);
    }

    /* renamed from: a */
    public final void mo64173a(Throwable th) {
        if (Log.isLoggable("Places", 5)) {
            bioi.m102661b("Places", "getPlaceInfos (SLS) failure", th);
            if (th instanceof VolleyError) {
                int a = biam.m101858a((VolleyError) th);
                StringBuilder sb = new StringBuilder(43);
                sb.append("getPlaceInfos (SLS) VolleyError ");
                sb.append(a);
                bioi.m102662c("Places", sb.toString());
            }
        }
        this.f119353b.mo64345a(this.f119352a);
    }
}
