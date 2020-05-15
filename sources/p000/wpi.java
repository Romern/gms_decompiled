package p000;

import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import com.android.volley.toolbox.NetworkImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.family.model.MemberDataModel;

/* renamed from: wpi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wpi extends acm implements View.OnClickListener {

    /* renamed from: s */
    final NetworkImageView f51082s;

    /* renamed from: t */
    final TextView f51083t;

    /* renamed from: u */
    final View f51084u;

    /* renamed from: v */
    final RadioButton f51085v;

    /* renamed from: w */
    final /* synthetic */ wpj f51086w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wpi(wpj wpj, View view) {
        super(view);
        this.f51086w = wpj;
        this.f51084u = view.findViewById(C0126R.C0129id.fm_item_container);
        this.f51082s = (NetworkImageView) view.findViewById(C0126R.C0129id.fm_manage_parents_item_avatar);
        this.f51083t = (TextView) view.findViewById(C0126R.C0129id.fm_manage_parents_item_primary_text);
        this.f51085v = (RadioButton) view.findViewById(C0126R.C0129id.fm_manage_parents_item_radiobutton);
    }

    public void onClick(View view) {
        int d = mo323d();
        wpj wpj = this.f51086w;
        MemberDataModel memberDataModel = (MemberDataModel) wpj.f51087a.get(d);
        if (wpj.f51090f == null) {
            wpj.f51088d.mo29263a().mo29109a(33);
            wpj.mo29266a(memberDataModel.f31350a);
            wpj.f51088d.mo29264a(memberDataModel);
        } else if (memberDataModel.f31350a.equals(wpj.f51091g)) {
            wpj.f51088d.mo29263a().mo29109a(35);
            MemberDataModel memberDataModel2 = wpj.f51090f;
            wpj.mo29266a(wpj.f51091g);
            wpj.f51088d.mo29264a(memberDataModel2);
        } else {
            wpj.f51088d.mo29263a().mo29109a(34);
            wpj.mo29266a(memberDataModel.f31350a);
            wpj.f51088d.mo29264a(memberDataModel);
        }
    }
}
