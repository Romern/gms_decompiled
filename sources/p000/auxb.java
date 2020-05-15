package p000;

import android.text.TextUtils;
import com.google.android.gms.location.places.personalized.AliasedPlace;
import com.google.android.gms.location.places.personalized.AliasedPlacesResult;

/* renamed from: auxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auxb implements rkl {

    /* renamed from: a */
    final /* synthetic */ auxe f92679a;

    protected auxb(auxe auxe) {
        this.f92679a = auxe;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        AliasedPlacesResult aliasedPlacesResult = (AliasedPlacesResult) rkk;
        if (aliasedPlacesResult.f79580a.mo17710c()) {
            for (AliasedPlace aliasedPlace : aliasedPlacesResult.f79581b) {
                for (String str : aliasedPlace.f79579b) {
                    if ("Home".equals(str)) {
                        auxe auxe = this.f92679a;
                        auxe.f92686f = aliasedPlace.f79578a;
                        if (!TextUtils.isEmpty(auxe.f92686f)) {
                            break;
                        }
                    }
                }
            }
            if (TextUtils.isEmpty(this.f92679a.f92686f)) {
                this.f92679a.mo51008d();
            } else if (((Boolean) this.f92679a.f92689i.mo6606a()).booleanValue()) {
                auza auza = new auza(this.f92679a.f92684d);
                String str2 = this.f92679a.f92686f;
                auxa auxa = new auxa(this);
                auza.f92812a.add(new auyz(auza.m78105a(str2), new auyx(str2, auxa), auza.f92813b.mo58526a()));
                this.f92679a.f92688h.mo50732b(auxi.m78032f(this.f92679a.f92683c), System.currentTimeMillis());
                this.f92679a.f92688h.mo50737d();
            } else {
                rjo rjo = aema.f63501a;
                auxe auxe2 = this.f92679a;
                aenc.m52185a(auxe2.f92685e, auxe2.f92686f).mo9458a(new auxd(this.f92679a));
                this.f92679a.f92688h.mo50732b(auxi.m78032f(this.f92679a.f92683c), System.currentTimeMillis());
                this.f92679a.f92688h.mo50737d();
            }
        } else {
            auxe.f92681a.mo50711a("Places: Fetch home fail.", new Object[0]).mo50708c();
            this.f92679a.f92685e.mo24803g();
            this.f92679a.mo51004a();
        }
    }
}
