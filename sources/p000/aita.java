package p000;

/* renamed from: aita */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aita implements ciiv {

    /* renamed from: a */
    final /* synthetic */ bqgy f69668a;

    /* renamed from: b */
    final /* synthetic */ ailt f69669b;

    public aita(bqgy bqgy, ailt ailt) {
        this.f69668a = bqgy;
        this.f69669b = ailt;
    }

    /* renamed from: a */
    public final void mo25548a() {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aita", "a", 149, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Finished receiving messages from tachyon.");
        this.f69668a.mo69136a((Throwable) new RuntimeException("ReceiveMessagesExpress stream has completed."));
    }

    /* renamed from: a */
    public final void mo37984a(cbkx cbkx) {
        int i = cbkx.f177455a;
        if (i == 7) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aita", "a", 131, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Received fast path ready message from tachyon.");
            this.f69668a.mo69138b((Object) null);
        } else if (i == 2) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
            bnsl2.mo68432a("aita", "a", 134, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Received inbox message from tachyon.");
            this.f69669b.mo37660a((cbkx.f177455a == 2 ? (cbkj) cbkx.f177456b : cbkj.f177405k).f177411e.getKey());
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo25549a(Object obj) {
        cbkx cbkx = (cbkx) obj;
        int i = cbkx.f177455a;
        if (i == 7) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aita", "a", 131, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Received fast path ready message from tachyon.");
            this.f69668a.mo69138b((Object) null);
        } else if (i == 2) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
            bnsl2.mo68432a("aita", "a", 134, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Received inbox message from tachyon.");
            this.f69669b.mo37660a((cbkx.f177455a == 2 ? (cbkj) cbkx.f177456b : cbkj.f177405k).f177411e.getKey());
        }
    }

    /* renamed from: a */
    public final void mo25550a(Throwable th) {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
        bnsl.mo68437a(th);
        bnsl.mo68432a("aita", "a", 142, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Failed to receive messages from tachyon with an error.");
        this.f69668a.mo69136a(th);
    }
}
