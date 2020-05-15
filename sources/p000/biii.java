package p000;

import com.google.android.gms.location.places.personalized.AliasedPlace;
import com.google.android.gms.location.places.personalized.AliasedPlacesResult;
import java.util.List;

/* renamed from: biii */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biii extends bihy {

    /* renamed from: a */
    final /* synthetic */ biij f120649a;

    /* renamed from: b */
    private final String f120650b;

    /* renamed from: c */
    private final String f120651c;

    public biii(biij biij, String str, String str2) {
        this.f120649a = biij;
        this.f120650b = str;
        this.f120651c = str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo64637b(rkk rkk) {
        AliasedPlacesResult aliasedPlacesResult = (AliasedPlacesResult) rkk;
        if (this.f120649a.f120659f == null) {
            return;
        }
        if (aliasedPlacesResult.f79580a.mo17710c()) {
            List list = aliasedPlacesResult.f79581b;
            if (list != null) {
                String str = (String) ((AliasedPlace) list.get(0)).f79579b.get(0);
                this.f120649a.f120659f.mo64640a(((AliasedPlace) aliasedPlacesResult.f79581b.get(0)).f79578a);
                return;
            }
            this.f120649a.f120659f.mo64640a(null);
            return;
        }
        this.f120649a.f120659f.mo64641a(this.f120650b, this.f120651c);
    }
}
