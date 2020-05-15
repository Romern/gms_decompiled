package p000;

import android.app.PendingIntent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.security.settings.VerifyAppsSettingsChimeraActivity;
import java.util.Collection;

/* renamed from: apxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apxs {

    /* renamed from: a */
    public final apuo[] f85083a;

    /* renamed from: b */
    public final apuo[] f85084b;

    /* renamed from: c */
    public final VerifyAppsSettingsChimeraActivity f85085c;

    /* renamed from: d */
    final /* synthetic */ VerifyAppsSettingsChimeraActivity f85086d;

    /* renamed from: e */
    public final svf f85087e;

    /* renamed from: f */
    private Resources f85088f;

    public apxs(VerifyAppsSettingsChimeraActivity verifyAppsSettingsChimeraActivity, apup apup) {
        this.f85086d = verifyAppsSettingsChimeraActivity;
        VerifyAppsSettingsChimeraActivity verifyAppsSettingsChimeraActivity2 = this.f85086d;
        this.f85085c = verifyAppsSettingsChimeraActivity2;
        this.f85087e = ((svi) verifyAppsSettingsChimeraActivity2.f41601g).f45221a;
        this.f85083a = apup.f84941d;
        this.f85084b = apup.f84942e;
        verifyAppsSettingsChimeraActivity.f107540l = apup.f84939b;
        verifyAppsSettingsChimeraActivity.f107541m = apup.f84940c;
        if (this.f85083a != null || this.f85084b != null) {
            try {
                this.f85088f = verifyAppsSettingsChimeraActivity.getPackageManager().getResourcesForApplication("com.android.vending");
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
    }

    /* renamed from: a */
    public final String mo47690a(apuo apuo) {
        int i;
        Resources resources;
        String str = apuo.f84934b;
        if (!(str != null || (i = apuo.f84935c) == 0 || (resources = this.f85088f) == null)) {
            str = resources.getString(i);
        }
        return str == null ? this.f85086d.getString(C0126R.string.play_protect_generic_malware) : str;
    }

    /* renamed from: a */
    public final void mo47691a(int i) {
        bngx a = bngx.m109368a((Collection) this.f85087e.mo26154g());
        int size = a.size();
        for (int i2 = 0; i2 < size; i2++) {
            sui sui = (sui) a.get(i2);
            if (sui.mo26089e() == i) {
                this.f85087e.mo26153d(sui);
            }
        }
    }

    /* renamed from: a */
    public final void mo47692a(apxg apxg, boolean z, int i, PendingIntent pendingIntent) {
        if (pendingIntent != null) {
            apxg.mo47681c(this.f85086d.getText(i));
            apxg.f85050a = new apxr(this, pendingIntent, z, apxg);
        }
    }
}
