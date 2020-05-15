package p000;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.ArrayList;

/* renamed from: dsh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dsh extends drx {

    /* renamed from: c */
    private final tmo f13934c;

    /* renamed from: d */
    private final ContextManagerClientInfo f13935d;

    /* renamed from: e */
    private final ContextDataFilterImpl f13936e;

    public dsh(tmo tmo, ContextManagerClientInfo contextManagerClientInfo, ContextDataFilterImpl contextDataFilterImpl) {
        super("ReadOperation");
        this.f13934c = tmo;
        this.f13935d = contextManagerClientInfo;
        this.f13936e = contextDataFilterImpl;
    }

    /* renamed from: a */
    private final void m9222a(int i, DataHolder dataHolder, int i2) {
        drn.m9165a(this.f13934c, i, dataHolder);
        dpf G = dwq.m9650G();
        ContextManagerClientInfo contextManagerClientInfo = this.f13935d;
        ContextDataFilterImpl contextDataFilterImpl = this.f13936e;
        bxvd a = dpf.m9018a(contextManagerClientInfo, 2, i);
        bxge a2 = dpf.m9010a(contextDataFilterImpl);
        bxvd da = bxgq.f163284d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxgq bxgq = (bxgq) da.f164949b;
        int i3 = 2 | bxgq.f163286a;
        bxgq.f163286a = i3;
        bxgq.f163288c = i2;
        if (a2 != null) {
            a2.getClass();
            bxgq.f163287b = a2;
            bxgq.f163286a = i3 | 1;
        }
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        bxgc bxgc = (bxgc) a.f164949b;
        bxgq bxgq2 = (bxgq) da.mo74062i();
        bxgc bxgc2 = bxgc.f163222o;
        bxgq2.getClass();
        bxgc.f163228e = bxgq2;
        bxgc.f163224a |= 8;
        G.mo9374a((bxgc) a.mo74062i());
        if (dataHolder != null) {
            drx.m9188a(dataHolder, this.f13934c, this.f13935d);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo9517b(int i) {
        DataHolder dataHolder = null;
        if (!rjs.m33679e(i)) {
            m9222a(i, (DataHolder) null, 0);
            return;
        }
        eej a = dwq.m9672p().mo10037a(this.f13936e, this.f13935d);
        if (!rjs.m33679e(a.f14775a)) {
            m9222a(a.f14775a, (DataHolder) null, 0);
            return;
        }
        ArrayList arrayList = new ArrayList(a.f14776b);
        if (!arrayList.isEmpty()) {
            rtu d = rts.m34440d();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                rts.m34439a(d, (ContextData) arrayList.get(i2));
            }
            dataHolder = d.mo25163a(0);
        }
        m9222a(0, dataHolder, arrayList.size());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9410a() {
        if (!this.f13935d.mo18067b()) {
            m9222a(7504, (DataHolder) null, 0);
        } else if (!this.f13936e.mo18052b() || !this.f13936e.mo18054d().contains(18) || this.f13935d.mo18066a().mo9338b()) {
            mo9517b(0);
        } else {
            mo9515a(drx.m9187a(this.f13935d));
        }
    }
}
