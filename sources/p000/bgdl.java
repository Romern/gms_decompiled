package p000;

import android.app.PendingIntent;

/* renamed from: bgdl */
final /* synthetic */ class bgdl implements Runnable {

    /* renamed from: a */
    private final bgdo f116133a;

    /* renamed from: b */
    private final PendingIntent f116134b;

    public bgdl(bgdo bgdo, PendingIntent pendingIntent) {
        this.f116133a = bgdo;
        this.f116134b = pendingIntent;
    }

    public final void run() {
        bgdo bgdo = this.f116133a;
        PendingIntent pendingIntent = this.f116134b;
        synchronized (bgdo.f116149e) {
            String valueOf = String.valueOf(Integer.toHexString(pendingIntent.hashCode()));
            if (valueOf.length() == 0) {
                new String("removing activity pendingIntent ");
            } else {
                "removing activity pendingIntent ".concat(valueOf);
            }
            bgbg bgbg = bgdo.f116157n;
            bgbg.mo25984a((Object) pendingIntent);
            bgbg.mo62601a(pendingIntent);
            bgdo.mo62680b(false);
            if (bgdo.f116157n.mo62605h() == 0 && bgdo.f116148d && cese.m138158g()) {
                bgdo.f116164u.mo25944a();
                bgdo.f116148d = false;
            }
        }
    }
}
