package p000;

import android.graphics.drawable.Drawable;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.setupservices.GoogleServicesChimeraActivity;
import com.google.android.gms.setupservices.item.GoogleServicesSwitchItem;

/* renamed from: aqim */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqim extends aqiv {

    /* renamed from: a */
    public aqje f86165a;

    /* renamed from: b */
    public aqje f86166b;

    /* renamed from: c */
    public aqjm f86167c;

    /* renamed from: d */
    final /* synthetic */ GoogleServicesChimeraActivity f86168d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aqim(GoogleServicesChimeraActivity googleServicesChimeraActivity) {
        super(C0126R.C0129id.google_play_opt_in, 6, 5);
        this.f86168d = googleServicesChimeraActivity;
    }

    /* renamed from: a */
    public final aucb mo47888a() {
        boolean z = this.f86168d.mo58957g().getBoolean("is_new_account", false);
        GoogleServicesChimeraActivity googleServicesChimeraActivity = this.f86168d;
        this.f86167c = new aqjm(googleServicesChimeraActivity, googleServicesChimeraActivity.f107627e, googleServicesChimeraActivity.mo58959k(), z);
        aucb a = aqjd.m71716a(cgll.f187253a.mo6606a().mo84066B());
        a.mo50373a(new aqij(this));
        aucb a2 = aqjd.m71716a(cgll.f187253a.mo6606a().mo84065A());
        a2.mo50373a(new aqik(this));
        return aucu.m76781a(a, a2);
    }

    /* renamed from: b */
    public final boolean mo47891b() {
        aqjm aqjm = this.f86167c;
        if (!cgll.f187253a.mo6606a().mo84095s()) {
            return aqjm.f86219b;
        }
        return false;
    }

    /* renamed from: c */
    public final bizy mo47892c() {
        return new aqil(this);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ aqiz mo47893d() {
        GoogleServicesSwitchItem googleServicesSwitchItem = new GoogleServicesSwitchItem();
        Drawable drawable = this.f86168d.getDrawable(C0126R.C0127drawable.quantum_ic_email_vd_theme_24);
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTint(C1133kh.m17843b(this.f86168d, C0126R.color.sud_list_item_icon_color_light));
        }
        googleServicesSwitchItem.mo71394a(drawable);
        aqje aqje = this.f86165a;
        if (aqje == null) {
            aqjm aqjm = this.f86167c;
            aqje = aqkg.m71752a(aqjm.f86226g, C0126R.array.setupservices_google_services_play, aqjm.f86218a);
        }
        googleServicesSwitchItem.f107650a = aqje;
        googleServicesSwitchItem.f107651b = this.f86166b;
        this.f86167c.mo47924a(new aqis(googleServicesSwitchItem));
        return googleServicesSwitchItem;
    }

    /* renamed from: a */
    public final void mo47890a(boolean z) {
        this.f86167c.mo47926f();
    }
}
