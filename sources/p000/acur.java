package p000;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;

/* renamed from: acur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acur extends Fragment {

    /* renamed from: a */
    public View f60827a;

    /* renamed from: b */
    public View f60828b;

    /* renamed from: c */
    public View f60829c;

    /* renamed from: d */
    private TextView f60830d;

    /* renamed from: e */
    private TextView f60831e;

    /* renamed from: f */
    private TextView f60832f;

    /* renamed from: g */
    private acut f60833g;

    /* renamed from: h */
    private View f60834h;

    /* renamed from: i */
    private Button f60835i;

    /* renamed from: j */
    private acup f60836j;

    /* renamed from: k */
    private actz f60837k;

    /* renamed from: l */
    private acty f60838l;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f60837k = new actz(activity);
        this.f60838l = new acty(activity);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.generic_details_fragment, viewGroup, false);
        this.f60827a = inflate.findViewById(C0126R.C0129id.generic_info_main_view);
        this.f60828b = inflate.findViewById(C0126R.C0129id.progress_bar);
        this.f60830d = (TextView) inflate.findViewById(C0126R.C0129id.created_timestamp_text_view);
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.accessed_timestamp_text_view);
        this.f60831e = textView;
        textView.setVisibility(0);
        TextView textView2 = (TextView) inflate.findViewById(C0126R.C0129id.url_text_view);
        this.f60832f = textView2;
        textView2.setOnClickListener(this.f60837k);
        View findViewById = inflate.findViewById(C0126R.C0129id.thing_view);
        this.f60829c = findViewById;
        findViewById.setVisibility(0);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f60833g = new acut(arguments.getString("indexableName"), arguments.getString("indexableUrl"), arguments.getLong("createdTimestamp"), arguments.getLong("accessedTimestamp"), arguments.getString("packageName"), arguments.getString("corpusName"), arguments.getString("indexableType"));
        }
        acut acut = this.f60833g;
        if (acut != null) {
            String str = acut.f60843e;
            if (str != null) {
                this.f60837k.f60784a = str;
            }
            if (!bmxx.m108577a(acut.f60839a)) {
                View findViewById2 = inflate.findViewById(C0126R.C0129id.in_apps_preview_view);
                this.f60834h = findViewById2;
                findViewById2.setVisibility(0);
                this.f60835i = (Button) inflate.findViewById(C0126R.C0129id.in_apps_preview_button);
                acty acty = this.f60838l;
                acty.f60782a = acut;
                this.f60835i.setOnClickListener(acty);
            }
            Activity activity = getActivity();
            if (activity != null) {
                this.f60830d.setText(Html.fromHtml(activity.getString(C0126R.string.created_timestamp, new Object[]{acua.m49851a(acut.f60841c)})));
                this.f60831e.setText(Html.fromHtml(activity.getString(C0126R.string.accessed_timestamp, new Object[]{acua.m49851a(acut.f60842d)})));
                String str2 = acut.f60840b;
                if (str2 != null) {
                    acua.m49859a(this.f60832f, str2);
                }
            }
            Activity activity2 = getActivity();
            String str3 = acut.f60840b;
            if (!(activity2 == null || str3 == null || str == null)) {
                acuq acuq = new acuq(this, activity2.getString(C0126R.string.indexable_not_indexed, new Object[]{"Indexable"}), activity2);
                this.f60836j = acuq;
                acuq.execute(str3, str);
            }
        }
        int i = Build.VERSION.SDK_INT;
        inflate.findViewById(C0126R.C0129id.in_apps_preview_description).setTextDirection(5);
        inflate.findViewById(C0126R.C0129id.user_action_label).setTextDirection(5);
        inflate.findViewById(C0126R.C0129id.error_code_label).setTextDirection(5);
        inflate.findViewById(C0126R.C0129id.call_type_label).setTextDirection(5);
        inflate.findViewById(C0126R.C0129id.error_message_label).setTextDirection(5);
        inflate.findViewById(C0126R.C0129id.timestamp_label).setTextDirection(5);
        inflate.findViewById(C0126R.C0129id.url_label).setTextDirection(5);
        inflate.findViewById(C0126R.C0129id.indexable_label).setTextDirection(5);
        inflate.findViewById(C0126R.C0129id.in_apps_preview_label).setTextDirection(5);
        inflate.findViewById(C0126R.C0129id.user_action_text).setTextDirection(5);
        inflate.findViewById(C0126R.C0129id.error_code_text_view).setTextDirection(5);
        inflate.findViewById(C0126R.C0129id.call_type_text_view).setTextDirection(5);
        inflate.findViewById(C0126R.C0129id.error_message_text_view).setTextDirection(5);
        inflate.findViewById(C0126R.C0129id.created_timestamp_text_view).setTextDirection(5);
        inflate.findViewById(C0126R.C0129id.accessed_timestamp_text_view).setTextDirection(5);
        inflate.findViewById(C0126R.C0129id.url_text_view).setTextDirection(5);
        inflate.findViewById(C0126R.C0129id.indexable_text).setTextDirection(5);
        return inflate;
    }

    public final void onDetach() {
        super.onDetach();
        acup acup = this.f60836j;
        if (acup != null) {
            acup.cancel(false);
        }
    }

    public final void onResume() {
        super.onResume();
        Activity activity = getActivity();
        if (activity != null) {
            activity.setTitle(activity.getString(C0126R.string.indexable_details_title, new Object[]{"Indexable"}));
            C1341rz aW = ((deu) activity).mo8628aW();
            if (aW != null) {
                aW.mo15852b("");
            }
        }
    }
}
