package p000;

import android.view.View;
import android.widget.Space;
import android.widget.TextView;
import com.android.volley.toolbox.NetworkImageView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: wnu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wnu extends acm implements View.OnClickListener {

    /* renamed from: s */
    final NetworkImageView f50995s;

    /* renamed from: t */
    final TextView f50996t;

    /* renamed from: u */
    final View f50997u;

    /* renamed from: v */
    final Space f50998v;

    /* renamed from: w */
    final /* synthetic */ wny f50999w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wnu(wny wny, View view) {
        super(view);
        this.f50999w = wny;
        this.f50997u = view.findViewById(C0126R.C0129id.fm_item_container);
        this.f50995s = (NetworkImageView) view.findViewById(C0126R.C0129id.fm_item_avatar);
        this.f50996t = (TextView) view.findViewById(C0126R.C0129id.fm_item_primary_text);
        this.f50998v = (Space) view.findViewById(C0126R.C0129id.fm_top_item_space);
    }

    public void onClick(View view) {
        int d = mo323d();
        if (this.f50999w.mo162a(d) == 0) {
            this.f50999w.mo29237f(d);
        }
    }
}
