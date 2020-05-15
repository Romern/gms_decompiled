package p000;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.cast.settings.CastSettingsChimeraActivity;

/* renamed from: pzq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pzq extends qab {

    /* renamed from: a */
    public suo f40752a;

    public pzq(CastSettingsChimeraActivity castSettingsChimeraActivity) {
        super(castSettingsChimeraActivity);
    }

    /* renamed from: a */
    public final void mo23823a(Bundle bundle) {
        C1341rz aW = this.f40775d.mo8628aW();
        aW.mo15841a(4, 4);
        aW.mo15853b(true);
        sun sun = new sun(aW);
        sun.mo26112a(C0126R.string.cast_settings_debug);
        this.f40752a = sun.mo26111a();
        this.f40775d.mo17606a(bundle);
    }

    /* renamed from: a */
    public final void mo23824a(sug sug) {
        svf e = sug.mo26098e(C0126R.string.cast_settings_gaia_category_title);
        svk svk = new svk(this.f40775d);
        svk.mo26084a((int) C0126R.string.cast_settings_gaia_refresh_title);
        svk.mo26106c(C0126R.string.cast_settings_gaia_refresh_title);
        svk.mo26086b(0);
        svk.mo26102a(new pzn(this));
        svk svk2 = new svk(this.f40775d);
        svk2.mo26084a((int) C0126R.string.cast_settings_enable_relay_casting_title);
        svk2.mo26106c(C0126R.string.cast_settings_enable_relay_casting_title);
        svk2.mo26086b(1);
        svk2.mo26102a(new pzo(this));
        svk svk3 = new svk(this.f40775d);
        svk3.mo26084a((int) C0126R.string.cast_settings_disable_relay_casting_title);
        svk3.mo26106c(C0126R.string.cast_settings_disable_relay_casting_title);
        svk3.mo26086b(2);
        svk3.mo26102a(new pzp(this));
        e.mo26149a((sui) svk);
        e.mo26149a((sui) svk2);
        e.mo26149a((sui) svk3);
    }

    /* renamed from: a */
    public final boolean mo23825a(Menu menu) {
        return this.f40775d.mo17607a(menu);
    }

    /* renamed from: a */
    public final boolean mo23826a(MenuItem menuItem) {
        return this.f40775d.mo17608a(menuItem);
    }
}
