package p000;

import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import java.util.Collections;
import java.util.List;

/* renamed from: dwz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dwz implements Runnable {

    /* renamed from: a */
    long f14322a;

    /* renamed from: b */
    final /* synthetic */ dxa f14323b;

    /* renamed from: c */
    private final dxd f14324c;

    public dwz(dxa dxa, dxd dxd, long j) {
        this.f14323b = dxa;
        this.f14324c = dxd;
        this.f14322a = j;
        int[] iArr = {3, 2};
        sdo.m34974b(true);
        List<bxma> emptyList = Collections.emptyList();
        bxvd da = bxds.f163058h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxds bxds = (bxds) da.f164949b;
        bxds.f163061b = 1;
        int i = bxds.f163060a | 1;
        bxds.f163060a = i;
        bxds.f163060a = i | 2;
        bxds.f163062c = 3000;
        if (!bxds.f163064f.mo73666a()) {
            bxds.f163064f = bxvk.m124019a(bxds.f163064f);
        }
        for (bxma bxma : emptyList) {
            bxds.f163064f.mo74153d(bxma.f163918d);
        }
        for (int i2 = 0; i2 < 2; i2++) {
            bxly a = bxly.m122852a(iArr[i2]);
            a = a == null ? bxly.UNKNOWN_STATE : a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxds bxds2 = (bxds) da.f164949b;
            a.getClass();
            if (!bxds2.f163063d.mo73666a()) {
                bxds2.f163063d = bxvk.m124019a(bxds2.f163063d);
            }
            bxds2.f163063d.mo74153d(a.f163912e);
        }
        tkx tkx = new tkx((bxds) da.mo74062i());
        sdo.m34959a(tkx);
        bxcj bxcj = (bxcj) bxcm.f162813z.mo74144da();
        bxcl bxcl = bxcl.NETWORK_STATE_FENCE;
        if (bxcj.f164950c) {
            bxcj.mo74035c();
            bxcj.f164950c = false;
        }
        bxcm bxcm = (bxcm) bxcj.f164949b;
        bxcm.f162815b = bxcl.f162810z;
        int i3 = bxcm.f162814a | 1;
        bxcm.f162814a = i3;
        bxds bxds3 = tkx.f46231a;
        bxds3.getClass();
        bxcm.f162826m = bxds3;
        bxcm.f162814a = i3 | 1024;
        ContextFenceStub contextFenceStub = new ContextFenceStub((bxcm) bxcj.mo74062i());
        lrk lrk = new lrk();
        lrk.mo15393a("ServerTaskRetryManagerFence", contextFenceStub, dxa);
        FenceUpdateRequestImpl a2 = lrk.mo15389a();
        dxa.f14336b = true;
        lrh.m19577a(dwq.m9662f(), lri.m19583b("ServerTaskRetryManager", null)).mo24681a(a2).mo50371a(new dwy(dxa, "[ServerTaskRetryManager] registerRetryFence", new Object[0]));
        long b = (j + 1) - dwq.m9665i().mo20506b();
        new Object[1][0] = Long.valueOf(b);
        dwq.m9667k().mo9434a(this, b, dqy.m9123a("ServerTaskRetryManager_prune"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9822a(long j) {
        if (j <= this.f14322a) {
            this.f14323b.f14337c = true;
            this.f14324c.run();
            this.f14323b.f14337c = false;
        } else {
            this.f14324c.mo9828b();
        }
        dwq.m9667k().mo9433a(this);
    }

    public final void run() {
        dxa dxa = this.f14323b;
        long b = dwq.m9665i().mo20506b();
        while (!dxa.f14335a.isEmpty()) {
            dwz dwz = (dwz) dxa.f14335a.peek();
            if (dwz.f14322a >= b) {
                break;
            }
            dxa.f14335a.poll();
            new Object[1][0] = Long.valueOf(dwz.f14322a);
            dwz.mo9822a(b);
        }
        if (dxa.f14336b && dxa.f14335a.isEmpty()) {
            dxa.mo9825a();
        }
    }
}
