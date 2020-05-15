package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;

/* renamed from: nlx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nlx extends Fragment {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.car_intro_fragment_gms, viewGroup, false);
        ((ImageView) inflate.findViewById(C0126R.C0129id.illustration)).setImageDrawable(C1583oob.m29297a(getActivity(), "car_headunit_illustration"));
        ((TextView) inflate.findViewById(C0126R.C0129id.title)).setText(getActivity().getString(C0126R.string.car_intro_fragment_select_android_auto_icon_title));
        return inflate;
    }
}
