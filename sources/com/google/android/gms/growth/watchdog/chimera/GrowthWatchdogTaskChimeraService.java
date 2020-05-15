package com.google.android.gms.growth.watchdog.chimera;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GrowthWatchdogTaskChimeraService extends aeah {

    /* renamed from: a */
    private final ablh f79048a;

    public GrowthWatchdogTaskChimeraService(ablh ablh) {
        this.f79048a = ablh;
    }

    public static GrowthWatchdogTaskChimeraService provideInstance() {
        abli a = ablj.m47861a();
        a.mo32207a(abif.m47744a());
        ablh j = a.mo32206a().f57663a.mo32127j();
        cazf.m127593a(j, "Cannot return null from a non-@Nullable component method");
        return new GrowthWatchdogTaskChimeraService(j);
    }

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        return this.f79048a.mo32199a(aecc);
    }
}
