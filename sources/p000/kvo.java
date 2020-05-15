package p000;

import android.content.Context;
import com.google.android.gms.autofill.operation.UserFieldTypeManager;
import java.util.Collection;

/* renamed from: kvo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kvo implements cayy {

    /* renamed from: a */
    private final cijl f25192a;

    /* renamed from: b */
    private final cijl f25193b;

    /* renamed from: c */
    private final cijl f25194c;

    /* renamed from: d */
    private final cijl f25195d;

    /* renamed from: e */
    private final cijl f25196e;

    /* renamed from: f */
    private final cijl f25197f;

    /* renamed from: g */
    private final cijl f25198g;

    /* renamed from: h */
    private final cijl f25199h;

    /* renamed from: i */
    private final cijl f25200i;

    /* renamed from: j */
    private final cijl f25201j;

    /* renamed from: k */
    private final cijl f25202k;

    /* renamed from: l */
    private final cijl f25203l;

    /* renamed from: m */
    private final cijl f25204m;

    /* renamed from: n */
    private final cijl f25205n;

    /* renamed from: o */
    private final cijl f25206o;

    /* renamed from: p */
    private final cijl f25207p;

    public kvo(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4, cijl cijl5, cijl cijl6, cijl cijl7, cijl cijl8, cijl cijl9, cijl cijl10, cijl cijl11, cijl cijl12, cijl cijl13, cijl cijl14, cijl cijl15, cijl cijl16) {
        this.f25192a = cijl;
        this.f25193b = cijl2;
        this.f25194c = cijl3;
        this.f25195d = cijl4;
        this.f25196e = cijl5;
        this.f25197f = cijl6;
        this.f25198g = cijl7;
        this.f25199h = cijl8;
        this.f25200i = cijl9;
        this.f25201j = cijl10;
        this.f25202k = cijl11;
        this.f25203l = cijl12;
        this.f25204m = cijl13;
        this.f25205n = cijl14;
        this.f25206o = cijl15;
        this.f25207p = cijl16;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Object obj;
        Context context = (Context) ((cayz) this.f25192a).f176439a;
        bmxv bmxv = (bmxv) ((cayz) this.f25193b).f176439a;
        kpk kpk = (kpk) this.f25195d.mo6445a();
        adyd b = ((ktm) this.f25196e).mo6445a();
        kju kju = (kju) this.f25197f.mo6445a();
        bngm bngm = (bngm) this.f25198g.mo6445a();
        keo keo = (keo) this.f25199h.mo6445a();
        lch lch = (lch) this.f25200i.mo6445a();
        lho lho = (lho) this.f25201j.mo6445a();
        kqn kqn = (kqn) this.f25202k.mo6445a();
        lgd lgd = (lgd) this.f25203l.mo6445a();
        kwu kwu = (kwu) this.f25204m.mo6445a();
        UserFieldTypeManager userFieldTypeManager = (UserFieldTypeManager) this.f25205n.mo6445a();
        bnhe bnhe = (bnhe) this.f25206o.mo6445a();
        lfm lfm = new lfm(context, b, lho, kju, lch, kpk, userFieldTypeManager, bmxv, bnhe, (bnhe) this.f25207p.mo6445a(), kwu);
        if (!kdi.f23885a.equals((kdi) ((cayz) this.f25194c).f176439a)) {
            obj = new les(kju, bngm, keo, lch, lho, kqn, kwu, lfm, kpk, lgd, userFieldTypeManager, bmxv);
        } else if (ccjf.m130036f()) {
            obj = new lfd(kju, bngm, bnic.m109495a((Collection) bnhe.values()), lch, lho, kqn, kwu, kpk, lgd, userFieldTypeManager, bmxv);
        } else {
            obj = lfm;
        }
        cazf.m127593a(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
