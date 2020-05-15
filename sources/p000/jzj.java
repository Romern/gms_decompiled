package p000;

import com.google.android.gms.auth.uiflows.minutemaid.GlifMinuteMaidLayout;

/* renamed from: jzj */
final /* synthetic */ class jzj implements Runnable {

    /* renamed from: a */
    private final kaa f23573a;

    /* renamed from: b */
    private final boolean f23574b;

    public jzj(kaa kaa, boolean z) {
        this.f23573a = kaa;
        this.f23574b = z;
    }

    public final void run() {
        GlifMinuteMaidLayout glifMinuteMaidLayout;
        biyp biyp;
        kaa kaa = this.f23573a;
        boolean z = this.f23574b;
        if (kaa.f23621H && (glifMinuteMaidLayout = kaa.f23623J) != null && (biyp = glifMinuteMaidLayout.f11533d) != null) {
            biyp.mo64888a(z);
        }
    }
}
