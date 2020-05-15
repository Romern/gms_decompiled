package p000;

import android.content.UriMatcher;
import java.util.Comparator;

/* renamed from: dhu */
final /* synthetic */ class dhu implements Comparator {

    /* renamed from: a */
    static final Comparator f13190a = new dhu();

    private dhu() {
    }

    public final int compare(Object obj, Object obj2) {
        dka dka = (dka) obj;
        dka dka2 = (dka) obj2;
        UriMatcher uriMatcher = dhw.f13192a;
        return bneu.f131545b.mo67471a(dka.mo9183R(), dka2.mo9183R()).mo67473a(dka.mo9185c(), dka2.mo9185c()).mo67470a();
    }
}
