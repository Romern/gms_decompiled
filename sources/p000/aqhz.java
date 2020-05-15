package p000;

import android.os.Build;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.setupservices.GoogleServicesChimeraActivity;
import com.google.android.gms.setupservices.item.GoogleServicesExpandableSwitchItem;

/* renamed from: aqhz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqhz extends aqiv {

    /* renamed from: a */
    public aqje f86141a;

    /* renamed from: b */
    public aqje f86142b;

    /* renamed from: c */
    public aqje f86143c;

    /* renamed from: d */
    public aqjf f86144d;

    /* renamed from: e */
    final /* synthetic */ GoogleServicesChimeraActivity f86145e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aqhz(GoogleServicesChimeraActivity googleServicesChimeraActivity) {
        super(C0126R.C0129id.agree_automatic_storage_manager, 8, 7);
        this.f86145e = googleServicesChimeraActivity;
    }

    /* renamed from: a */
    public final aucb mo47888a() {
        GoogleServicesChimeraActivity googleServicesChimeraActivity = this.f86145e;
        this.f86144d = new aqjf(googleServicesChimeraActivity, googleServicesChimeraActivity.f107627e, googleServicesChimeraActivity.f107628f);
        aucb a = aqjd.m71716a(cgll.f187253a.mo6606a().mo84086j());
        a.mo50373a(new aqhv(this));
        aucb a2 = aqjd.m71716a(cgll.f187253a.mo6606a().mo84085i());
        a2.mo50373a(new aqhw(this));
        aucb a3 = aqjd.m71716a(cgll.f187253a.mo6606a().mo84084h());
        a3.mo50373a(new aqhx(this));
        return aucu.m76781a(a, a2, a3);
    }

    /* renamed from: b */
    public final boolean mo47891b() {
        aqjf aqjf = this.f86144d;
        if (!cgll.f187253a.mo6606a().mo84094r()) {
            int i = Build.VERSION.SDK_INT;
            if (!aqjf.f86197b || !aqjz.m71749a("ro.storage_manager.enabled", false) || !aqjz.m71749a("ro.storage_manager.show_opt_in", true)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final bizy mo47892c() {
        return new aqhy(this);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ aqiz mo47893d() {
        GoogleServicesExpandableSwitchItem a = aqiv.m71684a(this.f86145e, C0126R.C0129id.section_backup_and_storage, C0126R.C0127drawable.quantum_ic_storage_vd_theme_24);
        aqje aqje = this.f86141a;
        if (aqje == null) {
            aqje = aqje.m71717a(this.f86144d.f86226g, (int) C0126R.string.setupservices_google_services_automatic_storage_manager_title);
        }
        a.f107646a = aqje;
        aqje aqje2 = this.f86142b;
        if (aqje2 == null) {
            aqjf aqjf = this.f86144d;
            aqje2 = aqkg.m71752a(aqjf.f86226g, C0126R.array.setupservices_google_services_automatic_storage_manager, aqjf.f86196a);
        }
        a.mo58961b(aqje2);
        aqje aqje3 = this.f86143c;
        if (aqje3 == null) {
            aqje3 = aqje.m71717a(this.f86144d.f86226g, (int) C0126R.string.setupservices_google_services_automatic_storage_manager_details);
        }
        a.mo58960a(aqje3);
        this.f86144d.mo47924a(new aqis(a));
        return a;
    }

    /* renamed from: a */
    public final void mo47890a(boolean z) {
        this.f86144d.mo47926f();
    }
}
