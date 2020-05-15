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

/* renamed from: ikw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ikw extends ikz implements View.OnClickListener {

    /* renamed from: a */
    public static final String f21259a;

    /* renamed from: b */
    public static final String f21260b;

    /* renamed from: c */
    public static final String f21261c = String.valueOf(f21259a).concat("_desc_text");

    /* renamed from: d */
    public static final String f21262d = String.valueOf(f21259a).concat("_lock_button_text");

    /* renamed from: e */
    public static final String f21263e = String.valueOf(f21259a).concat("_cancel_button_text");

    /* renamed from: f */
    public static final String f21264f = String.valueOf(f21259a).concat("_lock_screen_title_text");

    /* renamed from: g */
    public static final String f21265g = String.valueOf(f21259a).concat("_lock_screen_desc_text");

    /* renamed from: h */
    private ijt f21266h;

    static {
        String simpleName = ikw.class.getSimpleName();
        f21259a = simpleName;
        f21260b = String.valueOf(simpleName).concat("_title_text");
    }

    /* renamed from: a */
    public final String mo13099a() {
        return f21259a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final List mo13101b() {
        View view = getView();
        if (view == null) {
            return Arrays.asList(new Button[0]);
        }
        return Arrays.asList((Button) view.findViewById(C0126R.C0129id.lock_button), (Button) view.findViewById(C0126R.C0129id.cancel));
    }

    public void onClick(View view) {
        int i = 1;
        if (view.getId() != C0126R.C0129id.cancel && view.getId() == C0126R.C0129id.lock_button) {
            i = 0;
        }
        this.f21266h.mo7588a(this, i);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        TextView textView;
        this.f21266h = (ijt) getActivity();
        if (!igt.m15429a().booleanValue()) {
            i = C0126R.C0128layout.auth_authzen_screen_locker_fragment;
        } else {
            i = C0126R.C0128layout.auth_authzen_gm_screen_locker_fragment;
        }
        View inflate = getActivity().getLayoutInflater().inflate(i, (ViewGroup) null);
        inflate.findViewById(C0126R.C0129id.lock_button).setOnClickListener(this);
        inflate.findViewById(C0126R.C0129id.cancel).setOnClickListener(this);
        Bundle arguments = getArguments();
        String string = arguments.getString(f21260b);
        if (!stm.m36302d(string)) {
            ((TextView) getActivity().findViewById(C0126R.C0129id.auth_authzen_title)).setText(string);
        }
        String string2 = arguments.getString(f21261c);
        if (!stm.m36302d(string2)) {
            if (igt.m15429a().booleanValue()) {
                textView = (TextView) getActivity().findViewById(C0126R.C0129id.description);
            } else {
                textView = (TextView) inflate.findViewById(C0126R.C0129id.description);
            }
            textView.setText(Html.fromHtml(string2));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        String string3 = arguments.getString(f21262d);
        if (!stm.m36302d(string3)) {
            ((Button) inflate.findViewById(C0126R.C0129id.lock_button)).setText(string3);
        }
        String string4 = arguments.getString(f21263e);
        if (!stm.m36302d(string4)) {
            ((Button) inflate.findViewById(C0126R.C0129id.cancel)).setText(string4);
        }
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putAll(getArguments());
    }
}
