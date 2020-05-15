package p000;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.os.Bundle;
import android.support.p002v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;

/* renamed from: acve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acve extends Fragment {

    /* renamed from: a */
    public acuv f60867a;

    /* renamed from: b */
    public ListView f60868b;

    /* renamed from: c */
    public View f60869c;

    /* renamed from: d */
    public View f60870d;

    /* renamed from: e */
    public MenuItem f60871e;

    /* renamed from: f */
    public SearchView f60872f;

    /* renamed from: g */
    public CharSequence f60873g = "";

    /* renamed from: h */
    public SwipeRefreshLayout f60874h;

    /* renamed from: i */
    private String f60875i;

    /* renamed from: j */
    private String f60876j;

    /* renamed from: k */
    private String f60877k;

    /* renamed from: l */
    private boolean f60878l = true;

    /* renamed from: a */
    public final void mo33131a(String str) {
        this.f60873g = str;
        acvd acvd = new acvd(this);
        acvd.getClass();
        acvd.execute(new acvb(this.f60875i, this.f60876j, this.f60877k, str));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(C0126R.C0130menu.app_indexing_debug_menu, menu);
        SearchManager searchManager = (SearchManager) getActivity().getSystemService("search");
        if (searchManager == null) {
            super.onCreateOptionsMenu(menu, menuInflater);
            return;
        }
        SearchableInfo searchableInfo = searchManager.getSearchableInfo(getActivity().getComponentName());
        if (searchableInfo == null) {
            super.onCreateOptionsMenu(menu, menuInflater);
            return;
        }
        MenuItem findItem = menu.findItem(C0126R.C0129id.app_indexing_debug_search);
        this.f60871e = findItem;
        if (findItem == null) {
            super.onCreateOptionsMenu(menu, menuInflater);
            return;
        }
        C1264pc.m19828a(findItem, new acva(this));
        SearchView searchView = (SearchView) C1264pc.m19826a(this.f60871e);
        this.f60872f = searchView;
        if (searchView == null) {
            super.onCreateOptionsMenu(menu, menuInflater);
            return;
        }
        searchView.mo1614a(searchableInfo);
        this.f60872f.mo1615a((CharSequence) getActivity().getString(C0126R.string.search_view_hint, new Object[]{"Indexables"}));
        if (!this.f60878l) {
            this.f60869c.post(new acuw(this));
        }
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.generic_list_fragment, viewGroup, false);
        this.f60869c = inflate.findViewById(C0126R.C0129id.main_view);
        this.f60870d = inflate.findViewById(C0126R.C0129id.progress_bar);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C0126R.C0129id.swipe_container);
        this.f60874h = swipeRefreshLayout;
        swipeRefreshLayout.setEnabled(true);
        this.f60874h.f1697a = new acux(this);
        ListView listView = (ListView) inflate.findViewById(C0126R.C0129id.generic_list_view);
        this.f60868b = listView;
        listView.setEmptyView(inflate.findViewById(C0126R.C0129id.no_items_message));
        ((TextView) inflate.findViewById(C0126R.C0129id.no_items_message)).setText((int) C0126R.string.no_indexables);
        acuv acuv = new acuv(getActivity());
        this.f60867a = acuv;
        this.f60868b.setAdapter((ListAdapter) acuv);
        this.f60868b.setOnItemClickListener(new acuy(this));
        this.f60868b.setOnScrollListener(new acuz(this));
        this.f60875i = getArguments().getString("packageName");
        this.f60876j = getArguments().getString("corpusName");
        this.f60877k = getArguments().getString("indexableType");
        mo33131a(this.f60873g.toString());
        return inflate;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        SearchView searchView = this.f60872f;
        if (searchView != null) {
            this.f60873g = searchView.mo1625d();
            this.f60878l = this.f60872f.f1263p;
        }
    }

    public final void onResume() {
        super.onResume();
        getActivity().setTitle("Indexables");
        C1341rz aW = ((deu) getActivity()).mo8628aW();
        if (aW != null) {
            aW.mo15852b(getActivity().getString(C0126R.string.indexables_subtitle, new Object[]{this.f60877k, "Indexables"}));
        }
    }
}
