package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: bgdp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgdp extends soa {

    /* renamed from: a */
    final /* synthetic */ Throwable f116170a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgdp(Throwable th) {
        super(10);
        this.f116170a = th;
    }

    public final void run() {
        wwv wwv = new wwv(this.f116170a);
        wwv.f51512j = "com.google.android.location";
        wwv.f51499d = "com.google.android.location.nlp.smc.SILENT_FEEDBACK";
        wwv.mo29496b();
        try {
            aucu.m76783a(new wwr(rpr.m34216b()).mo29488b(wwv.mo29490a()), 500, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
        }
    }
}
