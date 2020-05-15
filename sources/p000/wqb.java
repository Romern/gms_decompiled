package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import java.lang.ref.WeakReference;

/* renamed from: wqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wqb extends Fragment implements wgr {

    /* renamed from: a */
    public wpx f51122a;

    /* renamed from: b */
    public View f51123b;

    /* renamed from: c */
    public WeakReference f51124c = new WeakReference(null);

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View view = this.f51123b;
        if (view != null) {
            view.findViewById(C0126R.C0129id.fm_management_loading_screen).setVisibility(0);
            this.f51123b.findViewById(C0126R.C0129id.fm_management_content_screen).setVisibility(8);
        }
        getLoaderManager().initLoader(1, null, new wqa(this));
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f51122a = (wpx) wgq.m41934a(wpx.class, getActivity());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.fm_fragment_v2_management_content, viewGroup, false);
        this.f51123b = inflate;
        return inflate;
    }

    public final void onDetach() {
        super.onDetach();
        this.f51122a = null;
    }
}
