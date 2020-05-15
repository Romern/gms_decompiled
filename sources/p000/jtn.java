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
import com.google.android.chimera.Fragment;
import com.google.android.gms.common.p037ui.URLSpanNoUnderline;

/* renamed from: jtn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jtn extends Fragment {

    /* renamed from: a */
    public String f23183a;

    /* renamed from: b */
    private boolean f23184b;

    /* renamed from: c */
    private String f23185c;

    /* renamed from: a */
    private final String m17301a() {
        return String.format("<a href=\"%s\">%s</a>", ccig.f179039a.mo6606a().mo76013j(), getString(C0126R.string.common_learn_more));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f23183a = arguments.getString("SELECTED_ACCOUNT");
        this.f23184b = arguments.getBoolean("BETTER_TOGETHER_ENABLED");
        this.f23185c = arguments.getString("DEVICE_NAME");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.better_together_settings_fragment, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.settings_subheadTextView);
        TextView textView2 = (TextView) inflate.findViewById(C0126R.C0129id.settings_headlineTextView);
        TextView textView3 = (TextView) inflate.findViewById(C0126R.C0129id.settings_disclaimerTextView);
        if (this.f23185c == null) {
            this.f23185c = getString(C0126R.string.default_device_name);
        }
        if (this.f23184b) {
            ImageView imageView = (ImageView) inflate.findViewById(C0126R.C0129id.settings_imageView);
            imageView.setImageDrawable(getContext().getDrawable(C0126R.C0127drawable.android_enabled));
            imageView.setContentDescription(getString(C0126R.string.settings_summary_enabled));
            textView2.setText((int) C0126R.string.settings_summary_enabled);
            textView.setText(URLSpanNoUnderline.m22736a(Html.fromHtml(getString(C0126R.string.settings_subhead_enabled, this.f23185c, m17301a()))));
            Button button = (Button) inflate.findViewById(C0126R.C0129id.settings_disableButton);
            button.setVisibility(0);
            button.setOnClickListener(new jtm(this));
            textView3.setVisibility(8);
        } else {
            textView2.setText(getString(C0126R.string.settings_summary_disabled, this.f23185c));
            textView.setText(URLSpanNoUnderline.m22736a(Html.fromHtml(getString(C0126R.string.settings_subhead_disabled, m17301a()))));
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        return inflate;
    }
}
