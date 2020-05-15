package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.mobiledataplan.MdpUpsellPlan;
import java.util.List;

/* renamed from: agyg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agyg implements agya {

    /* renamed from: a */
    private final List f66856a;

    public agyg(List list) {
        this.f66856a = list;
    }

    /* renamed from: a */
    public final int mo36175a() {
        return C0126R.C0128layout.repurchase_list_item;
    }

    /* renamed from: a */
    public final void mo36176a(acm acm) {
        agwx agwx = (agwx) acm;
        List list = this.f66856a;
        agwx.f66756s.mo36117c();
        agwx.f66756s.mo36116a(new agww(1));
        int size = list.size();
        for (int i = 0; i < size; i++) {
            agwx.f66756s.mo36116a(new agyf((MdpUpsellPlan) list.get(i), false));
        }
        agwx.f66756s.mo36116a(new agww(2));
    }
}
