package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.mobiledataplan.MdpUpsellPlan;

/* renamed from: agyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agyf extends agyn {

    /* renamed from: a */
    private final boolean f66855a;

    public agyf(MdpUpsellPlan mdpUpsellPlan, boolean z) {
        super(mdpUpsellPlan);
        this.f66855a = z;
    }

    /* renamed from: a */
    public final int mo36175a() {
        return this.f66855a ? C0126R.C0128layout.repurchase_single_card_item : C0126R.C0128layout.repurchase_card_item;
    }
}
