package p000;

import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: acvp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acvp extends Fragment {

    /* renamed from: a */
    public List f60891a;

    /* renamed from: b */
    public acue f60892b;

    /* renamed from: c */
    public ListView f60893c;

    /* renamed from: d */
    public View f60894d;

    /* renamed from: e */
    public View f60895e;

    /* renamed from: f */
    public final ArrayList f60896f = new ArrayList();

    /* renamed from: g */
    public ListView f60897g;

    /* renamed from: h */
    public acwh f60898h;

    /* renamed from: i */
    public final ArrayList f60899i = new ArrayList();

    /* renamed from: j */
    public ListView f60900j;

    /* renamed from: k */
    public acul f60901k;

    /* renamed from: l */
    public Button f60902l;

    /* renamed from: m */
    public TextView f60903m;

    /* renamed from: n */
    public TextView f60904n;

    /* renamed from: o */
    public Toast f60905o;

    /* renamed from: p */
    public Toast f60906p;

    /* renamed from: q */
    public SwipeRefreshLayout f60907q;

    /* renamed from: r */
    public Activity f60908r;

    /* renamed from: s */
    public String f60909s;

    /* renamed from: t */
    public boolean f60910t;

    /* renamed from: u */
    private TextView f60911u;

    /* renamed from: v */
    private TextView f60912v;

    /* renamed from: w */
    private Button f60913w;

    /* renamed from: x */
    private String f60914x;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33146a() {
        if (this.f60909s != null) {
            new acvn(this).execute(this.f60909s);
        }
    }

    /* renamed from: b */
    public final boolean mo33147b() {
        Activity activity = getActivity();
        if (activity != null) {
            boolean z = activity.getPreferences(0).getBoolean("errorCacheEnabled", false);
            if (!((Boolean) abzt.f58903ar.mo58455c()).booleanValue() || !z) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo33148c() {
        Activity activity = getActivity();
        if (activity != null) {
            boolean z = activity.getPreferences(0).getBoolean("errorCacheEnabled", false);
            if (!((Boolean) abzt.f58906au.mo58455c()).booleanValue() || !z) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f60908r = activity;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        Activity activity = getActivity();
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.package_details_fragment, viewGroup, false);
        this.f60894d = inflate.findViewById(C0126R.C0129id.package_details_main_view);
        this.f60895e = inflate.findViewById(C0126R.C0129id.package_details_progress_bar);
        ListView listView = (ListView) inflate.findViewById(C0126R.C0129id.corpora_list_view);
        this.f60893c = listView;
        listView.setEmptyView(inflate.findViewById(C0126R.C0129id.no_indexable_types_message));
        this.f60891a = new ArrayList();
        acue acue = new acue(getActivity(), this.f60891a);
        this.f60892b = acue;
        this.f60893c.setAdapter((ListAdapter) acue);
        this.f60893c.setOnItemClickListener(new acvf(this));
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C0126R.C0129id.swipe_container);
        this.f60907q = swipeRefreshLayout;
        swipeRefreshLayout.f1697a = new acvg(this);
        if (mo33148c()) {
            TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.user_actions_section_label);
            this.f60911u = textView;
            textView.setVisibility(0);
            inflate.findViewById(C0126R.C0129id.user_actions_separator).setVisibility(0);
            ListView listView2 = (ListView) inflate.findViewById(C0126R.C0129id.user_action_type_list_view);
            this.f60897g = listView2;
            listView2.setVisibility(0);
            this.f60897g.setEmptyView(inflate.findViewById(C0126R.C0129id.no_user_actions_message));
            acwh acwh = new acwh(getActivity(), this.f60896f);
            this.f60898h = acwh;
            this.f60897g.setAdapter((ListAdapter) acwh);
            this.f60897g.setOnItemClickListener(new acvh(this));
        }
        if (mo33147b()) {
            TextView textView2 = (TextView) inflate.findViewById(C0126R.C0129id.errors_section_label);
            this.f60912v = textView2;
            textView2.setVisibility(0);
            inflate.findViewById(C0126R.C0129id.errors_separator).setVisibility(0);
            ListView listView3 = (ListView) inflate.findViewById(C0126R.C0129id.errors_list_view);
            this.f60900j = listView3;
            listView3.setVisibility(0);
            this.f60900j.setEmptyView(inflate.findViewById(C0126R.C0129id.no_errors_message));
            acul acul = new acul(getActivity(), this.f60899i);
            this.f60901k = acul;
            this.f60900j.setAdapter((ListAdapter) acul);
            this.f60900j.setOnItemClickListener(new acvi(this));
            Button button = (Button) inflate.findViewById(C0126R.C0129id.clear_cache_button);
            this.f60902l = button;
            button.setEnabled(false);
            this.f60902l.setVisibility(0);
            this.f60902l.setOnClickListener(new acvj(this));
            if (activity != null) {
                this.f60906p = Toast.makeText(activity, (int) C0126R.string.error_cache_cleared_toast, 0);
            }
        }
        TextView textView3 = (TextView) inflate.findViewById(C0126R.C0129id.update_index_description);
        this.f60903m = textView3;
        if (!this.f60910t) {
            textView3.setText(this.f60908r.getString(C0126R.string.update_index_description_cannot_respond, new Object[]{"UPDATE_INDEX"}));
        }
        Button button2 = (Button) inflate.findViewById(C0126R.C0129id.send_intent_button);
        this.f60913w = button2;
        button2.setOnClickListener(new acvk(this));
        if (activity != null) {
            this.f60905o = Toast.makeText(activity, this.f60908r.getString(C0126R.string.update_index_toast, new Object[]{"UPDATE_INDEX"}), 0);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f60909s = arguments.getString("packageName");
            this.f60914x = arguments.getString("appName");
            this.f60910t = arguments.getBoolean("supportsRebuild");
        }
        this.f60913w.setEnabled(this.f60910t);
        TextView textView4 = (TextView) inflate.findViewById(C0126R.C0129id.missing_broadcast_receiver);
        this.f60904n = textView4;
        textView4.setText(acua.m49864b(this.f60908r.getString(C0126R.string.missing_broadcast_receiver, new Object[]{"UPDATE_INDEX"})));
        this.f60904n.setMovementMethod(LinkMovementMethod.getInstance());
        int i = Build.VERSION.SDK_INT;
        inflate.findViewById(C0126R.C0129id.update_index_description).setTextDirection(5);
        inflate.findViewById(C0126R.C0129id.indexable_types_section_label).setTextDirection(5);
        inflate.findViewById(C0126R.C0129id.user_actions_section_label).setTextDirection(5);
        inflate.findViewById(C0126R.C0129id.errors_section_label).setTextDirection(5);
        inflate.findViewById(C0126R.C0129id.update_index_label).setTextDirection(5);
        inflate.findViewById(C0126R.C0129id.no_indexable_types_message).setTextDirection(5);
        inflate.findViewById(C0126R.C0129id.no_user_actions_message).setTextDirection(5);
        inflate.findViewById(C0126R.C0129id.no_errors_message).setTextDirection(5);
        return inflate;
    }

    public final void onResume() {
        String str;
        super.onResume();
        Activity activity = getActivity();
        if (activity != null) {
            activity.setTitle((int) C0126R.string.package_details_title);
            C1341rz aW = ((deu) activity).mo8628aW();
            if (!(aW == null || (str = this.f60914x) == null)) {
                aW.mo15852b(str);
            }
        }
        mo33146a();
    }
}
