package p000;

import android.text.TextUtils;
import com.google.android.gms.auth.uiflows.minutemaid.GlifMinuteMaidLayout;

/* renamed from: jzh */
final /* synthetic */ class jzh implements Runnable {

    /* renamed from: a */
    private final kaa f23568a;

    /* renamed from: b */
    private final String f23569b;

    /* renamed from: c */
    private final int f23570c;

    public jzh(kaa kaa, String str, int i) {
        this.f23568a = kaa;
        this.f23569b = str;
        this.f23570c = i;
    }

    public final void run() {
        GlifMinuteMaidLayout glifMinuteMaidLayout;
        kaa kaa = this.f23568a;
        String str = this.f23569b;
        int i = this.f23570c;
        if (kaa.f23621H && (glifMinuteMaidLayout = kaa.f23623J) != null) {
            if (TextUtils.isEmpty(str)) {
                biyp biyp = glifMinuteMaidLayout.f11533d;
                if (biyp != null) {
                    biyp.mo64885a(8);
                    return;
                }
                return;
            }
            biyo biyo = new biyo(glifMinuteMaidLayout.f11530a);
            biyo.f122328c = i;
            biyo.f122329d = 2132018230;
            biyo.f122326a = str;
            glifMinuteMaidLayout.f11533d = biyo.mo64882a();
            glifMinuteMaidLayout.f11533d.mo64885a(0);
            glifMinuteMaidLayout.f11531b.mo52735b(glifMinuteMaidLayout.f11533d);
            glifMinuteMaidLayout.f11533d.f122336f = new jys(kaa);
        }
    }
}
