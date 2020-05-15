package p000;

import com.google.android.gms.auth.uiflows.minutemaid.GlifMinuteMaidLayout;

/* renamed from: jzg */
final /* synthetic */ class jzg implements Runnable {

    /* renamed from: a */
    private final kaa f23565a;

    /* renamed from: b */
    private final String f23566b;

    /* renamed from: c */
    private final int f23567c;

    public jzg(kaa kaa, String str, int i) {
        this.f23565a = kaa;
        this.f23566b = str;
        this.f23567c = i;
    }

    public final void run() {
        GlifMinuteMaidLayout glifMinuteMaidLayout;
        kaa kaa = this.f23565a;
        String str = this.f23566b;
        int i = this.f23567c;
        if (kaa.f23621H && (glifMinuteMaidLayout = kaa.f23623J) != null) {
            glifMinuteMaidLayout.mo7903a(str, i, kaa);
        }
    }
}
