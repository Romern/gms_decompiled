package p000;

import android.view.Display;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatus;

/* renamed from: agxy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agxy implements agya {

    /* renamed from: a */
    private final MdpDataPlanStatus f66829a;

    /* renamed from: b */
    private final Display f66830b;

    /* renamed from: c */
    private final boolean f66831c;

    /* renamed from: d */
    private final String f66832d;

    /* renamed from: e */
    private agvo f66833e;

    public agxy(MdpDataPlanStatus mdpDataPlanStatus) {
        this.f66829a = mdpDataPlanStatus;
        agtw b = agtw.m55116b();
        this.f66830b = b.f66537i;
        this.f66831c = !b.mo36106j();
        this.f66832d = b.mo36104h();
    }

    /* renamed from: a */
    public final int mo36175a() {
        return this.f66829a.f80166e != Long.MAX_VALUE ? C0126R.C0128layout.progressbar_dataplan_item : C0126R.C0128layout.unlimited_dataplan_item;
    }

    /* renamed from: a */
    public final void mo36176a(acm acm) {
        MdpDataPlanStatus mdpDataPlanStatus = this.f66829a;
        if (mdpDataPlanStatus.f80166e != Long.MAX_VALUE) {
            agwr agwr = (agwr) acm;
            agwr.f66747y = this.f66832d;
            agwr.f66745w = this.f66830b;
            agwr.f66746x = this.f66831c;
            this.f66833e = agwr;
        } else {
            agxl agxl = (agxl) acm;
            agxl.f66785u = this.f66832d;
            agxl.f66784t = this.f66831c;
            this.f66833e = agxl;
        }
        this.f66833e.mo36134a(mdpDataPlanStatus);
    }
}
