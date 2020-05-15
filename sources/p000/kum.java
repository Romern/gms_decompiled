package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: kum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kum implements cayy {

    /* renamed from: a */
    private final cijl f25110a;

    /* renamed from: b */
    private final cijl f25111b;

    /* renamed from: c */
    private final cijl f25112c;

    /* renamed from: d */
    private final cijl f25113d;

    /* renamed from: e */
    private final cijl f25114e;

    /* renamed from: f */
    private final cijl f25115f;

    /* renamed from: g */
    private final cijl f25116g;

    public kum(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4, cijl cijl5, cijl cijl6, cijl cijl7) {
        this.f25110a = cijl;
        this.f25111b = cijl2;
        this.f25112c = cijl3;
        this.f25113d = cijl4;
        this.f25114e = cijl5;
        this.f25115f = cijl6;
        this.f25116g = cijl7;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Object obj;
        bmzq bmzq = (bmzq) this.f25110a.mo6445a();
        kwu kwu = (kwu) this.f25111b.mo6445a();
        bmxv bmxv = (bmxv) this.f25112c.mo6445a();
        kdi kdi = (kdi) ((cayz) this.f25113d).f176439a;
        Context context = (Context) ((cayz) this.f25114e).f176439a;
        bqgk bqgk = (bqgk) this.f25115f.mo6445a();
        keu keu = (keu) this.f25116g.mo6445a();
        if (bmxv.mo66813a()) {
            kxx kxx = new kxx((keo) bmxv.mo66814b(), bmzq, kwu, 8, false);
            Account account = kdi.f23888d;
            obj = account == null ? bmxv.m108566b(kxx) : bmxv.m108566b(new kxx(new C1130key(context, bqgk, account, "people", kxx, new khp(), keu), bmzq, kwu, 8, true));
        } else {
            obj = bmvz.f131120a;
        }
        cazf.m127593a(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
