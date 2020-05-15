package p000;

import java.util.concurrent.ExecutionException;

/* renamed from: azir */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azir extends soa {

    /* renamed from: a */
    final /* synthetic */ azis f99490a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public azir(azis azis) {
        super(9);
        this.f99490a = azis;
    }

    public final void run() {
        azan.m85141a(this.f99490a.f99491a.f99493b).mo54535a();
        azqf.m86130a(this.f99490a.f99491a.f99493b);
        if (azqf.m86149c()) {
            azpw a = azpw.m86109a(this.f99490a.f99491a.f99493b);
            try {
                bnre i = ((bngx) azbj.m85193a(a.f99860a).mo54563c().mo56338a().get()).listIterator();
                while (i.hasNext()) {
                    a.mo55196a((bcoh) i.next());
                }
            } catch (InterruptedException | ExecutionException e) {
                azoj.m85933c("LTNotifUtils", "Unable to get accounts to post unread notifications", new Object[0]);
                azph.m85998a(a.f99860a).mo55126a(1441, 59);
            }
        }
    }
}
