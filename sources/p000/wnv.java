package p000;

import android.view.View;
import android.widget.Space;
import android.widget.TextView;
import com.android.volley.toolbox.NetworkImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.family.model.InvitationDataModel;

/* renamed from: wnv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wnv extends acm implements View.OnClickListener {

    /* renamed from: s */
    final NetworkImageView f51000s;

    /* renamed from: t */
    final TextView f51001t;

    /* renamed from: u */
    final TextView f51002u;

    /* renamed from: v */
    final View f51003v;

    /* renamed from: w */
    final Space f51004w;

    /* renamed from: x */
    final /* synthetic */ wny f51005x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wnv(wny wny, View view) {
        super(view);
        this.f51005x = wny;
        this.f51003v = view.findViewById(C0126R.C0129id.fm_item_container);
        this.f51000s = (NetworkImageView) view.findViewById(C0126R.C0129id.fm_item_avatar);
        this.f51001t = (TextView) view.findViewById(C0126R.C0129id.fm_item_primary_text);
        this.f51002u = (TextView) view.findViewById(C0126R.C0129id.fm_item_secondary_text);
        this.f51004w = (Space) view.findViewById(C0126R.C0129id.fm_top_item_space);
    }

    public void onClick(View view) {
        int d = mo323d();
        int a = this.f51005x.mo162a(d);
        if (a == 1) {
            this.f51005x.mo29237f(d);
        } else if (a == 2) {
            wny wny = this.f51005x;
            wnw wnw = this.f51005x.f51007a;
            wgn.m41923c("FamilyDashboardFragment", "Manage invitation clicked", new Object[0]);
            ((wot) wnw).f51048c.mo18506a((InvitationDataModel) wny.f51011g.get(d - wny.f51010f.size()));
        } else if (a == 3) {
            wot wot = (wot) this.f51005x.f51007a;
            wic wic = wot.f51053h;
            wot.f51048c.mo18517b(wic.f50703c - (wic.f50701a.size() + wot.f51053h.f50702b.size()), wot.f51054i.f31339c.f142395g);
        } else if (a == 4) {
            ((wot) this.f51005x.f51007a).f51048c.mo18523e();
        }
    }
}
