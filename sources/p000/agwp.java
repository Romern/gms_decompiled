package p000;

import android.os.Handler;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.concurrent.Executor;

/* renamed from: agwp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agwp extends acm {

    /* renamed from: s */
    public final Switch f66730s;

    /* renamed from: t */
    public final TextView f66731t;

    /* renamed from: u */
    public final agza f66732u;

    /* renamed from: v */
    public boolean f66733v;

    /* renamed from: w */
    public final Executor f66734w = snp.m35704b(9);

    /* renamed from: x */
    private final Handler f66735x;

    static {
        srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);
    }

    public agwp(View view) {
        super(view);
        this.f66730s = (Switch) view.findViewById(C0126R.C0129id.notification_switch);
        this.f66731t = (TextView) view.findViewById(C0126R.C0129id.switch_title);
        this.f66732u = new agza();
        this.f66735x = new adzt();
        this.f66733v = true;
    }

    /* renamed from: b */
    public final void mo36168b(boolean z) {
        this.f66735x.post(new agwo(this, z));
    }
}
