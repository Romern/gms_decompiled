package p000;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: agxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agxe extends acm {

    /* renamed from: w */
    public static final srn f66767w = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: s */
    public final TextView f66768s;

    /* renamed from: t */
    public final TextView f66769t;

    /* renamed from: u */
    public final ImageView f66770u;

    /* renamed from: v */
    public final Context f66771v;

    public agxe(View view) {
        super(view);
        this.f66768s = (TextView) view.findViewById(C0126R.C0129id.support_channel_title);
        this.f66769t = (TextView) view.findViewById(C0126R.C0129id.support_channel_subtitle);
        this.f66770u = (ImageView) view.findViewById(C0126R.C0129id.support_channel_icon);
        this.f66771v = view.getContext();
    }
}
