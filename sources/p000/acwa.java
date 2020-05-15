package p000;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Switch;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;

/* renamed from: acwa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acwa extends Fragment {

    /* renamed from: a */
    public acvt f60932a;

    /* renamed from: b */
    public ListView f60933b;

    /* renamed from: c */
    public View f60934c;

    /* renamed from: d */
    public View f60935d;

    /* renamed from: e */
    public View f60936e;

    /* renamed from: f */
    public Switch f60937f;

    /* renamed from: g */
    public SwipeRefreshLayout f60938g;

    /* renamed from: a */
    public final void mo33162a(boolean z) {
        Activity activity = getActivity();
        if (activity != null) {
            SharedPreferences.Editor edit = activity.getPreferences(0).edit();
            edit.putBoolean("errorCacheEnabled", z);
            edit.commit();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.packages_fragment, viewGroup, false);
        this.f60934c = inflate.findViewById(C0126R.C0129id.packages_main_view);
        this.f60935d = inflate.findViewById(C0126R.C0129id.packages_progress_bar);
        ListView listView = (ListView) inflate.findViewById(C0126R.C0129id.packages_list_view);
        this.f60933b = listView;
        listView.setEmptyView(inflate.findViewById(C0126R.C0129id.no_applications_message));
        acvt acvt = new acvt(getActivity());
        this.f60932a = acvt;
        this.f60933b.setAdapter((ListAdapter) acvt);
        this.f60933b.setOnItemClickListener(new acvu(this));
        if (((Boolean) abzt.f58903ar.mo58455c()).booleanValue()) {
            View findViewById = inflate.findViewById(C0126R.C0129id.error_cache_container);
            this.f60936e = findViewById;
            findViewById.setVisibility(0);
            Switch switchR = (Switch) inflate.findViewById(C0126R.C0129id.toggle_error_caching);
            this.f60937f = switchR;
            switchR.setOnCheckedChangeListener(new acvv(this));
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C0126R.C0129id.packages_swipe_container);
        this.f60938g = swipeRefreshLayout;
        swipeRefreshLayout.f1697a = new acvw(this);
        this.f60933b.setOnScrollListener(new acvx(this));
        int i = Build.VERSION.SDK_INT;
        inflate.findViewById(C0126R.C0129id.error_cache_description).setTextDirection(5);
        return inflate;
    }

    public final void onResume() {
        super.onResume();
        Activity activity = getActivity();
        if (activity != null) {
            activity.setTitle((int) C0126R.string.packages_title);
            C1341rz aW = ((deu) activity).mo8628aW();
            if (aW != null) {
                aW.mo15852b("");
            }
            new acvz(this).execute(new Void[0]);
        }
    }
}
