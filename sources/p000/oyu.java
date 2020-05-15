package p000;

import com.google.android.gms.carsetup.setup.PreSetupActivityImpl;

/* renamed from: oyu */
public final /* synthetic */ class oyu implements Runnable {

    /* renamed from: a */
    private final PreSetupActivityImpl f38636a;

    public oyu(PreSetupActivityImpl preSetupActivityImpl) {
        this.f38636a = preSetupActivityImpl;
    }

    public final void run() {
        PreSetupActivityImpl preSetupActivityImpl = this.f38636a;
        bnsi b = PreSetupActivityImpl.f29670b.mo68387b();
        b.mo68432a("com.google.android.gms.carsetup.setup.PreSetupActivityImpl", "o", 271, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        b.mo68405a("Critical error: user didn't unlock to proceed within 30s.");
        bmxy.m108581a(preSetupActivityImpl.f29674f);
        ozj ozj = preSetupActivityImpl.f29674f;
        if (!ozj.f38657c) {
            ozj.f38656b.mo22797a(bpeb.FRX_PRESETUP_EXIT_CONDITIONS, bpea.AUTO_DISMISS);
            ozj.mo22805f();
        }
    }
}
