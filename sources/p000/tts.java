package p000;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.felicanetworks.mfc.C0126R;

/* renamed from: tts */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tts extends tuv implements tut {

    /* renamed from: a */
    public tsb f46657a;

    /* renamed from: b */
    private final boolean m37474b() {
        return this.f46657a.mo26754b().mo2448b() != null && ((tql) this.f46657a.mo26754b().mo2448b()).mo26737c() == 2;
    }

    /* renamed from: a */
    public final void mo26799a(boolean z) {
        ((SwipeRefreshLayout) getActivity().findViewById(C0126R.C0129id.main_swipe_refresh_layout)).mo2090a(z);
    }

    public final void onCreate(Bundle bundle) {
        setHasOptionsMenu(true);
        super.onCreate(bundle);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        ((deu) getActivity()).mo8628aW().mo15863e((int) C0126R.C0127drawable.quantum_gm_ic_close_vd_theme_24);
        getActivity().findViewById(C0126R.C0129id.google_account_title).setVisibility(8);
        menu.clear();
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getActivity().getWindow().setFlags(8192, 8192);
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.pwm_enhanced_protection_screen, viewGroup, false);
        tsb tsb = (tsb) adcj.m50162a(getActivity(), tsi.m37432a(getActivity(), getArguments().getString("pwm.DataFieldNames.accountName"))).mo3444a(tsb.class);
        this.f46657a = tsb;
        tsb.mo26754b().mo2445a(this, new ttq(this));
        inflate.findViewById(C0126R.C0129id.ep_screen_button).setOnClickListener(new ttr(this));
        tuw.m37506a((TextView) inflate.findViewById(C0126R.C0129id.ep_screen_error_description), C0126R.string.pwm_ep_screen_error, Uri.parse(cdpr.m134630b()));
        return inflate;
    }

    /* renamed from: a */
    public final boolean mo26792a() {
        if (!m37474b()) {
            this.f46657a.f46574a.f46512c.mo2450b((Object) null);
        }
        return m37474b();
    }
}
