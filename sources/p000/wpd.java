package p000;

import android.os.Bundle;
import android.support.p002v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.volley.toolbox.NetworkImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.family.model.InvitationDataModel;
import java.text.DateFormat;

/* renamed from: wpd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wpd extends Fragment {

    /* renamed from: a */
    public wpc f51073a;

    /* renamed from: b */
    private View f51074b;

    public final void onActivityCreated(Bundle bundle) {
        String str;
        super.onActivityCreated(bundle);
        InvitationDataModel invitationDataModel = (InvitationDataModel) getArguments().getParcelable("invitation");
        whb.m41941a((Toolbar) this.f51074b.findViewById(C0126R.C0129id.fm_toolbar), invitationDataModel.mo18425a(), getActivity());
        NetworkImageView networkImageView = (NetworkImageView) this.f51074b.findViewById(C0126R.C0129id.fm_item_avatar);
        networkImageView.setDefaultImageResId(C0126R.C0127drawable.fm_ic_avatar);
        networkImageView.setImageUrl(wgw.m41936a(invitationDataModel.f31347e, getResources().getDimensionPixelSize(C0126R.dimen.fm_profile_photo_size_small)), wgv.m41935a());
        TextView textView = (TextView) this.f51074b.findViewById(C0126R.C0129id.fm_item_primary_text);
        if (TextUtils.isEmpty(invitationDataModel.f31346d)) {
            str = stm.m36299a(invitationDataModel.f31345c);
        } else {
            str = invitationDataModel.f31346d;
        }
        textView.setText(str);
        DateFormat dateInstance = DateFormat.getDateInstance(1, getResources().getConfiguration().locale);
        TextView textView2 = (TextView) this.f51074b.findViewById(C0126R.C0129id.fm_item_secondary_text);
        int i = invitationDataModel.f31349g - 1;
        if (i == 2) {
            textView2.setText(getResources().getString(C0126R.string.fm_invitation_sent, dateInstance.format(invitationDataModel.f31348f)));
        } else if (i != 4) {
            textView2.setText(getResources().getString(C0126R.string.fm_invitation_state_not_sent));
        } else {
            textView2.setText(getResources().getString(C0126R.string.fm_invitation_state_expired));
        }
        this.f51074b.findViewById(C0126R.C0129id.fm_manage_invitation_container).setVisibility(0);
        this.f51074b.findViewById(C0126R.C0129id.fm_manage_invitation_progress_bar).setVisibility(8);
        this.f51074b.findViewById(C0126R.C0129id.fm_uninvite_button).setOnClickListener(new wpb(this, invitationDataModel));
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f51073a = (wpc) wgq.m41934a(wpc.class, getActivity());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.fm_fragment_manage_invitation, viewGroup, false);
        this.f51074b = inflate;
        inflate.findViewById(C0126R.C0129id.fm_manage_invitation_container).setVisibility(8);
        this.f51074b.findViewById(C0126R.C0129id.fm_manage_invitation_progress_bar).setVisibility(0);
        return this.f51074b;
    }

    public final void onDetach() {
        super.onDetach();
        this.f51073a = null;
    }
}
