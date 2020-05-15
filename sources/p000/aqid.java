package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.setupservices.GoogleServicesChimeraActivity;
import com.google.android.gms.setupservices.item.GoogleServicesSwitchItem;

/* renamed from: aqid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqid extends aqiv {

    /* renamed from: a */
    public aqje f86149a;

    /* renamed from: b */
    public aqje f86150b;

    /* renamed from: c */
    public aqjn f86151c;

    /* renamed from: d */
    final /* synthetic */ GoogleServicesChimeraActivity f86152d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aqid(GoogleServicesChimeraActivity googleServicesChimeraActivity) {
        super(C0126R.C0129id.agree_safety_net, 7, 6);
        this.f86152d = googleServicesChimeraActivity;
    }

    /* renamed from: a */
    public final aucb mo47888a() {
        GoogleServicesChimeraActivity googleServicesChimeraActivity = this.f86152d;
        this.f86151c = new aqjn(googleServicesChimeraActivity, googleServicesChimeraActivity.f107627e, googleServicesChimeraActivity.f107628f);
        aucb a = aqjd.m71716a(cgll.f187253a.mo6606a().mo84068D());
        a.mo50373a(new aqia(this));
        aucb a2 = aqjd.m71716a(cgll.f187253a.mo6606a().mo84067C());
        a2.mo50373a(new aqib(this));
        return aucu.m76781a(a, a2);
    }

    /* renamed from: b */
    public final boolean mo47891b() {
        aqjn aqjn = this.f86151c;
        return aqjn.f86222b && aqjn.f86221a == aqkf.SIDEWINDER;
    }

    /* renamed from: c */
    public final bizy mo47892c() {
        return new aqic(this);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ aqiz mo47893d() {
        GoogleServicesSwitchItem googleServicesSwitchItem = new GoogleServicesSwitchItem();
        aqje aqje = this.f86149a;
        if (aqje == null) {
            aqjn aqjn = this.f86151c;
            aqje = aqkg.m71752a(aqjn.f86226g, C0126R.array.setupservices_google_services_safety_net, aqjn.f86221a);
        }
        googleServicesSwitchItem.f107650a = aqje;
        googleServicesSwitchItem.f107651b = this.f86150b;
        this.f86151c.mo47924a(new aqis(googleServicesSwitchItem));
        return googleServicesSwitchItem;
    }

    /* renamed from: a */
    public final void mo47890a(boolean z) {
        this.f86151c.mo47926f();
    }
}
