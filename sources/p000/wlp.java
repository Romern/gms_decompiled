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
import com.google.android.gms.family.p042v2.model.ContactPickerOptionsData;
import com.google.android.gms.family.p042v2.model.PageData;
import com.google.android.gms.family.p042v2.model.PageDataMap;
import com.google.android.gms.family.p042v2.model.ProfileData;

/* renamed from: wlp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wlp extends Fragment implements wgr {

    /* renamed from: a */
    public wll f50835a;

    /* renamed from: b */
    public String f50836b;

    /* renamed from: c */
    public Integer f50837c;

    /* renamed from: d */
    public int f50838d;

    /* renamed from: e */
    public PageDataMap f50839e;

    /* renamed from: f */
    public ProfileData f50840f;

    /* renamed from: g */
    public boolean f50841g;

    /* renamed from: h */
    public ContactPickerOptionsData f50842h;

    /* renamed from: i */
    private View f50843i;

    /* renamed from: j */
    private PageData f50844j;

    /* renamed from: a */
    public final void mo29188a() {
        PageDataMap pageDataMap = this.f50839e;
        if (pageDataMap != null && this.f50837c != null && this.f50840f != null) {
            if (pageDataMap.mo18560b(5)) {
                this.f50844j = this.f50839e.mo18558a(5);
                this.f50843i.findViewById(C0126R.C0129id.fm_invite_intro_screen).setVisibility(0);
                this.f50843i.findViewById(C0126R.C0129id.fm_invite_skip_screen).setVisibility(8);
                this.f50843i.findViewById(C0126R.C0129id.fm_invite_profile_screen).setVisibility(8);
                this.f50835a.mo18443b().mo29116b(16);
                NetworkImageView networkImageView = (NetworkImageView) this.f50843i.findViewById(C0126R.C0129id.fm_invite_intro_bookend_layout_header_image);
                networkImageView.setDefaultImageResId(C0126R.C0127drawable.fm_img_bookend_header_loading);
                networkImageView.setErrorImageResId(C0126R.C0127drawable.fm_img_bookend_header_default);
                if (this.f50844j.f31453a.containsKey(1)) {
                    networkImageView.setImageUrl((String) this.f50844j.f31453a.get(1), wgv.m41935a());
                }
                if (this.f50844j.f31453a.containsKey(2)) {
                    wgz.m41940a((TextView) this.f50843i.findViewById(C0126R.C0129id.fm_invite_intro_bookend_layout_header_text), (String) this.f50844j.f31453a.get(2), new wgt(this.f50844j, this, this.f50836b));
                }
                if (this.f50844j.f31453a.containsKey(3)) {
                    wgz.m41940a((TextView) this.f50843i.findViewById(C0126R.C0129id.fm_invite_intro_bookend_layout_body_text), (String) this.f50844j.f31453a.get(3), new wgt(this.f50844j, this, this.f50836b));
                }
                Button button = (Button) this.f50843i.findViewById(C0126R.C0129id.fm_invite_intro_bookend_layout_continue_button);
                if (this.f50844j.f31453a.containsKey(4)) {
                    button.setText((CharSequence) this.f50844j.f31453a.get(4));
                }
                button.setOnClickListener(new wla(this));
                Button button2 = (Button) this.f50843i.findViewById(C0126R.C0129id.fm_invite_intro_bookend_layout_skip_button);
                if (this.f50844j.f31453a.containsKey(5)) {
                    button2.setText((CharSequence) this.f50844j.f31453a.get(5));
                }
                button2.setOnClickListener(new wlb(this));
                this.f50835a.mo18477i();
            } else if (this.f50839e.mo18560b(17)) {
                this.f50844j = this.f50839e.mo18558a(17);
                ProfileData profileData = this.f50840f;
                this.f50843i.findViewById(C0126R.C0129id.fm_invite_intro_screen).setVisibility(8);
                this.f50843i.findViewById(C0126R.C0129id.fm_invite_skip_screen).setVisibility(8);
                this.f50843i.findViewById(C0126R.C0129id.fm_invite_profile_screen).setVisibility(0);
                ((NetworkImageView) this.f50843i.findViewById(C0126R.C0129id.fm_invite_profile_manager_avatar)).setImageUrl(wgw.m41936a(profileData.f31462e, getResources().getDimensionPixelSize(C0126R.dimen.fm_profile_image_size)), wgv.m41935a());
                ((TextView) this.f50843i.findViewById(C0126R.C0129id.fm_invite_profile_manager_email)).setText(profileData.f31458a);
                if (this.f50844j.f31453a.containsKey(6)) {
                    wgz.m41940a((TextView) this.f50843i.findViewById(C0126R.C0129id.fm_invite_profile_manager_label), (String) this.f50844j.f31453a.get(6), new wgt(this.f50844j, this, this.f50836b));
                }
                if (this.f50844j.f31453a.containsKey(2)) {
                    wgz.m41940a((TextView) this.f50843i.findViewById(C0126R.C0129id.fm_invite_profile_header_text), (String) this.f50844j.f31453a.get(2), new wgt(this.f50844j, this, this.f50836b));
                }
                if (this.f50844j.f31453a.containsKey(3)) {
                    wgz.m41940a((TextView) this.f50843i.findViewById(C0126R.C0129id.fm_invite_profile_body_text), (String) this.f50844j.f31453a.get(3), new wgt(this.f50844j, this, this.f50836b));
                }
                Button button3 = (Button) this.f50843i.findViewById(C0126R.C0129id.fm_invite_profile_continue_button);
                if (this.f50844j.f31453a.containsKey(4)) {
                    button3.setVisibility(0);
                    button3.setText((CharSequence) this.f50844j.f31453a.get(4));
                }
                button3.setOnClickListener(new wlc(this));
                Button button4 = (Button) this.f50843i.findViewById(C0126R.C0129id.fm_invite_profile_skip_button);
                if (this.f50844j.f31453a.containsKey(5)) {
                    button4.setText((CharSequence) this.f50844j.f31453a.get(5));
                }
                button4.setOnClickListener(new wld(this));
                this.f50835a.mo18477i();
            } else if (this.f50839e.mo18560b(15)) {
                this.f50835a.mo18471a(this.f50837c.intValue(), this.f50838d);
            } else if (this.f50839e.mo18560b(7)) {
                this.f50844j = this.f50839e.mo18558a(7);
                this.f50843i.findViewById(C0126R.C0129id.fm_invite_intro_screen).setVisibility(8);
                this.f50843i.findViewById(C0126R.C0129id.fm_invite_skip_screen).setVisibility(0);
                this.f50843i.findViewById(C0126R.C0129id.fm_invite_profile_screen).setVisibility(8);
                this.f50835a.mo18443b().mo29116b(19);
                NetworkImageView networkImageView2 = (NetworkImageView) this.f50843i.findViewById(C0126R.C0129id.fm_bookend_layout_header_image);
                networkImageView2.setDefaultImageResId(C0126R.C0127drawable.fm_img_bookend_header_loading);
                networkImageView2.setErrorImageResId(C0126R.C0127drawable.fm_img_bookend_header_default);
                if (this.f50844j.f31453a.containsKey(1)) {
                    networkImageView2.setImageUrl((String) this.f50844j.f31453a.get(1), wgv.m41935a());
                }
                if (this.f50844j.f31453a.containsKey(2)) {
                    wgz.m41940a((TextView) this.f50843i.findViewById(C0126R.C0129id.fm_bookend_layout_header_text), (String) this.f50844j.f31453a.get(2), new wgt(this.f50844j, this, this.f50836b));
                }
                if (this.f50844j.f31453a.containsKey(3)) {
                    wgz.m41940a((TextView) this.f50843i.findViewById(C0126R.C0129id.fm_bookend_layout_body_text), (String) this.f50844j.f31453a.get(3), new wgt(this.f50844j, this, this.f50836b));
                }
                Button button5 = (Button) this.f50843i.findViewById(C0126R.C0129id.fm_bookend_layout_continue_button);
                if (this.f50844j.f31453a.containsKey(4)) {
                    button5.setText((CharSequence) this.f50844j.f31453a.get(4));
                }
                button5.setOnClickListener(new wle(this));
                this.f50835a.mo18477i();
            } else {
                mo29189b();
                this.f50835a.mo18477i();
            }
        }
    }

    /* renamed from: b */
    public final void mo29189b() {
        wgm.m41916a(getActivity(), new wky(this), new wkz(this)).show();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f50835a.mo18476h();
        getLoaderManager().initLoader(0, null, new wlj(this));
        getLoaderManager().initLoader(1, null, new wlk(this));
        if (this.f50835a.mo18484p() != null) {
            this.f50840f = this.f50835a.mo18484p();
        } else {
            getLoaderManager().initLoader(2, null, new wlo(this));
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f50835a = (wll) wgq.m41934a(wll.class, activity);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f50836b = getArguments().getString("accountName");
        this.f50838d = getArguments().getInt("inviteeRole");
        this.f50841g = getArguments().getBoolean("isDirectAddInvitations");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f50843i = layoutInflater.inflate((int) C0126R.C0128layout.fm_fragment_v2_invite_intro, viewGroup, false);
        this.f50835a.mo18476h();
        return this.f50843i;
    }

    public final void onDetach() {
        super.onDetach();
        this.f50835a = null;
    }
}
