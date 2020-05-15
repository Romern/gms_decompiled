package p000;

import com.google.android.gms.contextmanager.fence.internal.FenceQueryRequestImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceStateMapImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: dsg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dsg extends drx {

    /* renamed from: c */
    private final tmo f13931c;

    /* renamed from: d */
    private final ContextManagerClientInfo f13932d;

    /* renamed from: e */
    private final FenceQueryRequestImpl f13933e;

    public dsg(tmo tmo, ContextManagerClientInfo contextManagerClientInfo, FenceQueryRequestImpl fenceQueryRequestImpl) {
        super("QueryFencesOperation");
        this.f13931c = tmo;
        this.f13932d = contextManagerClientInfo;
        this.f13933e = fenceQueryRequestImpl;
    }

    /* renamed from: a */
    private final void m9220a(int i, FenceStateMapImpl fenceStateMapImpl) {
        int i2;
        Map map;
        drn.m9167a(this.f13931c, i, fenceStateMapImpl);
        if (fenceStateMapImpl == null || (map = fenceStateMapImpl.f30658a) == null) {
            i2 = 0;
        } else {
            i2 = map.size();
        }
        dpf G = dwq.m9650G();
        ContextManagerClientInfo contextManagerClientInfo = this.f13932d;
        FenceQueryRequestImpl fenceQueryRequestImpl = this.f13933e;
        bxvd a = dpf.m9018a(contextManagerClientInfo, 9, i);
        bxgo a2 = dpf.m9014a(fenceQueryRequestImpl);
        bxvd da = bxgp.f163279d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxgp bxgp = (bxgp) da.f164949b;
        bxgp.f163281a |= 2;
        bxgp.f163283c = i2;
        if (a2 != null) {
            bxgo a3 = dpf.m9014a(fenceQueryRequestImpl);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxgp bxgp2 = (bxgp) da.f164949b;
            a3.getClass();
            bxgp2.f163282b = a3;
            bxgp2.f163281a |= 1;
        }
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        bxgc bxgc = (bxgc) a.f164949b;
        bxgp bxgp3 = (bxgp) da.mo74062i();
        bxgc bxgc2 = bxgc.f163222o;
        bxgp3.getClass();
        bxgc.f163235l = bxgp3;
        bxgc.f163224a |= 1024;
        G.mo9374a((bxgc) a.mo74062i());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9410a() {
        HashMap hashMap = null;
        if (!this.f13932d.mo18067b()) {
            m9220a(7504, (FenceStateMapImpl) null);
            return;
        }
        dtl E = dwq.m9648E();
        ContextManagerClientInfo contextManagerClientInfo = this.f13932d;
        FenceQueryRequestImpl.QueryFenceOperation queryFenceOperation = this.f13933e.f30650a;
        int i = queryFenceOperation.f30651a;
        if (i == 1) {
            List a = E.f13991b.mo9570a(contextManagerClientInfo);
            hashMap = new HashMap();
            if (a != null) {
                int size = a.size();
                for (int i2 = 0; i2 < size; i2++) {
                    duu duu = (duu) a.get(i2);
                    String str = duu.f14118a;
                    hashMap.put(str, dtz.m9356a(str, duu));
                }
            }
        } else if (i == 2) {
            List list = queryFenceOperation.f30652b;
            dto dto = E.f13991b;
            HashMap hashMap2 = new HashMap();
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str2 = (String) list.get(i3);
                duu b = dto.mo9575b(duu.m9451a(contextManagerClientInfo, str2));
                if (b != null) {
                    hashMap2.put(str2, dtz.m9356a(str2, b));
                }
            }
            hashMap = hashMap2;
        }
        m9220a(0, new FenceStateMapImpl(hashMap));
    }
}
