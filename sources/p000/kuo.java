package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: kuo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kuo implements cayy {

    /* renamed from: a */
    private final cijl f25119a;

    /* renamed from: b */
    private final cijl f25120b;

    /* renamed from: c */
    private final cijl f25121c;

    /* renamed from: d */
    private final cijl f25122d;

    /* renamed from: e */
    private final cijl f25123e;

    /* renamed from: f */
    private final cijl f25124f;

    /* renamed from: g */
    private final cijl f25125g;

    /* renamed from: h */
    private final cijl f25126h;

    public kuo(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4, cijl cijl5, cijl cijl6, cijl cijl7, cijl cijl8) {
        this.f25119a = cijl;
        this.f25120b = cijl2;
        this.f25121c = cijl3;
        this.f25122d = cijl4;
        this.f25123e = cijl5;
        this.f25124f = cijl6;
        this.f25125g = cijl7;
        this.f25126h = cijl8;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Object obj;
        bmzq bmzq = (bmzq) this.f25119a.mo6445a();
        kwu kwu = (kwu) this.f25120b.mo6445a();
        bmxv bmxv = (bmxv) this.f25121c.mo6445a();
        bmxv bmxv2 = (bmxv) this.f25122d.mo6445a();
        kdi kdi = (kdi) ((cayz) this.f25123e).f176439a;
        Context context = (Context) ((cayz) this.f25124f).f176439a;
        bqgk bqgk = (bqgk) this.f25125g.mo6445a();
        keu keu = (keu) this.f25126h.mo6445a();
        if (bmxv.mo66813a() || bmxv2.mo66813a()) {
            kxx kxx = new kxx(bmxv2.mo66813a() ? (keo) bmxv2.mo66814b() : (keo) bmxv.mo66814b(), bmzq, kwu, 9, false);
            Account account = kdi.f23888d;
            obj = account == null ? bmxv.m108566b(kxx) : bmxv.m108566b(new kxx(new C1130key(context, bqgk, account, "places", kxx, new kia(), keu), bmzq, kwu, 9, true));
        } else {
            obj = bmvz.f131120a;
        }
        cazf.m127593a(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
