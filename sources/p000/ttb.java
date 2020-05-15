package p000;

import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.support.p002v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.credential.manager.util.FadeInImageView;

/* renamed from: ttb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ttb extends tuv {

    /* renamed from: a */
    private trz f46627a;

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        Toolbar toolbar = (Toolbar) getActivity().findViewById(C0126R.C0129id.pwm_toolbar);
        toolbar.findViewById(C0126R.C0129id.google_account_title).setVisibility(8);
        toolbar.findViewById(C0126R.C0129id.toolbar_title).setVisibility(8);
        toolbar.findViewById(C0126R.C0129id.password_picker_search_button).setVisibility(8);
        menu.clear();
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.b(android.view.View, int):void
     arg types: [com.google.android.gms.credential.manager.util.FadeInImageView, int]
     candidates:
      ps.b(android.view.View, qh):qh
      ps.b(android.view.View, float):void
      ps.b(android.view.View, boolean):void
      ps.b(android.view.View, int):void */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f46627a = (trz) adcj.m50162a(getActivity(), tsi.m37432a(getActivity(), getArguments().getString("pwm.DataFieldNames.accountName"))).mo3444a(trz.class);
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.pwm_affiliated_group_details_screen, viewGroup, false);
        FadeInImageView fadeInImageView = (FadeInImageView) inflate.findViewById(C0126R.C0129id.signon_realm_icon);
        C1280ps.m19906b((View) fadeInImageView, 2);
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.affiliated_group_title);
        C0034at atVar = this.f46627a.f46572d;
        if (atVar == null || atVar.mo2448b() == null) {
            tsl.m37443a(getActivity()).mo26769b();
            return inflate;
        }
        this.f46627a.f46572d.mo2444a(this);
        this.f46627a.f46572d.mo2445a(this, new tta(this, fadeInImageView, textView));
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0126R.C0129id.credential_groups_recycler_view);
        getContext();
        recyclerView.setLayoutManager(new aah());
        recyclerView.setNestedScrollingEnabled(false);
        tnx tnx = new tnx(this.f46627a, this, tpy.m37326a(getContext(), getArguments().getString("pwm.DataFieldNames.accountName"), bsmt.PWM_ANDROID));
        if (cdpx.m134644b()) {
            int c = tsl.m37443a(getActivity()).mo26770c();
            if (c == 0) {
                throw null;
            } else if (c == 6) {
                recyclerView.setAdapter(new tol(this.f46627a, this));
                setHasOptionsMenu(true);
                return inflate;
            }
        }
        recyclerView.setAdapter(new tof(this.f46627a, tnx, this));
        setHasOptionsMenu(false);
        return inflate;
    }

    public final void onResume() {
        tsl.m37443a(getActivity()).mo26764a();
        super.onResume();
    }
}
