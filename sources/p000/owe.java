package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: owe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class owe extends oxu {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Activity activity = getActivity();
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.car_frx_car_moving, viewGroup, false);
        owl.m29905a(layoutInflater, (ViewGroup) inflate);
        ((ImageView) inflate.findViewById(C0126R.C0129id.illustration)).setImageDrawable(activity.getDrawable(C0126R.C0127drawable.car_parking_illustration));
        ((TextView) inflate.findViewById(C0126R.C0129id.title)).setText(activity.getString(C0126R.string.car_setup_car_moving_title));
        ((TextView) inflate.findViewById(C0126R.C0129id.body)).setText(activity.getString(C0126R.string.car_setup_car_moving_message));
        Button button = (Button) inflate.findViewById(C0126R.C0129id.right_button);
        button.setVisibility(0);
        button.setText(getString(C0126R.string.car_setup_exit));
        button.setOnClickListener(new owd(this));
        return inflate;
    }
}
