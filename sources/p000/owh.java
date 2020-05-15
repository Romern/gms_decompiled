package p000;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: owh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class owh extends oxu {

    /* renamed from: a */
    public static final bnsn f38523a = odk.m28481a("CAR.SETUP");

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context a = owl.m29903a(getActivity());
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(a);
        View inflate = cloneInContext.inflate((int) C0126R.C0128layout.car_frx_download_retry, viewGroup, false);
        owl.m29905a(cloneInContext, (ViewGroup) inflate);
        ((ImageView) inflate.findViewById(C0126R.C0129id.illustration)).setImageDrawable(a.getDrawable(C0126R.C0127drawable.car_download_apps_illustration));
        ((TextView) inflate.findViewById(C0126R.C0129id.title)).setText(a.getString(C0126R.string.common_something_went_wrong));
        ((TextView) inflate.findViewById(C0126R.C0129id.body)).setText(a.getString(C0126R.string.car_setup_download_retry_message, oyi.m29996a(getActivity(), ((oxk) mo22763b().f38582k).mo22677g())));
        Button button = (Button) inflate.findViewById(C0126R.C0129id.left_button);
        Button button2 = (Button) inflate.findViewById(C0126R.C0129id.right_button);
        button.setVisibility(0);
        button.setText(getString(C0126R.string.car_setup_exit));
        button.setOnClickListener(new owf(this));
        button2.setVisibility(0);
        button2.setText(getString(C0126R.string.common_accept));
        button2.setAllCaps(true);
        button2.setOnClickListener(new owg(this));
        return inflate;
    }
}
