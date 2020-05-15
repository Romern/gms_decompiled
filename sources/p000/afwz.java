package p000;

import android.content.BroadcastReceiver;

/* renamed from: afwz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afwz implements bqfp {

    /* renamed from: a */
    final /* synthetic */ BroadcastReceiver.PendingResult f64902a;

    public afwz(BroadcastReceiver.PendingResult pendingResult) {
        this.f64902a = pendingResult;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Void voidR = (Void) obj;
        bnsi d = afxa.f64903a.mo68390d();
        d.mo68432a("afwz", "a", 45, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("GCM ping successfully handled.");
        this.f64902a.finish();
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        bnsi c = afvx.m53603a().mo68388c();
        c.mo68402a((int) cfgy.m139565b());
        c.mo68437a(th);
        c.mo68432a("afwz", "a", 55, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68405a("Failed to handle GCM ping.");
        this.f64902a.finish();
    }

    /* renamed from: a */
    public final void mo35054a(Void voidR) {
        bnsi d = afxa.f64903a.mo68390d();
        d.mo68432a("afwz", "a", 45, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("GCM ping successfully handled.");
        this.f64902a.finish();
    }
}
