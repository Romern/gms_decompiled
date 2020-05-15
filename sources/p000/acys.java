package p000;

import android.content.Intent;

/* renamed from: acys */
final /* synthetic */ class acys implements C0038ax {

    /* renamed from: a */
    private final acza f61091a;

    public acys(acza acza) {
        this.f61091a = acza;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        acza acza = this.f61091a;
        aczd aczd = (aczd) obj;
        if (aczd != null) {
            int i = aczd.f61127a;
            boolean z = true;
            if (i == 0) {
                acza.mo33263a(aczd.f61129c, aczd.f61128b);
            } else if (i == 2) {
                acza.f61107e = true;
                acza.mo33262a((Intent) null, 1);
            } else if (i != 3) {
                z = false;
            } else {
                acza.f61107e = true;
                acza.mo33262a((Intent) null, 3);
            }
            acza.f61108f.mo33267a(z);
        }
    }
}
