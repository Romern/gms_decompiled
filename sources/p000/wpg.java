package p000;

import android.os.Bundle;
import android.support.p002v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.android.volley.toolbox.NetworkImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.family.model.MemberDataModel;
import com.google.android.gms.family.p042v2.model.PageData;
import java.util.HashMap;

/* renamed from: wpg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wpg extends Fragment {

    /* renamed from: a */
    public wpf f51077a;

    /* renamed from: b */
    public String f51078b;

    /* renamed from: c */
    private View f51079c;

    /* renamed from: d */
    private MemberDataModel f51080d;

    /* renamed from: e */
    private boolean f51081e;

    /* renamed from: a */
    private static final boolean m42133a(PageData pageData, int i) {
        HashMap hashMap;
        return (pageData == null || (hashMap = pageData.f31453a) == null || !hashMap.containsKey(Integer.valueOf(i + -1))) ? false : true;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f51077a = (wpf) wgq.m41934a(wpf.class, getActivity());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f51079c = layoutInflater.inflate((int) C0126R.C0128layout.fm_fragment_manage_member, viewGroup, false);
        this.f51080d = (MemberDataModel) getArguments().getParcelable("member_data");
        this.f51078b = getArguments().getString("hoh_given_name");
        this.f51081e = getArguments().getBoolean("can_be_removed");
        MemberDataModel memberDataModel = this.f51080d;
        whb.m41941a((Toolbar) this.f51079c.findViewById(C0126R.C0129id.fm_toolbar), stm.m36299a(memberDataModel.f31352c), getActivity());
        NetworkImageView networkImageView = (NetworkImageView) this.f51079c.findViewById(C0126R.C0129id.fm_item_avatar);
        networkImageView.setDefaultImageResId(C0126R.C0127drawable.fm_ic_avatar);
        networkImageView.setImageUrl(wgw.m41936a(memberDataModel.f31354e, getResources().getDimensionPixelSize(C0126R.dimen.fm_profile_photo_size_small)), wgv.m41935a());
        ((TextView) this.f51079c.findViewById(C0126R.C0129id.fm_item_primary_text)).setText(stm.m36299a(memberDataModel.f31351b));
        Button button = (Button) this.f51079c.findViewById(C0126R.C0129id.fm_remove_member_button);
        PageData pageData = (PageData) getArguments().getParcelable("manage_member_pd");
        if (cdst.m134852c() && memberDataModel.f31356g == 5) {
            TextView textView = (TextView) this.f51079c.findViewById(C0126R.C0129id.fm_item_secondary_text);
            if (m42133a(pageData, 33)) {
                textView.setText((CharSequence) pageData.f31453a.get(32));
            }
            if (m42133a(pageData, 31)) {
                TextView textView2 = (TextView) this.f51079c.findViewById(C0126R.C0129id.fm_manage_member_body_text);
                textView2.setVisibility(0);
                textView2.setText((CharSequence) pageData.f31453a.get(30));
            }
        }
        if (m42133a(pageData, 24) && (!cdsh.m134823b() || this.f51081e)) {
            button.setText((CharSequence) pageData.f31453a.get(23));
            button.setVisibility(0);
        }
        button.setOnClickListener(new wpe(this, memberDataModel));
        return this.f51079c;
    }

    public final void onDetach() {
        super.onDetach();
        this.f51077a = null;
    }
}
