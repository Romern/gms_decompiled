package p000;

import com.google.android.gms.carsetup.frx.SetupFsm$AutoIntroState;

/* renamed from: oxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oxg implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SetupFsm$AutoIntroState f38562a;

    public oxg(SetupFsm$AutoIntroState setupFsm$AutoIntroState) {
        this.f38562a = setupFsm$AutoIntroState;
    }

    public final void run() {
        bnsi b = oxj.f38565a.mo68387b();
        b.mo68432a("oxg", "run", 384, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        b.mo68405a("Critical error: user didn't unlock to proceed within 30s.");
        this.f38562a.f38587c.mo22754a("EVENT_INTRO_LOCK_TIMEOUT");
    }
}
