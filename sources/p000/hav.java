package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.chimera.Activity;

/* renamed from: hav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hav extends adcf {

    /* renamed from: a */
    public hdz f19362a;

    /* renamed from: b */
    public hay f19363b;

    /* renamed from: c */
    public String f19364c;

    /* renamed from: d */
    public C1247om f19365d;

    /* renamed from: e */
    public C1247om f19366e;

    /* renamed from: f */
    public C1247om f19367f;

    /* renamed from: g */
    public bqgj f19368g;

    /* renamed from: h */
    public ixl f19369h;

    /* renamed from: i */
    public hvd f19370i;

    /* renamed from: j */
    private hqv f19371j;

    /* renamed from: a */
    public final int mo12365a() {
        return spn.m35897i(getContext().getApplicationContext(), this.f19363b.f19380d);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f19362a.mo12423b();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        this.f19368g = sne.m35694a(2, 9);
        Context applicationContext = getContext().getApplicationContext();
        this.f19369h = aczw.m50063a(applicationContext);
        this.f19365d = new hac(this);
        this.f19366e = new hal(applicationContext);
        this.f19367f = new ham(this, applicationContext);
        Activity activity = getActivity();
        hay hay = (hay) adcj.m50161a(activity).mo3444a(hay.class);
        this.f19363b = hay;
        hay.f19384h.mo2445a(this, new hae(this));
        this.f19363b.f19385i.mo2445a(this, new haf(this));
        hqv hqv = (hqv) adcj.m50161a(activity).mo3444a(hqv.class);
        this.f19371j = hqv;
        hqv.f20259a.mo2445a(this, new hag(this));
        this.f19364c = this.f19363b.f19381e.f10226c;
        hvb a = hvc.m14893a();
        a.f20471a = this.f19364c;
        this.f19370i = hva.m14891a(applicationContext, a.mo12751a());
        qws qws = new qws(applicationContext, "IDENTITY_GMSCORE", null);
        hdy a2 = hdz.m14237a();
        a2.f19553a = adcs.RETRIEVE_ACCOUNT_LIST;
        a2.mo12419a(adcs.RETRIEVE_ACCOUNT_LIST, new han(this));
        a2.mo12419a(adcs.REAUTH_ACCOUNT, new hao(this));
        a2.mo12419a(adcs.DISPLAY_CONSENT_SCREEN, new hap(this));
        a2.mo12419a(adcs.RECORD_CONSENT_GRANT, new haq(this));
        a2.mo12419a(adcs.UPDATE_DEFAULT_GOOGLE_ACCOUNT, new har(this));
        a2.f19554b = new has(this);
        a2.f19555c = new hat(this);
        a2.mo12420a(qws, this.f19364c, had.f19341a);
        this.f19362a = a2.mo12418a();
    }
}
