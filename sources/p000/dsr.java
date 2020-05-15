package p000;

import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;
import java.util.ArrayList;

/* renamed from: dsr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dsr extends drx {

    /* renamed from: c */
    private final tmo f13958c;

    /* renamed from: d */
    private final ContextManagerClientInfo f13959d;

    /* renamed from: e */
    private final WriteBatchImpl f13960e;

    public dsr(tmo tmo, ContextManagerClientInfo contextManagerClientInfo, WriteBatchImpl writeBatchImpl) {
        super("WriteBatchOperation");
        this.f13958c = tmo;
        this.f13959d = contextManagerClientInfo;
        this.f13960e = writeBatchImpl;
    }

    /* renamed from: a */
    private final void m9246a(int i, WriteBatchImpl writeBatchImpl) {
        bxhb bxhb;
        drn.m9168a(this.f13958c, i, writeBatchImpl);
        dpf G = dwq.m9650G();
        ContextManagerClientInfo contextManagerClientInfo = this.f13959d;
        WriteBatchImpl writeBatchImpl2 = this.f13960e;
        bxvd a = dpf.m9018a(contextManagerClientInfo, 3, i);
        if (dpf.m9011a(writeBatchImpl2) != null) {
            bxvd da = bxhb.f163334c.mo74144da();
            bxge a2 = dpf.m9011a(writeBatchImpl2);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxhb bxhb2 = (bxhb) da.f164949b;
            a2.getClass();
            bxhb2.f163337b = a2;
            bxhb2.f163336a |= 1;
            bxhb = (bxhb) da.mo74062i();
        } else {
            bxhb = bxhb.f163334c;
        }
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        bxgc bxgc = (bxgc) a.f164949b;
        bxgc bxgc2 = bxgc.f163222o;
        bxhb.getClass();
        bxgc.f163229f = bxhb;
        bxgc.f163224a |= 16;
        G.mo9374a((bxgc) a.mo74062i());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ecv.a(doh, boolean):ecu
     arg types: [doh, int]
     candidates:
      ecv.a(doh, ecu):void
      ecv.a(doh, tjq):void
      eev.a(doh, tjq):void
      ecv.a(doh, boolean):ecu */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9410a() {
        ecv v = dwq.m9678v();
        WriteBatchImpl writeBatchImpl = null;
        if (this.f13959d.mo18067b()) {
            WriteBatchImpl writeBatchImpl2 = this.f13960e;
            ContextManagerClientInfo contextManagerClientInfo = this.f13959d;
            ArrayList arrayList = writeBatchImpl2.f30703a;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((ContextData) arrayList.get(i)).mo18010a(contextManagerClientInfo.f30680d, v.mo9974a(contextManagerClientInfo.mo18066a(), true).f14703a.f46294b);
                }
            }
            int a = dwq.m9672p().mo10036a(this.f13960e, this.f13959d);
            if (rjs.m33679e(a)) {
                writeBatchImpl = this.f13960e;
            }
            m9246a(a, writeBatchImpl);
            return;
        }
        m9246a(7504, (WriteBatchImpl) null);
    }
}
