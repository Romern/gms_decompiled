package p000;

import android.os.SystemClock;

/* renamed from: ahnn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahnn extends ahnl {
    public ahnn(ahnp ahnp, ahkv ahkv, String str) {
        super(ahnp, "KeepAliveManager", ahkv, str);
    }

    /* renamed from: a */
    public final boolean mo36889a(ahna ahna) {
        if (ahna.mo36802d() == -1 || ahna.mo36802d() + cfnv.f184625a.mo6606a().mo81771ad() >= SystemClock.elapsedRealtime()) {
            ahna.mo36799a(ahoy.m56304a(buuw.KEEP_ALIVE, buuf.f154939a).mo73642k());
            Thread.sleep(cfnv.m140742D());
            return true;
        }
        ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("No incoming frames were processed within the KeepAlive timeout for endpoint %s.", this.f67631c);
        return false;
    }

    public final void run() {
        try {
            Thread.sleep(cfnv.m140742D());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        super.run();
    }
}
