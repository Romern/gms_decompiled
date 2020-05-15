package p000;

import com.google.android.gms.auth.uiflows.minutemaid.GlifMinuteMaidLayout;

/* renamed from: jzk */
final /* synthetic */ class jzk implements Runnable {

    /* renamed from: a */
    private final kaa f23575a;

    /* renamed from: b */
    private final boolean f23576b;

    public jzk(kaa kaa, boolean z) {
        this.f23575a = kaa;
        this.f23576b = z;
    }

    public final void run() {
        GlifMinuteMaidLayout glifMinuteMaidLayout;
        kaa kaa = this.f23575a;
        boolean z = this.f23576b;
        if (kaa.f23621H && (glifMinuteMaidLayout = kaa.f23623J) != null) {
            biyp biyp = glifMinuteMaidLayout.f11532c;
            if (biyp != null) {
                biyp.mo64888a(z);
            }
            biyp biyp2 = glifMinuteMaidLayout.f11533d;
            if (biyp2 != null) {
                biyp2.mo64888a(z);
            }
        }
    }
}
