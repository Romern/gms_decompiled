package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.chromesync.ChromeSyncState;

/* renamed from: tul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tul extends tuv {

    /* renamed from: a */
    private tsb f46683a;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.pwm_settings_screen, viewGroup, false);
        String string = getArguments().getString("pwm.DataFieldNames.accountName");
        if (((tpt) getChildFragmentManager().findFragmentByTag("blacklist_fragment_tag")) == null) {
            tpt tpt = new tpt();
            Bundle bundle2 = new Bundle();
            bundle2.putString("pwm.DataFieldNames.accountName", string);
            tpt.setArguments(bundle2);
            getChildFragmentManager().beginTransaction().add(C0126R.C0129id.blacklist_container, tpt, "blacklist_fragment_tag").commitNow();
        }
        if (((tpx) getChildFragmentManager().findFragmentByTag("chromesync_settings_fragment_tag")) == null) {
            tpx tpx = new tpx();
            Bundle bundle3 = new Bundle();
            bundle3.putString("pwm.DataFieldNames.accountName", string);
            tpx.setArguments(bundle3);
            getChildFragmentManager().beginTransaction().add(C0126R.C0129id.chromesync_settings_container, tpx, "chromesync_settings_fragment_tag").commitNow();
        }
        this.f46683a = (tsb) adcj.m50162a(getActivity(), tsi.m37432a(getActivity(), getArguments().getString("pwm.DataFieldNames.accountName"))).mo3444a(tsb.class);
        if (cdpr.f181533a.mo6606a().mo78159a() && this.f46683a.mo26753a().mo2448b() != null && ((tql) this.f46683a.mo26753a().mo2448b()).mo26735a() != null && ((ChromeSyncState) ((tql) this.f46683a.mo26753a().mo2448b()).mo26735a()).f30013d) {
            inflate.findViewById(C0126R.C0129id.ep_card).setVisibility(0);
            inflate.findViewById(C0126R.C0129id.ep_card_learn_more_button).setOnClickListener(new tuj(this));
            inflate.findViewById(C0126R.C0129id.ep_card_button).setOnClickListener(new tuk(this));
            if (!(this.f46683a.mo26753a().mo2448b() == null || ((tql) this.f46683a.mo26753a().mo2448b()).mo26735a() == null || ((ChromeSyncState) ((tql) this.f46683a.mo26753a().mo2448b()).mo26735a()).f30011b != 5)) {
                inflate.findViewById(C0126R.C0129id.ep_card_state_icon).setVisibility(0);
                inflate.findViewById(C0126R.C0129id.ep_card_state_text).setVisibility(0);
                inflate.findViewById(C0126R.C0129id.ep_card_button).setVisibility(8);
            }
        }
        return inflate;
    }
}
