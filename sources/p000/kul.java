package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: kul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kul implements cayy {

    /* renamed from: a */
    private final cijl f25106a;

    /* renamed from: b */
    private final cijl f25107b;

    /* renamed from: c */
    private final cijl f25108c;

    /* renamed from: d */
    private final cijl f25109d;

    public kul(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4) {
        this.f25106a = cijl;
        this.f25107b = cijl2;
        this.f25108c = cijl3;
        this.f25109d = cijl4;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Object obj;
        Context context = (Context) ((cayz) this.f25107b).f176439a;
        kra kra = (kra) this.f25108c.mo6445a();
        cijl cijl = this.f25109d;
        Account account = ((kdi) ((cayz) this.f25106a).f176439a).f23888d;
        if (account != null) {
            obj = bmxv.m108566b(new khu(context, account, kra, snp.m35702a(9), cijl));
        } else {
            obj = bmvz.f131120a;
        }
        cazf.m127593a(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
