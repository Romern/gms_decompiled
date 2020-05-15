package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.android.volley.toolbox.NetworkImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.family.p042v2.model.PageData;

/* renamed from: wkp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wkp extends Fragment implements wgr {

    /* renamed from: a */
    public wko f50804a;

    /* renamed from: b */
    private String f50805b;

    /* renamed from: c */
    private PageData f50806c;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f50804a = (wko) wgq.m41934a(wko.class, activity);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f50806c = (PageData) getArguments().getParcelable("pageData");
        this.f50805b = getArguments().getString("accountName");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.fm_layout_v2_bookend, viewGroup, false);
        NetworkImageView networkImageView = (NetworkImageView) inflate.findViewById(C0126R.C0129id.fm_bookend_layout_header_image);
        networkImageView.setDefaultImageResId(C0126R.C0127drawable.fm_img_bookend_header_loading);
        networkImageView.setErrorImageResId(C0126R.C0127drawable.fm_img_bookend_header_default);
        this.f50804a.mo18443b().mo29116b(13);
        if (this.f50806c.f31453a.containsKey(1)) {
            networkImageView.setImageUrl((String) this.f50806c.f31453a.get(1), wgv.m41935a());
        }
        if (this.f50806c.f31453a.containsKey(2)) {
            wgz.m41940a((TextView) inflate.findViewById(C0126R.C0129id.fm_bookend_layout_header_text), (String) this.f50806c.f31453a.get(2), new wgt(this.f50806c, this, this.f50805b));
        }
        if (this.f50806c.f31453a.containsKey(3)) {
            wgz.m41940a((TextView) inflate.findViewById(C0126R.C0129id.fm_bookend_layout_body_text), (String) this.f50806c.f31453a.get(3), new wgt(this.f50806c, this, this.f50805b));
        }
        Button button = (Button) inflate.findViewById(C0126R.C0129id.fm_bookend_layout_continue_button);
        if (this.f50806c.f31453a.containsKey(4)) {
            button.setText((CharSequence) this.f50806c.f31453a.get(4));
        }
        button.setOnClickListener(new wkn(this));
        return inflate;
    }

    public final void onDetach() {
        super.onDetach();
        this.f50804a = null;
    }
}
