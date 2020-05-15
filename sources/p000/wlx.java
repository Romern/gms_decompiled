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

/* renamed from: wlx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wlx extends Fragment implements wgr, wru {

    /* renamed from: a */
    public wlw f50852a;

    /* renamed from: b */
    public ScrollToBottomView f50853b;

    /* renamed from: c */
    public String f50854c;

    /* renamed from: d */
    private View f50855d;

    /* renamed from: e */
    private PageData f50856e;

    /* renamed from: f */
    private byte[] f50857f;

    /* renamed from: a */
    public final aucb mo29194a(String str, int i) {
        ggk a = ggh.m13102a(getActivity());
        ggp ggp = new ggp();
        ggp.f18144c = this.f50854c;
        ggp.f18143b = 40;
        ggp.f18142a = 2;
        bsqv bsqv = (bsqv) bsqw.f146695g.mo74144da();
        bxvd da = bsre.f146739d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsre bsre = (bsre) da.f164949b;
        bsre.f146742b = 1;
        bsre.f146741a |= 1;
        bxvd da2 = bsrc.f146733d.mo74144da();
        bxvd da3 = bsrb.f146729c.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bsrb bsrb = (bsrb) da3.f164949b;
        str.getClass();
        bsrb.f146731a |= 1;
        bsrb.f146732b = str;
        bsrb bsrb2 = (bsrb) da3.mo74062i();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bsrc bsrc = (bsrc) da2.f164949b;
        bsrb2.getClass();
        bsrc.f146736b = bsrb2;
        bsrc.f146735a |= 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsre bsre2 = (bsre) da.f164949b;
        bsrc bsrc2 = (bsrc) da2.mo74062i();
        bsrc2.getClass();
        bsre2.f146743c = bsrc2;
        bsre2.f146741a |= 2;
        bsqv.mo70707a(da);
        bxvd da4 = bsre.f146739d.mo74144da();
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        bsre bsre3 = (bsre) da4.f164949b;
        bsre3.f146742b = 2;
        bsre3.f146741a |= 1;
        bxvd da5 = bsrc.f146733d.mo74144da();
        bxvd da6 = bsrb.f146729c.mo74144da();
        if (da6.f164950c) {
            da6.mo74035c();
            da6.f164950c = false;
        }
        bsrb bsrb3 = (bsrb) da6.f164949b;
        str.getClass();
        bsrb3.f146731a |= 1;
        bsrb3.f146732b = str;
        bsrb bsrb4 = (bsrb) da6.mo74062i();
        if (da5.f164950c) {
            da5.mo74035c();
            da5.f164950c = false;
        }
        bsrc bsrc3 = (bsrc) da5.f164949b;
        bsrb4.getClass();
        bsrc3.f146736b = bsrb4;
        bsrc3.f146735a |= 1;
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        bsre bsre4 = (bsre) da4.f164949b;
        bsrc bsrc4 = (bsrc) da5.mo74062i();
        bsrc4.getClass();
        bsre4.f146743c = bsrc4;
        bsre4.f146741a |= 2;
        bsqv.mo70707a(da4);
        bxvd da7 = bsrf.f146744d.mo74144da();
        bsmz bsmz = bsmz.FAMILIES_SHARE_PROFILE_CONSENT;
        if (da7.f164950c) {
            da7.mo74035c();
            da7.f164950c = false;
        }
        bsrf bsrf = (bsrf) da7.f164949b;
        bsrf.f146747b = bsmz.f146213dO;
        bsrf.f146746a |= 1;
        bxvd da8 = bsrg.f146749m.mo74144da();
        bxvd da9 = bsri.f146764c.mo74144da();
        if (da9.f164950c) {
            da9.mo74035c();
            da9.f164950c = false;
        }
        bsri bsri = (bsri) da9.f164949b;
        bsri.f146767b = i - 1;
        bsri.f146766a |= 1;
        bsri bsri2 = (bsri) da9.mo74062i();
        if (da8.f164950c) {
            da8.mo74035c();
            da8.f164950c = false;
        }
        bsrg bsrg = (bsrg) da8.f164949b;
        bsri2.getClass();
        bsrg.f146758h = bsri2;
        bsrg.f146751a |= 1024;
        if (da7.f164950c) {
            da7.mo74035c();
            da7.f164950c = false;
        }
        bsrf bsrf2 = (bsrf) da7.f164949b;
        bsrg bsrg2 = (bsrg) da8.mo74062i();
        bsrg2.getClass();
        bsrf2.f146748c = bsrg2;
        bsrf2.f146746a = 2 | bsrf2.f146746a;
        if (bsqv.f164950c) {
            bsqv.mo74035c();
            bsqv.f164950c = false;
        }
        bsqw bsqw = (bsqw) bsqv.f164949b;
        bsrf bsrf3 = (bsrf) da7.mo74062i();
        bsrf3.getClass();
        bsqw.f146701e = bsrf3;
        bsqw.f146697a |= 4;
        bxvd da10 = bssm.f146877d.mo74144da();
        bsmx bsmx = bsmx.FAMILIES_ANDROID_FAMILY_CREATION;
        if (da10.f164950c) {
            da10.mo74035c();
            da10.f164950c = false;
        }
        bssm bssm = (bssm) da10.f164949b;
        bssm.f146880b = bsmx.f145962iC;
        bssm.f146879a |= 1;
        if (bsqv.f164950c) {
            bsqv.mo74035c();
            bsqv.f164950c = false;
        }
        bsqw bsqw2 = (bsqw) bsqv.f164949b;
        bssm bssm2 = (bssm) da10.mo74062i();
        bssm2.getClass();
        bsqw2.f146702f = bssm2;
        bsqw2.f146697a |= 8;
        ggp.mo11800a(((bsqw) bsqv.mo74062i()).serializeToBytes());
        ggp.f18145d = this.f50857f;
        return a.mo11796a(ggp.mo11799a());
    }

    /* renamed from: b */
    public final aucb mo29195b() {
        aucf aucf = new aucf();
        new wlv(this, aucf).start();
        return aucf.f91388a;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f50852a = (wlw) wgq.m41934a(wlw.class, activity);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f50857f = getArguments().getByteArray("auditToken");
        this.f50854c = getArguments().getString("accountName");
        this.f50856e = (PageData) getArguments().getParcelable("pageData");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.fm_layout_v2_product_intro, viewGroup, false);
        this.f50855d = inflate;
        inflate.findViewById(C0126R.C0129id.fm_product_intro_layout_more_button).setVisibility(0);
        this.f50855d.findViewById(C0126R.C0129id.fm_product_intro_layout_continue_button).setVisibility(8);
        this.f50855d.findViewById(C0126R.C0129id.fm_product_intro_layout_skip_button).setVisibility(8);
        ScrollToBottomView scrollToBottomView = (ScrollToBottomView) this.f50855d.findViewById(C0126R.C0129id.fm_product_intro_scrollview);
        this.f50853b = scrollToBottomView;
        scrollToBottomView.f31481a = this;
        ((NetworkImageView) this.f50855d.findViewById(C0126R.C0129id.fm_product_intro_layout_header_image)).setImageUrl((String) this.f50856e.f31453a.get(1), wgv.m41935a());
        if (this.f50856e.f31453a.containsKey(2)) {
            wgz.m41940a((TextView) this.f50855d.findViewById(C0126R.C0129id.fm_product_intro_layout_header_text), (String) this.f50856e.f31453a.get(2), new wgt(this.f50856e, this, this.f50854c));
        }
        if (this.f50856e.f31453a.containsKey(12)) {
            wgz.m41940a((TextView) this.f50855d.findViewById(C0126R.C0129id.fm_product_intro_layout_subheader_text), (String) this.f50856e.f31453a.get(12), new wgt(this.f50856e, this, this.f50854c));
        }
        if (this.f50856e.f31453a.containsKey(3)) {
            wgz.m41940a((TextView) this.f50855d.findViewById(C0126R.C0129id.fm_product_intro_layout_body_text), (String) this.f50856e.f31453a.get(3), new wgt(this.f50856e, this, this.f50854c));
        }
        this.f50852a.mo18443b().mo29116b(33);
        Button button = (Button) this.f50855d.findViewById(C0126R.C0129id.fm_product_intro_layout_continue_button);
        if (this.f50856e.f31453a.containsKey(4)) {
            button.setText((CharSequence) this.f50856e.f31453a.get(4));
        }
        button.setOnClickListener(new wlr(this));
        Button button2 = (Button) this.f50855d.findViewById(C0126R.C0129id.fm_product_intro_layout_skip_button);
        if (this.f50856e.f31453a.containsKey(5)) {
            button2.setText((CharSequence) this.f50856e.f31453a.get(5));
        }
        button2.setOnClickListener(new wlt(this));
        Button button3 = (Button) this.f50855d.findViewById(C0126R.C0129id.fm_product_intro_layout_more_button);
        if (this.f50856e.f31453a.containsKey(7)) {
            button3.setText((CharSequence) this.f50856e.f31453a.get(7));
        }
        button3.setOnClickListener(new wlu(this));
        return this.f50855d;
    }

    public final void onDestroyView() {
        ScrollToBottomView scrollToBottomView = this.f50853b;
        if (scrollToBottomView != null) {
            scrollToBottomView.f31481a = null;
        }
        super.onDestroyView();
    }

    public final void onDetach() {
        super.onDetach();
        this.f50852a = null;
    }

    /* renamed from: a */
    public final void mo29167a() {
        View view = this.f50855d;
        if (view != null) {
            view.findViewById(C0126R.C0129id.fm_product_intro_layout_more_button).setVisibility(8);
            if (this.f50856e.f31453a.containsKey(4)) {
                this.f50855d.findViewById(C0126R.C0129id.fm_product_intro_layout_continue_button).setVisibility(0);
            }
            if (this.f50856e.f31453a.containsKey(5)) {
                this.f50855d.findViewById(C0126R.C0129id.fm_product_intro_layout_skip_button).setVisibility(0);
            }
        }
    }
}
