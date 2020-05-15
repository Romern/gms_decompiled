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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: ikq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ikq extends ikz implements View.OnClickListener {

    /* renamed from: a */
    public static final String f21225a;

    /* renamed from: b */
    public static final String f21226b;

    /* renamed from: c */
    public static final String f21227c = String.valueOf(f21225a).concat("_desc_text");

    /* renamed from: d */
    public static final String f21228d = String.valueOf(f21225a).concat("_correct_pin");

    /* renamed from: e */
    public static final String f21229e = String.valueOf(f21225a).concat("_pin_list");

    /* renamed from: f */
    public static final String f21230f = String.valueOf(f21225a).concat("_cancel_button_text");

    /* renamed from: g */
    public static final Logger f21231g = new Logger("PinValidationFragment");

    /* renamed from: h */
    private ijt f21232h;

    /* renamed from: i */
    private String f21233i;

    static {
        String simpleName = ikq.class.getSimpleName();
        f21225a = simpleName;
        f21226b = String.valueOf(simpleName).concat("_title_text");
    }

    /* renamed from: a */
    private final View m15625a(View view, int i) {
        if (!igt.m15429a().booleanValue()) {
            if (i == 1) {
                return view.findViewById(C0126R.C0129id.pin1);
            }
            if (i != 2) {
                return view.findViewById(C0126R.C0129id.pin3);
            }
            return view.findViewById(C0126R.C0129id.pin2);
        } else if (i == 1) {
            return getActivity().findViewById(C0126R.C0129id.pin1);
        } else {
            if (i != 2) {
                return getActivity().findViewById(C0126R.C0129id.pin3);
            }
            return getActivity().findViewById(C0126R.C0129id.pin2);
        }
    }

    /* renamed from: a */
    public final String mo13099a() {
        return f21225a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final List mo13101b() {
        View view = getView();
        if (view == null) {
            return Arrays.asList(new Button[0]);
        }
        return Arrays.asList((Button) m15625a(view, 1), (Button) m15625a(view, 2), (Button) m15625a(view, 3), (Button) view.findViewById(C0126R.C0129id.cancel));
    }

    public void onClick(View view) {
        if (view.getId() == C0126R.C0129id.cancel) {
            this.f21232h.mo7588a(this, 2);
        } else if (!(view instanceof TextView)) {
        } else {
            if (this.f21233i.equals(((TextView) view).getText().toString())) {
                if (igt.m15429a().booleanValue()) {
                    getActivity().findViewById(C0126R.C0129id.pin_validation_layout).setVisibility(8);
                }
                this.f21232h.mo7588a(this, 0);
                return;
            }
            if (igt.m15429a().booleanValue()) {
                getActivity().findViewById(C0126R.C0129id.pin_validation_layout).setVisibility(8);
            }
            this.f21232h.mo7588a(this, 1);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        TextView textView;
        this.f21232h = (ijt) getActivity();
        if (!igt.m15429a().booleanValue()) {
            i = C0126R.C0128layout.auth_authzen_pin_validation_fragment;
        } else {
            i = C0126R.C0128layout.auth_authzen_gm_pin_validation_fragment;
        }
        View inflate = getActivity().getLayoutInflater().inflate(i, (ViewGroup) null);
        Bundle arguments = getArguments();
        this.f21233i = arguments.getString(f21228d);
        ArrayList<String> stringArrayList = arguments.getStringArrayList(f21229e);
        if (stm.m36302d(this.f21233i) || stringArrayList.size() != 3) {
            this.f21232h.mo7588a(this, -1);
        } else {
            String string = arguments.getString(f21226b);
            if (!stm.m36302d(string)) {
                ((TextView) getActivity().findViewById(C0126R.C0129id.auth_authzen_title)).setText(string);
            }
            String string2 = arguments.getString(f21227c);
            if (!stm.m36302d(string2)) {
                if (igt.m15429a().booleanValue()) {
                    textView = (TextView) getActivity().findViewById(C0126R.C0129id.description);
                } else {
                    textView = (TextView) inflate.findViewById(C0126R.C0129id.description);
                }
                textView.setText(Html.fromHtml(string2));
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
            if (igt.m15429a().booleanValue()) {
                getActivity().findViewById(C0126R.C0129id.pin_validation_layout).setVisibility(0);
            }
            ((TextView) m15625a(inflate, 1)).setText(stringArrayList.get(0));
            ((TextView) m15625a(inflate, 2)).setText(stringArrayList.get(1));
            ((TextView) m15625a(inflate, 3)).setText(stringArrayList.get(2));
            String string3 = arguments.getString(f21230f);
            if (!stm.m36302d(string3)) {
                ((TextView) inflate.findViewById(C0126R.C0129id.cancel)).setText(string3);
            }
        }
        m15625a(inflate, 1).setOnClickListener(this);
        m15625a(inflate, 2).setOnClickListener(this);
        m15625a(inflate, 3).setOnClickListener(this);
        inflate.findViewById(C0126R.C0129id.cancel).setOnClickListener(this);
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putAll(getArguments());
    }
}
