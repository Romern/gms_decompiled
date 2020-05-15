package p000;

import android.content.Context;
import android.os.Build;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.setupservices.GoogleServicesChimeraActivity;
import com.google.android.gms.setupservices.item.GoogleServicesExpandableSwitchItem;

/* renamed from: aqhu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqhu extends aqiv {

    /* renamed from: a */
    public aqje f86132a;

    /* renamed from: b */
    public aqje f86133b;

    /* renamed from: c */
    public aqje f86134c;

    /* renamed from: d */
    public aqjl f86135d;

    /* renamed from: e */
    final /* synthetic */ GoogleServicesChimeraActivity f86136e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aqhu(GoogleServicesChimeraActivity googleServicesChimeraActivity) {
        super(C0126R.C0129id.agree_wireless_scan_always_mode, 4, 3);
        this.f86136e = googleServicesChimeraActivity;
    }

    /* renamed from: a */
    public final aucb mo47888a() {
        GoogleServicesChimeraActivity googleServicesChimeraActivity = this.f86136e;
        this.f86135d = new aqjl(googleServicesChimeraActivity, googleServicesChimeraActivity.f107627e, googleServicesChimeraActivity.f107628f);
        aucb a = aqjd.m71716a(cgll.f187253a.mo6606a().mo84102z());
        a.mo50373a(new aqhq(this));
        aucb a2 = aqjd.m71716a(cgll.f187253a.mo6606a().mo84101y());
        a2.mo50373a(new aqhr(this));
        aucb a3 = aqjd.m71716a(cgll.f187253a.mo6606a().mo84100x());
        a3.mo50373a(new aqhs(this));
        return aucu.m76781a(a, a2, a3);
    }

    /* renamed from: b */
    public final boolean mo47891b() {
        aqjl aqjl = this.f86135d;
        sre.m36087g(aqjl.f86226g);
        return aqjl.f86217b && aqjl.f86216a != aqkf.SIDEWINDER;
    }

    /* renamed from: c */
    public final bizy mo47892c() {
        return new aqht(this);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ aqiz mo47893d() {
        GoogleServicesExpandableSwitchItem a = aqiv.m71684a(this.f86136e, C0126R.C0129id.section_location, C0126R.C0127drawable.quantum_ic_location_on_vd_theme_24);
        aqje aqje = this.f86132a;
        if (aqje == null) {
            Context context = this.f86135d.f86226g;
            int i = Build.VERSION.SDK_INT;
            aqje = aqje.m71717a(context, (int) C0126R.string.setupservices_google_services_location_wireless_scan_title_v28);
        }
        this.f86132a = aqje;
        aqje aqje2 = this.f86133b;
        if (aqje2 == null) {
            aqjl aqjl = this.f86135d;
            int i2 = Build.VERSION.SDK_INT;
            aqje2 = aqje.m71717a(aqjl.f86226g, (int) C0126R.string.setupservices_google_services_location_wireless_scan_v28);
        }
        this.f86133b = aqje2;
        aqje aqje3 = this.f86134c;
        if (aqje3 == null) {
            aqje3 = aqje.m71717a(this.f86135d.f86226g, (int) C0126R.string.setupservices_google_services_location_wireless_scan_details);
        }
        this.f86134c = aqje3;
        a.f107646a = this.f86132a;
        a.mo58961b(this.f86133b);
        a.mo58960a(this.f86134c);
        this.f86135d.mo47924a(new aqis(a));
        return a;
    }

    /* renamed from: a */
    public final void mo47890a(boolean z) {
        this.f86135d.mo47926f();
    }
}
