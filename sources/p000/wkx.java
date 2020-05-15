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
import com.google.android.gms.family.widget.ScrollToBottomView;

/* renamed from: wkx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wkx extends Fragment implements wgr, wru, wis {

    /* renamed from: a */
    public wkw f50812a;

    /* renamed from: b */
    public String f50813b;

    /* renamed from: c */
    public PageData f50814c;

    /* renamed from: d */
    public PageData f50815d;

    /* renamed from: e */
    public PageData f50816e;

    /* renamed from: f */
    public ScrollToBottomView f50817f;

    /* renamed from: g */
    private View f50818g;

    /* renamed from: a */
    public static wkx m41992a(String str, PageData pageData, PageData pageData2, PageData pageData3) {
        wkx wkx = new wkx();
        Bundle bundle = new Bundle(4);
        bundle.putString("accountName", str);
        bundle.putParcelable("pageData", pageData);
        bundle.putParcelable("fopCancelDialogData", pageData2);
        bundle.putParcelable("postFopCancelDialogData", pageData3);
        wkx.setArguments(bundle);
        return wkx;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f50812a = (wkw) wgq.m41934a(wkw.class, activity);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f50814c = (PageData) getArguments().getParcelable("pageData");
        this.f50813b = getArguments().getString("accountName");
        this.f50815d = (PageData) getArguments().getParcelable("fopCancelDialogData");
        this.f50816e = (PageData) getArguments().getParcelable("postFopCancelDialogData");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.fm_layout_v2_headless_fop, viewGroup, false);
        this.f50818g = inflate;
        inflate.findViewById(C0126R.C0129id.fm_headless_fop_layout_one_button_bar).setVisibility(0);
        this.f50818g.findViewById(C0126R.C0129id.fm_headless_fop_layout_two_button_bar).setVisibility(8);
        ScrollToBottomView scrollToBottomView = (ScrollToBottomView) this.f50818g.findViewById(C0126R.C0129id.fm_headless_fop_scrollview);
        this.f50817f = scrollToBottomView;
        scrollToBottomView.f31481a = this;
        NetworkImageView networkImageView = (NetworkImageView) this.f50818g.findViewById(C0126R.C0129id.fm_headless_fop_layout_header_image);
        networkImageView.setDefaultImageResId(C0126R.C0127drawable.fm_img_bookend_header_loading);
        networkImageView.setErrorImageResId(C0126R.C0127drawable.fm_img_bookend_header_default);
        this.f50812a.mo18443b().mo29116b(13);
        if (this.f50814c.f31453a.containsKey(1)) {
            networkImageView.setImageUrl((String) this.f50814c.f31453a.get(1), wgv.m41935a());
        }
        if (this.f50814c.f31453a.containsKey(11)) {
            ((TextView) this.f50818g.findViewById(C0126R.C0129id.fm_headless_fop_layout_card_info)).setText((CharSequence) this.f50814c.f31453a.get(11));
        }
        if (this.f50814c.f31453a.containsKey(2)) {
            wgz.m41940a((TextView) this.f50818g.findViewById(C0126R.C0129id.fm_headless_fop_layout_header_text), (String) this.f50814c.f31453a.get(2), new wgt(this.f50814c, this, this.f50813b));
        }
        if (this.f50814c.f31453a.containsKey(3)) {
            wgz.m41940a((TextView) this.f50818g.findViewById(C0126R.C0129id.fm_headless_fop_layout_body_text), (String) this.f50814c.f31453a.get(3), new wgt(this.f50814c, this, this.f50813b));
        }
        if (this.f50814c.f31453a.containsKey(12)) {
            wgz.m41940a((TextView) this.f50818g.findViewById(C0126R.C0129id.fm_headless_fop_layout_footer_text), (String) this.f50814c.f31453a.get(12), new wgt(this.f50814c, this, this.f50813b));
        }
        Button button = (Button) this.f50818g.findViewById(C0126R.C0129id.fm_headless_fop_layout_continue_button);
        if (this.f50814c.f31453a.containsKey(16) && !this.f50812a.mo18464u()) {
            button.setText((CharSequence) this.f50814c.f31453a.get(16));
        } else if (this.f50814c.f31453a.containsKey(4)) {
            button.setText((CharSequence) this.f50814c.f31453a.get(4));
        }
        button.setOnClickListener(new wkq(this));
        Button button2 = (Button) this.f50818g.findViewById(C0126R.C0129id.fm_headless_fop_layout_cancel_button);
        if (this.f50814c.f31453a.containsKey(5)) {
            button2.setText((CharSequence) this.f50814c.f31453a.get(5));
        }
        button2.setOnClickListener(new wkt(this));
        Button button3 = (Button) this.f50818g.findViewById(C0126R.C0129id.fm_headless_fop_layout_change_button);
        if (!this.f50814c.f31453a.containsKey(13) || this.f50812a.mo18464u()) {
            button3.setVisibility(8);
        } else {
            button3.setText((CharSequence) this.f50814c.f31453a.get(13));
            button3.setOnClickListener(new wku(this));
        }
        Button button4 = (Button) this.f50818g.findViewById(C0126R.C0129id.fm_headless_fop_layout_more_button);
        if (this.f50814c.f31453a.containsKey(7)) {
            button4.setText((CharSequence) this.f50814c.f31453a.get(7));
        }
        button4.setOnClickListener(new wkv(this));
        return this.f50818g;
    }

    public final void onDetach() {
        super.onDetach();
        this.f50812a = null;
    }

    public final void onResume() {
        super.onResume();
        Button button = (Button) this.f50818g.findViewById(C0126R.C0129id.fm_headless_fop_layout_change_button);
        Button button2 = (Button) this.f50818g.findViewById(C0126R.C0129id.fm_headless_fop_layout_continue_button);
        if (this.f50812a.mo18464u()) {
            button.setVisibility(8);
            if (this.f50814c.f31453a.containsKey(4)) {
                button2.setText((CharSequence) this.f50814c.f31453a.get(4));
            }
        }
    }

    /* renamed from: a */
    public final void mo29167a() {
        View view = this.f50818g;
        if (view != null) {
            view.findViewById(C0126R.C0129id.fm_headless_fop_layout_one_button_bar).setVisibility(8);
            this.f50818g.findViewById(C0126R.C0129id.fm_headless_fop_layout_two_button_bar).setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo29132a(PageData pageData) {
        View view = this.f50818g;
        if (view != null) {
            NetworkImageView networkImageView = (NetworkImageView) view.findViewById(C0126R.C0129id.fm_headless_fop_layout_header_image);
            if (pageData.f31453a.containsKey(1)) {
                networkImageView.setImageUrl((String) this.f50814c.f31453a.get(1), wgv.m41935a());
            }
            if (pageData.f31453a.containsKey(11)) {
                ((TextView) this.f50818g.findViewById(C0126R.C0129id.fm_headless_fop_layout_card_info)).setText((CharSequence) this.f50814c.f31453a.get(11));
            }
        }
    }
}
