package p000;

import com.google.location.nearby.direct.client.internal.OperationRequest;
import com.google.location.nearby.direct.client.internal.OperationResponse;
import com.google.location.nearby.direct.service.NearbyDirectChimeraService;

/* renamed from: bvdx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvdx extends bvaz {

    /* renamed from: a */
    public bved f155685a;

    /* renamed from: b */
    final /* synthetic */ NearbyDirectChimeraService f155686b;

    public bvdx(NearbyDirectChimeraService nearbyDirectChimeraService) {
        this.f155686b = nearbyDirectChimeraService;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, long):void
     arg types: [java.lang.String, int]
     candidates:
      bnsi.a(java.lang.String, byte):void
      bnsi.a(java.lang.String, int):void
      bnsi.a(java.lang.String, java.lang.Object):void
      bnsi.a(java.lang.String, short):void
      bnsi.a(java.lang.String, java.lang.Object[]):void
      bnsi.a(java.lang.String, long):void */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        if (r0.f155700f.await(5000, java.util.concurrent.TimeUnit.MILLISECONDS) == false) goto L_0x0023;
     */
    /* renamed from: a */
    private final synchronized void m121007a() {
        bved bved = this.f155685a;
        if (bved == null || bved.f155702h.get()) {
            bved bved2 = this.f155685a;
            if (bved2 != null) {
            }
            srn srn = bvcm.f155598a;
            NearbyDirectChimeraService nearbyDirectChimeraService = this.f155686b;
            this.f155685a = new bved(nearbyDirectChimeraService, nearbyDirectChimeraService.f191777a);
        }
        return;
        bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
        bnsl.mo68432a("bvdx", "a", 221, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68415a("NearbyDirect failed to shut down after %sms", 5000L);
        srn srn2 = bvcm.f155598a;
        NearbyDirectChimeraService nearbyDirectChimeraService2 = this.f155686b;
        this.f155685a = new bved(nearbyDirectChimeraService2, nearbyDirectChimeraService2.f191777a);
    }

    /* renamed from: b */
    public final OperationResponse mo73269b(OperationRequest operationRequest) {
        bvee.m121027a(this.f155686b);
        m121007a();
        return this.f155685a.mo73269b(operationRequest);
    }

    /* renamed from: c */
    public final boolean mo73270c(OperationRequest operationRequest) {
        bvee.m121027a(this.f155686b);
        m121007a();
        return this.f155685a.mo73270c(operationRequest);
    }

    /* renamed from: d */
    public final boolean mo73271d(OperationRequest operationRequest) {
        bvee.m121027a(this.f155686b);
        m121007a();
        return this.f155685a.mo73271d(operationRequest);
    }

    /* renamed from: a */
    public final OperationResponse mo73267a(OperationRequest operationRequest) {
        bvee.m121027a(this.f155686b);
        m121007a();
        return this.f155685a.mo73267a(operationRequest);
    }

    /* renamed from: a */
    public final OperationResponse mo73268a(String str) {
        bvee.m121027a(this.f155686b);
        m121007a();
        return this.f155685a.mo73268a(str);
    }
}
