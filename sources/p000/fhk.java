package p000;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.gms.accountsettings.utils.ButtonConfig;
import java.util.regex.Pattern;

/* renamed from: fhk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fhk extends DialogFragment {

    /* renamed from: a */
    static final Pattern f16605a = Pattern.compile("myaccount\\.google\\.com");

    /* renamed from: b */
    ViewGroup f16606b;

    /* renamed from: c */
    public fhj f16607c;

    /* renamed from: d */
    boolean f16608d = false;

    static {
        ffw.m11631a("MessageDialog");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    private static final View m11699a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.as_message_dialog, viewGroup, false);
        C1280ps.m19919f(inflate, 1);
        C1280ps.m19906b(inflate, 1);
        return inflate;
    }

    /* renamed from: b */
    private static final String m11703b(Bundle bundle, String str) {
        ButtonConfig a = m11700a(bundle, str);
        if (a != null) {
            return a.f7810a;
        }
        return null;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof fhj) {
            this.f16607c = (fhj) activity;
            return;
        }
        throw new IllegalStateException("Needs to implement OnClickListener");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(true);
        if (bundle != null) {
            this.f16608d = bundle.getBoolean("shownAsDialog", this.f16608d);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        this.f16606b = (ViewGroup) m11699a(getActivity().getLayoutInflater(), (ViewGroup) null);
        C1349sg sgVar = new C1349sg(getActivity());
        sgVar.mo15907b(this.f16606b);
        sgVar.mo15902a(true);
        return sgVar.mo15904b();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (!this.f16608d) {
            return m11699a(layoutInflater, viewGroup);
        }
        m11702a(this.f16606b);
        return null;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f16608d) {
            bundle.putBoolean("shownAsDialog", true);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup viewGroup = (ViewGroup) view;
        this.f16606b = viewGroup;
        m11702a(viewGroup);
    }

    public final void show(FragmentManager fragmentManager, String str) {
        this.f16608d = true;
        super.show(fragmentManager, str);
    }

    /* renamed from: a */
    public static final ButtonConfig m11700a(Bundle bundle, String str) {
        Parcelable parcelable = bundle.getParcelable(str);
        if (parcelable instanceof ButtonConfig) {
            return (ButtonConfig) parcelable;
        }
        return null;
    }

    /* renamed from: a */
    public static fhk m11701a(CharSequence charSequence, CharSequence charSequence2, ButtonConfig buttonConfig, ButtonConfig buttonConfig2) {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(charSequence)) {
            bundle.putCharSequence("titleText", charSequence);
        }
        bundle.putCharSequence("msgText", charSequence2);
        if (buttonConfig != null) {
            bundle.putParcelable("negativeBtn", buttonConfig);
        }
        bundle.putParcelable("positiveBtn", buttonConfig2);
        fhk fhk = new fhk();
        fhk.setArguments(bundle);
        return fhk;
    }

    /* renamed from: a */
    private final void m11702a(ViewGroup viewGroup) {
        Bundle arguments = getArguments();
        TextView textView = (TextView) viewGroup.findViewById(C0126R.C0129id.as_message_title);
        CharSequence charSequence = arguments.getCharSequence("titleText");
        if (!TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(0);
            textView.setText(charSequence);
        } else {
            textView.setVisibility(8);
        }
        TextView textView2 = (TextView) viewGroup.findViewById(C0126R.C0129id.as_message_text);
        CharSequence charSequence2 = arguments.getCharSequence("msgText");
        textView2.setVisibility(0);
        textView2.setText(charSequence2);
        if (getString(C0126R.string.accountsettings_missing_account).contentEquals(charSequence2)) {
            Linkify.addLinks(textView2, f16605a, "https://");
        }
        String b = m11703b(arguments, "neutralBtn");
        Button button = (Button) viewGroup.findViewById(C0126R.C0129id.button_neutral);
        if (!TextUtils.isEmpty(b)) {
            button.setText(b);
            button.setVisibility(0);
            button.setOnClickListener(new fhg(this));
        } else {
            button.setVisibility(8);
        }
        String b2 = m11703b(arguments, "negativeBtn");
        Button button2 = (Button) viewGroup.findViewById(C0126R.C0129id.button_negative);
        if (!TextUtils.isEmpty(b2)) {
            button2.setText(b2);
            button2.setVisibility(0);
            button2.setOnClickListener(new fhh(this));
        } else {
            button2.setVisibility(8);
        }
        String b3 = m11703b(arguments, "positiveBtn");
        Button button3 = (Button) viewGroup.findViewById(C0126R.C0129id.button_positive);
        if (!TextUtils.isEmpty(b3)) {
            button3.setText(b3);
            button3.setVisibility(0);
            button3.setOnClickListener(new fhi(this));
            return;
        }
        button3.setVisibility(8);
    }
}
