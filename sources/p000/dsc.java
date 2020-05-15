package p000;

import android.app.PendingIntent;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceRegistrationStub;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: dsc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dsc extends drx {

    /* renamed from: c */
    public String f13919c;

    /* renamed from: d */
    public Runnable f13920d;

    /* renamed from: e */
    private final tmo f13921e;

    /* renamed from: f */
    private final ContextManagerClientInfo f13922f;

    /* renamed from: g */
    private final ContextFenceStub f13923g;

    /* renamed from: h */
    private final tku f13924h = new drz(this);

    /* renamed from: i */
    private boolean f13925i;

    public dsc(tmo tmo, ContextManagerClientInfo contextManagerClientInfo, ContextFenceStub contextFenceStub) {
        super("EvaluateFenceOperation");
        this.f13921e = tmo;
        this.f13922f = contextManagerClientInfo;
        this.f13923g = contextFenceStub;
        this.f13925i = false;
        this.f13919c = null;
        this.f13920d = null;
    }

    /* renamed from: b */
    private final tmi m9206b() {
        return tmi.m37203a(new dsb(this), (tmc) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9410a() {
        if (!this.f13922f.mo18067b()) {
            mo9527a(7504, (FenceStateImpl) null);
            return;
        }
        String uuid = UUID.randomUUID().toString();
        this.f13919c = uuid;
        ContextFenceStub contextFenceStub = this.f13923g;
        dwq.m9670n().mo9501a(m9206b(), this.f13922f, new FenceUpdateRequestImpl(new ArrayList(Arrays.asList(new UpdateFenceOperation(ContextFenceRegistrationStub.m22861a(uuid, 0, contextFenceStub), this.f13924h), new UpdateFenceOperation(6, (ContextFenceRegistrationStub) null, (lrj) null, (PendingIntent) null, this.f13919c, 0, cdgp.m133207p())))));
    }

    /* renamed from: a */
    public final void mo9527a(int i, FenceStateImpl fenceStateImpl) {
        bxgg bxgg;
        int i2 = i;
        if (!this.f13925i) {
            this.f13925i = true;
            drn.m9166a(this.f13921e, i2, fenceStateImpl);
            dpf G = dwq.m9650G();
            ContextManagerClientInfo contextManagerClientInfo = this.f13922f;
            ContextFenceStub contextFenceStub = this.f13923g;
            bxvd a = dpf.m9018a(contextManagerClientInfo, 10, i2);
            if (dpf.m9013a(contextFenceStub) != null) {
                bxvd da = bxgg.f163244c.mo74144da();
                bxgf a2 = dpf.m9013a(contextFenceStub);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxgg bxgg2 = (bxgg) da.f164949b;
                a2.getClass();
                bxgg2.f163247b = a2;
                bxgg2.f163246a = 1 | bxgg2.f163246a;
                bxgg = (bxgg) da.mo74062i();
            } else {
                bxgg = bxgg.f163244c;
            }
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            bxgc bxgc = (bxgc) a.f164949b;
            bxgc bxgc2 = bxgc.f163222o;
            bxgg.getClass();
            bxgc.f163236m = bxgg;
            bxgc.f163224a |= 2048;
            G.mo9374a((bxgc) a.mo74062i());
            dro n = dwq.m9670n();
            tmi b = m9206b();
            ContextManagerClientInfo contextManagerClientInfo2 = this.f13922f;
            lrk lrk = new lrk();
            lrk.mo15390a(this.f13919c);
            String str = this.f13919c;
            sdo.m34977c(str);
            lrk.f26640a.add(new UpdateFenceOperation(7, (ContextFenceRegistrationStub) null, (lrj) null, (PendingIntent) null, str, -1, -1));
            n.mo9501a(b, contextManagerClientInfo2, lrk.mo15389a());
            if (this.f13920d != null) {
                dwq.m9667k().mo9433a(this.f13920d);
            }
        }
    }
}
