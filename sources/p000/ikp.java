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

/* renamed from: ikp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ikp extends ikz implements View.OnClickListener {

    /* renamed from: a */
    public static final String f21219a;

    /* renamed from: b */
    public static final String f21220b;

    /* renamed from: c */
    public static final String f21221c = String.valueOf(f21219a).concat("_desc_text");

    /* renamed from: d */
    public static final String f21222d = String.valueOf(f21219a).concat("_secure_account_button_text");

    /* renamed from: e */
    public static final String f21223e = String.valueOf(f21219a).concat("_close_button_text");

    /* renamed from: f */
    protected ijt f21224f;

    static {
        String simpleName = ikp.class.getSimpleName();
        f21219a = simpleName;
        f21220b = String.valueOf(simpleName).concat("_title_text");
    }

    /* renamed from: a */
    public static ikp m15623a(Bundle bundle) {
        ikp ikp = new ikp();
        ikp.setArguments(bundle);
        return ikp;
    }

    /* renamed from: a */
    public final String mo13099a() {
        return f21219a;
    }

    public void onClick(View view) {
        this.f21224f.mo7588a(this, 0);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        TextView textView;
        this.f21224f = (ijt) getActivity();
        if (!igt.m15429a().booleanValue()) {
            i = C0126R.C0128layout.auth_authzen_notify_google_fragment;
        } else {
            i = C0126R.C0128layout.auth_authzen_gm_notify_google_fragment;
        }
        View inflate = getActivity().getLayoutInflater().inflate(i, (ViewGroup) null);
        Bundle arguments = getArguments();
        String string = arguments.getString(f21220b);
        if (!stm.m36302d(string)) {
            ((TextView) getActivity().findViewById(C0126R.C0129id.auth_authzen_title)).setText(string);
        }
        String string2 = arguments.getString(f21221c);
        if (!stm.m36302d(string2)) {
            if (igt.m15429a().booleanValue()) {
                textView = (TextView) getActivity().findViewById(C0126R.C0129id.description);
            } else {
                textView = (TextView) inflate.findViewById(C0126R.C0129id.description);
            }
            textView.setText(Html.fromHtml(string2));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        String string3 = arguments.getString(f21222d);
        Button button = (Button) inflate.findViewById(C0126R.C0129id.secure_account_button);
        if (!stm.m36302d(string3)) {
            button.setText(URLSpanNoUnderline.m22736a(Html.fromHtml(string3)));
            button.setMovementMethod(LinkMovementMethod.getInstance());
        } else {
            button.setVisibility(8);
        }
        String string4 = arguments.getString(f21223e);
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
