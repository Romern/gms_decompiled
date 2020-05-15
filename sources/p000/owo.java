package p000;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: owo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class owo extends oxu {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        Activity activity = getActivity();
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.car_frx_incompatible, viewGroup, false);
        owl.m29905a(layoutInflater, (ViewGroup) inflate);
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.body);
        Button button = (Button) inflate.findViewById(C0126R.C0129id.right_button);
        Button button2 = (Button) inflate.findViewById(C0126R.C0129id.left_button);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        button2.setOnClickListener(new owm(this));
        button.setOnClickListener(new own(this));
        button.setVisibility(0);
        ((TextView) inflate.findViewById(C0126R.C0129id.title)).setText((int) C0126R.string.car_frx_device_incompatible_title);
        ((ImageView) inflate.findViewById(C0126R.C0129id.illustration)).setImageDrawable(activity.getDrawable(C0126R.C0127drawable.car_incompatible_phone));
        if (((oxk) mo22763b().f38582k).mo22672b()) {
            button.setText((int) C0126R.string.common_ok);
            i = C0126R.string.car_frx_device_incompatible_reopen_message;
        } else {
            button.setText((int) C0126R.string.car_setup_download_app);
            button2.setVisibility(0);
            button2.setText((int) C0126R.string.common_no_thanks);
            i = C0126R.string.car_frx_device_incompatible_download_message;
        }
        textView.setText(Html.fromHtml(getString(i, owl.m29904a(activity, "answer/6395843"))), TextView.BufferType.SPANNABLE);
        return inflate;
    }
}
