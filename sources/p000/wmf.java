package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.volley.toolbox.NetworkImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.family.p042v2.model.PageData;
import com.google.android.gms.family.p042v2.model.ProfileData;
import com.google.android.gms.family.widget.ScrollToBottomView;

/* renamed from: wmf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wmf extends Fragment implements wgr, wru {

    /* renamed from: a */
    public wme f50865a;

    /* renamed from: b */
    public ScrollToBottomView f50866b;

    /* renamed from: c */
    public String f50867c;

    /* renamed from: d */
    private View f50868d;

    /* renamed from: e */
    private ProfileData f50869e;

    /* renamed from: f */
    private PageData f50870f;

    /* renamed from: g */
    private byte[] f50871g;

    /* renamed from: a */
    public static wmf m42026a(byte[] bArr, String str, PageData pageData, ProfileData profileData) {
        wmf wmf = new wmf();
        Bundle bundle = new Bundle(4);
        bundle.putByteArray("auditToken", bArr);
        bundle.putString("accountName", str);
        bundle.putParcelable("pageData", pageData);
        bundle.putParcelable("profileData", profileData);
        wmf.setArguments(bundle);
        return wmf;
    }

    /* renamed from: b */
    public final aucb mo29201b() {
        aucf aucf = new aucf();
        new wmd(this, aucf).start();
        return aucf.f91388a;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f50865a = (wme) wgq.m41934a(wme.class, activity);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f50871g = getArguments().getByteArray("auditToken");
        this.f50867c = getArguments().getString("accountName");
        this.f50870f = (PageData) getArguments().getParcelable("pageData");
        this.f50869e = (ProfileData) getArguments().getParcelable("profileData");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.fm_layout_v2_profile, viewGroup, false);
        this.f50868d = inflate;
        inflate.findViewById(C0126R.C0129id.fm_profile_layout_more_button).setVisibility(0);
        this.f50868d.findViewById(C0126R.C0129id.fm_profile_layout_continue_button).setVisibility(8);
        this.f50868d.findViewById(C0126R.C0129id.fm_profile_layout_skip_button).setVisibility(8);
        ScrollToBottomView scrollToBottomView = (ScrollToBottomView) this.f50868d.findViewById(C0126R.C0129id.fm_profile_scrollview);
        this.f50866b = scrollToBottomView;
        scrollToBottomView.f31481a = this;
        this.f50865a.mo18443b().mo29116b(3);
        ((NetworkImageView) this.f50868d.findViewById(C0126R.C0129id.fm_profile_layout_manager_avatar)).setImageUrl(wgw.m41936a(this.f50869e.f31462e, getResources().getDimensionPixelSize(C0126R.dimen.fm_profile_image_size)), wgv.m41935a());
        if (this.f50870f.f31453a.containsKey(14)) {
            wgz.m41940a((TextView) this.f50868d.findViewById(C0126R.C0129id.fm_profile_layout_primary_line), (String) this.f50870f.f31453a.get(14), new wgt(this.f50870f, this, this.f50867c));
        }
        if (this.f50870f.f31453a.containsKey(15)) {
            wgz.m41940a((TextView) this.f50868d.findViewById(C0126R.C0129id.fm_profile_layout_secondary_line), (String) this.f50870f.f31453a.get(15), new wgt(this.f50870f, this, this.f50867c));
        }
        if (this.f50870f.f31453a.containsKey(2)) {
            wgz.m41940a((TextView) this.f50868d.findViewById(C0126R.C0129id.fm_profile_layout_header_text), (String) this.f50870f.f31453a.get(2), new wgt(this.f50870f, this, this.f50867c));
        }
        if (this.f50870f.f31453a.containsKey(3)) {
            wgz.m41940a((TextView) this.f50868d.findViewById(C0126R.C0129id.fm_profile_layout_body_text), (String) this.f50870f.f31453a.get(3), new wgt(this.f50870f, this, this.f50867c));
        }
        if (this.f50870f.f31453a.containsKey(12)) {
            TextView textView = (TextView) this.f50868d.findViewById(C0126R.C0129id.fm_profile_layout_footer_text);
            textView.setVisibility(0);
            wgz.m41940a(textView, (String) this.f50870f.f31453a.get(12), new wgt(this.f50870f, this, this.f50867c));
        }
        Button button = (Button) this.f50868d.findViewById(C0126R.C0129id.fm_profile_layout_continue_button);
        if (this.f50870f.f31453a.containsKey(4)) {
            button.setText((CharSequence) this.f50870f.f31453a.get(4));
        }
        button.setOnClickListener(new wlz(this));
        Button button2 = (Button) this.f50868d.findViewById(C0126R.C0129id.fm_profile_layout_skip_button);
        if (this.f50870f.f31453a.containsKey(5)) {
            button2.setText((CharSequence) this.f50870f.f31453a.get(5));
            if (this.f50870f.f31453a.containsKey(4)) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
                layoutParams.gravity = 8388611;
                button2.setLayoutParams(layoutParams);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -1);
                layoutParams2.gravity = 8388613;
                button.setLayoutParams(layoutParams2);
            }
        }
        button2.setOnClickListener(new wmb(this));
        Button button3 = (Button) this.f50868d.findViewById(C0126R.C0129id.fm_profile_layout_more_button);
        if (this.f50870f.f31453a.containsKey(7)) {
            button3.setText((CharSequence) this.f50870f.f31453a.get(7));
        }
        button3.setOnClickListener(new wmc(this));
        return this.f50868d;
    }

    public final void onDestroyView() {
        ScrollToBottomView scrollToBottomView = this.f50866b;
        if (scrollToBottomView != null) {
            scrollToBottomView.f31481a = null;
        }
        super.onDestroyView();
    }

    public final void onDetach() {
        super.onDetach();
        this.f50865a = null;
    }

    /* renamed from: a */
    public final aucb mo29200a(String str, int i) {
        ggk a = ggh.m13102a(getActivity());
        ggp ggp = new ggp();
        ggp.f18144c = this.f50867c;
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
        ggp.mo11800a(((bsqw) bsqv.mo74062i()).mo73642k());
        ggp.f18145d = this.f50871g;
        return a.mo11796a(ggp.mo11799a());
    }

    /* renamed from: a */
    public final void mo29167a() {
        View view = this.f50868d;
        if (view != null) {
            view.findViewById(C0126R.C0129id.fm_profile_layout_more_button).setVisibility(8);
            if (this.f50870f.f31453a.containsKey(4)) {
                this.f50868d.findViewById(C0126R.C0129id.fm_profile_layout_continue_button).setVisibility(0);
            }
            if (this.f50870f.f31453a.containsKey(5)) {
                this.f50868d.findViewById(C0126R.C0129id.fm_profile_layout_skip_button).setVisibility(0);
            }
        }
    }
}
