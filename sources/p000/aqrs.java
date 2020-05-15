package p000;

import com.felicanetworks.mfc.C0126R;
import java.util.List;

/* renamed from: aqrs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqrs implements aqwu {

    /* renamed from: a */
    final /* synthetic */ aqrv f86671a;

    public aqrs(aqrv aqrv) {
        this.f86671a = aqrv;
    }

    /* renamed from: a */
    public final void mo48117a(List list) {
        bzil a = aqrx.m72026a(list);
        if (a == null || (a.f170204a & 16) == 0) {
            aqsm aqsm = (aqsm) this.f86671a;
            aqsm.f86700c.mo48127b();
            aqsm.f86704g = aqsm.f86703f.mo48121a();
            aqsm.f86704g.mo64020c();
            return;
        }
        aqrv aqrv = this.f86671a;
        bzis bzis = a.f170207d;
        if (bzis == null) {
            bzis = bzis.f170229b;
        }
        aqsm aqsm2 = (aqsm) aqrv;
        aqsm2.f86699b = true;
        aqsm2.f86700c.mo48127b();
        aqsm2.mo48131a(bzis.f170231a);
        List list2 = aqsm2.f86702e;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            ((aqsl) list2.get(i)).mo48053e();
        }
        aqsm2.f86704g = aqsm2.f86703f.mo48122a(C0126R.string.profile_merge_dismissed_succeed, C0126R.string.profile_merge_undo, new aqsj(aqsm2));
        aqsm2.f86704g.mo64020c();
    }
}
