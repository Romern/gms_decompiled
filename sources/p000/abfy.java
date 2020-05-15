package p000;

import android.support.p002v7.widget.RecyclerView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import java.util.List;

/* renamed from: abfy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abfy {

    /* renamed from: a */
    public final HelpChimeraActivity f57375a;

    /* renamed from: b */
    public final aasq f57376b;

    /* renamed from: c */
    public RecyclerView f57377c;

    /* renamed from: d */
    public abge f57378d;

    /* renamed from: e */
    public abfu f57379e;

    /* renamed from: f */
    public ListView f57380f;

    /* renamed from: g */
    public aazr f57381g;

    public abfy(HelpChimeraActivity helpChimeraActivity) {
        this.f57375a = helpChimeraActivity;
        this.f57376b = new aasq(helpChimeraActivity);
        if (mo32075b()) {
            RecyclerView recyclerView = (RecyclerView) helpChimeraActivity.findViewById(C0126R.C0129id.gh_search_results_list);
            this.f57377c = recyclerView;
            recyclerView.setLayoutManager(new aah());
            this.f57378d = new abge(helpChimeraActivity);
            this.f57379e = new abfu(helpChimeraActivity);
            return;
        }
        this.f57380f = (ListView) helpChimeraActivity.findViewById(C0126R.C0129id.gh_search_results_list);
        aazr aazr = new aazr(helpChimeraActivity);
        this.f57381g = aazr;
        this.f57380f.setAdapter((ListAdapter) aazr);
    }

    /* renamed from: a */
    public final void mo32074a() {
        this.f57377c.setAdapter(this.f57378d);
        this.f57378d.mo32082a((String) null, (List) null);
    }

    /* renamed from: b */
    public final boolean mo32075b() {
        return this.f57375a.f56986y != null && aaya.m47228a(cegf.m136774b()) && aaya.m47228a(cegr.m136796b());
    }
}
