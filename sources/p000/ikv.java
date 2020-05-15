package p000;

import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.Arrays;
import java.util.List;

/* renamed from: ikv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ikv extends ikz implements View.OnClickListener {

    /* renamed from: a */
    public static final String f21250a;

    /* renamed from: b */
    public static final String f21251b;

    /* renamed from: c */
    public static final String f21252c = String.valueOf(f21250a).concat("_desc_text");

    /* renamed from: d */
    public static final String f21253d = String.valueOf(f21250a).concat("_yes_button_text");

    /* renamed from: e */
    public static final String f21254e = String.valueOf(f21250a).concat("_no_button_text");

    /* renamed from: f */
    public static final String f21255f = String.valueOf(f21250a).concat("_yes_button_color");

    /* renamed from: g */
    public static final String f21256g = String.valueOf(f21250a).concat("_no_button_color");

    /* renamed from: i */
    public static final sek f21257i = new sek("RecoveryVerificationFragment");

    /* renamed from: h */
    protected ijt f21258h;

    static {
        String simpleName = ikv.class.getSimpleName();
        f21250a = simpleName;
        f21251b = String.valueOf(simpleName).concat("_title_text");
    }

    /* renamed from: a */
    private final void m15632a(int i, Button button) {
        int i2;
        int i3 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i3 == 0) {
        } else {
            if (i3 == 1) {
                if (!igt.m15429a().booleanValue()) {
                    i2 = C0126R.color.auth_authzen_google_blue;
                } else {
                    i2 = C0126R.color.google_blue600;
                }
                button.getBackground().setColorFilter(getResources().getColor(i2), PorterDuff.Mode.MULTIPLY);
                button.setTextColor(getResources().getColor(C0126R.color.auth_authzen_white));
            } else if (i3 == 2) {
                button.getBackground().setColorFilter(getResources().getColor(C0126R.color.auth_authzen_red_500), PorterDuff.Mode.MULTIPLY);
                button.setTextColor(getResources().getColor(C0126R.color.auth_authzen_white));
            } else if (i3 != 3) {
                f21257i.mo25418e("Unknown SelectorColor", new Object[0]);
            } else {
                button.getBackground().setColorFilter(getResources().getColor(C0126R.color.auth_authzen_grey_500), PorterDuff.Mode.MULTIPLY);
                button.setTextColor(getResources().getColor(C0126R.color.auth_authzen_black));
            }
        }
    }

    /* renamed from: a */
    public final String mo13099a() {
        return f21250a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final List mo13101b() {
        View view = getView();
        if (view == null) {
            return Arrays.asList(new Button[0]);
        }
        return Arrays.asList((Button) view.findViewById(C0126R.C0129id.yes_button), (Button) view.findViewById(C0126R.C0129id.no_button));
    }

    public void onClick(View view) {
        int i = 1;
        if (view.getId() != C0126R.C0129id.no_button && view.getId() == C0126R.C0129id.yes_button) {
            i = 0;
        }
        this.f21258h.mo7588a(this, i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (igt.m15429a().booleanValue()) {
            LayoutInflater layoutInflater = getActivity().getLayoutInflater();
            ViewGroup viewGroup = (ViewGroup) getView();
            viewGroup.removeAllViewsInLayout();
            View inflate = layoutInflater.inflate((int) C0126R.C0128layout.auth_authzen_gm_recovery_verification_fragment, viewGroup, true);
            mo13108a(inflate, getArguments());
            mo13109b(inflate, getArguments());
            mo13107a(inflate);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        this.f21258h = (ijt) getActivity();
        if (!igt.m15429a().booleanValue()) {
            i = C0126R.C0128layout.auth_authzen_recovery_verification_fragment;
        } else {
            i = C0126R.C0128layout.auth_authzen_gm_recovery_verification_fragment;
        }
        View inflate = getActivity().getLayoutInflater().inflate(i, (ViewGroup) null);
        mo13108a(inflate, getArguments());
        mo13109b(inflate, getArguments());
        mo13107a(inflate);
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putAll(getArguments());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo13109b(View view, Bundle bundle) {
        int i = bundle.getInt(f21255f);
        int i2 = bundle.getInt(f21256g);
        m15632a(byoq.m125038a(i), (Button) view.findViewById(C0126R.C0129id.yes_button));
        m15632a(byoq.m125038a(i2), (Button) view.findViewById(C0126R.C0129id.no_button));
    }

    /* renamed from: a */
    static final void m15633a(View view, Button button, Button button2) {
        f21257i.mo25414c("Stack the buttons because text length is too long", new Object[0]);
        ((LinearLayout) view.findViewById(C0126R.C0129id.auth_authzen_recovery_verification_buttons_container)).setOrientation(1);
        ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = button2.getLayoutParams();
        if (layoutParams.width > layoutParams2.width) {
            layoutParams2.width = layoutParams.width;
        } else {
            layoutParams.width = layoutParams2.width;
        }
        button.setLayoutParams(layoutParams);
        button2.setLayoutParams(layoutParams2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13107a(View view) {
        view.findViewById(C0126R.C0129id.no_button).setOnClickListener(this);
        view.findViewById(C0126R.C0129id.yes_button).setOnClickListener(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13108a(View view, Bundle bundle) {
        TextView textView;
        String string = bundle.getString(f21251b);
        if (!stm.m36302d(string)) {
            ((TextView) getActivity().findViewById(C0126R.C0129id.auth_authzen_title)).setText(string);
        }
        String string2 = bundle.getString(f21252c);
        if (!stm.m36302d(string2)) {
            if (igt.m15429a().booleanValue()) {
                textView = (TextView) getActivity().findViewById(C0126R.C0129id.description);
            } else {
                textView = (TextView) view.findViewById(C0126R.C0129id.description);
            }
            textView.setText(Html.fromHtml(string2));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        String string3 = bundle.getString(f21253d);
        String string4 = bundle.getString(f21254e);
        Button button = (Button) view.findViewById(C0126R.C0129id.yes_button);
        Button button2 = (Button) view.findViewById(C0126R.C0129id.no_button);
        boolean z = !stm.m36302d(string3);
        boolean z2 = !stm.m36302d(string4);
        if (z) {
            button.setText(string3);
        }
        if (z2) {
            button2.setText(string4);
        }
        if (z && z2) {
            if (igt.m15429a().booleanValue()) {
                LinearLayout linearLayout = (LinearLayout) view.findViewById(C0126R.C0129id.auth_authzen_recovery_verification_buttons_container);
                if (linearLayout.getOrientation() == 0) {
                    linearLayout.post(new iks(button, button2, view, linearLayout));
                }
            }
            button.post(new ikt(button, view, button2));
            button2.post(new iku(button2, view, button));
        }
    }
}
