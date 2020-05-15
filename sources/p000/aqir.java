package p000;

import android.os.Build;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.setupservices.GoogleServicesChimeraActivity;
import com.google.android.gms.setupservices.item.GoogleServicesExpandableSwitchItem;

/* renamed from: aqir */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqir extends aqiv {

    /* renamed from: a */
    public aqje f86173a;

    /* renamed from: b */
    public aqje f86174b;

    /* renamed from: c */
    public aqje f86175c;

    /* renamed from: d */
    public aqjs f86176d;

    /* renamed from: e */
    final /* synthetic */ GoogleServicesChimeraActivity f86177e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aqir(GoogleServicesChimeraActivity googleServicesChimeraActivity) {
        super(C0126R.C0129id.agree_wallpaper_permission, 9, 8);
        this.f86177e = googleServicesChimeraActivity;
    }

    /* renamed from: a */
    public final aucb mo47888a() {
        GoogleServicesChimeraActivity googleServicesChimeraActivity = this.f86177e;
        this.f86176d = new aqjs(googleServicesChimeraActivity, googleServicesChimeraActivity.f107628f);
        aucb a = aqjd.m71716a(cgll.f187253a.mo6606a().mo84076L());
        a.mo50373a(new aqin(this));
        aucb a2 = aqjd.m71716a(cgll.f187253a.mo6606a().mo84075K());
        a2.mo50373a(new aqio(this));
        aucb a3 = aqjd.m71716a(cgll.f187253a.mo6606a().mo84074J());
        a3.mo50373a(new aqip(this));
        return aucu.m76781a(a, a2, a3);
    }

    /* renamed from: b */
    public final boolean mo47891b() {
        if (!this.f86176d.f86234a || !aqjz.m71749a("ro.wallpapers_loc_request_suw", false)) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        return true;
    }

    /* renamed from: c */
    public final bizy mo47892c() {
        return new aqiq(this);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ aqiz mo47893d() {
        GoogleServicesExpandableSwitchItem a = aqiv.m71684a(this.f86177e, C0126R.C0129id.section_location, C0126R.C0127drawable.quantum_ic_wallpaper_vd_theme_24);
        aqje aqje = this.f86173a;
        if (aqje == null) {
            aqje = aqje.m71717a(this.f86176d.f86226g, (int) C0126R.string.setupservices_google_services_wallpaper_permission_title);
        }
        a.f107646a = aqje;
        aqje aqje2 = this.f86174b;
        if (aqje2 == null) {
            aqje2 = aqje.m71717a(this.f86176d.f86226g, (int) C0126R.string.setupservices_google_services_wallpaper_permission);
        }
        a.mo58961b(aqje2);
        aqje aqje3 = this.f86175c;
        if (aqje3 == null) {
            aqje3 = aqje.m71717a(this.f86176d.f86226g, (int) C0126R.string.setupservices_google_services_wallpaper_permission_details);
        }
        a.mo58960a(aqje3);
        this.f86176d.mo47924a(new aqis(a));
        return a;
    }

    /* renamed from: a */
    public final void mo47890a(boolean z) {
        this.f86176d.mo47926f();
    }
}
