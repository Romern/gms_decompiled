package p000;

import android.content.Intent;
import android.view.View;
import com.google.android.gms.carsetup.AaSettingsActivityImpl;

/* renamed from: oqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oqv implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ AaSettingsActivityImpl f38253a;

    public oqv(AaSettingsActivityImpl aaSettingsActivityImpl) {
        this.f38253a = aaSettingsActivityImpl;
    }

    public void onClick(View view) {
        Intent b = oyi.m29998b(this.f38253a, "com.google.android.projection.gearhead", "utm_source%3Dgms_settings%26utm_campaign%3Dsettings_google_services_discoveraa");
        this.f38253a.f29534c.mo21727a(bpea.SETTINGS_AA_GOOGLE_SETTINGS_GET_THE_APP);
        this.f38253a.startActivity(b);
    }
}
