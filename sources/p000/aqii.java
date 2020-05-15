package p000;

import android.content.Context;
import android.os.Build;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.setupservices.GoogleServicesChimeraActivity;
import com.google.android.gms.setupservices.item.GoogleServicesExpandableSwitchItem;

/* renamed from: aqii */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqii extends aqiv {

    /* renamed from: a */
    public aqje f86157a;

    /* renamed from: b */
    public aqje f86158b;

    /* renamed from: c */
    public aqje f86159c;

    /* renamed from: d */
    public aqjr f86160d;

    /* renamed from: e */
    final /* synthetic */ GoogleServicesChimeraActivity f86161e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aqii(GoogleServicesChimeraActivity googleServicesChimeraActivity) {
        super(C0126R.C0129id.agree_usage_reporting, 5, 4);
        this.f86161e = googleServicesChimeraActivity;
    }

    /* renamed from: a */
    public final aucb mo47888a() {
        GoogleServicesChimeraActivity googleServicesChimeraActivity = this.f86161e;
        this.f86160d = new aqjr(googleServicesChimeraActivity, googleServicesChimeraActivity.f107627e, googleServicesChimeraActivity.f107628f);
        aucb a = aqjd.m71716a(cgll.f187253a.mo6606a().mo84073I());
        a.mo50373a(new aqie(this));
        aucb a2 = aqjd.m71716a(cgll.f187253a.mo6606a().mo84072H());
        a2.mo50373a(new aqif(this));
        aucb a3 = aqjd.m71716a(cgll.f187253a.mo6606a().mo84071G());
        a3.mo50373a(new aqig(this));
        return aucu.m76781a(a, a2, a3);
    }

    /* renamed from: b */
    public final boolean mo47891b() {
        aqjr aqjr = this.f86160d;
        if (!aqjr.f86233b) {
            return false;
        }
        if (!cgll.f187253a.mo6606a().mo84096t() || soz.m35811h(aqjr.f86226g)) {
            return true;
        }
        sre.m36087g(aqjr.f86226g);
        return false;
    }

    /* renamed from: c */
    public final bizy mo47892c() {
        return new aqih(this);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ aqiz mo47893d() {
        GoogleServicesExpandableSwitchItem a = aqiv.m71684a(this.f86161e, C0126R.C0129id.section_device_maintenance, C0126R.C0127drawable.quantum_ic_data_usage_vd_theme_24);
        aqje aqje = this.f86157a;
        if (aqje == null) {
            aqjr aqjr = this.f86160d;
            aqje = aqkg.m71752a(aqjr.f86226g, C0126R.array.setupservices_google_services_usage_reporting_title, aqjr.f86232a);
        }
        a.f107646a = aqje;
        aqje aqje2 = this.f86158b;
        if (aqje2 == null) {
            aqjr aqjr2 = this.f86160d;
            aqje2 = aqkg.m71752a(aqjr2.f86226g, C0126R.array.setupservices_google_services_usage_reporting, aqjr2.f86232a);
        }
        a.mo58961b(aqje2);
        aqje aqje3 = this.f86159c;
        if (aqje3 == null) {
            aqjr aqjr3 = this.f86160d;
            if (aqjr3.f86232a != aqkf.AUTOMOTIVE) {
                aqje a2 = aqkg.m71752a(aqjr3.f86226g, C0126R.array.setupservices_google_services_usage_reporting_details, aqjr3.f86232a);
                Context context = aqjr3.f86226g;
                int i = Build.VERSION.SDK_INT;
                aqje a3 = aqje.m71717a(context, (int) C0126R.string.setupservices_google_services_usage_reporting_settings_v23);
                aqje3 = a2.mo47910a("\n\n", a3).mo47910a("\n\n", aqkg.m71752a(aqjr3.f86226g, C0126R.array.f7431x992d0eee, aqjr3.f86232a));
            } else {
                aqje3 = null;
            }
        }
        a.mo58960a(aqje3);
        this.f86160d.mo47924a(new aqis(a));
        return a;
    }

    /* renamed from: a */
    public final void mo47890a(boolean z) {
        this.f86160d.mo47926f();
    }
}
