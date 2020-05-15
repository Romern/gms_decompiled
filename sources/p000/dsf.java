package p000;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.ArrayList;

/* renamed from: dsf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dsf extends drx {

    /* renamed from: c */
    private final tmo f13928c;

    /* renamed from: d */
    private final ContextManagerClientInfo f13929d;

    /* renamed from: e */
    private final ContextDataFilterImpl f13930e;

    public dsf(tmo tmo, ContextManagerClientInfo contextManagerClientInfo, ContextDataFilterImpl contextDataFilterImpl) {
        super("WriteBatchOperation");
        this.f13928c = tmo;
        this.f13929d = contextManagerClientInfo;
        this.f13930e = contextDataFilterImpl;
    }

    /* renamed from: a */
    private final void m9218a(int i, DataHolder dataHolder, int i2) {
        drn.m9169b(this.f13928c, i, dataHolder);
        dpf G = dwq.m9650G();
        ContextManagerClientInfo contextManagerClientInfo = this.f13929d;
        ContextDataFilterImpl contextDataFilterImpl = this.f13930e;
        bxvd a = dpf.m9018a(contextManagerClientInfo, 4, i);
        bxge a2 = dpf.m9010a(contextDataFilterImpl);
        bxvd da = bxgi.f163254d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxgi bxgi = (bxgi) da.f164949b;
        bxgi.f163256a |= 2;
        bxgi.f163258c = i2;
        if (a2 != null) {
            bxge a3 = dpf.m9010a(contextDataFilterImpl);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxgi bxgi2 = (bxgi) da.f164949b;
            a3.getClass();
            bxgi2.f163257b = a3;
            bxgi2.f163256a |= 1;
        }
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        bxgc bxgc = (bxgc) a.f164949b;
        bxgi bxgi3 = (bxgi) da.mo74062i();
        bxgc bxgc2 = bxgc.f163222o;
        bxgi3.getClass();
        bxgc.f163230g = bxgi3;
        bxgc.f163224a |= 32;
        G.mo9374a((bxgc) a.mo74062i());
        if (dataHolder != null) {
            drx.m9188a(dataHolder, this.f13928c, this.f13929d);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9410a() {
        eel p = dwq.m9672p();
        DataHolder dataHolder = null;
        if (!this.f13929d.mo18067b()) {
            m9218a(7504, (DataHolder) null, 0);
            return;
        }
        ArrayList arrayList = new ArrayList();
        ContextDataFilterImpl contextDataFilterImpl = this.f13930e;
        if (contextDataFilterImpl != null) {
            eej a = p.mo10038a(contextDataFilterImpl, this.f13929d, Long.MAX_VALUE);
            if (!rjs.m33679e(a.f14775a)) {
                m9218a(a.f14775a, (DataHolder) null, 0);
                return;
            }
            arrayList.addAll(a.f14776b);
        }
        if (!arrayList.isEmpty()) {
            rtu d = rts.m34440d();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                rts.m34439a(d, (ContextData) arrayList.get(i));
            }
            dataHolder = d.mo25163a(0);
        }
        m9218a(0, dataHolder, arrayList.size());
    }
}
