package p000;

import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;

/* renamed from: aukr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aukr extends Fragment {

    /* renamed from: a */
    public aukq f91988a;

    /* renamed from: b */
    private int f91989b = -1;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f91988a = (aukq) activity;
            if (activity instanceof deu) {
                ((deu) activity).mo8628aW().mo15862e();
            }
            this.f91989b = activity.getWindow().getStatusBarColor();
            activity.getWindow().setStatusBarColor(getResources().getColor(C0126R.color.auth_coffee_on_boarding_intro_screen_header));
        } catch (ClassCastException e) {
            throw new ClassCastException(String.valueOf(activity.toString()).concat(" must implement GoogleTrustAgentIntroFragment.Callback"));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.auth_trusted_devices_prompt, viewGroup, false);
        int i = getArguments().getInt("image");
        String string = getArguments().getString("title");
        String string2 = getArguments().getString("subtitle", "");
        String string3 = getArguments().getString("content");
        String string4 = getArguments().getString("btn_text");
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.trusted_devices_prompt_subtitle);
        TextView textView2 = (TextView) inflate.findViewById(C0126R.C0129id.trusted_devices_prompt_content);
        ((ImageView) inflate.findViewById(C0126R.C0129id.trusted_devices_prompt_image)).setImageResource(i);
        ((TextView) inflate.findViewById(C0126R.C0129id.trusted_devices_prompt_title)).setText(string);
        if (!TextUtils.isEmpty(string2)) {
            textView.setText(string2);
        }
        textView2.setText(Html.fromHtml(string3));
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        Button button = (Button) inflate.findViewById(C0126R.C0129id.trusted_devices_prompt_button);
        if (string4 != null) {
            button.setText(string4);
        } else {
            button.setVisibility(8);
        }
        button.setOnClickListener(new auko(this));
        return inflate;
    }

    public final void onStop() {
        getActivity().getWindow().setStatusBarColor(this.f91989b);
        super.onStop();
    }
}
