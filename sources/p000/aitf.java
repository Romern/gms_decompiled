package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;

/* renamed from: aitf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aitf implements ciiv {

    /* renamed from: a */
    final /* synthetic */ bqgy f69685a;

    /* renamed from: b */
    final /* synthetic */ ailt f69686b;

    public aitf(bqgy bqgy, ailt ailt) {
        this.f69685a = bqgy;
        this.f69686b = ailt;
    }

    /* renamed from: a */
    public final void mo25548a() {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aitf", "a", 225, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Finished receiving messages from tachyon.");
        this.f69685a.mo69136a((Throwable) new RuntimeException("ReceiveMessages stream has completed."));
    }

    /* renamed from: a */
    public final void mo37994a(cbkx cbkx) {
        int i = cbkx.f177455a;
        if (i == 5) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aitf", "a", (int) BaseMfiEventCallback.TYPE_EXPIRED_MFI, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Received end of batch message from tachyon.");
            this.f69685a.mo69138b((Object) null);
        } else if (i == 2) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
            bnsl2.mo68432a("aitf", "a", (int) BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Received inbox message from tachyon.");
            this.f69686b.mo37660a((cbkx.f177455a == 2 ? (cbkj) cbkx.f177456b : cbkj.f177405k).f177411e.mo73780k());
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo25549a(Object obj) {
        cbkx cbkx = (cbkx) obj;
        int i = cbkx.f177455a;
        if (i == 5) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aitf", "a", (int) BaseMfiEventCallback.TYPE_EXPIRED_MFI, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Received end of batch message from tachyon.");
            this.f69685a.mo69138b((Object) null);
        } else if (i == 2) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
            bnsl2.mo68432a("aitf", "a", (int) BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Received inbox message from tachyon.");
            this.f69686b.mo37660a((cbkx.f177455a == 2 ? (cbkj) cbkx.f177456b : cbkj.f177405k).f177411e.mo73780k());
        }
    }

    /* renamed from: a */
    public final void mo25550a(Throwable th) {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
        bnsl.mo68437a(th);
        bnsl.mo68432a("aitf", "a", (int) BaseMfiEventCallback.TYPE_AGREEMENT_NOT_ACCEPT, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Failed to receive messages from tachyon with an error.");
        this.f69685a.mo69136a(th);
    }
}
