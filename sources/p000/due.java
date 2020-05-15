package p000;

import com.google.android.contextmanager.fence.PlaceFenceHelper;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: due */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class due extends dqi {

    /* renamed from: a */
    final /* synthetic */ String f14031a;

    /* renamed from: b */
    final /* synthetic */ dvd f14032b;

    /* renamed from: c */
    final /* synthetic */ dug f14033c;

    /* renamed from: d */
    final /* synthetic */ PlaceFenceHelper f14034d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public due(PlaceFenceHelper placeFenceHelper, String str, Object[] objArr, String str2, dvd dvd, dug dug) {
        super(str, objArr);
        this.f14034d = placeFenceHelper;
        this.f14031a = str2;
        this.f14032b = dvd;
        this.f14033c = dug;
    }

    /* renamed from: a */
    public final void mo9608a(aelj aelj) {
        aelh aelh;
        try {
            if (aelj.mo24660a() == 0 || (aelh = (aelh) aelj.mo24661a(0)) == null) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68432a("due", "a", 356, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[PlaceFenceHelper] Place not found");
            } else {
                LatLng d = aelh.mo8010d();
                new Object[1][0] = d;
                PlaceFenceHelper placeFenceHelper = this.f14034d;
                placeFenceHelper.mo6263a(this.f14031a, d.f79894a, d.f79895b, placeFenceHelper.mo6260a(aelh), this.f14032b, this.f14033c);
            }
        } finally {
            aelj.mo12460c();
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9366a(Object obj) {
        aelh aelh;
        aelj aelj = (aelj) obj;
        try {
            if (aelj.mo24660a() == 0 || (aelh = (aelh) aelj.mo24661a(0)) == null) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68432a("due", "a", 356, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[PlaceFenceHelper] Place not found");
            } else {
                LatLng d = aelh.mo8010d();
                new Object[1][0] = d;
                PlaceFenceHelper placeFenceHelper = this.f14034d;
                placeFenceHelper.mo6263a(this.f14031a, d.f79894a, d.f79895b, placeFenceHelper.mo6260a(aelh), this.f14032b, this.f14033c);
            }
        } finally {
            aelj.mo12460c();
        }
    }
}
