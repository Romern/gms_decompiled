package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.matchstick.task.ScheduledTaskService;

/* renamed from: azeh */
final /* synthetic */ class azeh implements Runnable {

    /* renamed from: a */
    private final azet f99161a;

    /* renamed from: b */
    private final Intent f99162b;

    public azeh(azet azet, Intent intent) {
        this.f99161a = azet;
        this.f99162b = intent;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        return;
     */
    public final void run() {
        azet azet = this.f99161a;
        Intent intent = this.f99162b;
        azox.m85982b();
        synchronized (azet.f99185a) {
            if (azet.mo54847c()) {
                azet.f99191g.mo55141a(458, azet.f99207w);
                azet.mo54844a(false);
                Context applicationContext = azet.f99187c.getApplicationContext();
                if (azfn.m85585b(applicationContext)) {
                    int intExtra = intent.getIntExtra("numOfBindResetFromEOPTimeout", 0);
                    if (((long) intExtra) < cfeo.f183719a.mo6606a().mo80963aW()) {
                        intent.putExtra("numOfBindResetFromEOPTimeout", intExtra + 1);
                        azet.f99189e.mo54875a(intent);
                    }
                } else {
                    ScheduledTaskService.m94658a(applicationContext, "gms:matchstick:restoreConn");
                }
            }
        }
    }
}
