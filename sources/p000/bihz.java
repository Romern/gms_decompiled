package p000;

import com.google.android.gms.location.places.personalized.AliasedPlacesResult;

/* renamed from: bihz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bihz extends bihy {

    /* renamed from: a */
    final /* synthetic */ biij f120644a;

    public bihz(biij biij) {
        this.f120644a = biij;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo64637b(rkk rkk) {
        AliasedPlacesResult aliasedPlacesResult = (AliasedPlacesResult) rkk;
        if (this.f120644a.f120659f == null) {
            return;
        }
        if (aliasedPlacesResult.f79580a.mo17710c()) {
            this.f120644a.f120659f.mo64643c();
        } else {
            this.f120644a.f120659f.mo64642b();
        }
    }
}
