package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.felicanetworks.mfc.C0126R;

/* renamed from: tpx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tpx extends adcf {

    /* renamed from: a */
    public tpy f46467a;

    /* renamed from: b */
    public tsh f46468b;

    /* renamed from: c */
    public final CompoundButton.OnCheckedChangeListener f46469c = new tpu(this);

    /* renamed from: d */
    public final CompoundButton.OnCheckedChangeListener f46470d = new tpv(this);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.pwm_chromesync_settings, viewGroup, false);
        String string = getArguments().getString("pwm.DataFieldNames.accountName");
        this.f46467a = tpy.m37326a(getContext(), string, bsmt.PWM_ANDROID);
        tsh tsh = (tsh) adcj.m50162a(getActivity(), tsi.m37432a(getActivity(), string)).mo3444a(tsh.class);
        this.f46468b = tsh;
        tsh.mo26762a().mo2445a(this, new tpw(this));
        return inflate;
    }
}
