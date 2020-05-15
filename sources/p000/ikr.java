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
import java.util.Arrays;
import java.util.List;

/* renamed from: ikr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ikr extends ikz implements View.OnClickListener {

    /* renamed from: a */
    public static final String f21234a;

    /* renamed from: b */
    public static final String f21235b;

    /* renamed from: c */
    public static final String f21236c = String.valueOf(f21234a).concat("_desc_text");

    /* renamed from: d */
    public static final String f21237d = String.valueOf(f21234a).concat("_allow_button_text");

    /* renamed from: e */
    public static final String f21238e = String.valueOf(f21234a).concat("_cancel_button_text");

    /* renamed from: f */
    private ijt f21239f;

    static {
        String simpleName = ikr.class.getSimpleName();
        f21234a = simpleName;
        f21235b = String.valueOf(simpleName).concat("_title_text");
    }

    /* renamed from: d */
    private static final int m15628d() {
        return igt.m15429a().booleanValue() ? C0126R.C0129id.yes_button : C0126R.C0129id.allow_button;
    }

    /* renamed from: e */
    private static final int m15629e() {
        return igt.m15429a().booleanValue() ? C0126R.C0129id.no_button : C0126R.C0129id.cancel;
    }

    /* renamed from: a */
    public final String mo13099a() {
        return f21234a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final List mo13101b() {
        View view = getView();
        if (view == null) {
            return Arrays.asList(new Button[0]);
        }
        return Arrays.asList((Button) view.findViewById(m15628d()), (Button) view.findViewById(m15629e()));
    }

    public void onClick(View view) {
        int i = 1;
        if (view.getId() != m15629e() && view.getId() == m15628d()) {
            i = 0;
        }
        this.f21239f.mo7588a(this, i);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        TextView textView;
        this.f21239f = (ijt) getActivity();
        if (!igt.m15429a().booleanValue()) {
            i = C0126R.C0128layout.auth_authzen_recovery_confirmation_fragment;
        } else {
            i = C0126R.C0128layout.auth_authzen_gm_recovery_verification_fragment;
        }
        View inflate = getActivity().getLayoutInflater().inflate(i, (ViewGroup) null);
        inflate.findViewById(m15628d()).setOnClickListener(this);
        inflate.findViewById(m15629e()).setOnClickListener(this);
        Bundle arguments = getArguments();
        String string = arguments.getString(f21235b);
        if (!stm.m36302d(string)) {
            ((TextView) getActivity().findViewById(C0126R.C0129id.auth_authzen_title)).setText(string);
        }
        String string2 = arguments.getString(f21236c);
        if (!stm.m36302d(string2)) {
            if (igt.m15429a().booleanValue()) {
                textView = (TextView) getActivity().findViewById(C0126R.C0129id.description);
            } else {
                textView = (TextView) inflate.findViewById(C0126R.C0129id.description);
            }
            textView.setText(Html.fromHtml(string2));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        String string3 = arguments.getString(f21238e);
        if (!stm.m36302d(string3)) {
            ((TextView) inflate.findViewById(m15629e())).setText(string3);
        }
        String string4 = arguments.getString(f21237d);
        if (!stm.m36302d(string4)) {
            ((Button) inflate.findViewById(m15628d())).setText(string4);
        }
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putAll(getArguments());
    }
}
