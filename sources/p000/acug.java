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
import com.google.android.gms.search.administration.AppIndexingErrorInfo;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.Thing;

/* renamed from: acug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acug extends Fragment {

    /* renamed from: a */
    private AppIndexingErrorInfo f60792a;

    /* renamed from: b */
    private View f60793b;

    /* renamed from: c */
    private View f60794c;

    /* renamed from: d */
    private Thing f60795d;

    /* renamed from: e */
    private ActionImpl f60796e;

    /* renamed from: f */
    private TextView f60797f;

    /* renamed from: g */
    private TextView f60798g;

    /* renamed from: h */
    private TextView f60799h;

    /* renamed from: i */
    private TextView f60800i;

    /* renamed from: j */
    private TextView f60801j;

    /* renamed from: k */
    private String f60802k;

    /* renamed from: l */
    private actz f60803l;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f60803l = new actz(activity);
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
        inflate.findViewById(C0126R.C0129id.error_details_fields).setVisibility(0);
        this.f60797f = (TextView) inflate.findViewById(C0126R.C0129id.call_type_text_view);
        this.f60798g = (TextView) inflate.findViewById(C0126R.C0129id.error_code_text_view);
        this.f60799h = (TextView) inflate.findViewById(C0126R.C0129id.error_message_text_view);
        this.f60800i = (TextView) inflate.findViewById(C0126R.C0129id.created_timestamp_text_view);
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.url_text_view);
        this.f60801j = textView;
        textView.setOnClickListener(this.f60803l);
        this.f60793b = inflate.findViewById(C0126R.C0129id.thing_view);
        this.f60794c = inflate.findViewById(C0126R.C0129id.user_action_view);
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
        return inflate;
    }

    public final void onResume() {
        super.onResume();
        getActivity().setTitle((int) C0126R.string.error_details_title);
        C1341rz aW = ((deu) getActivity()).mo8628aW();
        if (aW != null) {
            aW.mo15852b("");
        }
        AppIndexingErrorInfo appIndexingErrorInfo = (AppIndexingErrorInfo) getArguments().getParcelable("error");
        this.f60792a = appIndexingErrorInfo;
        this.f60795d = appIndexingErrorInfo.f107350f;
        this.f60796e = appIndexingErrorInfo.f107351g;
        String str = appIndexingErrorInfo.f107345a;
        this.f60802k = str;
        this.f60803l.f60784a = str;
        this.f60797f.setText(acua.m49852a((bpzo) bmxu.m108565a(bpzo.m112438a(appIndexingErrorInfo.f107346b), bpzo.UNRECOGNIZED)));
        this.f60798g.setText(acua.m49849a((bpzq) bmxu.m108565a(bpzq.m112442a(this.f60792a.f107347c), bpzq.UNRECOGNIZED)));
        this.f60799h.setText(this.f60792a.f107348d);
        this.f60800i.setText(acua.m49851a(this.f60792a.f107349e));
        Thing thing = this.f60795d;
        if (thing != null) {
            acua.m49859a(this.f60801j, thing.f152372d);
            acua.m49856a(this.f60793b.findViewById(C0126R.C0129id.indexable_text), this.f60795d);
            this.f60793b.setVisibility(0);
            this.f60794c.setVisibility(8);
            return;
        }
        ActionImpl actionImpl = this.f60796e;
        if (actionImpl != null) {
            acua.m49859a(this.f60801j, actionImpl.f152343c);
            acua.m49855a(this.f60794c, this.f60796e);
            this.f60793b.setVisibility(8);
            this.f60794c.setVisibility(0);
            return;
        }
        this.f60801j.setText("null");
        this.f60793b.setVisibility(8);
        this.f60794c.setVisibility(8);
    }
}
