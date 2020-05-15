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
import com.google.android.gms.family.p042v2.model.BulletPoint;
import com.google.android.gms.family.p042v2.model.PageData;
import com.google.android.gms.family.widget.BulletedList;
import com.google.android.gms.family.widget.ScrollToBottomView;
import java.util.ArrayList;

/* renamed from: wkm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wkm extends Fragment implements wgr, wru, wis {

    /* renamed from: a */
    public wkl f50796a;

    /* renamed from: b */
    public String f50797b;

    /* renamed from: c */
    public PageData f50798c;

    /* renamed from: d */
    public PageData f50799d;

    /* renamed from: e */
    public PageData f50800e;

    /* renamed from: f */
    public ScrollToBottomView f50801f;

    /* renamed from: g */
    private View f50802g;

    /* renamed from: a */
    public static wkm m41983a(String str, PageData pageData, PageData pageData2, PageData pageData3) {
        wkm wkm = new wkm();
        Bundle bundle = new Bundle(4);
        bundle.putString("accountName", str);
        bundle.putParcelable("pageData", pageData);
        bundle.putParcelable("fopCancelDialogData", pageData2);
        bundle.putParcelable("postFopCancelDialogData", pageData3);
        wkm.setArguments(bundle);
        return wkm;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f50796a = (wkl) wgq.m41934a(wkl.class, activity);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f50798c = (PageData) getArguments().getParcelable("pageData");
        this.f50797b = getArguments().getString("accountName");
        this.f50799d = (PageData) getArguments().getParcelable("fopCancelDialogData");
        this.f50800e = (PageData) getArguments().getParcelable("postFopCancelDialogData");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.fm_layout_v2_flat_headless_fop, viewGroup, false);
        this.f50802g = inflate;
        inflate.findViewById(C0126R.C0129id.fm_headless_fop_layout_one_button_bar).setVisibility(0);
        this.f50802g.findViewById(C0126R.C0129id.fm_headless_fop_layout_two_button_bar).setVisibility(8);
        ScrollToBottomView scrollToBottomView = (ScrollToBottomView) this.f50802g.findViewById(C0126R.C0129id.fm_headless_fop_scrollview);
        this.f50801f = scrollToBottomView;
        scrollToBottomView.f31481a = this;
        BulletedList bulletedList = (BulletedList) this.f50802g.findViewById(C0126R.C0129id.fm_headless_fop_layout_bullet_list);
        bulletedList.f31476a = C0126R.C0128layout.fm_bullet_point_layout;
        NetworkImageView networkImageView = (NetworkImageView) this.f50802g.findViewById(C0126R.C0129id.fm_headless_fop_layout_header_image);
        networkImageView.setDefaultImageResId(C0126R.C0127drawable.fm_img_bookend_header_loading);
        networkImageView.setErrorImageResId(C0126R.C0127drawable.fm_img_bookend_header_default);
        this.f50796a.mo18443b().mo29116b(13);
        if (this.f50798c.f31453a.containsKey(1)) {
            networkImageView.setImageUrl((String) this.f50798c.f31453a.get(1), wgv.m41935a());
        }
        if (this.f50798c.f31453a.containsKey(11)) {
            ((TextView) this.f50802g.findViewById(C0126R.C0129id.fm_headless_fop_layout_card_info)).setText((CharSequence) this.f50798c.f31453a.get(11));
        }
        if (this.f50798c.f31453a.containsKey(2)) {
            wgz.m41940a((TextView) this.f50802g.findViewById(C0126R.C0129id.fm_headless_fop_layout_header_text), (String) this.f50798c.f31453a.get(2), new wgt(this.f50798c, this, this.f50797b));
        }
        if (this.f50798c.f31453a.containsKey(3)) {
            wgz.m41940a((TextView) this.f50802g.findViewById(C0126R.C0129id.fm_headless_fop_layout_body_text), (String) this.f50798c.f31453a.get(3), new wgt(this.f50798c, this, this.f50797b));
        }
        ArrayList arrayList = this.f50798c.f31455c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            BulletPoint bulletPoint = (BulletPoint) arrayList.get(i);
            wgt wgt = new wgt(this.f50798c, this, this.f50797b);
            if (bulletPoint.f31429a.containsKey(21) && bulletPoint.f31429a.containsKey(22)) {
                View inflate2 = BulletedList.inflate(bulletedList.getContext(), bulletedList.f31476a, null);
                NetworkImageView networkImageView2 = (NetworkImageView) inflate2.findViewById(C0126R.C0129id.fm_bullet_icon);
                networkImageView2.setDefaultImageResId(C0126R.C0127drawable.fm_img_bookend_header_loading);
                networkImageView2.setImageUrl((String) bulletPoint.f31429a.get(21), wgv.m41935a());
                wgz.m41940a((TextView) inflate2.findViewById(C0126R.C0129id.fm_bullet_text), (String) bulletPoint.f31429a.get(22), wgt);
                bulletedList.addView(inflate2);
            }
        }
        if (this.f50798c.f31453a.containsKey(12)) {
            wgz.m41940a((TextView) this.f50802g.findViewById(C0126R.C0129id.fm_headless_fop_layout_footer_text), (String) this.f50798c.f31453a.get(12), new wgt(this.f50798c, this, this.f50797b));
        }
        Button button = (Button) this.f50802g.findViewById(C0126R.C0129id.fm_headless_fop_layout_continue_button);
        if (this.f50798c.f31453a.containsKey(16) && !this.f50796a.mo18464u()) {
            button.setText((CharSequence) this.f50798c.f31453a.get(16));
        } else if (this.f50798c.f31453a.containsKey(4)) {
            button.setText((CharSequence) this.f50798c.f31453a.get(4));
        }
        button.setOnClickListener(new wkf(this));
        Button button2 = (Button) this.f50802g.findViewById(C0126R.C0129id.fm_headless_fop_layout_cancel_button);
        if (this.f50798c.f31453a.containsKey(5)) {
            button2.setText((CharSequence) this.f50798c.f31453a.get(5));
        }
        button2.setOnClickListener(new wki(this));
        Button button3 = (Button) this.f50802g.findViewById(C0126R.C0129id.fm_headless_fop_layout_change_button);
        if (!this.f50798c.f31453a.containsKey(13) || this.f50796a.mo18464u()) {
            button3.setVisibility(8);
        } else {
            button3.setText((CharSequence) this.f50798c.f31453a.get(13));
            button3.setOnClickListener(new wkj(this));
        }
        Button button4 = (Button) this.f50802g.findViewById(C0126R.C0129id.fm_headless_fop_layout_more_button);
        if (this.f50798c.f31453a.containsKey(7)) {
            button4.setText((CharSequence) this.f50798c.f31453a.get(7));
        }
        button4.setOnClickListener(new wkk(this));
        return this.f50802g;
    }

    public final void onDetach() {
        super.onDetach();
        this.f50796a = null;
    }

    public final void onResume() {
        super.onResume();
        Button button = (Button) this.f50802g.findViewById(C0126R.C0129id.fm_headless_fop_layout_change_button);
        Button button2 = (Button) this.f50802g.findViewById(C0126R.C0129id.fm_headless_fop_layout_continue_button);
        if (this.f50796a.mo18464u()) {
            button.setVisibility(8);
            if (this.f50798c.f31453a.containsKey(4)) {
                button2.setText((CharSequence) this.f50798c.f31453a.get(4));
            }
        }
    }

    /* renamed from: a */
    public final void mo29167a() {
        View view = this.f50802g;
        if (view != null) {
            view.findViewById(C0126R.C0129id.fm_headless_fop_layout_one_button_bar).setVisibility(8);
            this.f50802g.findViewById(C0126R.C0129id.fm_headless_fop_layout_two_button_bar).setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo29132a(PageData pageData) {
        View view = this.f50802g;
        if (view != null) {
            NetworkImageView networkImageView = (NetworkImageView) view.findViewById(C0126R.C0129id.fm_headless_fop_layout_header_image);
            if (pageData.f31453a.containsKey(1)) {
                networkImageView.setImageUrl((String) pageData.f31453a.get(1), wgv.m41935a());
            }
            if (pageData.f31453a.containsKey(11)) {
                ((TextView) this.f50802g.findViewById(C0126R.C0129id.fm_headless_fop_layout_card_info)).setText((CharSequence) pageData.f31453a.get(11));
            }
        }
    }
}
