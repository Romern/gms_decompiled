package p000;

import com.google.android.gms.accountsettings.p007mg.poc.p008ui.search.SearchItemsListView;
import java.util.ArrayList;

/* renamed from: faz */
final /* synthetic */ class faz implements C0038ax {

    /* renamed from: a */
    private final fbh f16184a;

    public faz(fbh fbh) {
        this.f16184a = fbh;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        fbh fbh = this.f16184a;
        boolean d = fbh.mo10664d();
        SearchItemsListView searchItemsListView = (SearchItemsListView) fbh.f16243j;
        evk evk = (evk) ((bmxv) obj).mo66815c();
        fbg fbg = new fbg(fbh);
        searchItemsListView.f7777d = evk;
        searchItemsListView.f7778e = fbg;
        if (searchItemsListView.f7776c == null) {
            searchItemsListView.mo6333a(new ArrayList(), null, null);
        }
        searchItemsListView.f7776c.mo10554a(evk, fbg);
        if (d) {
            ((SearchItemsListView) fbh.f16243j).getLayoutManager().mo63b(0, 0);
        }
    }
}
