package p000;

import android.accounts.Account;
import java.util.Map;

/* renamed from: afud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class afud implements aftw {

    /* renamed from: a */
    public final cijl f64750a;

    /* renamed from: b */
    public final cijl f64751b;

    /* renamed from: c */
    public final cijl f64752c;

    /* renamed from: d */
    final /* synthetic */ afuf f64753d;

    /* renamed from: e */
    private final Account f64754e;

    /* renamed from: f */
    private final cijl f64755f;

    /* renamed from: g */
    private final cijl f64756g;

    /* renamed from: h */
    private final cijl f64757h;

    /* renamed from: i */
    private final cijl f64758i = new afsj(this.f64753d.f64792a);

    /* renamed from: j */
    private final cijl f64759j;

    /* renamed from: k */
    private final cijl f64760k;

    /* renamed from: l */
    private final cijl f64761l;

    /* renamed from: m */
    private final cijl f64762m;

    /* renamed from: n */
    private final cijl f64763n;

    /* renamed from: o */
    private final cijl f64764o;

    public afud(afuf afuf, Account account) {
        this.f64753d = afuf;
        this.f64754e = account;
        cayy a = cayz.m127582a(account);
        this.f64750a = a;
        afuf afuf2 = this.f64753d;
        this.f64755f = cayx.m127579a(new afsm(a, afuf2.f64798g, afuf2.f64801j, afuf2.f64793b));
        afuf afuf3 = this.f64753d;
        this.f64756g = new afsl(afuf3.f64795d, this.f64750a, afuf3.f64802k);
        cijl cijl = this.f64750a;
        afuf afuf4 = this.f64753d;
        this.f64757h = new afsk(cijl, afuf4.f64792a, afuf4.f64794c);
        cijl cijl2 = this.f64755f;
        cijl cijl3 = this.f64756g;
        cijl cijl4 = this.f64757h;
        afuf afuf5 = this.f64753d;
        this.f64759j = cayx.m127579a(new afsn(cijl2, cijl3, cijl4, afuf5.f64804m, this.f64758i, afuf5.f64803l, afuf5.f64802k));
        cijl cijl5 = this.f64755f;
        cijl cijl6 = this.f64756g;
        cijl cijl7 = this.f64757h;
        afuf afuf6 = this.f64753d;
        cijl a2 = cayx.m127579a(new afso(cijl5, cijl6, cijl7, afuf6.f64804m, this.f64758i, afuf6.f64803l, afuf6.f64802k));
        this.f64760k = a2;
        this.f64761l = cayx.m127579a(new afsc(this.f64759j, a2));
        caza a3 = cazb.m127586a(3);
        a3.mo75186b(afrg.PROFILE_FORCE_SYNC, this.f64761l);
        a3.mo75186b(afrg.PROFILE_UPDATE_PERSON_ME, this.f64761l);
        a3.mo75186b(afrg.PROFILE_UPDATE_PHOTO_ME, this.f64761l);
        cazb a4 = a3.mo75185a();
        this.f64762m = a4;
        this.f64751b = cayx.m127579a(new afxw(a4));
        aftj aftj = new aftj(this.f64759j, this.f64760k, this.f64753d.f64797f);
        this.f64763n = aftj;
        this.f64764o = cayx.m127579a(aftj);
        this.f64752c = cayx.m127579a(new afvz(this.f64750a));
    }

    /* renamed from: a */
    public final Map mo35025a() {
        afyd afyd = afyd.WIPEOUT;
        afuf afuf = this.f64753d;
        int i = afuf.f64766n;
        afyh afyh = new afyh(bnic.m109489a(new afto(this.f64754e, (bbja) this.f64755f.mo6445a(), afst.m53519a((bavw) afuf.f64794c.mo6445a()))));
        cazf.m127593a(afyh, "Cannot return null from a non-@Nullable @Provides method");
        return bnhe.m109409a(afyd, afyh, afyd.PROFILE_SYNC, (afxz) this.f64764o.mo6445a());
    }

    /* renamed from: b */
    public final afub mo35026b() {
        return new afub(this);
    }
}
