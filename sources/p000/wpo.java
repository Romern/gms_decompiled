package p000;

import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.support.p002v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.family.model.MemberDataModel;
import com.google.android.gms.family.p042v2.model.PageData;
import java.util.ArrayList;

/* renamed from: wpo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wpo extends Fragment implements wph, wgr {

    /* renamed from: a */
    public wpj f51099a = null;

    /* renamed from: b */
    public String f51100b;

    /* renamed from: c */
    public ArrayList f51101c;

    /* renamed from: d */
    public wpm f51102d;

    /* renamed from: e */
    private RelativeLayout f51103e;

    /* renamed from: f */
    private View f51104f;

    /* renamed from: g */
    private PageData f51105g;

    /* renamed from: h */
    private PageData f51106h;

    /* renamed from: a */
    public final wia mo29263a() {
        return this.f51102d.mo18443b();
    }

    /* renamed from: b */
    public final void mo29269b() {
        RelativeLayout relativeLayout = this.f51103e;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
    }

    /* renamed from: c */
    public final void mo29270c() {
        RelativeLayout relativeLayout = this.f51103e;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
    }

    /* renamed from: d */
    public final void mo29271d() {
        wgm.m41914a(getActivity()).show();
    }

    /* renamed from: e */
    public final void mo29272e() {
        this.f51099a.mo29267c();
        this.f51099a.mo171aJ();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f51102d = (wpm) wgq.m41934a(wpm.class, getActivity());
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f51100b = getArguments().getString("accountName");
        this.f51101c = getArguments().getParcelableArrayList("MEMBERS");
        this.f51105g = (PageData) getArguments().getParcelable("mppd");
        this.f51106h = (PageData) getArguments().getParcelable("mpnepd");
        if (bundle != null) {
            this.f51101c = bundle.getParcelableArrayList("MEMBERS");
        }
        this.f51099a = new wpj(this, this.f51101c, (String) this.f51105g.f31453a.get(27));
        if (bundle != null && bundle.getBundle("mpvs") != null) {
            this.f51099a.f51089e = bundle.getBundle("mpvs").getString("tmid");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string = getArguments().getString("accountName");
        if (this.f51101c.size() == 1) {
            PageData pageData = this.f51106h;
            this.f51104f = layoutInflater.inflate((int) C0126R.C0128layout.fm_fragment_manage_parents_none_eligible, viewGroup, false);
            if (pageData.f31453a.containsKey(3)) {
                wgz.m41940a((TextView) this.f51104f.findViewById(C0126R.C0129id.fm_manage_parents_none_eligible_body_text), (String) pageData.f31453a.get(3), new wgt(pageData, this, string));
            }
            if (pageData.f31453a.containsKey(2)) {
                whb.m41941a((Toolbar) this.f51104f.findViewById(C0126R.C0129id.fm_toolbar), (String) pageData.f31453a.get(2), getActivity());
            }
            if (pageData.f31453a.containsKey(28)) {
                wgz.m41940a((TextView) this.f51104f.findViewById(C0126R.C0129id.fm_manage_parents_none_eligible_subheader_text), (String) pageData.f31453a.get(28), new wgt(pageData, this, string));
            }
            return this.f51104f;
        }
        this.f51104f = layoutInflater.inflate((int) C0126R.C0128layout.fm_fragment_manage_parents, viewGroup, false);
        if (this.f51105g.f31453a.containsKey(3)) {
            wgz.m41940a((TextView) this.f51104f.findViewById(C0126R.C0129id.fm_manage_parents_page_primary_text), (String) this.f51105g.f31453a.get(3), new wgt(this.f51105g, this, string));
        }
        RecyclerView recyclerView = (RecyclerView) this.f51104f.findViewById(C0126R.C0129id.fm_manage_parents_list_view);
        recyclerView.setAdapter(this.f51099a);
        recyclerView.setVisibility(0);
        RelativeLayout relativeLayout = (RelativeLayout) this.f51104f.findViewById(C0126R.C0129id.fm_manage_parents_progress_bar_container);
        this.f51103e = relativeLayout;
        relativeLayout.setVisibility(8);
        if (this.f51105g.f31453a.containsKey(2)) {
            whb.m41941a((Toolbar) this.f51104f.findViewById(C0126R.C0129id.fm_toolbar), (String) this.f51105g.f31453a.get(2), getActivity());
        }
        if (this.f51105g.f31453a.containsKey(12)) {
            wgz.m41940a((TextView) this.f51104f.findViewById(C0126R.C0129id.fm_manage_parents_page_additional_text), (String) this.f51105g.f31453a.get(12), new wgt(this.f51105g, this, string));
        }
        getActivity();
        recyclerView.setLayoutManager(new aah());
        return this.f51104f;
    }

    public final void onDetach() {
        super.onDetach();
        this.f51102d = null;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        wpj wpj = this.f51099a;
        Bundle bundle2 = new Bundle();
        bundle2.putString("tmid", wpj.f51089e);
        bundle.putBundle("mpvs", bundle2);
        bundle.putString("accountName", this.f51100b);
        bundle.putParcelableArrayList("MEMBERS", this.f51101c);
    }

    /* renamed from: a */
    public final void mo29264a(MemberDataModel memberDataModel) {
        brcm brcm;
        mo29269b();
        brcm a = brcm.m113875a(memberDataModel.f31356g);
        if (a == brcm.MEMBER) {
            brcm = brcm.PARENT;
        } else {
            brcm = a == brcm.PARENT ? brcm.MEMBER : brcm.UNKNOWN_FAMILY_ROLE;
        }
        getActivity().getSupportLoaderManager().restartLoader(6, null, new wpl(this, memberDataModel.f31350a, brcm));
    }
}
