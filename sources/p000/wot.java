package p000;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.support.p002v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.family.model.DashboardDataModel;
import com.google.android.gms.family.model.MemberDataModel;
import com.google.android.gms.family.model.ViewerDataModel;
import com.google.android.gms.family.p042v2.model.PageData;
import com.google.android.gms.family.p042v2.model.PageDataMap;
import java.util.HashMap;
import java.util.List;

/* renamed from: wot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wot extends Fragment implements wnw {

    /* renamed from: a */
    public RecyclerView f51046a;

    /* renamed from: b */
    wny f51047b = null;

    /* renamed from: c */
    public wor f51048c;

    /* renamed from: d */
    public String f51049d;

    /* renamed from: e */
    public boolean f51050e;

    /* renamed from: f */
    public ViewerDataModel f51051f;

    /* renamed from: g */
    public String f51052g;

    /* renamed from: h */
    public wic f51053h;

    /* renamed from: i */
    public DashboardDataModel f51054i;

    /* renamed from: j */
    private ProgressBar f51055j;

    /* renamed from: k */
    private ProgressDialog f51056k = null;

    /* renamed from: l */
    private String f51057l = "";

    /* renamed from: m */
    private abu f51058m;

    /* renamed from: n */
    private View f51059n;

    /* renamed from: o */
    private Toolbar f51060o;

    /* renamed from: p */
    private boolean f51061p;

    /* renamed from: q */
    private boolean f51062q;

    /* renamed from: r */
    private boolean f51063r;

    /* renamed from: a */
    public final void mo29247a() {
        mo29248a(getString(C0126R.string.fm_just_a_sec_message));
        mo29249b();
    }

    /* renamed from: b */
    public final void mo29249b() {
        wgn.m41923c("FamilyDashboardFragment", "Refreshing the family dashboard", new Object[0]);
        this.f51054i = null;
        this.f51053h = null;
        getActivity().getSupportLoaderManager().destroyLoader(2);
        getActivity().getSupportLoaderManager().restartLoader(4, null, new woq(this));
        getActivity().getSupportLoaderManager().restartLoader(2, null, new woo(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo29250c() {
        int i;
        PageData pageData;
        HashMap hashMap;
        PageData pageData2;
        HashMap hashMap2;
        PageData pageData3;
        HashMap hashMap3;
        if (this.f51054i != null && this.f51053h != null) {
            mo29251d();
            mo29254g();
            this.f51051f = this.f51054i.f31340d;
            if (this.f51059n != null) {
                List list = this.f51053h.f50701a;
                int size = list.size();
                int i2 = 0;
                while (true) {
                    i = 1;
                    if (i2 < size) {
                        MemberDataModel memberDataModel = (MemberDataModel) list.get(i2);
                        i2++;
                        if (memberDataModel.f31356g == 1) {
                            this.f51052g = memberDataModel.f31353d;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                wgn.m41923c("FamilyDashboardFragment", "Notifying data set changed.", new Object[0]);
                wny wny = this.f51047b;
                wic wic = this.f51053h;
                DashboardDataModel dashboardDataModel = this.f51054i;
                wny.f51010f = wic.f50701a;
                wny.f51011g = wic.f50702b;
                wny.f51012h = dashboardDataModel.f31340d;
                wny.f51014j = dashboardDataModel.f31337a.mo18558a(21);
                wny.f51015k = dashboardDataModel.f31337a.mo18558a(20);
                wny.f51016l = dashboardDataModel.f31337a.mo18558a(28);
                wny.f51013i = wic.f50703c;
                wny.f51017m = wic.f50705e;
                boolean z = (!wny.f51012h.mo18431a(1) || (pageData3 = wny.f51015k) == null || (hashMap3 = pageData3.f31453a) == null || !hashMap3.containsKey(18)) ? false : wny.f51010f.size() + wny.f51011g.size() < wny.f51013i;
                boolean z2 = (!wny.f51012h.mo18431a(3) || (pageData2 = wny.f51014j) == null || (hashMap2 = pageData2.f31453a) == null) ? false : hashMap2.containsKey(18);
                boolean z3 = (!wny.f51012h.mo18431a(4) || (pageData = wny.f51016l) == null || (hashMap = pageData.f31453a) == null) ? false : hashMap.containsKey(18);
                wny.f51009e = 0;
                if (z) {
                    int[] iArr = wny.f51008d;
                    wny.f51009e = 1;
                    iArr[0] = 3;
                } else {
                    i = 0;
                }
                if (z2) {
                    int[] iArr2 = wny.f51008d;
                    int i3 = i + 1;
                    wny.f51009e = i3;
                    iArr2[i] = 4;
                    i = i3;
                }
                if (z3) {
                    int[] iArr3 = wny.f51008d;
                    wny.f51009e = i + 1;
                    iArr3[i] = 5;
                }
                this.f51046a.setAdapter(this.f51047b);
                this.f51047b.mo171aJ();
                this.f51048c.mo18505a(this.f51054i);
            } else {
                wgn.m41924d("FamilyDashboardFragment", "Cannot attach data to null view", new Object[0]);
            }
            this.f51060o.mo1700j().clear();
            this.f51060o.mo1692e(C0126R.C0130menu.fm_dashboard_menu);
            this.f51060o.f1351q = new woi(this);
            Menu j = this.f51060o.mo1700j();
            String str = this.f51053h.f50705e;
            PageDataMap pageDataMap = this.f51054i.f31337a;
            if (this.f51051f.mo18431a(0)) {
                j.findItem(C0126R.C0129id.fm_delete_family_option).setTitle((CharSequence) pageDataMap.mo18558a(34).f31453a.get(29));
            } else {
                j.findItem(C0126R.C0129id.fm_delete_family_option).setVisible(false);
            }
            if (this.f51051f.f31362c.contains(str)) {
                j.findItem(C0126R.C0129id.fm_remove_parent_privilege_option).setTitle((CharSequence) pageDataMap.mo18558a(34).f31453a.get(26));
            } else {
                j.findItem(C0126R.C0129id.fm_remove_parent_privilege_option).setVisible(false);
            }
            if (this.f51051f.f31361b.contains(str)) {
                j.findItem(C0126R.C0129id.fm_leave_family_option).setTitle((CharSequence) pageDataMap.mo18558a(34).f31453a.get(24));
            } else {
                j.findItem(C0126R.C0129id.fm_leave_family_option).setVisible(false);
            }
            if (!j.hasVisibleItems()) {
                this.f51060o.mo1686c();
            }
            DashboardDataModel dashboardDataModel2 = this.f51054i;
            if (dashboardDataModel2.f31338b) {
                wgm.m41919b(getActivity(), new woh(this)).show();
                return;
            }
            this.f51048c.mo18513a(dashboardDataModel2.f31337a);
            wic wic2 = this.f51053h;
            if (!wic2.f50704d) {
                this.f51048c.mo18511a(wic2.f50706f);
                return;
            }
            PageData pageData4 = this.f51054i.f31341e;
            if (pageData4 != null) {
                this.f51048c.mo18520b(pageData4);
            } else if (wic2.f50707g == 3) {
                bhnh a = bhnh.m101201a(getView(), (int) C0126R.string.fm_message_family_disabled, -2);
                a.mo64030a((int) C0126R.string.common_learn_more, new wok(this));
                a.mo64020c();
            }
        }
    }

    /* renamed from: d */
    public final void mo29251d() {
        ProgressDialog progressDialog = this.f51056k;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f51056k = null;
        }
    }

    /* renamed from: e */
    public final void mo29252e() {
        wgm.m41914a(getActivity()).show();
    }

    /* renamed from: f */
    public final void mo29253f() {
        ProgressBar progressBar = this.f51055j;
        if (progressBar != null) {
            progressBar.setVisibility(0);
            View view = this.f51059n;
            if (view == null) {
                wgn.m41926f("FamilyDashboardFragment", "showLoader() access dashboardView with null value", new Object[0]);
            } else {
                view.setClickable(false);
            }
        }
    }

    /* renamed from: g */
    public final void mo29254g() {
        ProgressBar progressBar = this.f51055j;
        if (progressBar != null) {
            progressBar.setVisibility(8);
            View view = this.f51059n;
            if (view == null) {
                wgn.m41926f("FamilyDashboardFragment", "hideLoader() access dashboardView with null value", new Object[0]);
            } else {
                view.setClickable(true);
            }
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getActivity().getSupportLoaderManager().initLoader(4, null, new woq(this));
        getActivity().getSupportLoaderManager().initLoader(2, null, new woo(this));
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f51048c = (wor) wgq.m41934a(wor.class, getActivity());
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f51049d = getArguments().getString("accountName");
        this.f51061p = getArguments().getBoolean("hasMemberIntent");
        this.f51062q = getArguments().getBoolean("hasSupervisedMemberIntent");
        this.f51063r = getArguments().getBoolean("hasKidIntent");
        this.f51050e = getArguments().getBoolean("directAdd");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.fm_fragment_dashboard, viewGroup, false);
        this.f51059n = inflate;
        this.f51055j = (ProgressBar) inflate.findViewById(C0126R.C0129id.fm_dashboard_progress_bar);
        mo29253f();
        RecyclerView recyclerView = (RecyclerView) this.f51059n.findViewById(C0126R.C0129id.fm_member_list_view);
        this.f51046a = recyclerView;
        recyclerView.setVisibility(8);
        Toolbar toolbar = (Toolbar) this.f51059n.findViewById(C0126R.C0129id.fm_toolbar);
        this.f51060o = toolbar;
        whb.m41941a(toolbar, getString(C0126R.string.fm_family_management_toolbar_title), getActivity());
        getActivity();
        aah aah = new aah();
        this.f51058m = aah;
        this.f51046a.setLayoutManager(aah);
        wgn.m41923c("FamilyDashboardFragment", "Created dashboard adapter", new Object[0]);
        this.f51047b = new wny(getActivity(), this, this.f51061p, this.f51062q, this.f51063r);
        if (bundle != null && bundle.getBoolean("showProgressDialog", false)) {
            if (bundle.getString("progressDialogMessage") != null) {
                mo29248a(bundle.getString("progressDialogMessage"));
            } else {
                mo29248a(getString(C0126R.string.fm_just_a_sec_message));
            }
        }
        return this.f51059n;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        getActivity().getSupportLoaderManager().destroyLoader(4);
        getActivity().getSupportLoaderManager().destroyLoader(2);
        this.f51059n = null;
    }

    public final void onDetach() {
        super.onDetach();
        this.f51048c = null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: wor.a(com.google.android.gms.family.model.MemberDataModel, java.lang.String, boolean):void
     arg types: [com.google.android.gms.family.model.MemberDataModel, java.lang.String, int]
     candidates:
      wor.a(com.google.android.gms.family.v2.model.PageData, java.lang.String, int):void
      wor.a(com.google.android.gms.family.model.MemberDataModel, java.lang.String, boolean):void */
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        int i = 0;
        if (itemId == C0126R.C0129id.fm_delete_family_option) {
            this.f51048c.mo18443b().mo29109a(10);
            wgn.m41923c("FamilyDashboardFragment", "Delete family clicked", new Object[0]);
            this.f51048c.mo18524f();
            return true;
        }
        MemberDataModel memberDataModel = null;
        if (itemId == C0126R.C0129id.fm_leave_family_option) {
            this.f51048c.mo18443b().mo29109a(15);
            wgn.m41923c("FamilyDashboardFragment", "Leave family clicked", new Object[0]);
            wor wor = this.f51048c;
            wic wic = this.f51053h;
            String str = wic.f50705e;
            List list = wic.f50701a;
            int size = list.size();
            while (true) {
                if (i >= size) {
                    break;
                }
                MemberDataModel memberDataModel2 = (MemberDataModel) list.get(i);
                i++;
                if (memberDataModel2.f31350a.equals(str)) {
                    memberDataModel = memberDataModel2;
                    break;
                }
            }
            wor.mo18508a(memberDataModel, this.f51052g, true);
            return true;
        } else if (itemId != C0126R.C0129id.fm_remove_parent_privilege_option) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            this.f51048c.mo18443b().mo29109a(24);
            wgn.m41923c("FamilyDashboardFragment", "Remove parent privilege clicked", new Object[0]);
            mo29253f();
            getActivity().getSupportLoaderManager().restartLoader(6, null, new wom(this, this.f51053h.f50705e, brcm.MEMBER));
            return true;
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f51056k != null) {
            bundle.putBoolean("showProgressDialog", true);
            bundle.putString("progressDialogMessage", this.f51057l);
            this.f51056k.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo29248a(String str) {
        ProgressDialog progressDialog = new ProgressDialog(getActivity(), wgp.m41933b(getActivity().getIntent()));
        this.f51056k = progressDialog;
        progressDialog.setIndeterminate(true);
        this.f51056k.setCanceledOnTouchOutside(false);
        this.f51056k.setMessage(str);
        this.f51056k.setCanceledOnTouchOutside(false);
        this.f51057l = str;
        this.f51056k.show();
    }
}
