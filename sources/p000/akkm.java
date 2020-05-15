package p000;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;

/* renamed from: akkm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akkm extends akko {

    /* renamed from: b */
    private final ContentObserver f72159b;

    /* renamed from: c */
    private final ContentResolver f72160c;

    /* renamed from: d */
    private bora f72161d;

    public akkm(ContentResolver contentResolver, Handler handler) {
        this.f72160c = contentResolver;
        this.f72159b = new akkl(this, "netrec", "FeatureLogger", handler);
    }

    /* renamed from: a */
    private final void m59923a(String str) {
        this.f72160c.registerContentObserver(Settings.Global.getUriFor(str), false, this.f72159b);
    }

    /* renamed from: b */
    public final boolean mo39517b() {
        return cfpd.f185332a.mo6606a().mo82447l();
    }

    /* renamed from: c */
    public final void mo39518c() {
        m59923a("wifi_networks_available_notification_on");
        m59923a("wifi_wakeup_enabled");
        m59923a("use_open_wifi_package");
        mo39520a();
    }

    /* renamed from: d */
    public final void mo39519d() {
        this.f72160c.unregisterContentObserver(this.f72159b);
    }

    /* renamed from: a */
    public final void mo39520a() {
        boolean z;
        bxvd da = bora.f134365e.mo74144da();
        if (Settings.Global.getInt(this.f72160c, "wifi_networks_available_notification_on", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bora bora = (bora) da.f164949b;
        bora.f134367a |= 2;
        bora.f134369c = z;
        boolean equals = TextUtils.equals(Settings.Global.getString(this.f72160c, "use_open_wifi_package"), cfpm.m142486b());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bora bora2 = (bora) da.f164949b;
        bora2.f134367a |= 4;
        bora2.f134370d = equals;
        boolean z2 = Settings.Global.getInt(this.f72160c, "wifi_wakeup_enabled", 0) == 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bora bora3 = (bora) da.f164949b;
        bora3.f134367a |= 1;
        bora3.f134368b = z2;
        bora bora4 = (bora) da.mo74062i();
        bora bora5 = this.f72161d;
        if (bora5 == null || !bora5.equals(bora4)) {
            bxvd da2 = boqx.f134343i.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            boqx boqx = (boqx) da2.f164949b;
            boqx.f134346b = 50;
            int i = 1 | boqx.f134345a;
            boqx.f134345a = i;
            bora4.getClass();
            boqx.f134351g = bora4;
            boqx.f134345a = i | 64;
            aknf.m60074a(da2);
            this.f72161d = bora4;
        }
    }
}
