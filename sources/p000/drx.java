package p000;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.location.places.PlacesClientIdentifier;

/* renamed from: drx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class drx extends aaab implements Runnable {

    /* renamed from: a */
    public final dpv f13912a;

    /* renamed from: b */
    public dqx f13913b;

    public drx(String str) {
        this(str, null);
    }

    /* renamed from: a */
    protected static aucb m9187a(ContextManagerClientInfo contextManagerClientInfo) {
        new Object[1][0] = contextManagerClientInfo;
        Context f = dwq.m9662f();
        aemh aemh = new aemh();
        aemh.f63515a = contextManagerClientInfo.f30678b;
        aemh.f63516b = contextManagerClientInfo.f30680d;
        return aema.m52141a(f, aemh.mo34328a()).mo24701a((rpa) new aell(new PlacesClientIdentifier(contextManagerClientInfo.f30678b, contextManagerClientInfo.f30680d)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo9410a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo9517b(int i) {
    }

    public final void run() {
        if (dwq.m9667k().mo9512b()) {
            mo9410a();
            return;
        }
        String valueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
        sb.append("Should be running on the EventHandler thread ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    public drx(String str, dpv dpv) {
        super(47, str);
        this.f13912a = dpv;
    }

    /* renamed from: a */
    protected static void m9188a(DataHolder dataHolder, tmo tmo, ContextManagerClientInfo contextManagerClientInfo) {
        boolean z = tmo instanceof tmi;
        Object[] objArr = {Boolean.valueOf(contextManagerClientInfo.mo18068c()), Integer.valueOf(contextManagerClientInfo.f30686j), Integer.valueOf(Process.myPid()), Boolean.valueOf(z)};
        if (!z) {
            dataHolder.close();
        }
    }

    /* renamed from: a */
    public final dqx mo9513a(String str) {
        dqx dqx = this.f13913b;
        if (str == null) {
            return new dqx(dqx.f13840a, dqx.f13846g, dqx.f13841b);
        }
        String str2 = dqx.f13840a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + str.length());
        sb.append(str2);
        sb.append("+");
        sb.append(str);
        return new dqx(sb.toString(), dqx.f13846g, dqx.f13841b);
    }

    /* renamed from: a */
    public final void mo9514a(long j, dqx dqx) {
        this.f13913b = dqx;
        dwq.m9667k().mo9434a(this, j, this.f13913b);
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        if (cdgp.f180782a.mo6606a().mo77605y()) {
            egr D = dwq.m9647D();
            if (D != null) {
                D.mo10106a(this.f13913b);
                this.f13913b.mo9463b();
            }
            mo9410a();
            if (D != null) {
                this.f13913b.mo9464c();
                D.mo10108b(this.f13913b);
                return;
            }
            return;
        }
        mo9410a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9515a(aucb aucb) {
        aucb.mo50378a(dwq.m9667k().mo9432a(dqy.m9123a("ControllerOperation_finalizeTask")), new drw(this, "[ControllerOperation] tasks finished", new Object[0]));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
        bnsl.mo68432a("drx", "a", 90, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("[ControllerOperation] Operations failed with status %s", status);
    }

    /* renamed from: a */
    public final void mo9516a(dqx dqx) {
        this.f13913b = dqx;
        dwq.m9667k().mo9435a(this, this.f13913b);
    }
}
