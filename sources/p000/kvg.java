package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: kvg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kvg implements cayy {

    /* renamed from: a */
    private final cijl f25167a;

    /* renamed from: b */
    private final cijl f25168b;

    /* renamed from: c */
    private final cijl f25169c;

    /* renamed from: d */
    private final cijl f25170d;

    /* renamed from: e */
    private final cijl f25171e;

    /* renamed from: f */
    private final cijl f25172f;

    public kvg(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4, cijl cijl5, cijl cijl6) {
        this.f25167a = cijl;
        this.f25168b = cijl2;
        this.f25169c = cijl3;
        this.f25170d = cijl4;
        this.f25171e = cijl5;
        this.f25172f = cijl6;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Object obj;
        lgg lgg;
        Context context = (Context) ((cayz) this.f25167a).f176439a;
        kpk kpk = (kpk) this.f25168b.mo6445a();
        kdi kdi = (kdi) ((cayz) this.f25169c).f176439a;
        lhi b = ((kvv) this.f25170d).mo6445a();
        bmxv bmxv = (bmxv) this.f25171e.mo6445a();
        bmxv bmxv2 = (bmxv) ((cayz) this.f25172f).f176439a;
        bngs j = bngx.m109377j();
        if (!ccjf.m130036f() || !ccjf.m130035e() || !kdi.f23885a.equals(kdi)) {
            j.mo67668c(new lgj(context, kdi.f23888d, kpk));
            j.mo67668c(new lgm(context));
            j.mo67668c(new lga(context, kdi, b));
            if (b.mo15089i()) {
                j.mo67668c(new lfy(context));
            }
            if (b.mo15087g()) {
                j.mo67668c(new lfw(context));
            }
            Account account = kdi.f23888d;
            if (account != null) {
                lgg = new lgg(context, account);
            } else {
                lgg = null;
            }
            if (lgg != null) {
                j.mo67668c(lgg);
            }
            if (bmxv.mo66813a()) {
                j.mo67668c(new lgr(context, (keg) bmxv.mo66814b()));
            }
            obj = new lfp(j.mo67664a());
        } else {
            obj = new lfo(context, bmxv2);
        }
        cazf.m127593a(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
