package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.widget.phone.SwitchBar;

/* renamed from: auwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auwj extends aupa {

    /* renamed from: c */
    public SwitchBar f92658c;

    /* renamed from: d */
    public boolean f92659d;

    /* renamed from: e */
    public final void mo50626e() {
        auol g = mo50786g();
        this.f92659d = false;
        if (g != null) {
            boolean c = g.mo50736c("auth_trust_agent_pref_trustlet_enabled_com.google.android.gms.auth.trustagent.trustlet.PhonePositionTrustlet");
            this.f92659d = c;
            this.f92658c.setChecked(c);
        }
        auwo.m77985a(getActivity(), 7, this.f92659d);
        this.f92658c.setClickable(true);
        this.f92658c.setOnClickListener(new auwg(this));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo9318a((int) C0126R.xml.on_body_detection_preferences);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.auth_on_body_detection_prompt, viewGroup, false);
        SwitchBar switchBar = (SwitchBar) inflate.findViewById(C0126R.C0129id.on_body_detection_switch_bar);
        this.f92658c = switchBar;
        switchBar.setEnabled(true);
        return inflate;
    }
}
