package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.gms.cast.activity.CastNearbyPinChimeraActivity;

/* renamed from: phe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class phe extends Fragment {

    /* renamed from: a */
    public Fragment f39100a;

    /* renamed from: b */
    public String f39101b;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.cast_nearby_fragment_mic_authorization, viewGroup, false);
        qay.m31785b(getActivity()).edit().remove("castnearby.optIn").apply();
        inflate.findViewById(C0126R.C0129id.skip_button).setOnClickListener(new phc(this));
        inflate.findViewById(C0126R.C0129id.connect_button).setOnClickListener(new phd(this));
        if (((phj) ((CastNearbyPinChimeraActivity) getActivity()).f29865b).mo23082e().isEmpty()) {
            this.f39100a = new phb();
            this.f39101b = "ConnectingFragment";
        } else {
            this.f39100a = new phv();
            this.f39101b = "RecoverPermissionsFragment";
        }
        return inflate;
    }
}
