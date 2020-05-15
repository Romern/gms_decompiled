package p000;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.p037ui.URLSpanNoUnderline;

/* renamed from: ikx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ikx extends ikz implements View.OnClickListener {

    /* renamed from: a */
    public static final String f21267a;

    /* renamed from: b */
    public static final String f21268b;

    /* renamed from: c */
    public static final String f21269c = String.valueOf(f21267a).concat("_desc_text");

    /* renamed from: d */
    public static final String f21270d = String.valueOf(f21267a).concat("_learn_more_button_text");

    /* renamed from: e */
    public static final String f21271e = String.valueOf(f21267a).concat("_close_button_text");

    /* renamed from: f */
    protected ijt f21272f;

    static {
        String simpleName = ikx.class.getSimpleName();
        f21267a = simpleName;
        f21268b = String.valueOf(simpleName).concat("_title_text");
    }

    /* renamed from: a */
    public final String mo13099a() {
        return f21267a;
    }

    public void onClick(View view) {
        this.f21272f.mo7588a(this, 0);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        TextView textView;
        this.f21272f = (ijt) getActivity();
        if (!igt.m15429a().booleanValue()) {
            i = C0126R.C0128layout.auth_authzen_simple_notification_fragment;
        } else {
            i = C0126R.C0128layout.auth_authzen_gm_simple_notification_fragment;
        }
        View inflate = getActivity().getLayoutInflater().inflate(i, (ViewGroup) null);
        Bundle arguments = getArguments();
        String string = arguments.getString(f21268b);
        if (!stm.m36302d(string)) {
            ((TextView) getActivity().findViewById(C0126R.C0129id.auth_authzen_title)).setText(string);
        }
        String string2 = arguments.getString(f21269c);
        if (!stm.m36302d(string2)) {
            if (igt.m15429a().booleanValue()) {
                textView = (TextView) getActivity().findViewById(C0126R.C0129id.description);
            } else {
                textView = (TextView) inflate.findViewById(C0126R.C0129id.description);
            }
            textView.setText(string2);
        }
        String string3 = arguments.getString(f21270d);
        Button button = (Button) inflate.findViewById(C0126R.C0129id.learn_more_button);
        if (!stm.m36302d(string3)) {
            button.setText(URLSpanNoUnderline.m22736a(Html.fromHtml(string3)));
            button.setMovementMethod(LinkMovementMethod.getInstance());
        } else {
            button.setVisibility(8);
        }
        String string4 = arguments.getString(f21271e);
        if (!stm.m36302d(string4)) {
            ((TextView) inflate.findViewById(C0126R.C0129id.close_button)).setText(string4);
        }
        inflate.findViewById(C0126R.C0129id.close_button).setOnClickListener(this);
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putAll(getArguments());
    }
}
