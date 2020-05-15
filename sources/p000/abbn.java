package p000;

import android.util.Log;
import android.util.Pair;

/* renamed from: abbn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abbn implements Runnable {

    /* renamed from: a */
    final /* synthetic */ abbo f57002a;

    public abbn(abbo abbo) {
        this.f57002a = abbo;
    }

    public final void run() {
        if (this.f57002a.mo31993a()) {
            Log.w("gH_GetSyncHelpPsd", "Getting sync help psd timed out.");
            new aare(this.f57002a.f57003a).mo31635a(sqw.m36033a(Pair.create("gms:googlehelp:sync_help_psd_failure", "timeout")));
            abbo abbo = this.f57002a;
            abbo.f57004b.mo31995a(abbo.f57003a);
        }
    }
}
