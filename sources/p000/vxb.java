package p000;

import com.google.android.gms.droidguard.DroidGuardResultsRequest;

/* renamed from: vxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class vxb extends vxe {

    /* renamed from: a */
    private final vwy f50175a = new vwy();

    /* renamed from: b */
    final /* synthetic */ vxc f50176b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vxb(vxc vxc, String str, DroidGuardResultsRequest droidGuardResultsRequest) {
        super(str, droidGuardResultsRequest);
        this.f50176b = vxc;
    }

    /* renamed from: a */
    public final Object mo28923a() {
        sdo.m34973b("This method must not be called on the main thread.");
        vxj vxj = this.f50176b.f50177a;
        this.f50180e.mo28934a(2, vxw.COARSE);
        vxj.f50192a.offer(this);
        vxj.f50194c.post(vxj);
        try {
            Object a = this.f50175a.mo28919a((long) this.f50179d.mo18376a());
            if (a != null) {
                return a;
            }
            int a2 = this.f50179d.mo18376a();
            StringBuilder sb = new StringBuilder(23);
            sb.append("timeout: ");
            sb.append(a2);
            sb.append(" ms");
            return mo28921a(sb.toString());
        } catch (InterruptedException e) {
            int a3 = this.f50179d.mo18376a();
            StringBuilder sb2 = new StringBuilder(44);
            sb2.append("takeWithTimeout(");
            sb2.append(a3);
            sb2.append(") got interrupted");
            return mo28921a(sb2.toString());
        }
    }

    /* renamed from: a */
    public abstract Object mo28921a(String str);

    /* renamed from: a */
    public abstract Object mo28922a(vvq vvq);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo28924b(vvq vvq) {
        this.f50175a.mo28920a(mo28922a(vvq));
    }
}
