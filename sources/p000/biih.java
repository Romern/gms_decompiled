package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;

/* renamed from: biih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class biih extends bihy {

    /* renamed from: a */
    final /* synthetic */ biij f120647a;

    /* renamed from: b */
    private final String f120648b;

    public biih(biij biij, String str) {
        this.f120647a = biij;
        this.f120648b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo64637b(rkk rkk) {
        aeli aeli = (aeli) rkk;
        if (this.f120647a.f120657d == null) {
            return;
        }
        if (!aeli.f63490b.mo17710c()) {
            biig biig = this.f120647a.f120657d;
            String str = this.f120648b;
            Fragment fragment = (Fragment) biig;
            if (fragment.isVisible()) {
                biiv biiv = (biiv) biig;
                biiv.f120685a.setVisibility(8);
                biiv.mo64667g();
                biiv.mo64658a((int) C0126R.C0128layout.places_ui_search_failed, fragment.getString(C0126R.string.common_retry), new biin(biiv, str));
                return;
            }
            return;
        }
        this.f120647a.f120669p = biij.m102441b(aeli);
        biig biig2 = this.f120647a.f120657d;
        String str2 = this.f120648b;
        aelh[] a = biij.m102440a(aeli);
        Fragment fragment2 = (Fragment) biig2;
        if (fragment2.isVisible()) {
            biiv biiv2 = (biiv) biig2;
            biiv2.f120685a.setVisibility(8);
            if (a.length == 0) {
                biiv2.mo64667g();
                biiv2.mo64658a((int) C0126R.C0128layout.places_ui_search_no_matching_places, fragment2.getString(C0126R.string.common_retry), new biim(biiv2, str2));
                return;
            }
            biis biis = biiv2.f120689e;
            if (biis != null) {
                biis.mo64656b(a);
            }
        }
    }
}
