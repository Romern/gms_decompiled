package p000;

import com.google.android.contextmanager.interest.InterestRecordStub;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.contextmanager.internal.InterestUpdateBatchImpl;
import java.util.ArrayList;

/* renamed from: dsq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dsq extends drx {

    /* renamed from: c */
    private final tmo f13955c;

    /* renamed from: d */
    private final ContextManagerClientInfo f13956d;

    /* renamed from: e */
    private final InterestUpdateBatchImpl f13957e;

    public dsq(tmo tmo, ContextManagerClientInfo contextManagerClientInfo, InterestUpdateBatchImpl interestUpdateBatchImpl) {
        super("UpdateInterestsOperation");
        this.f13955c = tmo;
        this.f13956d = contextManagerClientInfo;
        this.f13957e = interestUpdateBatchImpl;
    }

    /* renamed from: a */
    private final void m9243a(int i) {
        bxgz bxgz;
        bxgk bxgk;
        drn.m9163a(this.f13955c, i);
        dpf G = dwq.m9650G();
        ContextManagerClientInfo contextManagerClientInfo = this.f13956d;
        InterestUpdateBatchImpl interestUpdateBatchImpl = this.f13957e;
        bxvd a = dpf.m9018a(contextManagerClientInfo, 11, i);
        bxvd da = bxha.f163331b.mo74144da();
        ArrayList arrayList = interestUpdateBatchImpl.f30688a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            InterestUpdateBatchImpl.Operation operation = (InterestUpdateBatchImpl.Operation) arrayList.get(i2);
            if (operation == null) {
                bxgz = bxgz.f163326d;
            } else {
                bxvd da2 = bxgz.f163326d.mo74144da();
                bxgy bxgy = (bxgy) bmxu.m108565a(bxgy.m122705a(operation.f30689a), bxgy.UNKNOWN_UPDATE_INTEREST_OPERATION_TYPE);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bxgz bxgz2 = (bxgz) da2.f164949b;
                bxgz2.f163329b = bxgy.f163325d;
                bxgz2.f163328a |= 1;
                InterestRecordStub interestRecordStub = operation.f30690b;
                if (interestRecordStub != null) {
                    bxvd da3 = bxgk.f163264c.mo74144da();
                    bxco b = tiq.m37051b(interestRecordStub.mo6265a());
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bxgk bxgk2 = (bxgk) da3.f164949b;
                    bxgk2.f163267b = b.f162973bD;
                    bxgk2.f163266a |= 1;
                    bxgk = (bxgk) da3.mo74062i();
                } else {
                    bxgk = null;
                }
                if (bxgk != null) {
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bxgz bxgz3 = (bxgz) da2.f164949b;
                    bxgk.getClass();
                    bxgz3.f163330c = bxgk;
                    bxgz3.f163328a |= 2;
                }
                bxgz = (bxgz) da2.mo74062i();
            }
            if (bxgz != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxha bxha = (bxha) da.f164949b;
                bxgz.getClass();
                if (!bxha.f163333a.mo73666a()) {
                    bxha.f163333a = GeneratedMessageLite.m124021a(bxha.f163333a);
                }
                bxha.f163333a.add(bxgz);
            }
        }
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        bxgc bxgc = (bxgc) a.f164949b;
        bxha bxha2 = (bxha) da.mo74062i();
        bxgc bxgc2 = bxgc.f163222o;
        bxha2.getClass();
        bxgc.f163237n = bxha2;
        bxgc.f163224a |= 4096;
        G.mo9374a((bxgc) a.mo74062i());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo9517b(int i) {
        dwa dwa;
        if (!rjs.m33679e(i)) {
            m9243a(i);
            return;
        }
        dvx r = dwq.m9674r();
        long a = dwq.m9665i().mo20505a();
        ArrayList arrayList = this.f13957e.f30688a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            InterestUpdateBatchImpl.Operation operation = (InterestUpdateBatchImpl.Operation) arrayList.get(i2);
            int i3 = operation.f30689a;
            boolean z = true;
            if (i3 == 1) {
                bxcx bxcx = operation.mo18078a().f7712a;
                ContextManagerClientInfo contextManagerClientInfo = this.f13956d;
                bxcw bxcw = operation.mo18078a().f7712a.f163009h;
                if (bxcw == null) {
                    bxcw = bxcw.f162994e;
                }
                dwa dwa2 = new dwa(bxcx, dvz.m9584a(contextManagerClientInfo, bxcw.f162999d));
                dwa2.mo9745a(a);
                r.mo9724a(dwa2);
            } else if (i3 != 2) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                bnsl.mo68432a("dsq", "b", 96, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68409a("[UpdateInterestsOperation] Unknown operation type=%s", operation.f30689a);
            } else {
                ContextManagerClientInfo contextManagerClientInfo2 = this.f13956d;
                if (i3 != 2) {
                    z = false;
                }
                sdo.m34970a(z);
                dvz a2 = dvz.m9584a(contextManagerClientInfo2, operation.f30691c);
                r.mo9730b(a2);
                if (!r.f14226d || r.mo9728a(a2)) {
                    if (r.f14223a.containsKey(a2.f14240c) && (dwa = (dwa) ((dwf) r.f14223a.get(a2.f14240c)).f14258a.get(a2)) != null) {
                        r.mo9732b(dwa, false);
                    }
                    r.f14224b.mo9715a(a2);
                }
            }
        }
        m9243a(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9410a() {
        if (this.f13956d.mo18067b()) {
            InterestUpdateBatchImpl interestUpdateBatchImpl = this.f13957e;
            if (interestUpdateBatchImpl != null) {
                ArrayList arrayList = interestUpdateBatchImpl.f30688a;
                if (arrayList == null || arrayList.isEmpty()) {
                    m9243a(0);
                    return;
                }
                if (!this.f13956d.mo18066a().mo9338b()) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        InterestUpdateBatchImpl.Operation operation = (InterestUpdateBatchImpl.Operation) arrayList.get(i);
                        if (operation.f30689a == 1 && operation.mo18078a().mo6265a() == 18) {
                            mo9515a(drx.m9187a(this.f13956d));
                            return;
                        }
                    }
                }
                mo9517b(0);
                return;
            }
            m9243a(0);
            return;
        }
        m9243a(7504);
    }
}
