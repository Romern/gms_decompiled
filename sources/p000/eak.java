package p000;

import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;

/* renamed from: eak */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class eak extends dwu {

    /* renamed from: a */
    final /* synthetic */ eal f14544a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eak(eal eal) {
        super(eal.f14387c, "produce server context for account %s", eal.f14389e);
        this.f14544a = eal;
    }

    /* renamed from: a */
    public final void mo9477a(int i) {
        super.mo9477a(i);
        Object[] objArr = {this.f14544a.f14389e, Integer.valueOf(i)};
        this.f14544a.f14552p = false;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9478a(Object obj) {
        eal eal;
        String str;
        bxiv bxiv = (bxiv) obj;
        try {
            new Object[1][0] = this.f14544a.f14389e;
            bxwc<ByteString> bxwc = bxiv.f163577c;
            if (!bxwc.isEmpty()) {
                WriteBatchImpl b = tjj.m37080b();
                ContextData contextData = this.f14544a.f14546j;
                new Object[1][0] = contextData;
                ContextFenceStub contextFenceStub = null;
                if (contextData != null) {
                    str = contextData.mo18014d();
                } else {
                    str = null;
                }
                boolean z = false;
                for (ByteString bxtx : bxwc) {
                    ContextData contextData2 = new ContextData(bxtx.getKey());
                    if (contextData2.mo18015e() != null) {
                        int g = contextData2.mo18018g();
                        eal eal2 = this.f14544a;
                        int[] iArr = eal2.f14390f.f14369c;
                        if (g == iArr[0]) {
                            eal2.f14546j = contextData2;
                            z = true;
                        } else if (!sqc.m35957a(iArr, contextData2.mo18018g())) {
                            dss.m9249a(this.f14544a.f14387c, "Un-produced context type received, skipping", new Object[0]);
                        }
                        Object[] objArr = {contextData2.mo18014d(), contextData2};
                        b.mo18101a(contextData2);
                    }
                }
                if (z) {
                    eal eal3 = this.f14544a;
                    new Object[1][0] = eal3.f14546j;
                    eal3.mo9852a(b);
                    if ((bxiv.f163575a & 2) != 0) {
                        bxcm bxcm = bxiv.f163578d;
                        if (bxcm == null) {
                            bxcm = bxcm.f162813z;
                        }
                        contextFenceStub = new ContextFenceStub(bxcm);
                        new Object[1][0] = contextFenceStub;
                    }
                    new Object[1][0] = contextFenceStub;
                    eal eal4 = this.f14544a;
                    if (str != null && !str.isEmpty()) {
                        new Object[1][0] = str;
                        tjr tjr = new tjr(eal4.f14389e);
                        tkb tkb = new tkb();
                        tkb.mo26624b();
                        TimeFilterImpl a = tkb.mo26620a();
                        tjv tjv = new tjv();
                        tjv.mo26613a(str);
                        tjr.mo26597a(13, a, tjv.mo26612a());
                        new Object[1][0] = Integer.valueOf(dwq.m9673q().mo10056b(tjr.mo26595a()));
                    }
                    if (contextFenceStub != null) {
                        eal.m9980a(contextFenceStub, this.f14544a.f14546j.mo18014d(), this.f14544a.f14389e);
                        this.f14544a.mo9905a(contextFenceStub);
                    }
                    eal eal5 = this.f14544a;
                    eal5.f14547k = false;
                    eal5.mo9863i();
                }
                eal = this.f14544a;
            } else {
                eal = this.f14544a;
            }
            eal.f14552p = false;
        } catch (Throwable th) {
            this.f14544a.f14552p = false;
            throw th;
        }
    }
}
