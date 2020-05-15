package p000;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.accessibility.AccessibilityManager;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.smart_profile.SmartProfileChimeraActivity;
import com.google.android.gms.smart_profile.SmartProfileContainerView;
import com.google.android.gms.smart_profile.SmartProfilePerson;
import com.google.android.gms.smart_profile.header.view.HeaderView;
import java.util.List;
import java.util.Set;

/* renamed from: aqre */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqre implements aqpv {

    /* renamed from: a */
    public aqpy f86642a;

    /* renamed from: b */
    public aqpw f86643b;

    /* renamed from: c */
    public aqrq f86644c;

    /* renamed from: d */
    public SmartProfileContainerView f86645d;

    /* renamed from: e */
    public HeaderView f86646e;

    /* renamed from: f */
    public aqvf f86647f;

    /* renamed from: g */
    public aqqm f86648g;

    /* renamed from: h */
    public aqvb f86649h;

    /* renamed from: i */
    public aqvk f86650i;

    /* renamed from: j */
    public aquw f86651j;

    /* renamed from: k */
    public aqwq f86652k;

    /* renamed from: l */
    public tim f86653l;

    /* renamed from: m */
    public aqwm f86654m;

    /* renamed from: n */
    public aqvs f86655n;

    /* renamed from: o */
    public final /* synthetic */ SmartProfileChimeraActivity f86656o;

    public aqre() {
    }

    /* renamed from: a */
    public final void mo48044a() {
        SmartProfileContainerView smartProfileContainerView = this.f86645d;
        if (smartProfileContainerView.f107733e.getVisibility() != 0) {
            smartProfileContainerView.f107733e.setVisibility(0);
        }
        if (smartProfileContainerView.f107732d.getVisibility() == 0) {
            smartProfileContainerView.f107732d.setVisibility(8);
            smartProfileContainerView.f107735g.mo48070a();
        }
    }

    /* renamed from: b */
    public final void mo48098b() {
        if (!cgnt.m146316b() || !cgnn.f187369a.mo6606a().mo84164b()) {
            bhnh a = bhnh.m101201a(this.f86645d, (int) C0126R.string.no_network_connection, (int) cgor.m146364c());
            a.mo64030a((int) C0126R.string.common_retry, new aqrc(this));
            a.mo64033b(C1133kh.m17843b(this.f86656o, C0126R.color.snackbar_button_color));
            a.mo64020c();
            return;
        }
        Context context = this.f86645d.getContext();
        int c = (int) cgor.m146364c();
        if (cgnn.f187369a.mo6606a().mo84165c()) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && !accessibilityManager.getEnabledAccessibilityServiceList(1).isEmpty()) {
                c = -2;
            }
        }
        SpannableString spannableString = new SpannableString(this.f86645d.getResources().getString(C0126R.string.no_network_connection));
        spannableString.setSpan(new ForegroundColorSpan(thh.m36969e(context)), 0, spannableString.length(), 0);
        bhnh a2 = bhnh.m101202a(this.f86645d, spannableString, c);
        a2.mo64030a((int) C0126R.string.common_retry, new aqrb(this));
        a2.mo64033b(thh.m36968d(context));
        a2.mo64034c(thh.m36967c(context));
        a2.mo64020c();
    }

    /* renamed from: c */
    public final boolean mo48099c() {
        return ssk.m36235a(this.f86656o);
    }

    public aqre(SmartProfileChimeraActivity smartProfileChimeraActivity) {
        this.f86656o = smartProfileChimeraActivity;
    }

    /* renamed from: a */
    public final void mo48097a(SmartProfilePerson smartProfilePerson) {
        SmartProfilePerson smartProfilePerson2 = new SmartProfilePerson(smartProfilePerson, this.f86656o.getIntent().getStringExtra("com.google.android.gms.people.smart_profile.DISPLAY_PHONE"), this.f86656o.getIntent().getStringExtra("com.google.android.gms.people.smart_profile.DISPLAY_EMAIL"), this.f86656o.getResources().getString(C0126R.string.profile_communicate_email));
        aqrq aqrq = this.f86644c;
        aqrq.f86666c = smartProfilePerson2;
        aqrq.mo48115a();
        LoaderManager supportLoaderManager = this.f86656o.getSupportLoaderManager();
        SmartProfileChimeraActivity smartProfileChimeraActivity = this.f86656o;
        aqsu aqsu = new aqsu(supportLoaderManager, smartProfilePerson2, smartProfileChimeraActivity.f107726n, smartProfileChimeraActivity);
        aqsp aqsp = new aqsp(aqsu, new aqpx(this.f86642a));
        aqsu.f86719e = new aqsv(null);
        aqsu.f86715a.initLoader(1, null, new aqsq(aqsu));
        aqsu.f86720f = new aqsv(null);
        aqsu.f86715a.initLoader(2, null, new aqsr(aqsu));
        aqsu.f86721g = new aqsv(null);
        aqsu.f86715a.initLoader(3, null, new aqss(aqsu));
        new aqso(aqsp, new aqsn(new aqsv[]{aqsu.f86719e, aqsu.f86720f, aqsu.f86721g}).f86707a);
        aquw aquw = this.f86651j;
        List list = aquw.f86858a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((aquu) list.get(i)).mo48040a(smartProfilePerson2);
        }
        aquw.f86859b = smartProfilePerson2;
        aquw.f86862e = 1;
        Set a = aquw.m72121a(aquw.f86859b);
        if (!a.isEmpty()) {
            aqwf aqwf = aquw.f86860c;
            aqwf.f86965a.restartLoader(10, null, new aqwc(aqwf, a, new aqus(aquw)));
            return;
        }
        aquw.mo48172a(2, 2);
    }
}
