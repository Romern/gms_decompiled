package p000;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.search.administration.AppIndexingUserActionInfo;

/* renamed from: acwe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acwe extends Fragment {

    /* renamed from: a */
    public View f60945a;

    /* renamed from: b */
    public View f60946b;

    /* renamed from: c */
    public TextView f60947c;

    /* renamed from: d */
    private AppIndexingUserActionInfo f60948d;

    /* renamed from: e */
    private View f60949e;

    /* renamed from: f */
    private View f60950f;

    /* renamed from: g */
    private TextView f60951g;

    /* renamed from: h */
    private TextView f60952h;

    /* renamed from: i */
    private String f60953i;

    /* renamed from: j */
    private acup f60954j;

    /* renamed from: k */
    private actz f60955k;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f60955k = new actz(activity);
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
        this.f60945a = inflate.findViewById(C0126R.C0129id.generic_info_main_view);
        this.f60946b = inflate.findViewById(C0126R.C0129id.progress_bar);
        this.f60951g = (TextView) inflate.findViewById(C0126R.C0129id.created_timestamp_text_view);
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.url_text_view);
        this.f60952h = textView;
        textView.setOnClickListener(this.f60955k);
        View findViewById = inflate.findViewById(C0126R.C0129id.user_action_view);
        this.f60949e = findViewById;
        findViewById.setVisibility(0);
        if (((Boolean) abzt.f58909ax.mo58455c()).booleanValue()) {
            View findViewById2 = inflate.findViewById(C0126R.C0129id.thing_view);
            this.f60950f = findViewById2;
            findViewById2.setVisibility(0);
            ((TextView) this.f60950f.findViewById(C0126R.C0129id.indexable_label)).setText(getActivity().getString(C0126R.string.associated_indexable_label, new Object[]{"INDEXABLE"}));
            this.f60947c = (TextView) this.f60950f.findViewById(C0126R.C0129id.indexable_text);
        }
        AppIndexingUserActionInfo appIndexingUserActionInfo = (AppIndexingUserActionInfo) getArguments().getParcelable("userAction");
        this.f60948d = appIndexingUserActionInfo;
        String str = appIndexingUserActionInfo.f107352a;
        this.f60953i = str;
        this.f60955k.f60784a = str;
        this.f60951g.setText(acua.m49851a(appIndexingUserActionInfo.f107353b));
        acua.m49859a(this.f60952h, this.f60948d.f107354c.f152343c);
        acua.m49855a(this.f60949e, this.f60948d.f107354c);
        int i = Build.VERSION.SDK_INT;
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
        String str2 = this.f60948d.f107354c.f152343c;
        if (((Boolean) abzt.f58909ax.mo58455c()).booleanValue()) {
            acwd acwd = new acwd(this, getActivity().getString(C0126R.string.no_matching_indexable, new Object[]{"User Action", "FirebaseAppIndex.update()"}));
            this.f60954j = acwd;
            acwd.execute(str2, this.f60953i);
        }
        return inflate;
    }

    public final void onDetach() {
        super.onDetach();
        acup acup = this.f60954j;
        if (acup != null) {
            acup.cancel(false);
        }
    }

    public final void onResume() {
        super.onResume();
        getActivity().setTitle(getActivity().getString(C0126R.string.user_action_details_title, new Object[]{"User Action"}));
        C1341rz aW = ((deu) getActivity()).mo8628aW();
        if (aW != null) {
            aW.mo15852b("");
        }
    }
}
