package p000;

import android.app.KeyguardManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: oxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class oxb extends oxu {

    /* renamed from: a */
    public static final /* synthetic */ int f38551a = 0;

    /* renamed from: b */
    private Button f38552b;

    /* renamed from: c */
    private final void m29907c() {
        if (((KeyguardManager) getActivity().getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            this.f38552b.setText((int) C0126R.string.car_setup_unlock_to_proceed);
        } else {
            this.f38552b.setText((int) C0126R.string.common_get_started);
        }
    }

    /* renamed from: a */
    public final void mo22734a() {
        mo22763b().mo22754a("EVENT_INTRO_CANCEL_TIMER");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Activity activity = getActivity();
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.car_frx_intro, viewGroup, false);
        owl.m29905a(layoutInflater, (ViewGroup) inflate);
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.body);
        ((ImageView) inflate.findViewById(C0126R.C0129id.illustration)).setImageDrawable(activity.getDrawable(C0126R.C0127drawable.car_intro_screen_illustration));
        ((TextView) inflate.findViewById(C0126R.C0129id.title)).setText((int) C0126R.string.car_setup_intro_title);
        textView.setText((int) C0126R.string.car_setup_intro_body);
        Button button = (Button) inflate.findViewById(C0126R.C0129id.left_button);
        this.f38552b = (Button) inflate.findViewById(C0126R.C0129id.right_button);
        button.setVisibility(0);
        button.setText((int) C0126R.string.common_no_thanks);
        button.setOnClickListener(new owy(this));
        this.f38552b.setVisibility(0);
        m29907c();
        this.f38552b.setOnClickListener(new owz(this));
        textView.setMovementMethod(new oxa(this));
        return inflate;
    }

    public final void onResume() {
        m29907c();
        super.onResume();
    }
}
