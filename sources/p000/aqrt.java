package p000;

import com.felicanetworks.mfc.C0126R;
import java.util.List;

/* renamed from: aqrt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqrt implements aqwu {

    /* renamed from: a */
    final /* synthetic */ aqrw f86672a;

    public aqrt(aqrw aqrw) {
        this.f86672a = aqrw;
    }

    /* renamed from: a */
    public final void mo48117a(List list) {
        bzil a = aqrx.m72026a(list);
        if (a == null || (a.f170204a & 32) == 0) {
            aqsm aqsm = (aqsm) this.f86672a;
            aqsm.f86704g = aqsm.f86703f.mo48122a(C0126R.string.profile_merge_undo_action_failed, C0126R.string.common_retry, new aqsk(aqsm));
            aqsm.f86704g.mo64020c();
            return;
        }
        aqrw aqrw = this.f86672a;
        bziy bziy = a.f170208e;
        if (bziy == null) {
            bziy = bziy.f170256b;
        }
        aqsm aqsm2 = (aqsm) aqrw;
        int i = 0;
        aqsm2.f86699b = false;
        aqsm2.mo48131a(bziy.f170258a);
        aqsm2.f86700c.f86692j.setVisibility(0);
        aqsm2.f86700c.mo48127b();
        int i2 = aqsm2.f86705h;
        if (i2 == 3) {
            List list2 = aqsm2.f86702e;
            int size = list2.size();
            while (i < size) {
                ((aqsl) list2.get(i)).mo48052d();
                i++;
            }
        } else if (i2 == 4) {
            List list3 = aqsm2.f86702e;
            int size2 = list3.size();
            while (i < size2) {
                ((aqsl) list3.get(i)).mo48054f();
                i++;
            }
        }
    }
}
