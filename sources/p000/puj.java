package p000;

import com.google.android.gms.cast_mirroring.JGCastLogger;

/* renamed from: puj */
final /* synthetic */ class puj implements Runnable {

    /* renamed from: a */
    private final pun f40262a;

    public puj(pun pun) {
        this.f40262a = pun;
    }

    public final void run() {
        pun pun = this.f40262a;
        pun.f40379n.mo23670a("Releasing mirroring logger after %d ms.", Long.valueOf(pun.f40268b));
        JGCastLogger jGCastLogger = pun.f40274h;
        if (jGCastLogger != null) {
            jGCastLogger.mo5043a();
            pun.f40274h = null;
        }
    }
}
