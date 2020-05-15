package p000;

import android.os.Build;
import android.os.Bundle;
import android.support.p002v7.widget.Toolbar;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.felicanetworks.mfc.C0126R;

/* renamed from: tuf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tuf extends tuv {
    /* renamed from: a */
    public final void mo26810a(boolean z) {
        ((SwipeRefreshLayout) getActivity().findViewById(C0126R.C0129id.main_swipe_refresh_layout)).mo2090a(z);
        ((Toolbar) getActivity().findViewById(C0126R.C0129id.pwm_toolbar)).findViewById(C0126R.C0129id.password_picker_search_button).setVisibility(!z ? 0 : 8);
    }

    public final void onCreate(Bundle bundle) {
        setHasOptionsMenu(true);
        super.onCreate(bundle);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        Toolbar toolbar = (Toolbar) getActivity().findViewById(C0126R.C0129id.pwm_toolbar);
        tsm a = tsl.m37443a(getActivity());
        toolbar.findViewById(C0126R.C0129id.google_account_title).setVisibility(8);
        toolbar.findViewById(C0126R.C0129id.toolbar_title).setVisibility(0);
        toolbar.findViewById(C0126R.C0129id.password_picker_search_button).setOnClickListener(new tum(a));
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
     method: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.a(boolean, int):void
     arg types: [int, int]
     candidates:
      androidx.swiperefreshlayout.widget.SwipeRefreshLayout.a(int, int):android.view.animation.Animation
      androidx.swiperefreshlayout.widget.SwipeRefreshLayout.a(boolean, boolean):void
      androidx.swiperefreshlayout.widget.SwipeRefreshLayout.a(android.view.View, int):void
      pf.a(android.view.View, int):void
      pf.a(android.view.View, int):void
      androidx.swiperefreshlayout.widget.SwipeRefreshLayout.a(boolean, int):void */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.pwm_picker_screen, viewGroup, false);
        ((SwipeRefreshLayout) getActivity().findViewById(C0126R.C0129id.main_swipe_refresh_layout)).mo2091a(false, tvc.m37515a(!getActivity().getIntent().hasExtra("pwm.DataFieldNames.pickerWarningText") ? 50 : 140));
        String string = getArguments().getString("pwm.DataFieldNames.accountName");
        if (((tsw) getChildFragmentManager().findFragmentByTag("password_list_fragment_tag_on_picker")) == null) {
            getChildFragmentManager().beginTransaction().add(C0126R.C0129id.password_list_container, tsw.m37457a(string, false), "password_list_fragment_tag_on_picker").commitNow();
        }
        if (getActivity().getIntent().hasExtra("pwm.DataFieldNames.pickerWarningText")) {
            int i = Build.VERSION.SDK_INT;
            ((TextView) inflate.findViewById(C0126R.C0129id.picker_warning_text_description)).setText(Html.fromHtml(getActivity().getIntent().getStringExtra("pwm.DataFieldNames.pickerWarningText"), 63));
            inflate.findViewById(C0126R.C0129id.picker_warning_text_card).setVisibility(0);
        }
        tsf tsf = (tsf) adcj.m50162a(getActivity(), tsi.m37432a(getActivity(), string)).mo3444a(tsf.class);
        if (tsf.mo26759c().mo2448b() == null || ((tql) tsf.mo26759c().mo2448b()).mo26735a() == null) {
            mo26810a(true);
            tsf.mo26755a();
            tsf.mo26759c().mo2445a(this, new tue(this));
        } else {
            mo26810a(false);
            mo26811a(((bngx) ((tql) tsf.mo26759c().mo2448b()).mo26735a()).isEmpty(), inflate);
        }
        return inflate;
    }

    /* renamed from: a */
    public final void mo26811a(boolean z, View view) {
        int i;
        int i2 = 0;
        int i3 = 8;
        if (!z) {
            i = 8;
        } else {
            i = 0;
        }
        if (z) {
            i2 = 8;
        }
        view.findViewById(C0126R.C0129id.warm_welcome_screen_layout).setVisibility(i);
        view.findViewById(C0126R.C0129id.password_list_container).setVisibility(i2);
        View findViewById = view.findViewById(C0126R.C0129id.picker_warning_text_card);
        if (getActivity().getIntent().hasExtra("pwm.DataFieldNames.pickerWarningText")) {
            i3 = i2;
        }
        findViewById.setVisibility(i3);
        ((Toolbar) getActivity().findViewById(C0126R.C0129id.pwm_toolbar)).findViewById(C0126R.C0129id.password_picker_search_button).setVisibility(i2);
    }
}
