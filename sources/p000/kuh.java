package p000;

import com.google.android.gms.autofill.data.Credential;
import com.google.android.gms.autofill.data.PaymentCard;

/* renamed from: kuh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kuh implements cayy {

    /* renamed from: a */
    private final cijl f25092a;

    /* renamed from: b */
    private final cijl f25093b;

    /* renamed from: c */
    private final cijl f25094c;

    /* renamed from: d */
    private final cijl f25095d;

    /* renamed from: e */
    private final cijl f25096e;

    /* renamed from: f */
    private final cijl f25097f;

    /* renamed from: g */
    private final cijl f25098g;

    /* renamed from: h */
    private final cijl f25099h;

    /* renamed from: i */
    private final cijl f25100i;

    /* renamed from: j */
    private final cijl f25101j;

    public kuh(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4, cijl cijl5, cijl cijl6, cijl cijl7, cijl cijl8, cijl cijl9, cijl cijl10) {
        this.f25092a = cijl;
        this.f25093b = cijl2;
        this.f25094c = cijl3;
        this.f25095d = cijl4;
        this.f25096e = cijl5;
        this.f25097f = cijl6;
        this.f25098g = cijl7;
        this.f25099h = cijl8;
        this.f25100i = cijl9;
        this.f25101j = cijl10;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        long j;
        kyp kyp = (kyp) ((cayz) this.f25092a).f176439a;
        keo keo = (keo) this.f25093b.mo6445a();
        keo keo2 = (keo) this.f25094c.mo6445a();
        bmxv bmxv = (bmxv) this.f25095d.mo6445a();
        bmxv bmxv2 = (bmxv) this.f25096e.mo6445a();
        bmxv bmxv3 = (bmxv) this.f25097f.mo6445a();
        bmxv bmxv4 = (bmxv) this.f25098g.mo6445a();
        bmzq bmzq = (bmzq) this.f25099h.mo6445a();
        kwu kwu = (kwu) this.f25100i.mo6445a();
        bqgk bqgk = (bqgk) this.f25101j.mo6445a();
        if (kyp == kyp.UI) {
            j = ccip.f179070a.mo6606a().mo76044g();
        } else {
            j = ccip.f179070a.mo6606a().mo76045h();
        }
        bnhp b = bnht.m109442b();
        b.mo67730b(kcy.class, keo);
        b.mo67730b(kdf.class, keo2);
        ktv.m18571a(b, Credential.class, bmxv);
        ktv.m18571a(b, PaymentCard.class, bmxv2);
        ktv.m18571a(b, kcy.class, bmxv3);
        ktv.m18571a(b, kde.class, bmxv3);
        ktv.m18571a(b, kdf.class, bmxv3);
        ktv.m18571a(b, kdg.class, bmxv4);
        bnha h = bnhe.m109414h();
        ktv.m18570a(h, Credential.class, bmxv);
        ktv.m18570a(h, PaymentCard.class, bmxv2);
        kxx kxx = new kxx(new kei(bqgk, j, b.mo67731c(), h.mo67618b()), bmzq, kwu, 3, false);
        cazf.m127593a(kxx, "Cannot return null from a non-@Nullable @Provides method");
        return kxx;
    }
}
