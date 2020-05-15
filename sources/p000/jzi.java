package p000;

import com.google.android.gms.auth.uiflows.minutemaid.GlifMinuteMaidLayout;

/* renamed from: jzi */
final /* synthetic */ class jzi implements Runnable {

    /* renamed from: a */
    private final kaa f23571a;

    /* renamed from: b */
    private final boolean f23572b;

    public jzi(kaa kaa, boolean z) {
        this.f23571a = kaa;
        this.f23572b = z;
    }

    public final void run() {
        GlifMinuteMaidLayout glifMinuteMaidLayout;
        kaa kaa = this.f23571a;
        boolean z = this.f23572b;
        if (kaa.f23621H && (glifMinuteMaidLayout = kaa.f23623J) != null) {
            glifMinuteMaidLayout.mo7904a(z);
        }
    }
}
