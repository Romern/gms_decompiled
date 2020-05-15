package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: kuf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kuf implements cayy {

    /* renamed from: a */
    private final cijl f25082a;

    /* renamed from: b */
    private final cijl f25083b;

    /* renamed from: c */
    private final cijl f25084c;

    /* renamed from: d */
    private final cijl f25085d;

    /* renamed from: e */
    private final cijl f25086e;

    /* renamed from: f */
    private final cijl f25087f;

    /* renamed from: g */
    private final cijl f25088g;

    public kuf(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4, cijl cijl5, cijl cijl6, cijl cijl7) {
        this.f25082a = cijl;
        this.f25083b = cijl2;
        this.f25084c = cijl3;
        this.f25085d = cijl4;
        this.f25086e = cijl5;
        this.f25087f = cijl6;
        this.f25088g = cijl7;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Object obj;
        Context context = (Context) ((cayz) this.f25082a).f176439a;
        kdi kdi = (kdi) ((cayz) this.f25083b).f176439a;
        kbe kbe = (kbe) this.f25084c.mo6445a();
        bmxv bmxv = (bmxv) this.f25085d.mo6445a();
        bmxv bmxv2 = (bmxv) this.f25086e.mo6445a();
        kwu kwu = (kwu) this.f25087f.mo6445a();
        lhi b = ((kvv) this.f25088g).mo6445a();
        if (bmxv.mo66813a() && bmxv2.mo66813a()) {
            Account account = kdi.f23888d;
            obj = account != null ? bmxv.m108566b(new khd(context, (kfe) bmxv.mo66814b(), (awkh) bmxv2.mo66814b(), kbe, account, kwu.mo14899a(), b.mo15093m())) : bmvz.f131120a;
        } else {
            obj = bmvz.f131120a;
        }
        cazf.m127593a(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
