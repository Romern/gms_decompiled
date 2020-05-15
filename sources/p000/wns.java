package p000;

import android.os.Bundle;
import android.support.p002v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.family.p042v2.model.PageData;

/* renamed from: wns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wns extends Fragment implements wgr {

    /* renamed from: a */
    public wnr f50990a;

    /* renamed from: b */
    public int f50991b;

    /* renamed from: c */
    public String f50992c;

    /* renamed from: d */
    private View f50993d;

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f50991b = getArguments().getInt("desiredRole");
        this.f50992c = getArguments().getString("memberId");
        Toolbar toolbar = (Toolbar) this.f50993d.findViewById(C0126R.C0129id.fm_toolbar);
        if (toolbar != null) {
            wgg.m41907a(this.f50993d, toolbar.mo1693f());
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f50990a = (wnr) wgq.m41934a(wnr.class, getActivity());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.fm_fragment_v2_management_content, viewGroup, false);
        this.f50993d = inflate;
        inflate.findViewById(C0126R.C0129id.fm_management_content_screen).setVisibility(0);
        this.f50993d.findViewById(C0126R.C0129id.fm_management_loading_screen).setVisibility(8);
        PageData pageData = (PageData) getArguments().getParcelable("pageData");
        String string = getArguments().getString("accountName");
        if (pageData.f31453a.containsKey(28)) {
            whb.m41941a((Toolbar) this.f50993d.findViewById(C0126R.C0129id.fm_toolbar), (String) pageData.f31453a.get(28), getActivity());
        }
        if (pageData.f31453a.containsKey(3)) {
            wgz.m41940a((TextView) this.f50993d.findViewById(C0126R.C0129id.fm_management_body_text), (String) pageData.f31453a.get(3), new wgt(pageData, this, string));
        }
        Button button = (Button) this.f50993d.findViewById(C0126R.C0129id.fm_management_action_button);
        if (pageData.f31453a.containsKey(4)) {
            button.setText((CharSequence) pageData.f31453a.get(4));
        }
        button.setOnClickListener(new wnp(this));
        Button button2 = (Button) this.f50993d.findViewById(C0126R.C0129id.fm_management_cancel_button);
        if (pageData.f31453a.containsKey(5)) {
            button2.setText((CharSequence) pageData.f31453a.get(5));
        }
        button2.setOnClickListener(new wnq(this));
        return this.f50993d;
    }

    public final void onDetach() {
        super.onDetach();
        this.f50990a = null;
    }
}
