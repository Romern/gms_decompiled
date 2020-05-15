package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: bguy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bguy extends soa {

    /* renamed from: a */
    final /* synthetic */ Throwable f117616a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bguy(Throwable th) {
        super(10);
        this.f117616a = th;
    }

    public final void run() {
        try {
            wwv wwv = new wwv(this.f117616a);
            wwv.f51512j = "com.google.android.gms";
            wwv.f51499d = "com.google.android.gms.location.reporting.SILENT_FEEDBACK";
            wwv.mo29496b();
            aucu.m76783a(new wwr(rpr.m34216b()).mo29488b(wwv.mo29490a()), 500, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            bgur.m100012a("GCoreUlr", "Error sending feedback", e);
        }
    }
}
