package p000;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatus;
import java.text.ParseException;

/* renamed from: agxl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agxl extends agvo {

    /* renamed from: B */
    private static final srn f66780B = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: w */
    public static final /* synthetic */ int f66781w = 0;

    /* renamed from: A */
    private final Context f66782A;

    /* renamed from: s */
    public final TextView f66783s;

    /* renamed from: t */
    public boolean f66784t;

    /* renamed from: u */
    public String f66785u = null;

    /* renamed from: v */
    public MdpDataPlanStatus f66786v;

    /* renamed from: x */
    private final TextView f66787x;

    /* renamed from: y */
    private final TextView f66788y;

    /* renamed from: z */
    private final ImageView f66789z;

    public agxl(View view) {
        super(view);
        this.f66782A = view.getContext();
        this.f66783s = (TextView) view.findViewById(C0126R.C0129id.dataplan_name);
        this.f66787x = (TextView) view.findViewById(C0126R.C0129id.data_usage);
        this.f66788y = (TextView) view.findViewById(C0126R.C0129id.expired_time);
        this.f66789z = (ImageView) view.findViewById(C0126R.C0129id.dataplan_icon);
    }

    /* renamed from: a */
    public static final void m55215a(StringBuilder sb, String str) {
        sb.append(10);
        sb.append(str);
        sb.append(10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e5, code lost:
        if (p000.agze.m55341c(r1) < 0) goto L_0x00ea;
     */
    /* renamed from: a */
    public final void mo36134a(MdpDataPlanStatus mdpDataPlanStatus) {
        String str;
        float f;
        if (mdpDataPlanStatus.f80166e != Long.MAX_VALUE) {
            ((bnsl) f66780B.mo68388c()).mo68420a("UnlimitedPlanViewHolder needs unlimited plan, not this plan: %s", mdpDataPlanStatus);
            agvn.m55183a(this.f201a);
        }
        this.f66783s.setText(agvn.m55182a(mdpDataPlanStatus, this.f66782A));
        TextView textView = this.f66787x;
        if (!TextUtils.isEmpty(mdpDataPlanStatus.f80172k)) {
            str = mdpDataPlanStatus.f80172k;
        } else if (mdpDataPlanStatus.f80181t) {
            str = this.f66782A.getString(C0126R.string.unlimited);
        } else {
            str = this.f66782A.getString(C0126R.string.flexwin_or_unlimited_viewholder_description_inactive);
        }
        textView.setText(str);
        String str2 = mdpDataPlanStatus.f80165d;
        boolean z = false;
        if (!TextUtils.isEmpty(str2)) {
            try {
                int[] a = agsc.m55044a(str2);
                if (a != null) {
                    boolean z2 = mdpDataPlanStatus.f80181t;
                    if (a.length > 0) {
                        this.f66789z.setImageResource(agvn.m55179a(a[0], z2));
                    }
                    this.f66789z.setVisibility(0);
                } else {
                    f66780B.mo26019b(agyt.m55307c()).mo68405a("Data plan status has no traffic categories, showing default type in UI");
                }
            } catch (IllegalArgumentException e) {
                bnsl a2 = f66780B.mo26019b(agyt.m55307c());
                a2.mo68437a(e);
                a2.mo68420a("Data plan status returns invalid category string %s, showing default in UI", str2);
            }
        } else {
            f66780B.mo26019b(agyt.m55307c()).mo68405a("Data plan status returns empty category string, showing default type in UI");
        }
        this.f66789z.setVisibility(0);
        String str3 = mdpDataPlanStatus.f80164c;
        if (!TextUtils.isEmpty(str3)) {
            if (this.f66784t) {
                this.f66788y.setVisibility(0);
                agvn.m55184a(str3, this.f66782A, this.f66788y);
            } else {
                this.f66788y.setVisibility(8);
            }
        }
        this.f66786v = mdpDataPlanStatus;
        boolean z3 = mdpDataPlanStatus.f80181t;
        try {
            if (cfnm.m140632c()) {
                String str4 = mdpDataPlanStatus.f80164c;
                if (str4 != null) {
                }
            }
        } catch (ParseException e2) {
        }
        z = z3;
        ImageView imageView = this.f66789z;
        if (!z) {
            f = 0.38f;
        } else {
            f = 1.0f;
        }
        imageView.setAlpha(f);
        this.f66783s.setEnabled(z);
        this.f66787x.setEnabled(z);
        this.f66788y.setEnabled(z);
        this.f201a.setOnClickListener(new agxg(this, mdpDataPlanStatus));
    }
}
