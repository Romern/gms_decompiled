package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.setupservices.GoogleServicesChimeraActivity;
import com.google.android.gms.setupservices.item.GoogleServicesExpandableSwitchItem;

/* renamed from: aqhp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqhp extends aqiv {

    /* renamed from: a */
    public aqje f86123a;

    /* renamed from: b */
    public aqje f86124b;

    /* renamed from: c */
    public aqje f86125c;

    /* renamed from: d */
    public aqjk f86126d;

    /* renamed from: e */
    final /* synthetic */ GoogleServicesChimeraActivity f86127e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aqhp(GoogleServicesChimeraActivity googleServicesChimeraActivity) {
        super(C0126R.C0129id.agree_location_service, 3, 2);
        this.f86127e = googleServicesChimeraActivity;
    }

    /* renamed from: a */
    public final aucb mo47888a() {
        GoogleServicesChimeraActivity googleServicesChimeraActivity = this.f86127e;
        this.f86126d = new aqjk(googleServicesChimeraActivity, googleServicesChimeraActivity.f107627e, googleServicesChimeraActivity.f107628f);
        aucb a = aqjd.m71716a(cgll.f187253a.mo6606a().mo84099w());
        a.mo50373a(new aqhl(this));
        aucb a2 = aqjd.m71716a(cgll.f187253a.mo6606a().mo84098v());
        a2.mo50373a(new aqhm(this));
        aucb a3 = aqjd.m71716a(cgll.f187253a.mo6606a().mo84097u());
        a3.mo50373a(new aqhn(this));
        return aucu.m76781a(a, a2, a3);
    }

    /* renamed from: b */
    public final boolean mo47891b() {
        aqjk aqjk = this.f86126d;
        return aqjk.f86215b && aqjk.f86214a != aqkf.SIDEWINDER;
    }

    /* renamed from: c */
    public final bizy mo47892c() {
        return new aqho(this);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ aqiz mo47893d() {
        GoogleServicesExpandableSwitchItem a = aqiv.m71684a(this.f86127e, C0126R.C0129id.section_location, C0126R.C0127drawable.quantum_ic_location_on_vd_theme_24);
        aqje aqje = this.f86124b;
        if (aqje == null) {
            aqje = this.f86126d.mo47922b();
        }
        this.f86124b = aqje;
        aqje aqje2 = this.f86125c;
        if (aqje2 == null) {
            aqje2 = this.f86126d.mo47923c();
        }
        this.f86125c = aqje2;
        aqje aqje3 = this.f86123a;
        if (aqje3 == null) {
            aqje3 = this.f86126d.mo47921a();
        }
        this.f86123a = aqje3;
        a.mo58961b(this.f86124b);
        a.mo58960a(this.f86125c);
        a.f107646a = this.f86123a;
        this.f86126d.mo47924a(new aqis(a));
        return a;
    }

    /* renamed from: a */
    public final void mo47890a(boolean z) {
        this.f86126d.mo47926f();
    }
}
