package p000;

import com.google.android.gms.location.places.personalized.AliasedPlace;
import com.google.android.gms.location.places.personalized.AliasedPlacesResult;
import java.util.concurrent.TimeUnit;

/* renamed from: bihw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bihw extends bihy {

    /* renamed from: a */
    final /* synthetic */ biij f120642a;

    public bihw(biij biij) {
        this.f120642a = biij;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo64637b(rkk rkk) {
        AliasedPlacesResult aliasedPlacesResult = (AliasedPlacesResult) rkk;
        if (this.f120642a.f120660g == null) {
            return;
        }
        if (!aliasedPlacesResult.f79580a.mo17710c()) {
            this.f120642a.f120660g.mo64645d();
            return;
        }
        C1223np npVar = new C1223np(2);
        for (AliasedPlace aliasedPlace : aliasedPlacesResult.f79581b) {
            for (String str : aliasedPlace.f79579b) {
                npVar.put(str, aliasedPlace.f79578a);
            }
        }
        if (npVar.f26809h != 0) {
            biij biij = this.f120642a;
            rjo rjo = aema.f63501a;
            biij.f120668o = aenc.m52185a(biij.f120654a, (String[]) npVar.values().toArray(new String[npVar.f26809h]));
            biij biij2 = this.f120642a;
            biij2.f120668o.mo9459a(new bihv(biij2, npVar), cggj.m145237d(), TimeUnit.MILLISECONDS);
            return;
        }
        this.f120642a.f120660g.mo64644a(new C1223np());
    }
}
